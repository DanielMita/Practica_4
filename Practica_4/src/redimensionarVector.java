import java.util.Arrays;

/*
 * Programa que redimensiona un vector original
 * Usaremos varios metodos
 * Autor: ajp
 */


public class redimensionarVector {
	
	//Al poner el vector como vector global, no hace falta pasar dicho vector como parametro a los metodos
	static int [] datos= {2,9,3,5,1,7}; 

	
	
	public static void main(String[] args) {
		
		System.out.println("Vector de datos original ");
		monstrarVectorDatos();
		
		
		redimensionarBasico();
		System.out.println(" Vector de datos reasignado con redimensionarBasico() ");
		monstrarVectorDatos();
		
		redimensionarAvanzado1();
		System.out.println(" Vector de datos reasignado con redimensionarAvanzado1() ");
		monstrarVectorDatos();
		
		redimensionarAvanzado2();
		System.out.println(" Vector de datos reasignado con redimensionarAvanzado2() ");
		monstrarVectorDatos();

	}
	
	/**
	 * Define un nuevo vector, copia los datos y reasigna la nueva referencia a la variable original.
	 */
	static void redimensionarBasico() {
		
		
		int[] nuevoDatos = new int[datos.length * 2];
		
		for(int i = 0; i < datos.length; i++) {
			nuevoDatos[i] = datos[i];
		}
		datos = nuevoDatos;
	}

	
	/**
	 * Define un nuevo vector, copia los datos y reasigna la nueva referencia a la variable original.
	 */
	
	public static void redimensionarAvanzado2() {
		
		
		datos = Arrays.copyOf(datos, datos.length * 2);	
		
	}
	
	
	/**
	 * Define un nuevo vector, copia los datos y reasigna la nueva referencia a la variable original.
	 */
	
	public static void redimensionarAvanzado1() {
		
		
		int[] nuevoDatos = new int[datos.length * 2];
		System.arraycopy(datos, 0, nuevoDatos, 0, datos.length-1);
		datos = nuevoDatos;	
	}
	
	
	/**
	 * Muestra de forma simple los datos de un array
	 */
	public  static void monstrarVectorDatos() {
		System.out.println(Arrays.toString(datos));	
	}

}
