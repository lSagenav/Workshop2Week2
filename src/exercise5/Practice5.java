
package exercise5;

import exercise4.Bike;
import exercise4.Boat;
import exercise4.Car;
import exercise4.Motorcycle;
import exercise4.Truck;
import exercise4.Vehicles;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Scorpion
 * 
 * En esta clase tendremos al logica de del la creacion de los diferentes tipos de vehiculos 
 * donde estaremos importando las clases y sus datos a este principal y pos terior a ello podremos usar 
 * esos datos para crear los nuevos vehiculos
 */
public class Practice5 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    /**
     * merodo donde estaremos dando la opcion al usuario que tipo de vehiculo crear con sus respectivos datos
     */
    public static void ferryDos() {
        List<Vehicles> vehicles = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese tipo de vehículo:\n"
                    + "1. Carro\n"
                    + "2. Cicla\n"
                    + "3. Moto\n"
                    + "4. Camion\n"
                    + "5. Lancha\n"
                    + "");
            int vehicleType = sc.nextInt();
            /**
             * Switch donde tendremos los tipos de carros que se iran a crear y posterior a ellos redirecionandolos
             * a ese clase donde los estaremos desarrollando
             */
            switch (vehicleType) {
                case 1:
                    Vehicles v1 = new Car();
                    v1 = v1.createVehicle();
                    vehicles.add(v1);

                    break;
                case 2:
                    Vehicles v2 = new Bike();
                    v2 = v2.createVehicle();
                    vehicles.add(v2);
                    break;
                case 3:
                    Vehicles v3 = new Motorcycle();
                    v3 = v3.createVehicle();
                    vehicles.add(v3);
                    break;  
                case 4:
                    Vehicles v4 = new Truck();
                    v4 = v4.createVehicle();
                    vehicles.add(v4);
                    break;
                    
                case 5:
                    Vehicles v5 = new Boat();
                    v5 = v5.createVehicle();
                    vehicles.add(v5);
                

                default:
                    System.out.println("NO SE HA INGREADO NINGUN DATO");
                    break;
            }

        }

        vehicles.forEach(System.out::println);

    }


}
