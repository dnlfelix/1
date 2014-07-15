package com.bean;

import com.model.Usuario;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;


@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable{
    private Usuario usuario;
    private Boolean logado;
    private String userTentativa;
    private String senhaTentativa;
    
    public UsuarioBean() {
        this.usuario = new Usuario();
        this.logado = false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    

    public String getUserTentativa() {
        return userTentativa;
    }

    public void setUserTentativa(String userTentativa) {
        this.userTentativa = userTentativa;
    }

    public String getSenhaTentativa() {
        return senhaTentativa;
    }

    public void setSenhaTentativa(String senhaTentativa) {
        this.senhaTentativa = senhaTentativa;
    }

    public Boolean isLogado() {
        return logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }
    
    
    
}
