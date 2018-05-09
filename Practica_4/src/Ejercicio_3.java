/*
 * Ejercicio_3.java
 * Metodo que recibe un vector de enteros, un numero, y devuelve la frecuencia de ese numero dentro del vector.
 * Dmita 09/01/2018
 */


public class Ejercicio_3 {

	public static void main(String[]args) {
		
		
		int [] vector= {5,9,12,4,1,9,6,3,7,7,11,4,2,9,5,7,3,4};

		//Mostramos por pantalla la frecuencia
		System.out.println(frecuenciaNumero(7,vector));
		
		
	}
	
	//metodo que halla la frecuencia de un numero dado por parametro
	public static int frecuenciaNumero(int numero, int...vector) {
		
		int contador=0;
		
		for(int i=0;i<vector.length;i++) {
			
			if(vector[i]==numero) {
				
				contador++;
			}
			
		}
		
		return contador;
		
	}
	
}
