package Aula13.Exercicio6.view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class main {
	 public static void main(String[] args) throws Exception {

	        int[] vet = { 12, 4, 16, 4, 2, 8, 6 };
	        ArvoreInt arvore = new ArvoreInt();

	        for (int i = 0; i < vet.length; i++) {
	            arvore.inserir(vet[i]);
	        }


	        System.out.println("Nivel do No do numero 6");
	        arvore.buscar(6);
	        System.out.println("\n===========================================================");
	    
	        System.out.println("Numero 12 removido");
	        arvore.remover(12);
	        arvore.buscaPosfixa();
	        System.out.println("\n===========================================================");
	    }
}
