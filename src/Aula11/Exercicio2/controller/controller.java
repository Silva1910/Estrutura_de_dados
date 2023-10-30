package Aula11.Exercicio2.controller;

import LibLista.Lista;

import javax.swing.JOptionPane;


import Aula11.Exercicio2.model.*;
public class controller {

	
		public static void adicionaMorador(Lista<model>[] l, String morador) throws Exception {

		
			    String[] partes = morador.split(";");

			    if (partes.length == 5) {
			        
			        String nome = partes[0];
			        int num = Integer.parseInt(partes[1]);
			        String modelo = partes[2];
			        String cor = partes[3];
			        int placa = Integer.parseInt(partes[4]);

			        model novoMorador = new model (nome, num,  modelo, cor, placa);

			        int posicao = hash(num);

			      if (l[posicao].isEmpty()) {
			            l[posicao] = new Lista<>();
			            l[posicao].addFirst(novoMorador);
			        } else {
			            l[posicao].addLast(novoMorador);
			        }
			    } else {
			        JOptionPane.showMessageDialog(null, "Formato de entrada inválido para o morador: " + morador, "Erro", JOptionPane.ERROR_MESSAGE);
			    }
			    JOptionPane.showMessageDialog(null, "efetuado com sucesso");
			}


		

		public static int hash(int num) {
		    int posicao = (num / 100) -1 ;
		    return posicao;
		}

		public static void consulta(Lista<model>[] l) throws Exception {
		    for (int i = 0; i < l.length; i++) { // Alteração aqui para percorrer todo o array
		        System.out.print("Posicao " + i + ": ");
		        
		        if (l[i] != null && !l[i].isEmpty()) {
		            // Adicione este loop para percorrer os elementos da lista vinculada
		            for (int j = 0; j < l[i].size(); j++) {
		                model morador = l[i].get(j); // Obtenha o objeto model da lista vinculada
		                System.out.print("Num: " + morador.getNumApto() + ", Nome: " + morador.getnome() +
		                                 ", Modelo: " + morador.getModelo() + ", Cor: " + morador.getCor() +
		                                 ", Placa: " + morador.getPlaca() + " ==> ");
		            }
		            System.out.println(" null ");
		        } else {
		            System.out.println("#null ");
		        }
		    }
		}

			
			


		public static void removeMorador(Lista<model>[] l, int posicao, int posicao2) throws Exception {
			  JOptionPane.showMessageDialog(null, " o morador que perdeu a permissao foi a " + l[posicao].get(posicao2));
		 l[posicao].remove(posicao2);
			
		}

		public static void consultaMorador(Lista<model>[] l, int posicao, int posicao2) throws Exception {
		JOptionPane.showMessageDialog(null,	" o morador e este com os atributos" + l[posicao].get(posicao2));
			
		}

	}