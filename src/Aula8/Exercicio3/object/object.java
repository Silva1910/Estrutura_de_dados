package Aula8.Exercicio3.object;

import lib.Fila;

public class object {
	public String nome;
	public int QtdRetornos;

	public String toString() {
		return "Processo [nome=" + nome + ", Quantidade de Processos=" + QtdRetornos + "]";
	}

	public object(String nome, int QtdRetornos) {
		this.nome = nome;
		this.QtdRetornos = QtdRetornos;

	}
}