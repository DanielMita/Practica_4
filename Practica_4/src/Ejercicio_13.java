
/*
 * Programa que busca una submatriz de 3x3 maxima en una matriz mayor
 * Autor: DM
 */

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		//matriz principal
		int[][] matriz=new int [4][5];
		
		//rellenamos la matriz vacia con un metodo y la matriz devuelta, la igualamos a la matriz de mas arriba
		matriz=secuenciaNaturalIntA(matriz);
		
		//Muestra matriz original rellenada gracias al metodo secuenciaNaturalIntA()
		for(int [] u: secuenciaNaturalIntA(matriz)) {
			System.out.println();
			for(int z:u) {
				System.out.print(" "+z);
				
			}
		}
		
		System.out.println();
		
		//Muestra submatriz de 3x3 usando el metodo maxima3()
		for(int [] u: maxima3(matriz)) {
			System.out.println();
			for(int z:u) {
				System.out.print(" "+z);
				
			}
		}
		//Mostramos por pantalla suma de la submatriz de 3x3
		System.out.println("\n");
		System.out.println("La suma maxima de la submatriz de 3x3 es " + maxima33(matriz));

	}
	
	/**
	 * Extrae submatriz maxima de 3x3
	 * @param matriz
	 * @return matrix
	 */
	public static int [][] maxima3(int [][] matriz) {
		
		int maxima=0;
		int suma=0;
		int [][] matrix=new int [3][3];
		
		for(int i=0;i<matriz.length-2;i++) {
			for(int j=0;j<matriz[0].length-2;j++) {
				
				suma = matriz[i][j] + matriz[i][j+1] + matriz[i][j+2]
					
					  +matriz[i+1][j] + matriz[i+1][j+1] + matriz[i+1][j+2]
					
					  +matriz[i+2][j] + matriz[i+2][j+1] + matriz[i+2][j+2];
				
				
				if(suma>maxima) {
					
					maxima=suma;
					
					matrix[0][0]=matriz[i][j];
					matrix[0][1]=matriz[i][j+1];
					matrix[0][2]=matriz[i][j+2];
					matrix[1][0]=matriz[i+1][j];
					matrix[1][1]=matriz[i+1][j+1];
					matrix[1][2]=matriz[i+1][j+2];
					matrix[2][0]=matriz[i+2][j];
					matrix[2][1]=matriz[i+2][j+1];
					matrix[2][2]=matriz[i+2][j+2];

				}
				
			}
			
			
		}
		
		
		return matrix;
		
	}
	
	
	/**
	 * Rellenamos matriz original de datos
	 * @param matriz
	 * @return matriz
	 */
	public static int [][] secuenciaNaturalIntA(int [][] matriz){
		
		int contador=1;
		
		for(int i=0;i<matriz[0].length;i++) {			//5
			for(int j=0;j<matriz.length;j++) {			//4
				matriz[j][i]=contador++;				//4,5
			}
			
		}
		
		return matriz;
		
	}
	
	
	/**
	 * Devuelve suma maxima de submatrix de 3x3
	 * @param matriz
	 * @return suma
	 */
	public static int maxima33(int [][] matriz) {
		
		int maxima=0;
		int suma=0;
		int [][] matrix=new int [3][3];
		
		for(int i=0;i<matriz.length-2;i++) {
			for(int j=0;j<matriz[0].length-2;j++) {
				
				suma = matriz[i][j] + matriz[i][j+1] + matriz[i][j+2]
					
					  +matriz[i+1][j] + matriz[i+1][j+1] + matriz[i+1][j+2]
					
					  +matriz[i+2][j] + matriz[i+2][j+1] + matriz[i+2][j+2];
				
				
				if(suma>maxima) {
					
					maxima=suma;
					
					matrix[0][0]=matriz[i][j];
					matrix[0][1]=matriz[i][j+1];
					matrix[0][2]=matriz[i][j+2];
					matrix[1][0]=matriz[i+1][j];
					matrix[1][1]=matriz[i+1][j+1];
					matrix[1][2]=matriz[i+1][j+2];
					matrix[2][0]=matriz[i+2][j];
					matrix[2][1]=matriz[i+2][j+1];
					matrix[2][2]=matriz[i+2][j+2];

				}
				
			}
			
			
		}
		
		
		return suma;
		
	}

}
