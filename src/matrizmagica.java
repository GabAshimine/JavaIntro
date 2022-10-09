/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "EJ13.java."

import java.io.*;

public class matrizmagica {

	// 13. Una matriz m�gica es una matriz cuadrada (tiene igual n�mero de filas que de columnas) que 
	// tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual. 
	// Por ejemplo: 
	// 2 7 6 
	// 9 5 1 
	// 4 3 8 
	// En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un 
	// algoritmo que compruebe si una matriz de datos enteros es m�gica o no, y en caso de que 
	// sea m�gica escribir la suma. Adem�s, el programa deber� comprobar que los n�meros 
	// introducidos son correctos, es decir, est�n entre el 1 y el 9. El usuario ingresa el tama�o de la 
	// matriz que no debe superar orden igual a 10.
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int c;
		int cantidad;
		int d;
		int d1;
		int f;
		int m[][];
		int sumacol[];
		int sumafila[];
		int v;
		cantidad = 12;
		d = 0;
		d1 = 0;
		v = 0;
		while (cantidad>=10) {
			System.out.println("ingrese el tama�o de la matriz");
			cantidad = Integer.parseInt(bufEntrada.readLine());
		}
		m = new int[cantidad][cantidad];
		sumafila = new int[cantidad];
		sumacol = new int[cantidad];
		for (f=0;f<=cantidad-1;f++) {
			for (c=0;c<=cantidad-1;c++) {
				System.out.println("ingrese la fila "+f+1+" y la columna "+c+1);
				m[f][c] = Integer.parseInt(bufEntrada.readLine());
				if (m[f][c]>10) {
					System.out.println("ingrese un numero entre 1 y 9");
					c = c-1;
				}
			}
		}
		for (f=0;f<=cantidad-1;f++) {
			for (c=0;c<=cantidad-1;c++) {
				System.out.print("("+m[f][c]+")");
			}
			System.out.println("");
		}
		// /inicializamos vectores
		for (c=0;c<=cantidad-1;c++) {
			sumafila[c] = 0;
			sumacol[c] = 0;
		}
		// /suma fila
		for (f=0;f<=cantidad-1;f++) {
			for (c=0;c<=cantidad-1;c++) {
				sumafila[f] = sumafila[f]+m[f][c];
			}
			System.out.println("la suma de la fila es "+sumafila[f]);
		}
		System.out.println("");
		System.out.println("");
		// /suma de columna
		for (c=0;c<=cantidad-1;c++) {
			for (f=0;f<=cantidad-1;f++) {
				sumacol[c] = sumacol[c]+m[f][c];
			}
			System.out.println("la suma de la columna es "+sumacol[c]);
		}
		System.out.println("");
		// / suma diagonal principal
		for (f=0;f<=cantidad-1;f++) {
			for (c=0;c<=cantidad-1;c++) {
				if (f==c) {
					d = d+m[f][c];
				}
			}
		}
		System.out.println("la suma de la diagonal principal es "+d);
		// / suma diagonal secundaria
		c = cantidad-1;
		for (f=0;f<=cantidad-1;f++) {
			d1 = d1+m[f][c];
			c = c-1;
		}
		System.out.println("la suma de la diagonal secundaria es "+d1);
		if (d==d1) {
			for (f=0;f<=cantidad-1;f++) {
				if (sumacol[f]!=sumafila[f]) {
					v = 1;
				}
			}
			if (v==0) {
				System.out.println("la matriz es magica");
			}
		} else {
			System.out.println("la matriz no es magica");
		}
	}


}

