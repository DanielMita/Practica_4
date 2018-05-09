import java.util.Scanner;


/*
 * Programa que devuelve la posicion del numero buscado dentro de un array
 * autor: DM
 */

public class Ejercicio_7 {
	
	public static void main (String [] args) {
		
		
		int [] vector = {2,9,5,3,4,6,9,7,8,1,6};
		System.out.println(buscarInt(vector));
		
		
	}
	
	public static int buscarInt(int [] vector) {
		
		//datos introducidos por teclado y almacenados 
		Scanner s=new Scanner (System.in);
		System.out.println ("Introduce el numero a buscar en el vector");
		int var=s.nextInt();
		
		//variable auxiliar que almacena valor de i
		int aux=0;
		
		//Bucle for que recorre el vector
		for(int i=0;i<vector.length;i++) {
			
			if(vector[i]==var) {
				
				aux=i;
				break;
			}
		}
		
		return aux;
	}

}
