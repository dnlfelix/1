package com.bean;

import com.dao.antigo.DAO;
import com.model.Tipo;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "tipoBean")
@SessionScoped
public class TipoBean implements Serializable {

    private Tipo tipo;

    public TipoBean() {
        this.tipo = new Tipo();
    }

    public Tipo getTipo() {
        return tipo;
    }

    public List<Tipo> getTipos() {
        return new DAO<>(Tipo.class).listaTodos();
        //return new TipoDao().listaTodos();
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String salvar() {

        if (tipo.getId() == null) {
            new DAO<>(Tipo.class).adiciona(this.tipo);
        } else {
            new DAO<>(Tipo.class).atualiza(this.tipo);
        }

        return "admtiptodos";
    }

    public String excluir(Tipo tipo) {
        new DAO<>(Tipo.class).remove(tipo);
        return "admtiptodos";
    }


    public String criarNovo() {
        this.tipo = new Tipo();

        return "admtipnovo";
    }

    public String verDetalhe(Tipo t) {
        this.tipo = t;
        return "admtipnovo";
    }

}
