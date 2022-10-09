
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author Gabriel
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String cadena="";
        int cont=0, corr=0, inc=0;
        do{
            System.out.println("Ingrese una cadena");
        cadena=sc.nextLine().toUpperCase();
        cont++;
        if(cadena.length()==5 && cadena.substring(0,1).equals("X") && cadena.substring(4).equals("O")){
            System.out.println("Correcto");
            corr++;
        }else{
            System.out.println("Incorrecto");
            inc++;
        }
        }while(cadena.equals("&&&&&")==false);
        System.out.println("Se ingresaron "+ cont + " cadenas, "+ corr + " fueron corresctas "+ (inc -1)+ " fueron incorrectas");
    }
           
            
}
