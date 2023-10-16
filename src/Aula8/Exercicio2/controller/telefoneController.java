package Aula8.Exercicio2.controller;

import javax.swing.JOptionPane;

import lib.Fila;

public class telefoneController {

	public static void insereLigacao(Fila f, String numTelefone) {
		f.insert(numTelefone);
	}

	public static void consultaLigacoes(Fila f) throws Exception {
		

			String ultimoTel = (String) f.remove();
			JOptionPane.showMessageDialog(null," o ultimo telefone que foi registrado " + ultimoTel);

		}
	}
