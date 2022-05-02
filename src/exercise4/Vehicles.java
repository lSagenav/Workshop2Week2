
package exercise4;

/**
 *
 * @author Scorpion
 * 
 * Aqui crearemos todos los atributos de la clase Vehiculo donde implementaremos de la clase crear vehiculo y 
 * posterior a ello estaremos crenado los atributos de vehiculo junto a los 2 constructores y todos los Getter  y Setter 
 */
public class Vehicles implements VehicleCreator {

    private int id;
    private int wheels;
    private int passengers;
    private int numberOfChairs;
    private String name;
    private String typeTransport;
    private String fuel;
    private double topSpeed;
    private String matricule;

    public Vehicles() {

    }

    /**
     * contructor donde tendremos las variables que s ele han orotgado a los vehiculos
     * @param id
     * @param matricule
     * @param wheels
     * @param passengers
     * @param numberOfChairs
     * @param name
     * @param typeTransport
     * @param fuel
     * @param topsSpeed
     */
    public Vehicles(int id, String matricule, int wheels, int passengers, int numberOfChairs, String name, String typeTransport, String fuel, double topsSpeed) {
        this.id = id;
        this.wheels = wheels;
        this.passengers = passengers;
        this.numberOfChairs = numberOfChairs;
        this.name = name;
        this.typeTransport = typeTransport;
        this.fuel = fuel;
        this.topSpeed = topSpeed;
        this.matricule = matricule;

    }

    /**
     * setter y getter cual cuales se usaran ya sea para pedir algun dato o ya sea para mandar algun
     * dato a las variables que se usaran en los vehiculos
     * @return
     */
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getNumberOfChairs() {
        return numberOfChairs;
    }

    public void setNumberOfChairs(int numberOfChairs) {
        this.numberOfChairs = numberOfChairs;
    }

    @Override
    public Vehicles createVehicle() {
        return null;
    }
}
