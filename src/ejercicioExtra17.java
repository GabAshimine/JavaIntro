
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
public class ejercicioExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        boolean flag;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        flag = primo(num);
        System.out.println("El numero es primo: "+flag);

    }

    private static boolean primo(int num) {
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont != 2) {
            System.out.println("No primo");
            return false;
        } else {
            System.out.println("Es primo");
            return true;
        }
    }

 
    
}
