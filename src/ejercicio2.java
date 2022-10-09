
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla.
 * @author Gabriel
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre=sc.nextLine();
        System.out.println("Hola " + nombre);
    }
    
}
