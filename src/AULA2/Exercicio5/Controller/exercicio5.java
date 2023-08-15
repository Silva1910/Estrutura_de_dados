package AULA2.Exercicio5.Controller;

public class exercicio5 {
	public exercicio5() {
		super();
	}

	public int exercicio5(int x, int y) {
		if (x == y) {
			return x;
		}
		else if (x>y){
			return exercicio5(x-y,y);
						
		}else { 
			return exercicio5(y,x);
		}
	}
}
