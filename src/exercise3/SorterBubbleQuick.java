
package exercise3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Scorpion
 * 
 * En esta clase estaremos creando la logica para realizar el ordenamiento de un Array por medio del
 * metodo Borbuja y QuickSort
 * 
 * dicho Array se crea mediando un Ramdon para llenar el Array con numeros aleatorios
 */
public class SorterBubbleQuick {


    static Scanner sc = new Scanner(System.in);
    static int[] numberArray = new int[5];

    /**
     * metodo que usaremos para hacer el llamado del menu de las funciones del punto
     *
     */
    public static void menu() {

        System.out.println("---------------------------");
        System.out.println("Hola este es el ejercicio 3");
        System.out.println("---------------------------");


        numberArray = ThreadLocalRandom.current().ints(0, 50).limit(10).toArray();

        System.out.print("Arreglo inicial \n");
       
        System.out.println(Arrays.toString(numberArray));

        boolean menuLoop = true;
        /**
         * menu donde estaremos dando la eleccion al usuario porqie metodo realizar el
         * ordenamiento del arreglo creado previamente por el random
         */
        while (menuLoop) {
            System.out.println("Escoja una opción para realizar el arreglo: \n" +
                    "1. Burbuja\n" +
                    "2. Quick sort\n   " +
                    "3. Salir");
            int option = sc.nextInt();
            int[] sorted = new int[numberArray.length];
            /**
             * Switch donde estaremos interactuando entre las funciones que se han generado para
             * realizar el ordenamiento del arreglo
             */
            switch (option) {
                case 1:
                    System.out.println("Arreglo inicial");
                    System.out.println(Arrays.toString(numberArray));
                    System.out.println("Arreglo Ordenamiento metodo burbuja");
                    sorted = orderBubble(numberArray);
                    System.out.println(Arrays.toString(sorted));
                    break;
                case 2:
                    System.out.println("Arreglo inicial");
                    System.out.println(Arrays.toString(numberArray));
                    System.out.println("Arreglo Ordenamiento metodo quicksort");
                    sorted = MakeOrderQuickSort(numberArray, 0, numberArray.length - 1);
                    System.out.println(Arrays.toString(sorted));
                    break;
                case 3:
                    menuLoop = false;
                    break;
                default:
                    System.out.println("Por favor ingrese una opción válida");
                    System.out.println("Escoja una opción para realizar el arreglo: \n" +
                            "1. Burbuja\n" +
                            "2. Quick sort\n   " +
                            "3. Salir");
                    break;
            }
        }
    }

    /**
     * metodo por el cual estaremos realizando el ordenamiento del arreglo por el famoso
     * ordenamiento burbuja
     * @param array
     * @return
     */
    private static int[] orderBubble(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        try {
            int aux;
            for (int i = 2; i <= sortedArray.length; i++) {
                for (int j = 0; j <= sortedArray.length - i; j++) {
                    if (sortedArray[j] > sortedArray[j + 1]) {
                        aux = sortedArray[j];
                        sortedArray[j] = sortedArray[j + 1];
                        sortedArray[j + 1] = aux;
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error de indice");
        }

        return sortedArray;
    }

    /**
     * metodo QuickSort el cual sera el otro metodo por el cual el usuario tendra en el menu
     * en caso que desee organizar el areglo por este metodo
     * @param array
     * @param firstNum
     * @param lastNum
     * @return
     */
    private static int[] MakeOrderQuickSort(int[] array, int firstNum, int lastNum) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int pivot = sortedArray[firstNum];
        int a = firstNum;
        int z = lastNum;
        int aux;

        while (a < z) {
            while (sortedArray[a] <= pivot && a < z) a++;
            while (sortedArray[z] > pivot) z--;

            if (a < z) {
                aux = sortedArray[a];
                sortedArray[a] = sortedArray[z];
                sortedArray[z] = aux;
            }
        }

        sortedArray[firstNum] = sortedArray[z];
        sortedArray[z] = pivot;

        if (firstNum < z - 1) MakeOrderQuickSort(sortedArray, firstNum, z - 1);
        if (z + 1 < lastNum) MakeOrderQuickSort(sortedArray, z + 1, lastNum);

        return sortedArray;
    }

}