
/*
 * Programa que devuelve la cantidad de elementos que son consecutivos
 * Autor:DM
 */

public class Ejercicio_6 {
	
	
	public static void main (String [] args) {
		
		int [] vector= {4,8,6,3,5,8,7,5,5,5,5,4,7,9,6,6,6,6,1,2,3,3,3,3,3,3};
		System.out.println(maximoIntConsecutivos(vector));
		
		
		
	}
	
	public static int maximoIntConsecutivos(int [] vector) {
		
		int aux=1;
		int suma=0;
	
		boolean var=true;
		boolean var2=false;
		
		for(int i=1;i<vector.length;i++) {
			
				if(vector[i]==vector[i-1]) {
					var=true;
					var2=true;
					aux++;
					
					/*
					 * Solo entrará aqui al final de la iteracion del bucle for (cuando i=vector.length-1)
					 * Usamos este if, porque al final del bucle for, no entramos en el "else if"
					 */
					if(i==vector.length-1) {
						suma+=aux;
					}
				//Solo entrará aqui después de una secuencia de numeros consecutivos en el vector, luego, saldrá	
				}else if(var&&var2) {
					var=false;
					suma+=aux;
					aux=1;
					
				}else {
					
				}
		}
		
		return suma;
	}

}
