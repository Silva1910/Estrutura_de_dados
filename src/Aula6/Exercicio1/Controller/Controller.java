package Aula6.Exercicio1.Controller;

import model.PilhaInteiros;

public class Controller {

    public void processarVetor(int[] vetor) throws Exception {
        PilhaInteiros p = new PilhaInteiros();
        int size = vetor.length;

        for (int i = 0; i < size - 1; i++) {
            if (vetor[i] >= 0) {
                p.push(vetor[i]);
            } else {
                int soma = p.top();
                p.pop();
                soma += p.top();
                p.pop();
                p.push(vetor[i]);
                p.push(soma);
            }
        }

        // Apresentando a pilha no final
        System.out.println("Conteudo da pilha no final:");
        while (!p.isEmpty()) {
            System.out.println(p.top());
            p.pop();
        }
    }
}