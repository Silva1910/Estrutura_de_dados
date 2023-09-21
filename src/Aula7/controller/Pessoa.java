package Aula7.controller;

import javax.swing.JOptionPane;

import lib.Fila;

public class Pessoa {

	public int id;
	public String nome;
	 private static int senha = 1;

	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome;
	}

	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;

	}

	public static int adicionaPilhaComum( String nomeComum, Fila<String> comum) {
		
		comum.insert(nomeComum + " (senha: " + senha + ")");
		return senha++;
	}

	public static int  adicionaPilhaPrioritarios( String nomePrioritario,Fila<String> prioritarios) {
		prioritarios.insert(nomePrioritario + " (senha: " + senha + ")");
		return senha++;
	}

	public static void atenderPessoas(Fila<String> comum, Fila<String> prioritarios) throws Exception {
		int i = 1;

		if (!prioritarios.isEmpty() && i % 4 != 0) {
			String pessoaPrioritaria = prioritarios.remove();
			JOptionPane.showMessageDialog(null, "Atendendo a pessoa prioritária: " + pessoaPrioritaria);
		} else if (!comum.isEmpty()) {
			String pessoaComum = comum.remove();
			JOptionPane.showMessageDialog(null, "Atendendo a pessoa comum: " + pessoaComum);
		} else {
			JOptionPane.showMessageDialog(null, "As filas estão vazias no momento");
			return;
		}
		i++;
	}

	public Pessoa() {
		super();
	}
}