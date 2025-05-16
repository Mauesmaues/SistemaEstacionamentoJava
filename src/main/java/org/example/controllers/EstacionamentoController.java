package org.example.controllers;

import org.example.factory.EstacionamentoFactory;
import org.example.factory.VagaFactory;
import org.example.model.Estacionamento;

import java.util.ArrayList;
import java.util.List;

public class EstacionamentoController {
    private Estacionamento estacionamento;

    public void cadastrarEstacionamento(String nome, int numeroDeVagasCarros, int numeroDeVagasMotos, String endereco, String telefone, String email) {
        estacionamento = EstacionamentoFactory.criarEstacionamento( nome, numeroDeVagasCarros, numeroDeVagasMotos, endereco, telefone, email);

    }
}
