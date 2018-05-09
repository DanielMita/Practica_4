/**
 * BannerVector.java
 * Programa ejemplo que genera banner de una letra utilizando un vector.
 * ajp - 2017.12.15
 */

public class Ejercicio_11 {
	
	public static void main(String[] args) {	
		
		
		char letra = 'f';
		System.out.println(bannerLetra(Character.toUpperCase(letra))); 	
		System.out.println(Character.toUpperCase(letra));
	}

	/** * Proporciona representación banner de una letra.
	 * @param letra, a tratar.
	 * @return representacion de la letra. 
	 */
	static String bannerLetra(char letra) {
		
		assert letra >= 'A': "No es mayúscula";
		assert letra <= 'Z';
		
		String[] representaciones = {
				"   A   \n" 
			+ 	" A   A \n" 
			+ 	"A     A\n" 
			+	"A     A\n" 
			+	"AAAAAAA\n" 
			+	"A     A\n" 
			+	"A     A\n",

				"BBBBB  \n" 
			+	"B     B\n" 
			+ 	"B     B\n" 
			+ 	"BBBBB  \n" 
			+ 	"B     B\n" 
			+ 	"B     B\n" 
			+ 	"BBBBB  \n",
			
				"   CC  \n" 
			+	" C    C\n" 
			+ 	"C      \n" 
			+ 	"C      \n" 
			+ 	"C      \n" 
			+ 	" C    C\n" 
			+ 	"   CC  \n",
			
				"DDDD   \n" 
			+	"D    D \n" 
			+ 	"D     D\n" 
			+ 	"D     D\n" 
			+ 	"D     D\n" 
			+ 	"D    D \n" 
			+ 	"DDDD   \n",
			
				"EEEEEEE\n" 
			+	"E      \n" 
			+ 	"E      \n" 
			+ 	"EEEEE  \n" 
			+ 	"E      \n" 
			+ 	"E      \n" 
			+ 	"EEEEEEE\n",
			
				"FFFFFFF\n" 
			+	"F      \n" 
			+ 	"F      \n" 
			+ 	"FFFFF  \n" 
			+ 	"F      \n" 
			+ 	"F      \n" 
			+ 	"F      \n",
		} ;
		
		return representaciones[letra - 'A'];
	}









}
