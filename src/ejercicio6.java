/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que dado un numero determine si es par o impar.
        */
        
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        
        if(num1%2==0){
            System.out.println("El numero es par");
        }
        else{
            System.out.println("El numero no es par");
        }
        // TODO code application logic here
    }
    
}
