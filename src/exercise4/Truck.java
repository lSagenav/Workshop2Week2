
package exercise4;

import java.util.Scanner;

/**
 *
 * @author Scorpion
 */
public class Truck extends Vehicles {
    
    private boolean height  = true;

    public Truck(boolean height) {
        this.height = height;
    }

    public Truck() {
        
    }

    public void setHeight(boolean height) {
        this.height = height;
    }


    /**
     * metodo donde estaremos pidiendo algunos datos al momento de crear el camion
     * @return
     */
    @Override
    public Vehicles createVehicle() {
        System.out.println("crear Camion");
        Scanner scanner = new Scanner(System.in);
        Vehicles truck = new Truck();
        System.out.println("Por favor ingrese el id".toUpperCase());
        setId(scanner.nextInt());
        System.out.println("Por favor ingrese el nombre".toUpperCase());
        setName(scanner.next());
        System.out.println("Por favor ingrese la cantidad de ruedas".toUpperCase());
        setWheels(scanner.nextInt());
        System.out.println("Por favor ingrese el numero de pasajeros".toUpperCase());
        setPassengers(scanner.nextInt());
        System.out.println("Por favor ingrese el tipo de transporte".toUpperCase());
        setTypeTransport(scanner.next());
        System.out.println("Por favor ingrese la velocidad maxima".toUpperCase());
        setTopSpeed(scanner.nextDouble());

        return this;
    }
    
        @Override
    public String toString() {
        return " Camion = {"
                + " id = " + getId()
                + " Nombre = " + getName()
                + " Ruedas = " + getWheels()
                + " Pasajeros = " + getPassengers()
                + " Tipo Transporte = " + getTypeTransport()
                + " Maxima Velocidad = " + getTopSpeed()
                + ", Altura = " + height
                + '}';
    }
    
}
