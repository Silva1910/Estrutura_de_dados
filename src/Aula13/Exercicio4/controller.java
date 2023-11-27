package Aula13.Exercicio4;


import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class controller {

	
	public static void main(String[] args) throws Exception {
	
		int[] vet = { 7, 8, 3, 4, 2, 1, 6, 5 };
		ArvoreInt arvore = new ArvoreInt();
		

		
		for (int i=0; i< vet.length; i++) {
			arvore.inserir(vet[i]);

		}
		arvore.remover(7);
		arvore.remover(6);
	

		arvore.buscaPrefixa();
		System.out.println("");
		System.out.println("===========================================================");
		arvore.buscaInfixa();
		System.out.println("");
		System.out.println("===========================================================");
		arvore.buscaPosfixa();
		System.out.println("");
		
		
	
	 
	   
		}
	
}
