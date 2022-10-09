
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author Gabriel
 */
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int con1D=0, con4D=0, con3D=0, con2D=0, con5D=0;
        System.out.println("Ingrese enl tamaño del arreglo");
        int tam=sc.nextInt();
        int[] vec= new int[tam];
        for (int i = 0; i < vec.length; i++) {
            vec[i]= (int)(Math.random()*100000);
             System.out.print(vec[i]+",");
        }
        System.out.println("");
        for (int i = 0; i < vec.length; i++) {
            if(vec[i]<10){
                con1D++;
            }else if(vec[i]<100){
                con2D++;
            }else if(vec[i]<1000){
                con3D++;
            }else if(vec[i]<10000){
                con4D++;
            }else if(vec[i]<100000){
                con5D++;
            }
                }
        System.out.println("En el arreglo hay " + con1D + " numeros de 1 digito");
        System.out.println("En el arreglo hay " + con2D + " numeros de 2 digitos");
        System.out.println("En el arreglo hay " + con3D + " numeros de 3 digitos");
        System.out.println("En el arreglo hay " + con4D + " numeros de 4 digitos");
        System.out.println("En el arreglo hay " + con5D + " numeros de 5 digitos");
    }
    
}
