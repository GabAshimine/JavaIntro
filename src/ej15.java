
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
public class ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int[] vec= new int[100];
        for (int i = 0; i < 100; i++) {
            vec[i]= i+1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.print(vec[i]+",");
            
        }
        System.out.println("");
    }
    
}
