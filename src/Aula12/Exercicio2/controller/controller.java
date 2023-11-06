package Aula12.Exercicio2.controller;

import LibLista.Lista;

public class controller {
	public static void main(String[] args) throws Exception {
	    Lista<Integer>[] l = new Lista[2];
		int[]  vetor = new int [10];
	    for (int i = 0; i < 2; i++) {
          l[i] = new Lista<>();
        }
		
		for (int i =0; i<10; i++) {
			vetor[i] = (int) (Math.random() * 101);
		    int posicao = hash(vetor[i]);

            if (l[posicao].isEmpty()) {
                l[posicao].addFirst(vetor[i]);
            } else {
                l[posicao].addLast(vetor[i]);
            }
		}
		

        for (int i = 0; i < l.length; i++) {
            System.out.print("Posicao " + i + ": ");

            if (!l[i].isEmpty()) {
                for (int j = 0; j < l[i].size(); j++) {
                    System.out.print(l[i].get(j) + " ==> ");
                }
                System.out.println("null");
            } else {
                System.out.println("#null");
            }
        }
	

		
	}
    static int hash(int n) {
        if (n%2 ==0) {	
        return 0;
    } else {
    	return 1;
    	}
    }
	
	
}
