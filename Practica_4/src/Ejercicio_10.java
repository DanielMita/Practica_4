
/*
 * Programa que busca una secuencia de numeros en un vector, y devuelve la posicion de la primera ocurrencia
 * Autor: DM
 */


public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int [] vector={5, 3, 1, 4, 2, 5, 8};
		int [] vector2=        {4, 1, 5};
		
		//Salida por consola del resultado
		if(buscarSecuenciaInt(vector, vector2)==-1) {
			
			System.out.println("No hay ocurrencias");
			
		}else System.out.println("La posicion donde ocurre la primera ocurrencia es "+buscarSecuenciaInt(vector, vector2));

	}
	
	/**
	 * Metodo que busca secuencia de un vector dentro de otr vector mayor.
	 * @param vector
	 * @param vector2
	 * @return posicion
	 */
	public static int buscarSecuenciaInt(int [] vector, int [] vector2){
		
		boolean var=false;
		int contador=0;
		int posicion=0;
		
		externo:for(int i=0;i<vector.length;i++) {
			
			if(vector[i]==vector2[0]) {
				
				for(int j=0, z=i;j<vector2.length;j++,z++) {
					
					if(vector[z]==vector2[j]) {
						contador++;
						
						if(contador==vector2.length) {
							posicion=i;
							break externo;
						}
						
					}else {
							continue externo;
						
					}
				}
			}
			posicion=-1;
		}
		return posicion;
	}

}
