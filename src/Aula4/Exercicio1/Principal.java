package Aula4.Exercicio1;


import lib.QuickSort;

public class Principal {

    public static void main(String[] args) {
        QuickSort.OrdQuickController controller = new QuickSort().new OrdQuickController();

        int[] vetor0 = { 44, 43, 42, 41, 40, 39, 38 };
        int[] temp0 = controller.QuickSort(vetor0, 0, vetor0.length - 1);
        System.out.println("Primeiro Sort:");
        printArray(temp0);

        int[] vetor1 = { 74, 20, 74, 87, 81, 16, 25, 99, 44, 58 };
        int[] temp1 = controller.QuickSort(vetor1, 0, vetor1.length - 1);
        System.out.println("Segundo Sort:");
        printArray(temp1);

        int[] vetor2 =  {31, 32, 33, 34, 99, 98, 97, 96};
        int[] temp2 = controller.QuickSort(vetor2, 0, vetor2.length - 1);
        System.out.println("Terceiro Sort:");
        printArray(temp2);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Pular linha após imprimir o vetor
    }
}

