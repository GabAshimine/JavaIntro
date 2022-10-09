
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author Gabriel
 */
public class ejercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precio;
        String letra;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una letra");
        letra = sc.nextLine();
        System.out.println("Ingrese un precio");
     precio = sc.nextDouble();
     switch(letra){
         case "A" :
             System.out.println("El precio del tratamiento odontologico será " + precio/2);
        
        break;
             case "a" :
             System.out.println("El precio del tratamiento odontologico será " + precio/2);
        
         break;
        case "B" :
             System.out.println("El precio del tratamiento odontologico será " + precio*0.65);
        
         break;
        case "b" :
             System.out.println("El precio del tratamiento odontologico será " + precio*0.65);
        
         break;
        case "C" :
             System.out.println("El precio del tratamiento odontologico será " + precio);
        
         break;
        case "c" :
             System.out.println("El precio del tratamiento odontologico será " + precio);
        
         break;
         default:
             System.out.println("Letra o precio erróneo");
    }
    
}
}