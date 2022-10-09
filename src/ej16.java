
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author Gabriel
 */
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam=sc.nextInt();
        int[] vec= new int[tam];
        for (int i = 0; i < vec.length; i++) {
            vec[i]= (int)(Math.random()*10);
        }
        for (int i =0; i <vec.length; i++) {
            System.out.print(vec[i]+",");
            
        }
        System.out.println("");
        System.out.println("Ingrese el numero que desea buscar dentro del arreglo");
        int buscar= sc.nextInt();
        int c=0;
        for (int i = 0; i < vec.length; i++) {
            
            if(buscar ==vec[i]){
                c++;
                System.out.println("El numero buscado se encontró   en la posicion " + (i+1));
            }
            
        }
        System.out.println("El numero se encontró "+ c + " veces");
    }
    
}
