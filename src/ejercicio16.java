
import java.util.Scanner;
import java.util.Random;
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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tam, n, cont=0, i;
        
        
        System.out.println("Ingrese el tamaño del arreglo:");
        tam=sc.nextInt();
        int[] vector = new int[tam];
        for(i=0;i<=tam-1;i++){
            vector[i]=(int)(Math.random()*10);
        }
                
        for ( i = 0; i <=tam-1; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("Ingrese el numero que desea buscar:");
        n=sc.nextInt();
        for (int j = 0; j <= tam-1; j++) {
            if(n==vector[j]){
                cont++;
                System.out.println("El numero buscado se ha encontrado en la posicion  "+ j );//+ cont + "veces");
            }
            
        }
        System.out.println("El numero buscado aparece "+ cont + " veces" );
       
        
    }
    
}
