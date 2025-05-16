package org.example.model;

import org.example.Enum.StatusVaga;
import org.example.Enum.TipoVaga;

public class Vaga {
    private int numero;
    private TipoVaga tipo;
    private StatusVaga status;
    private String veiculo;

    Vaga(int numero, TipoVaga tipo, StatusVaga status, String veiculo) {
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

    public TipoVaga getTipo() {
        return tipo;
    }

    public void setTipo(TipoVaga tipo) {
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
