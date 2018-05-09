/*
 * Devuelve un vector que contiene la posición que le corresponde a cada letra de la palabra recibida según el alfabeto español.
 * Autor: DM
 */
public class Ejercicio_14 {
	
	public static void main(String [] args) {
	
	String s="Hola";
	
	
	for(int u:indiceAlfabetico(s)) {
		System.out.print(u+ " ");
	}
		
		
		
	}//main
	
	/**
	 * Rellena y devuelve un vector numerico con las posiciones de las letras del alfabeto español de un String
	 * @param s
	 * @return vector
	 */
	public static int [] indiceAlfabetico(String s){
		
		//"s2" using toLowerCase();
		String s2=s.toLowerCase();
		
		//vector a rellenar y mostrar por pantalla
		int [] vector=new int [s.length()];
		
		//vector de caracteres con letras del alfabeto ordenadas
		char [] vectorchar= {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		
		//bucles for anidados que recorren el String (i) y el vector de caracteres (j)
		for(int i=0;i<s2.length();i++) {
			for(int j=0;j<vectorchar.length;j++) {
				
				if(s2.charAt(i)==vectorchar[j]) {
					
					vector[i]=j+1;
					
				}
				
			}
		}
		
		return vector;
	}
	

}//class
