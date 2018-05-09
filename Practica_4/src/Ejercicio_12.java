
public class Ejercicio_12 {
	
	static int contador=1;
	
	public static void main (String [] args) {
		
		
		int [][] matriz=new int [4][5];
		
		
		
		
		
		
		
		for(int u[]:secuenciaNaturalIntA(matriz)) {
			System.out.println();
			for(int z:u) {
				System.out.print("  "+ z);
			}
		}
		
	}//main
	
	
	public static int [][] secuenciaNaturalIntA(int [][] matrix){
		
		contador=1;
		
		for(int i=0;i<matrix[0].length;i++) {			//5
			for(int j=0;j<matrix.length;j++) {			//4
				matrix[j][i]=contador++;				//4,5
			}
			
		}
		
		return matrix;
		
	}
	
	public static int [][] secuenciaNaturalIntB (int [][] matrix){
		
		contador=1;
		
		for(int i=0;i<matrix[0].length;i++) {
			
			if(i==0 || i%2==0) {
				
				for(int j=0;j<matrix.length;j++) {
					
					matrix[j][i]=contador++;
					
				}
				
			}else {
				
				for(int j=matrix.length-1;j>=0;j--) {
					
					matrix[j][i]=contador++;
					
				}
			}
		}
		
		return matrix;
	}
	

	public static int [][] secuenciaNaturalIntC (int [][] matrix){
		
		contador=1;
		
		//primero
		for(int i=0;i<matrix.length;i++) {
			matrix[i][0]=contador++;
			
		}
		//segundo
		for(int i=1;i<matrix.length-1;i++) {
			
			matrix[matrix.length-1][i]=contador++;
			
		}
		//tercero
		for(int i=matrix.length-1;i>=0;i--) {
			
			matrix[i][matrix.length-1]=contador++;
		}
		
		for(int i=matrix.length-2;i>0;i--) {
			matrix[0][i]=contador++;
		}
		
		for(int i=1;i<matrix.length-1;i++) {
			
			matrix[i][1]=contador++;
		}
		
		for(int i=2;i<matrix.length-1;i++) {
			
			matrix[matrix.length-2][i]=contador++;
		}
		
		for(int i=matrix.length-3;i>0;i--) {
			
			matrix[i][matrix.length-2]=contador++;
		}
			
		
			
		return matrix;
		
	}
	
}
