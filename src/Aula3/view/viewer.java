package Aula3.view;

import br.edu.fateczl.ordenacao.ordenacaoBubbleSort;
import AULA3.mergeSort.OrdMergeSort;

public class viewer {

    public static void main(String[] args) {
        int[] vetor = {44, 43, 42, 41, 40, 39, 38};
        ordenacaoBubbleSort bubble = new ordenacaoBubbleSort();
        int[] tempBubble = bubble.bubblesort(vetor);
        System.out.println("Bubble Sort:");
        for (int i = 0; i < tempBubble.length; i++) {
            System.out.print(tempBubble[i] + " ");
        }
        System.out.println();

        viewer viewer = new viewer();
        viewer.parte2();
    }

    public void parte2() {
        int[] vetor2 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
        OrdMergeSort merge = new OrdMergeSort();
        int[] tempMerge = merge.MergeSort(vetor2, 0, vetor2.length - 1); // Use MergeSort() method
        System.out.println("Merge Sort:");
        for (int i = 0; i < tempMerge.length; i++) {
            System.out.print(tempMerge[i] + " ");
        }
    }
}
