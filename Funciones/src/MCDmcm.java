
public class MCDmcm {
	public static int MCD(int a, int b){
		int resultado = Math.min(a, b);
		//busco desde el menor de los dos hacia abajo y devuelve el que divide a los dos
		//con un for	
		for(int i=resultado; i>0;i--) {
				if ((a%i==0) && (b%i==0)) {
					return i;
				}
			}
		return 1;	
		// con un while
//		while ((a%resultado !=0) || (b%resultado != 0)) {
//			resultado--;
//		}
//		return resultado;	
	}
	
	public static int mcm(int a, int b){
		return (a*b)/MCD(a,b);	
   		
	}
	
	public static void main(String[] args) {
		System.out.println(MCD(42,56));				
	}

}
