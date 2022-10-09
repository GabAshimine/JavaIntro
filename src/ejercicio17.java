
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
public class ejercicio17 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tam, unDigito=0, dosDigitos=0, tresDigitos=0, cuatroDigitos=0, cincoDigitos=0;
             Scanner sc = new Scanner(System.in);
             System.out.println("Ingrese el tamaño del arreglo");
             tam = sc.nextInt();
             int []vec;
             vec= new int [tam];  
             for (int i = 0; i <= tam-1; i++) {
             vec[i]=(int)(Math.random()*99999);
             
             }
        for (int i = 0; i < tam; i++) {
             System.out.println("[" + vec[i] +","+ "]");
             if(vec[i]>0 && vec[i]<10){
             unDigito++;
                 
             }
             else if( vec[i]<100){
                 dosDigitos++;
                 
             }
             else if( vec[i]<1000){
                 tresDigitos++;
                 
             }
             else if(vec[i]<10000){
                 cuatroDigitos++;
                 
             }
             else if( vec[i]<100000){
                 cincoDigitos++;
                 
             }
             
        }System.out.println("En el arreglo hay " + unDigito + " numeros de  1 digito");
        System.out.println("En el arreglo hay " +dosDigitos+ " numeros de  2 digito");
        System.out.println("En el arreglo hay " + tresDigitos + " numeros de  3 digito");
        System.out.println("En el arreglo hay " + cuatroDigitos + " numeros de  4 digito");
        System.out.println("En el arreglo hay " + cincoDigitos + " numeros de  5 digito");
             }
}
            

    
  



