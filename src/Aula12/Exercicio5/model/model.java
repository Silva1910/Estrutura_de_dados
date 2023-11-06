package Aula12.Exercicio5.model;


	//Classe Model.java

	public class model {
		private int saldo;
		private String nome;
		private int numeroConta;

		// Construtor
		public model(int numeroConta, String nome, int saldo) {
			this.numeroConta = numeroConta;
			this.nome = nome;
			this.saldo = saldo;
		}

		// Métodos getters
		public String getNome() {
			return nome;
		}

		public int getSaldo() {
			return saldo;
		}

		public int getNumeroConta() {
			return numeroConta;
		}

		// Método toString
		@Override
		public String toString() {
			return " Conta corrente [numero da conta=> " + numeroConta + ", nome da pessoa = " + nome + ", o total do saldo e = " + saldo				+ "]";
		}
	}


