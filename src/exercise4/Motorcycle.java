
package exercise4;

import java.util.Scanner;

/**
 *
 * @author Scorpion
 */
public class Motorcycle extends Vehicles {

    private boolean haveLeg = true;

    public Motorcycle() {

    }

    public boolean isHaveLeg() {
        return haveLeg;
    }

    public void setHaveLeg(boolean haveLeg) {
        this.haveLeg = haveLeg;
    }

    public Motorcycle(boolean haveLeg) {
        this.haveLeg = haveLeg;
    }

    @Override
    public Vehicles createVehicle() {
        System.out.println("crear Moto");
        Scanner scanner = new Scanner(System.in);
        Vehicles motorcycle = new Motorcycle();
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
        return " Motorcycle = {"
                + " id = " + getId()
                + " Nomnre = " + getName()
                + " Ruedas = " + getWheels()
                + " Pasajeros = " + getPassengers()
                + " Tipo Transporte = " + getTypeTransport()
                + " Maxima Velocidad = " + getTopSpeed()
                + ", Tiene Pata = " + haveLeg
                + '}';
    }

}
