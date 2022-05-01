
package exercise2;

/**
 *
 * @author Scorpion
 * 
 * Aqui podremos observar que realizaremos la impresion del archivo plano por consola 
 * que lo estaremos llando a la url del proyecto " la raiz "
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void Practice2() {
        System.out.println("Hola este es el ejercicio 2");
        System.out.println("---------------------------");

        File a = new File();
        System.out.println(a.readTxt("src\\exercise2\\Txt.txt"));

    }

}
