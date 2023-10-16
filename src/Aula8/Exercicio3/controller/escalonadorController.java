package Aula8.Exercicio3.controller;

import javax.swing.JOptionPane;

import Aula8.Exercicio3.object.object;
import lib.Fila;

public class escalonadorController {

    public escalonadorController(Fila<object> f) throws Exception {
        int totalProcessos = f.size();  // Obtém o número total de processos na fila

        while (!f.isEmpty()) {
            object processo = f.remove();
            
            if (processo.QtdRetornos > 1) {
                processo.QtdRetornos--;
                f.insert(processo);
            } else {
               System.out.println("o processo ==>  " + processo.nome +" foi concluido com sucesso");
            }
        }

        // Se todos os processos foram processados, o loop termina
    
        System.out.println("Todos os processos foram concluídos.");
       
     
       
               
    }
}
    
