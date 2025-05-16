package org.example.factory;

import org.example.Enum.StatusVaga;
import org.example.Enum.TipoVaga;
import org.example.model.Estacionamento;

public abstract class EstacionamentoFactory {

    public static Estacionamento criarEstacionamento(String nome, int numeroDeVagasCarros, int numeroDeVagasMotos, String endereco, String telefone, String email){
        Estacionamento estacionamento = new Estacionamento(nome, numeroDeVagasCarros, numeroDeVagasMotos, endereco, telefone, email);
        for(int i = 1; i < numeroDeVagasCarros; i++){
            VagaFactory.criarVaga(i, TipoVaga.CARRO, StatusVaga.LIVRE);
        }
        return estacionamento;
    }

}
