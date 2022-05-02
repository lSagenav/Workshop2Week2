package main;

import exercise1.Practica1;
import exercise2.Practice2;
import exercise3.SorterBubbleQuick;
import exercise4.CreateFerry;
import exercise5.Practice5;
import exercise6.CreateVector;

import java.util.Scanner;

/**
 * clase principal donde tendremos el control de la ejecucion de todos los ejercicios por medio
 * de un menu
 */
public class Main {

    public static void main(String[] args) {

        // TODO code application logic here

        System.out.print("Hola este es el taller practico".toUpperCase());

        Scanner sc = new Scanner(System.in);
        boolean activ = true;

        int option = 0;

        do {
            System.out.print("\n Por favor elije una opción".toUpperCase()
                    + "\n\n1. Ejercicio # 1  = Calcular la fuerza gravitacional entre dos planetas de la vía lactea".toUpperCase()
                    + "\n2. Ejercicio # 2  = Se abrira un documento .txt".toUpperCase()
                    + "\n3. Ejercicio # 3  = Crear una lista de números aleatorios".toUpperCase()
                    + "\n4. Ejercicio # 4  = Crear ferrys".toUpperCase()
                    + "\n5. Ejercicio # 5  = Crear vehiculos".toUpperCase()
                    + "\n6. Ejercicio # 6  = Crear un Vector - al finalizar muestra el vector en consola".toUpperCase()
                    + "\n7. Salir".toUpperCase()
                    + "");

            try {
                option = sc.nextInt();

            } catch (Exception e) {
                System.out.println("dato incorrecto".toUpperCase());

            }
            /**
             * Switch donde tendremos los case de todos los ejercicios,
             * donde los llamaremos y el se ira a esa parte del proyecto donde este codificada la opcion
             * que el usuaio haya elegido 
             */
            switch (option) {
                case 1:
                    Practica1.Ejercicio1();
                    break;
                case 2:
                    Practice2.Practice2();
                    break;
                case 3:
                    SorterBubbleQuick.menu();
                    break;
                case 4:
                    CreateFerry.createVehicles();
                    break;
                case 5:
                    Practice5.ferryDos();
                    break;
                case 6:
                    CreateVector.createdVector();
                    break;
                case 7:
                    activ = false;
                    break;

                default:
                    System.out.println("opcion invalida".toUpperCase());

            }
        } while (activ);

    }

    }
