package Aula11.Exercicio3.controller;

import javax.swing.JOptionPane;

import Aula11.Exercicio3.model.model;
import LibLista.Lista;

import javax.swing.JOptionPane;

import LibLista.Lista;

public class controller {

	public static void addBarra(Lista<model>[] l, int altura, int largura, int comprimento) throws Exception {
		int posicao = 0;
		int volume = altura * largura * comprimento;
		int grama=0;
		String doce = "";

		if (volume >= 50 && volume <= 60) {
			grama = 60;
			doce = "Bombom";
		 posicao = hash(1);
		} else if (volume >= 100 && volume <= 110) {
			doce = "Pavê";
			grama = 115;
		 posicao = hash(2);
		} else if (volume >= 150 && volume <= 165) {
			grama = 160;
			doce = "Brigadeiro";
			 posicao = hash(3);
		} else if (volume >= 200 && volume <= 220) {
			doce = "Bolo";
			grama = 215;
			 posicao = hash(4);
		} else if (volume >= 260 && volume <= 280) {
			doce = "Ovo de Páscoa";
			grama = 280;
			 posicao = hash(5);
		} else {
			doce = "Tipo não especificado";
		}


		model novaBarra = new model(doce, grama, volume);


		// Adicionar a nova barra à lista na posição calculada
		if (l[posicao].isEmpty()) {
			l[posicao] = new Lista<>();
			l[posicao].addFirst(novaBarra);
			  JOptionPane.showMessageDialog(null, " a barra foi adicionada com sucesso");
				 
		} else {
			l[posicao].addLast(novaBarra);
			JOptionPane.showMessageDialog(null, " a barra foi adicionada com sucesso");
		}

	}

	static int hash(int num) {
		int posicao = num - 1;
		return posicao;

	}

	public static void consulta(Lista<model>[] l) throws Exception {
	    for (int i = 0; i < l.length; i++) {
	        System.out.print("Tabela indice " + i + ": ");

	        if (l[i] != null && !l[i].isEmpty()) {
	            for (int j = 0; j < l[i].size(); j++) {
	                model Model = l[i].get(j);
	                System.out.print("o volume e ==> " + Model.getVolume() + ", Nome do doce e : " + Model.getDoce() +
	                                 ", e as gramas sao aproximadamente: " + Model.getGramas() +  " ==> ");
	            }
	            System.out.println(" null ");
	        } else {
	            System.out.println("#null ");
	        }
	    }
	}
	






	}

	
		

