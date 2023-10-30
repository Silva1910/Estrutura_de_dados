package Aula11.Exercicio2.model;

public class model {
	// FOOD NAME,SCIENTIFIC NAME,GROUP,SUB GROUP
	private int numApto;
	private String nome;
	private String modelo;
	private String cor;
	private int placa;

//Construtor
	public model(String nome, int numApto, String modelo, String cor, int placa) {
		this.numApto = numApto;
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
	}

//Métodos getters
	public String getnome() {
		return nome;
	}

	public int getNumApto() {
		return numApto;
	}

	public int getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}

//Método toString
	@Override
	public String toString() {
		return "Morador [Nome do morador=" + nome + ", morador do apto " + numApto
				+ ", propietariod do modelo do carro=" + modelo + ", e da cor =" + cor + ", da placa=" + placa + "]";
	}
}