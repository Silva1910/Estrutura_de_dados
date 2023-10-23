package Aula10.Exercicio3.model;

public class Musica {
	 	private String nome;
	    private String nomeArtista;
	    private int duracao;

	    // Adicione getters para campos privados
	    public String getNome() {
	        return nome;
	    }

	    public String getNomeArtista() {
	        return nomeArtista;
	    }


	    public int getDuracao() {
	        return duracao;
	    }

	    public String toString() {
	        return "Musica (nome da musica==>" +  nome  + " || o nome do artista==>" +  nomeArtista + " || e a duracao em minutos " + duracao + ")";
	    }

	    public Musica(String nome, String nomeArtista, int duracao) {
	        this.nome = nome;
	        this.nomeArtista = nomeArtista;
	        this.duracao = duracao;
	    }
}
