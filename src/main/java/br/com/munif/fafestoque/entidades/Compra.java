/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.munif.fafestoque.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author munifgebarajunior
 */
public class Compra {

    private int numero;
    private Date quando;
    private Juridica juridica;
    private List<ItemCompra> itens;

    public Compra() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getQuando() {
        return quando;
    }

    public void setQuando(Date quando) {
        this.quando = quando;
    }

    public Juridica getJuridica() {
        return juridica;
    }

    public void setJuridica(Juridica juridica) {
        this.juridica = juridica;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemCompra> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Compra{" + "numero=" + numero + ", quando=" + quando + ", juridica=" + juridica + ", itens=" + itens + '}';
    }

}
