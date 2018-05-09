/**
 * NumeroMasFrecuente.java
 * Programa que muestra la frecuencia de un número en un vector
 * Utiliza el método masFrecuenteInt()
 * ajp - 2017.12.29
 */

public class Ejercicio_9 {
	
	
	public static void main(String[] args) {
		int[] datosPrueba = {4,1,1,4,2,3,2,4,1,9,9,9,9,9};

		System.out.println(masFrecuenteInt(datosPrueba));
	}

	
	static int masFrecuenteInt(int[] datos) {
		
		int frecuenciaNumeroActual = 1;
		int frecuenciaMaxima = 1; 
		int resultado = datos[0];
		
		for (int i = 0; i < datos.length; i++) {
			for (int j = i+1; j < datos.length; j++) {
				if (datos[i] == datos[j]) {
					frecuenciaNumeroActual++;
				}
			}
			if (frecuenciaNumeroActual > frecuenciaMaxima) {
				frecuenciaMaxima = frecuenciaNumeroActual;
				resultado = datos[i];
			}
			frecuenciaNumeroActual = 1;
		}
		
		return resultado;
	}

}
