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
public class Venda {

    private int numero;
    private Date quando;
    private Pessoa pessoa;
    private List<ItemVenda> itens;

    public Venda() {
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Venda{" + "numero=" + numero + ", quando=" + quando + ", pessoa=" + pessoa + ", itens=" + itens + '}';
    }

}
