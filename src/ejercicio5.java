
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt()
 * @author Gabriel
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int n,d,t;
        double r;
        System.out.println("Ingrese un numero");
        n=sc.nextInt();
        d=2*n;
        t=3*n;
        r = Math.sqrt(n);
        System.out.println("El numero ingresado es: "+ n);
        System.out.println("El doble de " + n + " es " + d);
        System.out.println("El triple de " + n  + " es "+ t);
        System.out.println("La raiz cuaderada de "+ n + " es "+ r);
    }
    
}
