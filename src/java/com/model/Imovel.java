/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author sistema.inter
 */
@Entity
public class Imovel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long referencia;
    private String titulo;
    private int vagas;
    private double valor;
    private String valormediodocondominio;
    private String bairro;
    private String cidade;
    private int dormitorios;
    private int suites;
    private int banheiros;
    private double areautil;
    private double areatotal;
    private double areaaverbada;
    private String rua;
    private String numero;
    @Column(name="descricao", length=800)
    private String descricao;
    @OneToOne
    private Finalidade finalidade;
    @OneToOne
    private Tipo tipo;
    private boolean destaque;
    private String tipodenegocio;
    private boolean vendido;
    private boolean ativo;

    public Imovel() {
        this.tipo = new Tipo();
        this.finalidade = new Finalidade();
        this.ativo = true;
    }

    public Long getReferencia() {
        return referencia;
    }

    public void setReferencia(Long referencia) {
        this.referencia = referencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getValormediodocondominio() {
        return valormediodocondominio;
    }

    public void setValormediodocondominio(String valormediodocondominio) {
        this.valormediodocondominio = valormediodocondominio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getDormitorios() {
        return dormitorios;
    }

    public void setDormitorios(int dormitorios) {
        this.dormitorios = dormitorios;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public double getAreautil() {
        return areautil;
    }

    public void setAreautil(double areautil) {
        this.areautil = areautil;
    }

    public double getAreatotal() {
        return areatotal;
    }

    public void setAreatotal(double areatotal) {
        this.areatotal = areatotal;
    }

    public double getAreaaverbada() {
        return areaaverbada;
    }

    public void setAreaaverbada(double areaaverbada) {
        this.areaaverbada = areaaverbada;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public String getTipodenegocio() {
        return tipodenegocio;
    }

    public void setTipodenegocio(String tipodenegocio) {
        this.tipodenegocio = tipodenegocio;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Imovel other = (Imovel) obj;
        if (this.referencia != other.referencia) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (this.vagas != other.vagas) {
            return false;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.valormediodocondominio, other.valormediodocondominio)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (this.dormitorios != other.dormitorios) {
            return false;
        }
        if (this.suites != other.suites) {
            return false;
        }
        if (this.banheiros != other.banheiros) {
            return false;
        }
        if (Double.doubleToLongBits(this.areautil) != Double.doubleToLongBits(other.areautil)) {
            return false;
        }
        if (Double.doubleToLongBits(this.areatotal) != Double.doubleToLongBits(other.areatotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.areaaverbada) != Double.doubleToLongBits(other.areaaverbada)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.finalidade, other.finalidade)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (this.destaque != other.destaque) {
            return false;
        }
        if (!Objects.equals(this.tipodenegocio, other.tipodenegocio)) {
            return false;
        }
        if (this.vendido != other.vendido) {
            return false;
        }
        if (this.ativo != other.ativo) {
            return false;
        }
        return true;
    }

}
