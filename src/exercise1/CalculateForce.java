/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

/**
 *
 * @author Scorpion
 * esta es la clase donde creamos o mas bien calculamos la fuerza gravitacional de lo 2 planetas
 */
public class CalculateForce {
    
    float gravity;
    float force;
    
    
    public void calculationForce(Planet planet1, Planet planet2){
        
        gravity = (float) 6.67;
        
        force = (gravity * (planet1.getMass()* planet2.getMass()) / (planet1.getDistanceToSun() - planet2.getDistanceToSun()));
        System.out.println("la fuerza de gravedad de los dos planetas es: "+force+"");
        
    }
    
}
