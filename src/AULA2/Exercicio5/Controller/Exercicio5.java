package AULA2.Exercicio5.Controller;

public class Exercicio5 {
	public Exercicio5() {
		super();
	}

	public int exercicio5(int x, int y) {
		if (x == y) { // ponto de parada
			return    x;
		}
		else if (x>y){
			return exercicio5(x-y,y); //  retorno da função
						
		}else { 
			return exercicio5(y,x); //  retorno da função
		}
	}
}
