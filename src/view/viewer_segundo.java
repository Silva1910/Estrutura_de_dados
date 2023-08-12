package view;
import controller.segundo_exerc;
public class viewer_segundo {

	public static void main(String[] args) {
		int [] vetor = {10,22,30,4,5}; 
		int tamanho = vetor.length-1;
		
		segundo_exerc vc = new segundo_exerc(); 
		int segundo_exerc = vc.segundo_exerc(vetor, tamanho);
		System.out.println("o menor numero  e igual á ==>" + segundo_exerc);
	}

}
