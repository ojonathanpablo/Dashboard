package com.nobre.caixa.model;

import javax.swing.Icon;

/**
 *
 * @author User
 */
public class ModelPessoa {

    private String primeiroNome;
    private String segundoNome;
    private Icon imagem;
    private String caminho;

    public ModelPessoa() {
    }

    public ModelPessoa(String primeiroNome, String segundoNome, Icon imagem, String caminho) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.imagem = imagem;
        this.caminho = caminho;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public String toString() {
        return primeiroNome + " " + segundoNome;
    }

}
