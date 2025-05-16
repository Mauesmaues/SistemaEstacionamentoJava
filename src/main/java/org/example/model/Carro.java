package org.example.model;

import java.time.LocalDateTime;

public class Carro extends Veiculo{
    public Carro(String placa, String modelo, String cor, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
        super(placa, modelo, cor, dataHoraEntrada, dataHoraSaida);

    }
}
