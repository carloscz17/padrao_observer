package org.example;

import Observer.CarroRoubado;
import Observer.ViaturaPolicial;

import java.util.Observer;

public class PerseguicaoPolicial {
    public static void main(String[] args) {
        // Criação do carro roubado (observado)
        CarroRoubado carroRoubado = new CarroRoubado();

        // Criação das viaturas policiais (observadores)
        ViaturaPolicial viatura1 = new ViaturaPolicial("Viatura 1") {
            @Override
            public void update(String acao) {

            }
        };
        ViaturaPolicial viatura2 = new ViaturaPolicial("Viatura 2") {
            @Override
            public void update(String acao) {

            }
        };

        // Adiciona as viaturas como observadores do carro roubado
        carroRoubado.addObserver((Observer) viatura1);
        carroRoubado.addObserver((Observer) viatura2);

        // Simulação de eventos no carro roubado
        carroRoubado.realizarAcao("virou a esquerda");
        carroRoubado.realizarAcao("virou a direita");
        carroRoubado.realizarAcao("parou");
    }
}