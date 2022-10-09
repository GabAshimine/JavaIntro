
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
public class ejercicio1 {

    /**1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int num1,num2, resultado;
        System.out.println("INGRESE UN NUMERO");
        num1=sc.nextInt();
        System.out.println("INGRESE UN NUMERO");
        num2=sc.nextInt();
        resultado= num1+num2;
        System.out.println("El resultado de la suma de " + num1 + "+" + num2 + " es " + resultado);
    }
    
}
