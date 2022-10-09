
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 * @author Gabriel
 */
public class ejercicioExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,resultado, rta, cont=0;
        n1=(int)(Math.random()*10);
        n2=(int)(Math.random()*10);
        resultado=n1*n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("adivine el resultado de la multiplicacion de don numeros del 1 al 10");
        rta=sc.nextInt();
        do{
            System.out.println("Incorrecto");
            System.out.println("adivine el resultado de la multiplicacion de don numeros del 1 al 10");
            rta=sc.nextInt();
            cont++;
            
        }while(rta!=resultado);
        System.out.println("Felicidades! Adivinó la respuesta en "+ cont + " intentos");
    }
    
}
