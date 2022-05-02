package exercise4;


import exercise4.Vehicles;
import java.util.Scanner;


/**
 *
 * @author Scorpion
 */
public class Boat extends Vehicles {

    private boolean flag = true;

    public Boat(boolean flag) {
        this.flag = flag;
    }

    public Boat() {
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public Vehicles createVehicle() {
        System.out.println("crear Lancha");
        Scanner scanner = new Scanner(System.in);
        Vehicles boat = new Boat();
        System.out.println("Por favor ingrese el id".toUpperCase());
        setId(scanner.nextInt());
        System.out.println("Por favor ingrese el nombre".toUpperCase());
        setName(scanner.next());
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
        return "Lancha{"
                + "id = " + getId()
                + "Nombre = " + getName()
                + "Pasajeros = " + getPassengers()
                + "Tipo Transporte = " + getTypeTransport()
                + "Maxima Velocidad = " + getTopSpeed()
                + ", Banderas = " + flag
                + '}';
    }

}
