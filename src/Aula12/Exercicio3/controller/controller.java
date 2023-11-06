package Aula12.Exercicio3.controller;

import LibLista.Lista;

public class controller {
	public static void main(String[] args) throws Exception {
		   Lista<Integer>[] l = new Lista[10];
		   Lista<Integer>[] l2 = new Lista[5];
		    for (int i = 0; i < 10; i++) {
	          l[i] = new Lista<>();
	        }
		    for (int i = 0; i < 5; i++) {
		          l2[i] = new Lista<>();
		        }
		    
		    l[0].addFirst(12);
		    l[0].addLast(647);
		    l[0].addLast(158);
		    l[0].addLast(136);
		    l[0].addLast(467);
		    
		    l[1].addFirst(156);
		    l[1].addLast(600);
		    l[1].addLast(551);
	        
		    l[2].addFirst(263);
		    l[2].addLast(414);
		    l[2].addLast(882);
	        l[2].addLast(945);
	        l[2].addLast(914);
	        l[2].addLast(953);
	        l[2].addLast(629);
	        
	        
		    l[3].addFirst(884);
		    l[3].addLast(795);
		    l[3].addLast(194);
	        l[3].addLast(513);
	        
	        l[4].addFirst(591);
		    l[4].addLast(847);
		    l[4].addLast(66);
	        l[4].addLast(337);
	        l[4].addLast(979);
	        
	        l[5].addFirst(768);
		    l[5].addLast(53);
		    
		    l[6].addFirst(114);
	        l[6].addLast(803);
	        l[6].addLast(90);
	        l[6].addLast(339);
	        l[6].addLast(550);
	        
	        l[7].addFirst(574);
		    l[7].addLast(977);
		    l[7].addLast(216);
	        l[7].addLast(99);
	        l[7].addLast(617);
	        l[7].addLast(88);
	        
	        l[8].addFirst(142);
		    l[8].addLast(148);
		    l[8].addLast(227);
	        l[8].addLast(939);
	        l[8].addLast(585);
	        l[8].addLast(338);
	        l[8].addLast(206);
	                
	        l[9].addFirst(569);
		    l[9].addLast(708);
		    l[9].addLast(884);
	        

	        
		     for (int i = 0; i < l.length; i++) {
		            if (!l[i].isEmpty()) {
		                for (int j = 0; j < l[i].size(); j++) {
		                    int elemento = l[i].get(j);
		                    int posicao = hash(elemento);

		                    if (l2[posicao].isEmpty()) {
		                        l2[posicao].addFirst(elemento);
		                    } else {
		                        l2[posicao].addLast(elemento);
		                    }
		                }
		            }
		        }

		    for (int i = 0; i < l2.length; i++) {
	            System.out.print("Posicao " + i + ": ");

	            if (!l2[i].isEmpty()) {
	                for (int j = 0; j < l2[i].size(); j++) {
	                    System.out.print(l2[i].get(j) + " ==> ");
	                }
	                System.out.println("null");
	            } else {
	                System.out.println("#null");
	            }
	        }
	        
	        
	   
	   }
	   static int hash(int n) {
		
			    return n % 5;
			

	        
	   }
}
