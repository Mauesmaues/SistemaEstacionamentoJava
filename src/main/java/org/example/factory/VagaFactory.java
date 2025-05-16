package org.example.factory;

import org.example.Enum.StatusVaga;
import org.example.Enum.TipoVaga;
import org.example.model.Vaga;

public abstract class VagaFactory {
    public static Vaga criarVaga(int numero, TipoVaga tipo, StatusVaga status){
        return new Vaga(numero, tipo, status);
    }
}
