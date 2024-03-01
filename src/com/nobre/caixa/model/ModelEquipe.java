package com.nobre.caixa.model;

import com.raven.table.model.TableRowData;

public class ModelEquipe extends TableRowData {

    private ModelPessoa nome;
    private String sexo;
    private int idade;
    private String email;
    private String telefone;

    public ModelEquipe() {
    }

    public ModelEquipe(ModelPessoa nome, String sexo, int idade, String email, String telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public ModelPessoa getNome() {
        return nome;
    }

    public void setNome(ModelPessoa nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public Object[] toTableRow() {
        return new Object[]{nome,sexo,idade,email,telefone};
    }

}
