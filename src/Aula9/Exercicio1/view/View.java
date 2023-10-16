package Aula9.Exercicio1.view;

import lib.Lista;

public class View {

    public static void main(String[] args) {
        Lista<Integer> l = new Lista<>();
        Lista<Integer> l2 = new Lista<>();

        try {
            // Adiciona elementos à lista original
            l.addFirst(3);
            l.addLast(5);
            l.add(18, 2);
            l.add(12, 3);
            l.add(9, 4);
            l.add(7, 5);
            l.add(6, 6);
            l.add(2, 7);
            l.add(13, 8);
            l.add(4, 9);
            l.add(16, 10);

            int tamanho = l.size() - 1;

            // Inverte a lista
            for (int i = 0; i < 11; i++)
                l2.add(l.get(tamanho - i), i);

            // Imprime a lista invertida
            System.out.println("lista invertida abaixo"); 
            for (int i = 0; i < 11; i++)
                System.out.print("|" +l2.get(i)+ "|" );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
