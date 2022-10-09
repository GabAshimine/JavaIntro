
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        int largo;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        largo = frase.length();
        if (largo == 8) {
            System.out.println("Correcto");
             
        }
        else{
            System.out.println("Incorrecto");
            
        }
    }
}

   
    

