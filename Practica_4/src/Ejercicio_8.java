
public class Ejercicio_8 {

	public static void main(String[] args) {
		
		int [] vector = {3,4,5,6};
		System.out.println(yaOrdenadoInt(vector));
		

	}
	
	public static boolean yaOrdenadoInt(int [] vector) {
		
		boolean var=true;
		boolean var2=true;
		boolean var3=true;
		
		for(int i=1;i<vector.length;i++) {
			
			if(vector[i]<vector[i-1] && var) {
				var2=false;
				
				
				
				
				
			}else if(vector[i]>vector[i-1] && var2) {
				var=false;
				
				
				
			}else {
				
				var3=false;
				break;
				
			}
			
		}
		
		
		return var3;
		
		
	}

}
