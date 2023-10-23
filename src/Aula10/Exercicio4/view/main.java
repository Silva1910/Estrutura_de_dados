package Aula10.Exercicio4.view;

import LibLista.Lista;

public class main {

	public static void main(String[] args) throws Exception {
		

			Lista<Integer> l = new Lista<>();

			l.add(3, 0);
			l.add(5, 1);
			l.add(8, 2);
			l.add(12, 3);
			l.add(9, 4);
			l.add(7, 5);
			l.add(6, 6);
			l.add(2, 7);
			l.add(3, 8);
			l.add(7, 9);
			l.add(16, 10);

			int maior1 = l.get(0);
			int maior2 = l.get(0);

			for (int i = 0; i < l.size(); i++) {

				if (l.get(i) > maior1) {
					maior2 = maior1;
					maior1 = l.get(i);
				}

				else if (l.get(i) > maior2) {
					maior2 = l.get(i);
				}
			}

			System.out.println(" o maior numero e  ==>:  " + maior1 + " || e o segundo maior numero e  ==>:  " + maior2);
		}

	}


