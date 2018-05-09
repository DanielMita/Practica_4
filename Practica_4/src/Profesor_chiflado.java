/**
 * Demostración de cómo descomponer un problema complejo de recorrido de matrices,
 * en subproblemas más simples y sencillos de abordar.
 * @author ajp - 2017.12.29
 */
public class Profesor_chiflado {

	// Distribución para prueba recorrido básico por filas.
	static int[][] matriz = {
			{ 1,  2,  3,  4},
			{ 5,  6,  7,  8},
			{ 9, 10, 11, 12},
			{13, 14, 15, 16}
	};

	// Distribuciones para prueba recorrido espiral.
	static int[][] matrizE2 = {
			{1, 4},
			{2, 3},

	};

	static int[][] matrizE3 = {
			{1, 8, 7},
			{2, 9, 6},
			{3, 4, 5},
	};

	static int[][] matrizE4 = {
			{1, 12, 11, 10},
			{2, 13, 16,  9},
			{3, 14, 15,  8},
			{4,  5,  6,  7}
	};

	static int[][] matrizE5 = {
			{1, 16, 15, 14, 13},
			{2, 17, 24, 23, 12},
			{3, 18, 25, 22, 11},
			{4, 19, 20, 21, 10},
			{5,  6,  7,  8,  9}
	};

	public static void main(String[] args) {
		System.out.println(recorrerPorFilas(matriz));
		System.out.println(recorrerEspiralBasico3a());
		//System.out.println(recorrerEspiralBasico3b());
		//System.out.println(recorrerEspiralBasico4b());
		//System.out.println(recorrerEspiral(matrizE5));
	}

	/**
	 * Recorre en espiral, en sentido antihorario, la matriz recibida.
	 * @param matriz
	 * @return La secuencia obtenida en forma de texto separado por comas.
	 */
	public static String recorrerEspiral(int[][] matriz) {
		String secuencia = "";
		int limite = matriz.length;	
		for (int i = limite, j = 1; i > limite-3; i--, j++) {
			
			//       [0][0]        a      [3][0] para tamaño 4
			//[limite-i][limite-i] a [limite][limite-i]
			for (int fila = limite-i, col = limite-i; fila < i; fila++) {
				secuencia += matriz[fila][col] + ", ";
			}
			
			//                [3][1] a [3][3] para tamaño 4
			//[limite-j][limite-i+1] a [limite][limite-i]
			for (int fila = limite-j, col = limite-i+1; col < i; col++) {
				secuencia += matriz[fila][col] + ", ";
			}
			//         [2][3] a [0][3] para tamaño 4
			//[i-2][limite-j] a [limite-i][limite-j]	
			for (int fila = i-2, col = limite-j; fila >= limite-i; fila--) {
				secuencia += matriz[fila][col] + ", ";
			}
			
			//	              [0][2] a [0][1] para tamaño 4
			//[limite-i][limite-j-1] a [limite-i][limite-i+1]
			for (int fila = limite-i, col = limite-j-1; col >= limite-i+1; col--) {
				secuencia += matriz[fila][col] + ", ";
			}
		}	
		return secuencia;
	}
	

	/**
	 * Recorre, en sentido antihorario, el perímetro de una matriz de 4x4. 
	 * @return La secuencia obtenida en forma de texto separado por comas.
	     [0] [1] [2] [3]
	[0]	  1  12  11  10
	[1]	  2           9
	[2]	  3       	  8
	[3]   4   5   6   7
	Hay que darse cuenta que la primera vuelta completa obtendría: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12. 
	El 13 se obtendría ya con la segunda vuelta. 
	Objetivo básico: Obtener 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  
	-la primera vuelta- sin intentar resolver nada más.	
	
	¿Es posible con un solo bucle?
		Objetivo parcial1: Obtener 1, 2, 3, 4 con un bucle for
		Objetivo parcial2: Obtener 5, 6, 7 con un bucle for y añadir
		Objetivo parcial3: Obtener 8, 9, 10 con un bucle for y añadir
		Objetivo parcial4: Obtener 11, 12 con un bucle for y añadir
	Experiencia: Se recomienda hacer referencia a los índices 
	con nombres de variables significativos: fila y col, no i, j
	 */

