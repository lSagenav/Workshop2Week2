
package exercise4;

import java.util.Scanner;

/**
 *
 * @author Scorpion
 *
 * En esta clase estaremos intanciando la clase sicla y donde le estaremos
 * otorgando algunos valores que le extenderemos de la lase Vehiculo y dado ello
 * se le pediran algunos datos propios de la sicla al usuario
 */
public class Bike extends Vehicles {

    private boolean havePedals;

    public Bike() {
    }

    public boolean isHavePedals() {
        return havePedals;
    }

    public void setHavePedals(boolean havePedals) {
        this.havePedals = havePedals = true;
    }

    /**
     * metodo donde estaremos pidiento los datos a ingresar de la bici
     * @return
     */
    @Override
    public Vehicles createVehicle() {
        System.out.println("crear cicla");
        Scanner scanner = new Scanner(System.in);
        Vehicles bike = new Bike();
        System.out.println("Por favor ingrese el id".toUpperCase());
        setId(scanner.nextInt());
        System.out.println("Por favor ingrese el nombre".toUpperCase());
        setName(scanner.next());
        System.out.println("Por favor ingrese la cantidad de ruedas");
        setWheels(scanner.nextInt());
        System.out.println("Por favor ingrese el numero de pasajeros".toUpperCase());
        setPassengers(scanner.nextInt());
        System.out.println("Por favor ingrese el tipo de transporte".toUpperCase());
        setTypeTransport(scanner.next());
        System.out.println("Por favor ingrese la velocidad maxima".toUpperCase());
        setTopSpeed(scanner.nextDouble());

        //   return car;
        return this;
    }

    @Override
    public String toString() {
        return " Bike ={"
                + " id = " + getId()
                + " Nombre = " + getName()
                + " Ruedas = " + getWheels()
                + " Pasajeros =" + getPassengers()
                + " Tipo Transporte = " + getTypeTransport()
                + " Maxima Velocidad = " + getTopSpeed()
                + ", Tiene Pedales = " + havePedals
                + '}';
    }
}
