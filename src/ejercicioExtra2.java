
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

 * @author Gabriel
 */
public class ejercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A=25;
        int B= 30;
        int C= 35;
        int D= 40;
        int aux;
        System.out.println("Las variables originales son: ");
        System.out.println("Variable A="+A);
        System.out.println("Variable B="+B);
        System.out.println("Variable C="+C);
        System.out.println("Variable D="+D);
        aux=B;
        B= C;
        C= A;
        A=D;
        D=aux;
        System.out.println("Las variables intercambiadas son:  ");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
    
}
