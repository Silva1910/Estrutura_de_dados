package Aula11.Exercicio1.controller;

import LibLista.Lista;

public class controller {



	public static void main(String args[])  throws Exception {
		Lista[] l;
		l = new Lista[50];
		int[] numeros = { 1112, 1036, 1100, 1842, 1186, 895, 1293, 1599, 1389, 1505, 863, 1970, 1358, 1425, 882, 1174,
				1921, 1848, 1260, 1003, 1087, 1028, 1152, 1302, 1609, 1054, 1863, 1358, 910, 1890, 1487, 687, 582, 707,
				557, 1073, 1790, 876, 862, 1521, 1723, 990, 1515, 676, 616, 1976, 1840, 1185, 1707, 1040, 1019, 1958,
				958, 1018, 645, 1184, 1892, 1447, 1453, 1986, 769, 838, 1621, 1751, 1841, 1389, 999, 764, 918, 1016,
				1142, 933, 981, 1649, 1144, 588, 1375, 1710, 1882, 777 };

		for (int i = 0; i < 50; i++) {
			l[i] = new Lista();
		}
		for (int num : numeros) {
			int posicao = hash(num);
			if (l[posicao].isEmpty()) {
				l[posicao].addFirst(num);
			} else {
				l[posicao].addLast(num);
			}
		}
		
		
		
		
		for (int i = 0; i < 50; i++) {
            System.out.print("Posicao " + i + ": ");
            if (!l[i].isEmpty()) {
                // Adicione este loop para percorrer os elementos da lista
                for (int j = 0; j < l[i].size(); j++) {
                    System.out.print(l[i].get(j) + " ==> ");
                }
                System.out.println(" null " );
            } else {
                System.out.println("#null ");
            }
        }

	}
	
	public static int hash(int numero) {
		int posicao = numero % 50;
		return posicao;
	}
	
}
