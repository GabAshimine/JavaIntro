
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. 

 * @author Gabriel
 */
public class ejercicioExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String operacion;
             System.out.println("Ingrese dos numeros");
             num1= sc.nextInt();
             num2=sc.nextInt();
             System.out.println("Elija una operacion aritmetica S para sumar , R par arestar, D para div, M para multi");
        operacion= sc.next();
              
           switch (operacion){
            case "s":
               System.out.println(suma(num1, num2));
               break;
             case "r":
               System.out.println(resta(num1, num2));
               break;
             case "d":
               System.out.println(div(num1, num2));
               break;
             case "m":
                 System.out.println(multi(num1, num2));
                 break;
        }
    }
    public static int suma(int num1, int num2){
                
        int sumas= num1+num2;
     
        return sumas;
             }
    public static int resta(int num1, int num2){
                
        int resta= num1-num2;
     
        return resta;
             }
    public static int div(int num1, int num2){
                
        int div= num1/num2;
     
        return div;
             }
    public static int multi(int num1, int num2){
                
        int multi= num1*num2;
     
        return multi;
             }
}
