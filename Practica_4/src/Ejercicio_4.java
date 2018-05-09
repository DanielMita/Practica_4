import java.util.Arrays;
import java.util.Scanner;

/*
 * Metodo que recibe 2 vectores y devuelve true si son iguales o false si no lo son
 */

public class Ejercicio_4 extends Object{

	public static void main(String[] args) {
		
		int [] v1= {5,3,7,9,5,6,7};
		int [] v2= {5,3,7,9,1,6,7};
		
		System.out.println(vectoresIntIguales(v1, v2));
	

	}
	
	
	public static boolean vectoresIntIguales(int [] v1, int [] v2) {
		
		
		int contador=0;
		if( v1.length!=v2.length) return false;
			
		else {
			
			for(int i=0;i<v1.length;i++) {
				
				if (v1[i]==v2[i]) {
					contador++;
				}
			}
		}
		if(contador==v2.length) return true;
		else return false;
	}

}

