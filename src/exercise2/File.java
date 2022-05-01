
package exercise2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Scorpion
 * 
 * En esta clase tendremos la logica donde crearemos el motodo para realizar la lectura de un documento de texto plano
 * posterior a ello se mostrra el contenido del txt en consola
 */
public class File {
    
    public String readTxt (String direction){
        
        String text ="";
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String temp ="";
            String bfRead;
            
            while((bfRead = bf.readLine()) != null){
                
                temp = temp + bfRead;
                
            }
            
            text = temp;
            
        }catch(Exception e){System.out.println("no se encontro archivo");}
            
            return text;
        
    }
    
}
