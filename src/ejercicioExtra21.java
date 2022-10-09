
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 * @author Gabriel
 */
public class ejercicioExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double n1,n2,n3,n4;
        int al=0, c=0,prom = 0;
        double [] notas;
        notas=new double[prom];
        
        do{
            System.out.println("Ingrese la primera nota");
            n1=sc.nextDouble();
            System.out.println("Ingrese la segunda nota");
            n2=sc.nextDouble();
            System.out.println("Ingrese la tercera nota");
            n3=sc.nextDouble();
            System.out.println("Ingrese la cuarta nota");
            n4=sc.nextDouble();     
            prom=(int) (n1*0.1+n2*0.15+n3*0.25+n4*0.5);
            al++;
            
            if(prom>=7){
                System.out.println("Aprobado");
                c++;
        
            }
               
            
                      
        }while(al<10);
        System.out.println("La cantidad de aprobados es:"+ c + " la cantidad de desprobados es " + (al-c));
               for (int i = 0; i < 10; i++) {
                   System.out.println(notas[i]+" ");
        }
        }

   
        
    }
    
    
    

