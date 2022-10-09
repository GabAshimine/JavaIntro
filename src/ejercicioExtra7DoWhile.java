
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
public class ejercicioExtra7DoWhile {

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
       
       do{
            System.out.println("Ingrese un numero");
            num=sc.nextInt();
            suma=suma + num;
            cont++;
            if(num<min){
               min= num; 
            }
            if(num>max)
            max=num;
        }while(cont<=n);
         prom= suma/n;
       System.out.println("El promedio de los numeros ingresados es: " + prom);
       System.out.println("El valor minimo ingresado  es: " + min);
       System.out.println("El valor minimo ingresado  es: " + max);
    }
    
}
