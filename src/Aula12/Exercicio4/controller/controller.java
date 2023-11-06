package Aula12.Exercicio4.controller;

import javax.swing.JOptionPane;

import Aula12.Exercicio4.model.model;
import LibLista.Lista;

public class controller {

	public static void adicionaDepartamento(Lista<model>[] l, String depto) throws Exception {

	
		    String[] partes = depto.split(";");

		    if (partes.length == 3) {
		    	int andar = Integer.parseInt(partes[0]);
		        String nome = partes[1];
		       
		        String descricao = partes[2];
		        
		        model novoDepartamento = new model (andar,nome,descricao);

		        int posicao = hash(andar);

		      if (l[posicao].isEmpty()) {
		            l[posicao] = new Lista<>();
		            l[posicao].addFirst(novoDepartamento);
		            JOptionPane.showMessageDialog(null, "efetuado com sucesso");
		        } else {
		            l[posicao].addLast(novoDepartamento);
		            JOptionPane.showMessageDialog(null, "efetuado com sucesso");
		        }
		    } else {
		        JOptionPane.showMessageDialog(null, "Formato de entrada inválido para o morador: " + depto, "Erro", JOptionPane.ERROR_MESSAGE);
		    }
		  
		}


	

	public static int hash(int num) {
	    int posicao = num   ;
	    return posicao;
	}

	public static void consulta(Lista<model>[] l) throws Exception {
	    for (int i = 0; i < l.length; i++) { // Alteração aqui para percorrer todo o array
	        System.out.print("Posicao " + i + ": ");
	        
	        if (l[i] != null && !l[i].isEmpty()) {
	            // Adicione este loop para percorrer os elementos da lista vinculada
	            for (int j = 0; j < l[i].size(); j++) {
	                model departamento = l[i].get(j); // Obtenha o objeto model da lista vinculada
	                System.out.print("andar: " + departamento.getAndar() + " numero da porta ==> " + j + "  Nome do departamento: " + departamento.getNome() +
	                                 ", descricao: " + departamento.getDescricao()  + " ==> ");
	            }
	            System.out.println(" null ");
	        } else {
	            System.out.println("#null ");
	        }
	    }
	}

		
		


	public static void removeDepartamento(Lista<model>[] l, int posicao, int posicao2) throws Exception {
		  JOptionPane.showMessageDialog(null, " o departamento que foi excluido   foi  " + l[posicao].get(posicao2));
	 l[posicao].remove(posicao2);
		
	}

	public static void consultaDepartamento(Lista<model>[] l, int posicao, int posicao2) throws Exception {
	JOptionPane.showMessageDialog(null,	" o departamento com este  atributos  " + l[posicao].get(posicao2));
		
	}
}
