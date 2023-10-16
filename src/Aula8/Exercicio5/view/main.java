package Aula8.Exercicio5.view;
import Aula8.Exercicio5.model.*;
import Aula8.Exercicio5.controller.*;
import lib.Fila;

public class main {

	public static void main(String[] args) throws Exception {
		   Fila<model> filaParque = new Fila<>(); // Utilize generics para especificar o tipo de elementos na fila

	        for (int i = 1; i <= 30; i++) {
	            String nome = "pessoa" + i;
	            int idade = (int) (Math.random() * 31 + 10);
	            float altura = (float) (Math.random() * 0.65 + 1.35);
	            model f = new model(nome, idade, altura);

	            filaParque.insert(f);
	        }

	        ParqueController.processarFila(filaParque);
	}

}
