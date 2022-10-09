
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
 * si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author Gabriel
 */
public class ejercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de minutos que desea convertir");
        int min, d, h;
        
        min = leer.nextInt();
        d=min/1440;
        h=(min-(d*1440))/60;
        System.out.println("Son "+d+" dias y "+h+" horas");
    }
        }
    
    

