
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
public class ejercicioExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector;
        int n,s=0;
        Scanner l=new Scanner(System.in);
        System.out.println("Tamaño del vector: ");
        n=l.nextInt();
        vector=new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa valor numero "+(i+(1)));
            vector[i]=l.nextInt();
            s=s+vector[i];
        }
        System.out.println("La suma total del vector ["+n+"] es igual a: "+s);
    }
    
}
    

