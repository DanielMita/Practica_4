/*
 * Ejercicio_1.java
 * Declarar e iniciar un vector de 10 elemento con un valor de 7 para cada elemento
 * Dmita 09/01/2018
 */

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		//una forma de declarar e iniciar un vector
		int [] vector= {7,7,7,7,7,7,7,7,7,7};
		
		//otra forma de declarar e inicar un vector
		int [] vector2=new int [10];
		
		vector2[0]=7;
		vector2[1]=7;
		vector2[2]=7;
		vector2[3]=7;
		vector2[4]=7;
		vector2[5]=7;
		vector2[6]=7;
		vector2[7]=7;
		vector2[8]=7;
		vector2[9]=7;
		
		//Mostrar por pantalla un vector ya iniciado
		for(int i=0;i<10;i++) {
			System.out.println(vector[i]);
		}

	}

}
