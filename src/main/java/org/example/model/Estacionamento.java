package org.example.model;

public class Estacionamento {
    private String nome;
    private int numeroDeVagas;
    private String endereco;
    private String telefone;
    private String email;

    Estacionamento(String nome, int numeroDeVagas, String endereco, String telefone, String email) {
        this.nome = nome;
        this.numeroDeVagas = numeroDeVagas;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeVagas() {
        return numeroDeVagas;
    }

    public void setNumeroDeVagas(int numeroDeVagas) {
        this.numeroDeVagas = numeroDeVagas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nEstacionamento=" +
                "\nemail:" + email +
                "\nnome:'" + nome +
                "\nnumeroDeVagas:" + numeroDeVagas +
                "\nendereco:" + endereco +
                "\ntelefone:" + telefone;
    }
}
