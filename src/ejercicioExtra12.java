/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
 * @author Gabriel
 */
public class ejercicioExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c =000;
        for (int i = 0; i < 999; i++) {
            if(i<10){
                System.out.println("00"+i);
                
            }else if (i<100){
                System.out.println("0"+i);
               // break;
        } else if (i>=100||i<1000){
                System.out.println(i);
            }
                    {
                
          
        }
        }
        
    }
}

    