	public static String recorrerEspiralBasico4b() {
		String secuencia = "";
		int limite = matrizE4.length; 

		//[0][0] a        [3][0]
		//[0][0] a [limite-1][0]
		for (int fila = 0, col = 0; fila <= limite-1; fila++) {	// Objetivo parcial1: Obtener 1, 2, 3, 4
			secuencia += matrizE4[fila][col] + ", ";			// col = 0
		}

		//[3][1] a [3][3]
		//[3][1] a [3][limite-1]
		for (int fila = 3, col = 1; col <= limite-1; col++) {	// Objetivo parcial2: Obtener 5, 6, 7
			secuencia += matrizE4[fila][col] + ", ";			// fila = limite-1
		}

		//[2][3] a [0][3]
		for (int fila = 2, col = 3; fila >= 0; fila--) {		// Objetivo parcial3: Obtener 8, 9, 10
			secuencia += matrizE4[fila][col] + ", ";			// col = limite-1
		}

		//[0][2] a [0][1]
		for (int fila = 0, col = 2; col >= 1; col--) {			//Objetivo parcial4: Obtener 11, 12 
			secuencia += matrizE4[fila][col] + ", ";			// fila = 0
		}
		return secuencia;
	}

	/**
	 * Recorre, en sentido antihorario, el perímetro de una matriz de 3x3. 
	 * @return La secuencia obtenida en forma de texto separado por comas.
	 */
	public static String recorrerEspiralBasico3b() {
		String secuencia = "";
		int limite = matrizE3.length; 

		//[0][0] a        [2][0]
		//[0][0] a [limite-1][0]
		for (int fila = 0, col = 0; fila <= limite-1; fila++) {	// Objetivo parcial1: Obtener 1, 2, 3
			secuencia += matrizE3[fila][col] + ", ";			// col = 0
		}

		//[2][1] a [2][2]
		//[2][1] a [2][limite-1]
		for (int fila = 2, col = 1; col <= limite-1; col++) {	// Objetivo parcial2: Obtener 4, 5
			secuencia += matrizE3[fila][col] + ", ";			// fila = limite-1
		}

		//[1][2] a [0][2]
		for (int fila = 1, col = 2; fila >= 0; fila--) {		// Objetivo parcial3: Obtener 6, 7
			secuencia += matrizE3[fila][col] + ", ";			// col = limite-1
		}

		//[0][1] a [0][1]
		for (int fila = 0, col = 1; col >= 1; col--) {			//Objetivo parcial4: Obtener 8 
			secuencia += matrizE3[fila][col] + ", ";			// fila = 0
		}	
		return secuencia;
	}

	
	/**
	 * Recorre, en sentido antihorario, el perímetro de una matriz de 3x3. 
	 * @return La secuencia obtenida en forma de texto separado por comas.
		 [0] [1] [2]
	[0]	  1   8   7
	[1]	  2       6
	[2]	  3   4   5	
	Hay que darse cuenta que la primera vuelta completa obtendría: 1, 2, 3, 4, 5, 6, 7, 8. 
	El 9 se obtendría ya con la segunda vuelta. 
	Objetivo básico: Obtener 1, 2, 3, 4, 5, 6, 7, 8  
	-la primera vuelta- sin intentar resolver nada más.	
	
	¿Es posible con un solo bucle?
		Objetivo parcial1: Obtener 1, 2, 3 con un bucle for
		Objetivo parcial2: Obtener 4, 5 con un bucle for y añadir
		Objetivo parcial3: Obtener 6, 7 con un bucle for y añadir
		Objetivo parcial4: Obtener 8 con un bucle for y añadir
	Experiencia: Se recomienda hacer referencia a los índices con 
	nombres de variables significativos: fila y col, no i, j
	 */	
	public static String recorrerEspiralBasico3a() {
		String secuencia = "";
		int limite = matrizE3.length; 

		//[0][0] a [2][0]								// La col = 0 es fija
		for (int fila = 0; fila <= 2; fila++) {			// Objetivo parcial1: Obtener 1, 2, 3		
			secuencia += matrizE3[fila][0] + ", ";		// col = 0
		}

		//[2][1] a [2][2]								// La fila = 2 es fija
		for (int col = 1; col <= 2; col++) {				// Objetivo parcial2: Obtener 4, 5		
			secuencia += matrizE3[2][col] + ", ";		// fila = limite-1, osea 2
		}

		//[1][2] a [0][2]								// La col = 2 es fija
		for (int fila = 1; fila >= 0; fila--) {			// Objetivo parcial3: Obtener 6, 7	
			secuencia += matrizE3[fila][2] + ", ";		// col = limite-1, osea 2
		}

		//[0][1] a [0][1]								// La fila = 1 es fija
		for (int col = 1; col >= 1; col--) {			// Objetivo parcial4: Obtener 8 	
			secuencia += matrizE3[0][col] + ", ";		// fila = 0
		}
		return secuencia;
	}

	
	/**
	 * Recorre, por filas una matriz recibida como parámetro.
	 * @param matriz
	 * @return La secuencia obtenida en forma de texto separado por comas.
	 */
	public static String recorrerPorFilas(int[][] matriz) {
		String secuencia = "";

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				secuencia += matriz[fila][col] + ", ";
			}
		}
		return secuencia;
	}
	
} //class