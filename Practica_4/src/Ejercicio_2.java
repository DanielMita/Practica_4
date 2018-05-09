/*
 * Ejercicio_2.java
 * Declarar un vector de 20 elemento e iniciarlo con valor igual al indice correspondiente del elemento, multiplicado por 5
 * Dmita 09/01/2018
 */


public class Ejercicio_2 {

	public static void main(String[] args) {
		
		//Declaramos vector
		int [] vector=new int [20];
		
		//Iniciamos vector con valores
		for(int i=0;i<20;i++) {
			
			vector[i]=i*5;
		}
		
		//Mostramos vector por pantalla
		for(int elemento:vector) {
			
			System.out.println(elemento);
		}

	}

}
