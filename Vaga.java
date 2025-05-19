package org.example.model;

import org.example.Enum.StatusVaga;
import org.example.Enum.TipoVaga;

public class Vaga {
    private int numero;
    private TipoVaga tipo;
    private StatusVaga status;

    public Vaga(int numero, TipoVaga tipo, StatusVaga status) {
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
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


    @Override
    public String toString() {
        return "\nVaga=" +
                "\nnumero:" + numero +
                "\ntipo:" + tipo +
                "\nstatus:" + status;
    }
}
