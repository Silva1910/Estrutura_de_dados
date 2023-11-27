package Aula13.Exercicio3;

import br.edu.fateczl.arvore.inteiro.ArvoreChar.ArvoreChar;

public class controller {

    public static void main(String[] args) throws Exception {
    	ArvoreChar arvore = new ArvoreChar();

    	char[] vet = { 'M', 'F', 'S', 'D', 'J', 'P',
				'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K' };
    	
		for (int i=0; i< vet.length; i++) {
			arvore.inserir(vet[i]);

		}
		
        System.out.println("Busca em Prefixo:");
        arvore.buscaPrefixa();
        System.out.println("\n===========================================================");

        System.out.println("Busca Infixa:");
        arvore.buscaInfixa();
        System.out.println("\n===========================================================");

        System.out.println("Busca em Posfixo:");
        arvore.buscaPosfixa();
        System.out.println("\n===========================================================");
    }
}
