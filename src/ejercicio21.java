
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 * @author Gabriel
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //creo la matriz de 10x10
        int  matrizM[] []= new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j]= (int)(Math.random()*100);
            }
        }
        //muestro la matriz M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+ matrizM[i][j] +" ]");
            }
            System.out.println("");
        }
         System.out.println("");
         //creo la matriz p de 3x3
         
         int  matrizP[] []= new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.println("Introduzca el elemento [" + i + "," + j + "]");
              
                matrizP[i][j] = sc.nextInt();
            }
        }
        //muestro la matriz p
     for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matrizP[i][j] +" ]");
            }
            System.out.println("");
        }
         System.out.println("");
         //muestro la matriz M
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+ matrizM[i][j] +" ]");
            }
            System.out.println("");
        }
         System.out.println("");
         
         
  }
}
       
       
    
    

