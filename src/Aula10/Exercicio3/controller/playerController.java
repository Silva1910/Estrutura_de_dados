package Aula10.Exercicio3.controller;

import javax.swing.JOptionPane;

import Aula10.Exercicio3.model.*;
import Aula8.Exercicio1.model.Model;
import LibSet.ListaSet;

public class playerController<t> {
	static int i = 0;
	static int j = 0;

	public static <T> void adicionaMusica(ListaSet<T> l, String musica) throws Exception {

		String[] partes = musica.split(";");

		if (partes.length == 3) {
			String nomeDaMusica = partes[0];
			String nomeDoArtista = partes[1];
			int duracao = Integer.parseInt(partes[2]);

			Musica novaMusica = new Musica(nomeDaMusica, nomeDoArtista, duracao);
			if (l.isEmpty()) {
				l.addFirst( (T) novaMusica);
			} else {
				l.addLast( (T) novaMusica);
			}

		} else {
	
			JOptionPane.showMessageDialog(null, "Formato de entrada inválido para a música: " + musica, "Erro", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static <T> void removeMusica(ListaSet<T> l, int posicao) throws Exception {
		
		  JOptionPane.showMessageDialog(null, " A musica que foi excluida com sucesso ela estava no indice  " + i + "  foi a " + l.get(i));
				i++;
			
		
			l.remove(posicao);
		
	}

	public static <T> void executaPlaylist(ListaSet<T> l) throws Exception {
		Musica music = (Musica) l.get(j);
		
		
			  JOptionPane.showMessageDialog(null," a musica que sera  reporduzida e ==> " + l.get(j));
			  int duracao = music.getDuracao() * 2000;
			  Thread.sleep(duracao);
			j++;

		}
	}

