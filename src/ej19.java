/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author Gabriel
 */
public class ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix= new int [3][3];
        for (int i = 0; i < 3; i++) {         
            for (int j = 0; j < 3; j++) {
               if(i==j){
                   matrix[i][j]= 0;
               }else{
                   matrix[i][j]= (int)(Math.random()*10);
               }
                
            }
            
        }
        
        for (int i = 0; i < 3; i++) {         
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matrix[i][j]+"] ");
            }
            System.out.println("");
        }
         System.out.println("");
         
        for (int i = 0; i < 3; i++) {         
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ (-matrix[j][i])+"] ");// A = -AT. 
            }
            System.out.println("");
        }
         System.out.println("");
         
    }
    
}
