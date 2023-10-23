package Aula10.Exercicio2;

import LibLista.Lista;

public class main {

	public static void main(String[] args) throws Exception {
		Lista<Integer> a = new Lista<>();
		Lista<Integer> b = new Lista<>();
		Lista<Integer> interseccao = new Lista<>();
		Lista<Integer> uniao = new Lista<>();
		int i;
		int j;

		a.add(3, 0);
		a.add(5, 1);
		a.add(8, 2);
		a.add(12, 3);
		a.add(9, 4);
		a.add(7, 5);
		a.add(16, 6);
		b.add(9, 0);
		b.add(6, 1);
		b.add(2, 2);
		b.add(3, 3);
		b.add(7, 4);

		for ( i = 0; i < a.size(); i++) {
			for ( j = 0; j < b.size(); j++) {
				if (a.get(i) == b.get(j)) {
					interseccao.addFirst(a.get(i));
					break; 
				}
			}
		}

		
		for ( i = 0; i < a.size(); i++) {
			uniao.addFirst(a.get(i));
		}

		for ( j = 0; j < b.size(); j++) {
		    int aux = b.get(j);
	
		    for ( i = 0; i < a.size(); i++) {
		        if (aux == a.get(i)) {
		            break;
		        }
		    }
		    if (i == a.size()) {
		        uniao.addFirst(aux);
		    }
		}


		// Impressão da interseção
		System.out.print("Interseccao: ");
		for ( i = 0; i < interseccao.size(); i++) {
			System.out.print(interseccao.get(i) + " | ");
		}
		System.out.println();

		// Impressão da união
		System.out.print("Uniao: ");
		for (i = 0; i < uniao.size(); i++) {
			System.out.print(uniao.get(i) + " | ");
		}
	}
}
