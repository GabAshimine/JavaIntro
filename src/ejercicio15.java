
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente
 * @author Gabriel
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
    int []vec;
    vec= new int [100];                                                             
    for(int i=0; i<100; i++){
        vec[i]=i+1;
    }
    for(int j=0; j<100; j++){
        System.out.print("["+vec[99-j]+"]");
    }
    
}
    
}
