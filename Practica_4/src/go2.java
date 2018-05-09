
public class go2 {

	
	public static int [] v1= {2,2,7,9};
	public static int [] v2= {2,9,7,9};
	
	
	public static boolean vectoresIntIguales(int [] v1, int [] v2){
		
		boolean variable=true;
		if(v1.length==v2.length) {
			for(int i=0;i<v1.length;i++) {
				
				if(v1[i]!=v2[i]) {
					variable=false;
				}
			}
			
		}
		else {
			variable =false;
		}
		
		return variable;
		
		
	}
	
	
}
