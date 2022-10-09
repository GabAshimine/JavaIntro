
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general
 * 
 * @author Gabriel
 */
public class ejercicioExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, i=0, cont;
       double altura, suma1, suma2, promGen, promBajos;
        suma1=0;
        suma2=0;
        cont=0;
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas cuya altura desea promediar");
        n=sc.nextInt();
        
        for( i=0;i<n;i++){
            System.out.println("Ingrese altura: ");
            altura= sc.nextDouble();
            suma1+= altura;
            if(altura < 1.60){
                suma2= suma2+ altura;
                cont ++;
            } else {
            }
            
        }
        promGen= suma1/n;
             promBajos= suma2/cont;
             System.out.println("El promedio de altura general es: " + promGen);
             System.out.println("El promedio de altura de los de menos de 1.6 es : " + promBajos);
    }
    
}
