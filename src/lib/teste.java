package lib;

import LibLista.Lista;
import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;



public class teste {
	
		 public static void main(String[] args) throws Exception {

			   int[] vet = { 30,23,17,12,76,58,98 ,58,24,       36,92,17,75,74,78,78,0,11,67,17};

		        
		        for (int i = 0; i < vet.length; i++) {
		        	int f = (int) (10 * (     ((7.0 / 13) * vet[i])         % 1));
		        	
		        System.out.println("sera este ==>" + f +"  " + vet[i]);  
		        }



		        		       
		 }
		 }
