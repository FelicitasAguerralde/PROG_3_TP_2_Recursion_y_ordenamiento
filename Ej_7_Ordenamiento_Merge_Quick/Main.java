package Ej_7_Ordenamiento_Merge_Quick;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int N = 10; // tamaño del arreglo
        int[] arreglo = new int[N];

        Random random = new Random();

        // Cargar arreglo con valores aleatorios
        for (int i = 0; i < N; i++) {
            arreglo[i] = random.nextInt(100); // números entre 0 y 99
        }

        // Copias para probar ambos algoritmos
        int[] arregloMerge = arreglo.clone();
        int[] arregloQuick = arreglo.clone();

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(arreglo));

        // Probar MergeSort
        MergeSort mergeSort = new MergeSort();

        mergeSort.mergeSort(arregloMerge);
        System.out.println("\nArreglo ordenado con MergeSort:");
        System.out.println(Arrays.toString(arregloMerge));

        // Probar QuickSort
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arregloQuick);
        System.out.println("\nArreglo ordenado con QuickSort:");
        System.out.println(Arrays.toString(arregloQuick));
    }
}
