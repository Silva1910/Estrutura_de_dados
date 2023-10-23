// Classe Model.java
package Aula10.Exercicio5.model;

public class model {
    private String cpf;
    private String nome;
    private int idade;
    private double limiteCredito;

    // Construtor
    public model(String cpf, String nome, int idade, double limiteCredito) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.limiteCredito = limiteCredito;
    }

    // Métodos getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", Limite Credito=" + limiteCredito + "]";
    }
}
