/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_11;

import java.util.Scanner;

/**
 *
 * @author Georg Thierry
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        int opcion,num1,num2;
        String respuesta="";
        do {
            System.out.println("Ingresar primer número: ");
            num1=leer.nextInt();
        } while (num1<=0);
        do {
            System.out.println("Ingresar segundo número: ");
            num2=leer.nextInt();
        } while (num2<=0);
        
        do {
            System.out.println("MENU:");
            System.out.println("------OPCIONES-----"); 
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elegir una opción: ");
            opcion=leer.nextInt();
            switch (opcion){
            case 1:
                System.out.println("La suma de "+num1+" y "+num2+" es igual a "+(num1+num2));
                break;
            case 2:
                System.out.println("La resta de "+num1+" y "+num2+" es igual a "+(num1-num2));
                break;
            case 3:
                System.out.println("La multiplicación de "+num1+" y "+num2+" es igual a "+(num1*num2));
                break;
            case 4:
                System.out.println("La división de "+num1+" y "+num2+" es igual a "+(num1/num2));
                break;
            case 5:
                do {
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    respuesta=texto.nextLine();
                    respuesta= respuesta.toUpperCase();
                    //esto sirve para que no me introduzca un letra distinto a S o N
                } while (respuesta.equals("S")==false && respuesta.equals("N")==false);  
                break;
            default:
                System.out.println("OPCION INCORRECTA.");
                break;
          }
        } while (opcion!=5 || respuesta.equals("N") );
        
    }
    
}
