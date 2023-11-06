package Aula12.Exercicio5.controller;

import javax.swing.JOptionPane;

import Aula12.Exercicio5.model.model;
import LibLista.Lista;

public class controller {
	public static void adicionaConta(Lista<model>[] l, int numero,  String nome,  int saldo) throws Exception {

	

		
			model novoInfo = new model(numero, nome, saldo);
			
	        
		
			int posicao = hash(numero);


			if (l[posicao].isEmpty() || l[posicao] == null) {
				l[posicao] = new Lista<>();
				l[posicao].addFirst(novoInfo);
				JOptionPane.showMessageDialog(null, "efetuado com sucesso");
			} else {
				l[posicao].addLast(novoInfo);
				JOptionPane.showMessageDialog(null, "efetuado com sucesso");
			}
		}




	private static int hash(int numero) {
	    int temp = Math.abs(numero) % 10;
	
	    return  temp;
	}


	public static void consulta(Lista<model>[] l) throws Exception {
		for (int i = 0; i < l.length; i++) { // Alteração aqui para percorrer todo o array
			System.out.print("Posicao " + i + ": ");

			if (l[i] != null && !l[i].isEmpty()) {
				// Adicione este loop para percorrer os elementos da lista vinculada
				for (int j = 0; j < l[i].size(); j++) {
					model banco = l[i].get(j); // Obtenha o objeto model da lista vinculada
					System.out.print("numero da conta: " + banco.getNumeroConta() + " nome  do cliente ==> "
							+ banco.getNome() + ", saldo no total de : " + banco.getSaldo() + " ==> ");
				}
				System.out.println(" null ");
			} else {
				System.out.println("#null ");
			}
		}
	}

	public static void removeConta(Lista<model>[] l, int posicao, int posicao2) throws Exception {
		JOptionPane.showMessageDialog(null, " a conta que foi excluida foi  " + l[posicao].get(posicao2));
		l[posicao].remove(posicao2);

	}

	public static void consultaConta(Lista<model>[] l, int posicao, int posicao2) throws Exception {
		JOptionPane.showMessageDialog(null, " a conta com  este  atributos  ==>   " + l[posicao].get(posicao2));

	}
	 
}