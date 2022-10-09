
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 * @author Gabriel
 */
public class ejercicioExtra7While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int min, max,  n,num , cont=1, suma=0;
        double prom;
        System.out.println("Ingrese la cantidad de valores que desea calcular");
        n= sc.nextInt();
        min=1000;
        max=1;
       
        while(cont<=n){
            System.out.println("Ingrese un numero");
            num=sc.nextInt();
            suma=suma + num;
            cont++;
            if(num<min){
               min= num; 
            }
            if(num>max)
            max=num;
        }
         prom= suma/n;
       System.out.println("El promedio de los numeros ingresados es: " + prom);
       System.out.println("El valor minimo ingresado  es: " + min);
       System.out.println("El valor minimo ingresado  es: " + max);
    }
    
}
