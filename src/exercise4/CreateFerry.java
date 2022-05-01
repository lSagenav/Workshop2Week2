
package exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Scorpion
 * 
 * Aqui crearemos la clase donde posteriormente creamos el metodo crear ferry,
 * donde ingresaremos los datos de 10 vehiculos
 */
public class CreateFerry {

    private static Scanner sc = new Scanner(System.in);

    public static void createVehicles() {
        List<Vehicles> vehicles = new ArrayList<>();
        System.out.println("Por favor ingrese los datos que se pediran a conitnuación para la creación del carro");

        //Punto 4
        for (int i = 0; i < 10; i++) {
           Car newCar = Car.createVehicles(sc);
            vehicles.add(newCar);
        }
        vehicles.forEach(System.out::println);
        
        
    }
    
}
