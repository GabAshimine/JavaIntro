
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 *
 * @author Gabriel
 */
public class ejercicioExtra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int altura= sc.nextInt();
        int cont=0;
        for (int i = 1; i < altura+1; i++) {
            cont= cont +i;
            System.out.println(cont);
            cont=cont*10;
        }
    }
    
}
