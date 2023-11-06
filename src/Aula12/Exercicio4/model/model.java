package Aula12.Exercicio4.model;

//Classe Model.java

public class model {
	private String descricao;
	private String nome;
	private int andar;

	// Construtor
	public model(int andar, String nome, String descricao) {
		this.andar = andar;
		this.nome = nome;
		this.descricao = descricao;
	}

	// Métodos getters
	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getAndar() {
		return andar;
	}

	// Método toString
	@Override
	public String toString() {
		return "  Loja de departamento [andar=> " + andar + ", nome do departamento = " + nome + ", descricao= " + descricao
				+ "]";
	}
}
