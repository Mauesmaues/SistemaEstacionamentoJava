package org.example.model;

import java.time.LocalDateTime;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;

    public Veiculo(String placa, String modelo, String cor, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    @Override
    public String toString() {
        return "Veiculo=" +
                "\ncor:'" + cor + '\'' +
                "\nplaca='" + placa + '\'' +
                "\nmodelo='" + modelo + '\'' +
                "\ndataHoraEntrada=" + dataHoraEntrada +
                "\ndataHoraSaida=" + dataHoraSaida;
    }
}
