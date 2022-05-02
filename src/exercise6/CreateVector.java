
package exercise6;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Scorpion
 * 
 * Aqui crearemos la clase crear vector, donde desarrollaremos toda la logica para crear el vector 
 * el vector a crear se le indicara al usuario que ingrese numeros por teclado y cuando este ingrese un numero repetido el programa se detendra
 * y posterior a ello mostrara el listado de los numeros del vector por consola 
 */
public class CreateVector {

    static private Vector<Integer> newVector;
    static private Scanner sc;
    static private File file;
    static private FileWriter fw;
    static private BufferedWriter out;
    static private boolean activ;

    static private Random numRandom = new Random();

    public static void createdVector() {
        System.out.println(("\n Si el número ingresado ya existe en el Array el programa se detendra \n" +
                " posterior a esto te mostrara el Array con todos los datos ingresados  \n"
                + " y  regresara al ménu principal").toUpperCase());

        sc = new Scanner(System.in);
        newVector = new Vector<Integer>();
        System.out.println("-------------------");
        activ = false;

        int number;
        int numRamdon = numRandom.nextInt((2000 + 1) + 1);
        do {
            System.out.print(" ");
            System.out.println("\n ingresa un número= ".toUpperCase());
            try {
                number = sc.nextInt();
                if (newVector.contains(number)) {
                    System.out.println(" ");
                    System.out.println("\n Estos son los datos que contiene el vector \n".toUpperCase());
                    for (Integer num : newVector) {
                        System.out.println(num);
                    }
                    activ = false;
                } else {
                    newVector.add(number);
                    activ = true;
                }
            } catch (Exception e) {
                System.out.println("\n------------------------------------------------------");
                System.out.println("\n error!, opción invalida.".toUpperCase()
                        + "\n Por favor ingrese nuevamente una opción".toUpperCase());
                sc.next();
                activ = true;
            }
        } while (activ);

    }

}
