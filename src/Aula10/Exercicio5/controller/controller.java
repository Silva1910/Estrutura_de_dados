// Classe ModificacaoCadastroController.java
package Aula10.Exercicio5.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import Aula10.Exercicio5.model.model;

public class controller {

	public class ModificacaoCadastroController {

	    private static void novoArquivo(List<model> lista, String nomeArquivo) {
	        File arquivo = new File("C:\\TEMP", nomeArquivo);
	        int contador = 0;
	        StringBuilder buffer = new StringBuilder();

	        for (model cliente : lista) {
	            String linha = cliente.getCpf() + ";" + cliente.getNome() + ";" + cliente.getIdade() + ";" + cliente.getLimiteCredito() + "\n";
	            buffer.append(linha);
	            contador++;
	        }

	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
	            writer.write(buffer.toString());
	            System.out.println("Total de elementos processados: " + contador);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void novoCadastro(int idadeMin, int idadeMax, Double limiteCredito) {
	        List<model> listaClientes = new ArrayList<>();

	        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\TEMP\\cadastro.csv"))) {
	            String linha;

	            while ((linha = bufferedReader.readLine()) != null) {
	                String[] valores = linha.split(";");
	                model cliente = new model(valores[0], valores[1], Integer.parseInt(valores[2]), Double.parseDouble(valores[3]));

	                if (cliente.getIdade() >= idadeMin && cliente.getIdade() <= idadeMax &&
	                        cliente.getLimiteCredito() > limiteCredito) {
	                    listaClientes.add(cliente);
	                }
	            }

	            novoArquivo(listaClientes, "Idade" + idadeMin + "a" + idadeMax + "_limite" + limiteCredito + ".csv");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
}