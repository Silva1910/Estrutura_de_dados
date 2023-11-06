package Aula12.Exercicio1.view;

import LibLista.Lista;

public class main {

    public static void main(String[] args) throws Exception {
        int[] numeros = {12, 38, 98, 83, 96, 15, 58, 94, 23, 98, 55, 9, 75, 75, 20, 1, 42, 71, 25, 94, 83, 4, 12, 43, 75,
                96, 39, 74, 52, 31, 12, 81, 18, 68, 51, 46, 57, 65, 33, 76, 72, 97, 57, 92, 66, 53, 41, 19, 35, 61,
                5, 90, 85, 71, 77, 56, 72, 3, 64, 64, 5, 22, 92, 68, 42, 49, 30, 64, 22, 23, 81, 32, 59, 36, 24, 29, 22,
                29, 31, 31, 43, 50, 86, 100, 40, 94, 87, 10, 7, 34, 52, 30, 5, 79, 89, 9, 97, 42, 38, 44, 2, 44, 58,
                63};

        Lista<Integer>[] tabelaEspalhamento = new Lista[100];

        for (int i = 0; i < 100; i++) {
            tabelaEspalhamento[i] = new Lista<>();
        }

        for (int i = 0; i < numeros.length; i++) {
            int posicao = hash(numeros[i]);

            if (tabelaEspalhamento[posicao].isEmpty()) {
                tabelaEspalhamento[posicao].addFirst(numeros[i]);
            } else {
                tabelaEspalhamento[posicao].addLast(numeros[i]);
            }
        }

        for (int i = 0; i < tabelaEspalhamento.length; i++) {
            System.out.print("Posicao " + i + ": ");

            if (!tabelaEspalhamento[i].isEmpty()) {
                for (int j = 0; j < tabelaEspalhamento[i].size(); j++) {
                    System.out.print(tabelaEspalhamento[i].get(j) + " ==> ");
                }
                System.out.println("null");
            } else {
                System.out.println("#null");
            }
        }
    }

    static int hash(int n) {
        int posicao =  (int) (100*(((((Math.sqrt(7) - 1) / 2) * n) % 1)));; 

        return posicao;
    }
}
