package Aula8.Exercicio1.model;

import lib.Fila;




public class Model {
    private String nome;
    private int quantidadePecas;
    private double valorPecas;

    // Adicione getters para campos privados
    public String getNome() {
        return nome;
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public String toString() {
        return "Cliente [nome=" + nome + ", Quantidade de Pecas=" + quantidadePecas + " ,valorPecas=" + valorPecas + "]";
    }

    public Model(String nome, int quantidadePecas, double valorPecas) {
        this.nome = nome;
        this.quantidadePecas = quantidadePecas;
        this.valorPecas = valorPecas;
    }
}