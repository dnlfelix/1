package com.bean;

import com.dao.antigo.DAO;
import com.model.Finalidade;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named(value = "finalidadeBean")
@SessionScoped
public class FinalidadeBean implements Serializable{

    private Finalidade finalidade;

    public FinalidadeBean() {
        finalidade = new Finalidade();
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public List<Finalidade> getFinalidades() {
        return new DAO<>(Finalidade.class).listaTodos();
        //return new TipoDao().listaTodos();
    }

    public String salvar() {

        if (finalidade.getId() == null) {
            new DAO<>(Finalidade.class).adiciona(this.finalidade);
        } else {
            new DAO<>(Finalidade.class).atualiza(this.finalidade);
        }

        return "admfintodos";
    }

    public String excluir(Finalidade fin) {
        new DAO<>(Finalidade.class).remove(fin);
        return "admfintodos";
    }

    public String criarNovo() {
        this.finalidade = new Finalidade();

        return "admfinnovo";
    }

    public String verDetalhe(Finalidade f) {
        this.finalidade = f;
        return "admfinnovo";
    }

}
