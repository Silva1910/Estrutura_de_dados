package Aula4.Exercico2.main;
import br.edu.fateczl.ordenacao.ordenacaoBubbleSort;
import lib.QuickSort;
import AULA3.mergeSort.OrdMergeSort;


public class principal {

	public static void main(String[] args) {
		    int[] vetor = new int[1500];

	        // Preenchendo o vetor com números aleatórios
	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = (int) (Math.random() * 1501);
	        }

	        // Medindo o tempo de ordenação pelo Bubble Sort
	        ordenacaoBubbleSort bubble = new ordenacaoBubbleSort();
	        double tempoInicialBubble = System.nanoTime();
	        int[] tempBubble = bubble.bubblesort(vetor.clone());
	        double tempoFinalBubble = System.nanoTime();
	        double tempoTotalBubble = (tempoFinalBubble - tempoInicialBubble) / Math.pow(10, 9);
	        System.out.println("Tempo total do Bubble Sort: " + String.format("%.7f", tempoTotalBubble) + "s");

	        // Medindo o tempo de ordenação pelo Merge Sort
	        OrdMergeSort merge = new OrdMergeSort();
	        double tempoInicialMerge = System.nanoTime();
	        int[] tempMerge = merge.MergeSort(vetor.clone(), 0, vetor.length - 1);
	        double tempoFinalMerge = System.nanoTime();
	        double tempoTotalMerge = (tempoFinalMerge - tempoInicialMerge) / Math.pow(10, 9);
	        System.out.println("Tempo total do Merge Sort: " + String.format("%.7f", tempoTotalMerge) + "s");
		        
				
	        // Medindo o tempo de ordenação pelo Quick Sort
	        QuickSort.OrdQuickController controller = new QuickSort().new OrdQuickController(); 
	        double tempoInicialQuick = System.nanoTime();
	        int[]  TempQuick = controller.QuickSort(vetor.clone(), 0, vetor.length - 1); 
	        double tempoFinalQuick = System.nanoTime();
	        double tempoTotalQuick = (tempoFinalQuick - tempoInicialQuick) / Math.pow(10, 9);
	        System.out.println("Tempo total do Quick Sort: " + String.format("%.7f", tempoTotalQuick) + "s");

	        
	        
			

		        
		   
		    
	
		        }

	}


