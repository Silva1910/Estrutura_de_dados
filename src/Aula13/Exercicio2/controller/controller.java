package Aula13.Exercicio2.controller;

import br.edu.fateczl.arvore.inteiro.ArvoreInt.ArvoreInt;





public class controller {

    public static void main(String[] args) throws Exception {

        int[] vet = { 33, 15, 41, 38, 47, 34, 49, 43 };
        ArvoreInt arvore = new ArvoreInt();

        for (int i = 0; i < vet.length; i++) {
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