package Aula8.Exercicio5.model;

import lib.Fila;

public class model {
	private String nome;
	private int idade;
	private float altura;

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}

	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + " , altura=" + altura + "]";
	}

	public model(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
}