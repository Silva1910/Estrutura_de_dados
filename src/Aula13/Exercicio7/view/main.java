package Aula13.Exercicio7.view;

import br.edu.fateczl.arvore.inteiro.ArvoreChar.ArvoreChar;

public class main {
	  public static void main(String[] args) throws Exception {
	    	ArvoreChar arvore = new ArvoreChar();

	    	char[] vet = { 'k', 'd', 'm', 'b', 'c', 'f',
					'l', 't', 'p', 'z', 'r' };
	    	
			for (int i=0; i< vet.length; i++) {
				arvore.inserir(vet[i]);

			}
			
			arvore.remover('m');
	        System.out.println("Busca em Prefixo apos remover m:");
	        arvore.buscaPrefixa();
	        System.out.println("\n===========================================================");

	        System.out.println("Busca Infixa apos remover m :");
	        arvore.buscaInfixa();
	        System.out.println("\n===========================================================");

	        System.out.println("Busca em Posfixo apos remover m :");
	        arvore.buscaPosfixa();
	        System.out.println("\n===========================================================");
	        System.out.println("nivel de r apos a remocao de m :");
	        arvore.buscar('r');
	  }
}
