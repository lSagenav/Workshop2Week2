
package exercise1;

/**
 *
 * @author Scorpion
 *
 *Esta clase es donde tenemos todos los atributos de la clase planeta, es decir todas las caracteristicas que tendran nuestros planetas
 *tambien tendremos lo que son los Geter Y los Setter juntos a los 2 contructores el lleno con los datos y tendremos 1 vacio 
 */
 public class Planet {
    
    String name;
    int id;
    float mass;
    float density;
    float diameter;
    float distantToSun;

    public Planet(String name, int id, float mass, float density, float diameter, float distantToSun) {
        this.name = name;
        this.id = id;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distantToSun = distantToSun;
    }

    public Planet() {
        
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

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getDistanceToSun() {
        return distantToSun;
    }

    public void setDistanceToSun(float distantToSun) {
        this.distantToSun = distantToSun;
    }

    
    
}
