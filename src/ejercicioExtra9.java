
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 * @author Gabriel
 */
public class ejercicioExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int dividendo, divisor, cociente, residuo=0, cont=0;
        
        System.out.println("Ingrese el dividendo");
        dividendo=sc.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = sc.nextInt();
        
        dividendo= dividendo - divisor;
        
        while(dividendo>=0){
            cont++;
            dividendo= dividendo - divisor;
            //dividendo=residuo;
            if(dividendo>=divisor){
                residuo= dividendo-divisor;
            }
            }
               
            System.out.println("El resultado de la division es "+ cont + " y el resto es "+ residuo);
        }
        }
    
    
    

