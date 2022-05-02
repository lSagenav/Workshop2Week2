
package exercise1;

/**
 *
 * @author Scorpion
 * esta es la clase donde creamos o mas bien calculamos la fuerza gravitacional de lo 2 planetas
 */
public class CalculateForce {
    
    float gravity;
    float force;

    /**en en este metodo estaremos desarrollando la logica donde calcularemos la gravedad
     * de los dos planetas
     *
     * @param planet1 variable que se usara para realizar el calculo de la gravedad de las naves
     * @param planet2 variable que se usara para realizar el calculo de la gravedad de las naves
     */
    public void calculationForce(Planet planet1, Planet planet2){
        
        gravity = (float) 6.67;
        
        force = (gravity * (planet1.getMass()* planet2.getMass()) / (planet1.getDistanceToSun() - planet2.getDistanceToSun()));
        System.out.println("la fuerza de gravedad de los dos planetas es: "+force+"");
        
    }
    
}
