package org.example.model;

import org.example.Enum.StatusVaga;

public class Vaga {
    private int numero;
    private String tipo;
    private StatusVaga status;
    private String veiculo;

    Vaga(int numero, String tipo, StatusVaga status, String veiculo) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
        this.veiculo = veiculo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public StatusVaga getStatus() {
        return status;
    }

    public void setStatus(StatusVaga status) {
        this.status = status;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "\nVaga=" +
                "\nnumero:" + numero +
                "\ntipo:" + tipo +
                "\nstatus:" + status +
                "\nveiculo:'" + veiculo;
    }
}
