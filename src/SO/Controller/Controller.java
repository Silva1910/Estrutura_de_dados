// Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000 posições inteiras 
//(Preencher todas as posições com valor 0) e gere o tempo gasto para percorrer o vetor. 
// Repetir para 10000 e 100000 posições. Responder com o tempo (em nS ou S) de cada operação.

package SO.Controller;

public class Controller {

	public Controller() {
		super();
	}

	public void vt1(int[] vetor1) {
		{
			double temporInicial = System.nanoTime();
			for (int i = 0; i < 1000; i++) {
				vetor1[i] =0;
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - temporInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("o tempo total do vetor 1 e ==>" + tempoTotal + "s"  );
		}
	}

	public void vt2(int[] vetor2) {
		{
			double temporInicial = System.nanoTime();
			for (int i = 0; i < 10000; i++) {
				vetor2[i] =0;
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - temporInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("o tempo total do vetor 2 e ==>" + tempoTotal + "s"  );
		}

	}
	public void vt3(int [] vetor3 ) {
		{
			double temporInicial = System.nanoTime();
			for (int i = 0; i < 100000; i++) {
				vetor3[i] =0;
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - temporInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("o tempo total do vetor 3 e ==>" + tempoTotal + "s" );
		}

	}




}
