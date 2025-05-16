package org.example.model;

public class Estacionamento {
    private String nome;
    private int numeroDeVagasCarros;
    private int numeroDeVagasMotos;
    private String endereco;
    private String telefone;
    private String email;

    public Estacionamento(String nome, int numeroDeVagasCarros, int numeroDeVagasMotos, String endereco, String telefone, String email) {
        this.nome = nome;
        this.numeroDeVagasCarros = numeroDeVagasCarros;
        this.numeroDeVagasMotos = numeroDeVagasMotos;
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

    public int getNumeroDeVagasCarros() {
        return numeroDeVagasCarros;
    }

    public void setNumeroDeVagasCarros(int numeroDeVagasCarros) {
        this.numeroDeVagasCarros = numeroDeVagasCarros;
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

    public int getNumeroDeVagasMotos() {
        return numeroDeVagasMotos;
    }

    public void setNumeroDeVagasMotos(int numeroDeVagasMotos) {
        this.numeroDeVagasMotos = numeroDeVagasMotos;
    }

    @Override
    public String toString() {
        return "\nEstacionamento=" +
                "\nemail:" + email +
                "\nnome:'" + nome +
                "\nnumeroDeVagas:" + numeroDeVagasCarros +
                "\nendereco:" + endereco +
                "\ntelefone:" + telefone;
    }
}
