/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 * @author Gabriel
 */
public class ejercicioExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n, numLeidos=0, pares=0, impares=0;
       
        do{
             System.out.println("Ingrese un numero:");
             n=sc.nextInt();
             
             if(n%5==0){
                 break;
                 
             }
             numLeidos++;
             if(n%2==0){
                 pares++;
             }else{
                 impares++;
             }
        }while(n%5!=0);
        System.out.println("La cantidad de numeros leidos es: " + numLeidos  );
        System.out.println("La cantidad de numeros pares es: " + pares);
        System.out.println("La cantidad de numeros impares es "+ impares);
    }
    
}
