package Aula13.Exercicio5.view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;

public class main {
	 public static void main(String[] args) throws Exception {

	        int[] vet = { 30, 15, 60, 10, 20, 40, 80 };
	        ArvoreInt arvore = new ArvoreInt();

	        for (int i = 0; i < vet.length; i++) {
	            arvore.inserir(vet[i]);
	        }


	        System.out.println("Ordem crescente");
	        arvore.buscaInfixa();
	        System.out.println("\n===========================================================");
	    
	        System.out.println("Numero 60 removido");
	        arvore.remover(60);
	        arvore.buscaInfixa();
	        System.out.println("\n===========================================================");
	    }
	 }


