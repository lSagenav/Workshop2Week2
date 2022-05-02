/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author Scorpion
 * 
 * En esta clase tendremos la logica de la clase donde le pediremos al usuario los datos de los dos planetas
 * y posteriormente realizaremos el calculo de la fuerza gravitacional de los dos planetas
 */
public class Practica1 {

    static Planet planeta1 = new Planet("jupiter", 1, 59746, 4587, 7859, 745896);
    static Planet planeta2 = new Planet("neptuno", 2, 5946, 458, 789, 74586);

    static Planet[] planets = {
        planeta1, planeta2
    };

    static boolean activ = true;
    static int selection = 0;

    static Scanner sc = new Scanner(System.in);

    /**
     * metodo donde estaremos desarrollando lo que sera la logica para realizar el calculo de la
     * fuerza gravitacional de los 2 planetas
     */
    public static void Ejercicio1() {
        Planet selecctionPlanet1;
        Planet selecctionPlanet2;

        CalculateForce calculationForce = new CalculateForce();

        do {

            System.out.println("\nlista de planetas=".toUpperCase());
            for (Planet planet : planets) {

                System.out.println(
                        "ID= " + planet.getId() + ".  " + "NOMBRE= " + planet.getName() + ",  " + "DIAMETRO (km)= "
                        + planet.getDiameter() + ",  " + "MASA (kg)= " + planet.getMass() + ",  " + "DENSIDAD= "
                        + planet.getDensity() + ",  " + "DISTANCIA AL SOL (km)= " + planet.getDistanceToSun());
            }

            try {

                System.out.print("\nPor favor elige el primer planeta= ");
                selection = sc.nextInt();

                while ((selection < 1) || (selection > 6)) {

                    selection = sc.nextInt();
                }

                selecctionPlanet1 = planets[selection - 1];

                System.out.print("\nPor favor elige el segundo planeta= ");
                selection = sc.nextInt();

                while ((selection < 1) || (selection > 6)) {

                    selection = sc.nextInt();
                }

                selecctionPlanet2 = planets[selection - 1];

                calculationForce.calculationForce(selecctionPlanet1, selecctionPlanet2
                );
                activ = false;

            } catch (Exception e) {

                sc.next();
                activ = true;

            }

            System.out.println("por favor elija un planeta");
        } while (activ);

    }

}
