package AULA2.Exercicio8.Controller;

public class controller {

	public controller() {
		super();
	}

	public String invertePalavra(String palavra) {
		// condição de parada
		if (palavra.isEmpty()) {
			return palavra;
		} else {
			// chamada da proxima função
			return invertePalavra(palavra.substring(1)).concat(palavra.substring(0, 1));
		}
	}

}
