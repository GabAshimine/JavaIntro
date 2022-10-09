
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 * @author Gabriel
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int limpos, suma=0,n;
        System.out.println("Ingrese un numero limite");
        limpos=leer.nextInt();
        
        do{
            System.out.println("Ingrese un numero");
            n=leer.nextInt();
            suma=suma+n;
        }while( suma <= limpos);
            

            }

}


