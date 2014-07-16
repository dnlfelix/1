package com.bean;

import com.dao.antigo.DAO;
import com.model.Imovel;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

@Named(value = "imovelBean")
@SessionScoped
public class ImovelBean implements Serializable{
    private Imovel imovel;
    public ImovelBean() {
//        this.imovel = new Imovel();
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    public List<Imovel> getImovels() {
        return new DAO<>(Imovel.class).listaTodos();
        //return new TipoDao().listaTodos();
    }

    
    public String salvar() {

        if (imovel.getReferencia() == null) {
            new DAO<>(Imovel.class).adiciona(this.imovel);
        } else {
            new DAO<>(Imovel.class).atualiza(this.imovel);
        }

        return "admimotodos";
    }

    public String excluir(Imovel i) {
        new DAO<>(Imovel.class).remove(i);
        return "admimotodos";
    }

    public String criarNovo() {
        this.imovel = new Imovel();
        this.imovel.setReferencia(null);

        return "admimonovo";
    }

    public String verDetalhe(Imovel i) {
        this.imovel = i;
        return "admimonovo";
    }
    
}
