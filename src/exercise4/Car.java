
package exercise4;

import java.util.Scanner;

/**
 *
 * @author Scorpion
 * 
 * Aqui estaremos instanciando la clase carro que le extenderemos de la clase Vehiculo algunas caracteristcas 
 * posterior a eso crearemos 2 contructores 1 lleno con sus atributos y 1 vacio 
 * tambien estremos creando todos los Setter y Getter que se requieren 
 */
public class Car extends Vehicles {

    private int id;
    private String name;
    private String matricule;
    private String typeTransport;
    private String Fuel;
    private double topSpeed;
    private int passengers;

    public Car() {

    }

    public Car(int id, String name, int passengers, String matricule, String typeTransport, String Fuel, double topSpeed) {
        this.id = id;
        this.name = name;
        this.matricule = matricule;
        this.typeTransport = typeTransport;
        this.Fuel = Fuel;
        this.topSpeed = topSpeed;
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getFuel() {
        return Fuel;
    }

    public void setFuel(String Fuel) {
        this.Fuel = Fuel;
    }

    

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public static Car createVehicles(Scanner scanner) {
        Car car = new Car();
        System.out.println("Por favor ingrese el id".toUpperCase());
        car.setId(scanner.nextInt());
        System.out.println("Por favor ingrese la matricula".toUpperCase());
        car.setMatricule(scanner.next());
        System.out.println("Por favor ingrese el nombre".toUpperCase());
        car.setName(scanner.next());
        System.out.println("Por favor ingrese el numero de pasajeros".toUpperCase());
        car.setPassengers(scanner.nextInt());
        System.out.println("Por favor ingrese el tipo de transporte".toUpperCase());
        car.setTypeTransport(scanner.next());
        System.out.println("Por favor ingrese la gasolina".toUpperCase());
        car.setFuel(scanner.next());
        System.out.println("Por favor ingrese la velocidad maxima".toUpperCase());
        car.setTopSpeed(scanner.nextDouble());
        return car;
    }

    @Override
    public Vehicles createVehicle() {
        Scanner scanner = new Scanner(System.in);
        Vehicles car = new Car();
        System.out.println("Por favor ingrese el id".toUpperCase());
        setId(scanner.nextInt());
        System.out.println("Por favor ingrese la matricula".toUpperCase());
        setMatricule(scanner.next());
        System.out.println("Por favor ingrese el nombre".toUpperCase());
        setName(scanner.next());
        System.out.println("Por favor ingrese el numero de pasajeros".toUpperCase());
        setPassengers(scanner.nextInt());
        System.out.println("Por favor ingrese el tipo de transporte".toUpperCase());
       setTypeTransport(scanner.next());
        System.out.println("Por favor ingrese la gasolina".toUpperCase());
        setFuel(scanner.next());
        System.out.println("Por favor ingrese la velocidad maxima".toUpperCase());
        setTopSpeed(scanner.nextDouble());
        return this;
    }

    @Override
    public String toString() {
        return "Car{"
                + "Id del vehiculo = " + id
                + ", Nombre del vehiculov= " + name + '\''
                + ", Matricula del carro = " + matricule + '\''
                + ", Capacidad de Pasajeros =  " + passengers + '\''
                + ", Tipo de transporte = " + typeTransport + '\''
                + ", Tipo de conbustible = " + Fuel
                + ", Maxima Velocidad = " + topSpeed
                + '}';
    }
}
