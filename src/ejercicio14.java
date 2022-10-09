
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 * @author Gabriel
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
         double euro;
        System.out.println("");
        System.out.println("CONVERSOR DE DIVISAS");
        do {
        System.out.println("Cantidad de euros a convertir");
        euro= leer.nextDouble();
        } while (euro<0);
        System.out.println("");
        System.out.println("Euro a: ");
        System.out.println("(Ingrese la inicial de la moneda. Por ejemplo ¨D¨ para dolar.)");
        System.out.println("Y=Yen");
        System.out.println("D=Dolar");
        System.out.println("L=Libras");
        System.out.println("");
        String divisa= leer.next();
        divisa = divisa.toUpperCase();
        
        while (!divisa.equals("Y") && !divisa.equals("D") && !divisa.equals("L")) {
        System.out.println("(Comando no valido. Ingrese la inicial de la moneda. Por ejemplo ¨D¨ para dolar.)");
        System.out.println("Y=Yen");
        System.out.println("D=Dolar");
        System.out.println("L=Libras");
        System.out.println("");
        divisa= leer.next();
        
        divisa = divisa.toUpperCase();
        }
                
        conversion (divisa, euro);
               
        
    }
    
    public static void conversion (String divisa, double euro){
    double total = 1;
    String moneda = "";
         
        switch (divisa){
            case "L":
               total=euro*0.86;
               moneda= "£";
               break;
             case "D":
               total=euro*1.28611;
               moneda= "$";
               break;
             case "Y":
               total=euro*129.852;
               moneda= "¥";
               break;
        }
                
        System.out.println( euro + "€ es igual a: " + moneda + total);
      
         
    }
    
}
