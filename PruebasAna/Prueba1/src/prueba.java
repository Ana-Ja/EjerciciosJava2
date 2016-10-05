
public class prueba {

	public static void main(String[] args) {
		int i = 9,k;
		float j = 47.9F;
		System.out.println("i" +i + " j: " +j);
		k = (int)j; //empleo de un cast
		System.out.println("j: " + j +" k: " +k);
		j = k;//no necesita cast
		System.out.println("j: " + j + " k: " +k);
		float m =  2.3F;
		//float m = 2.3; daría error al compilar.
		prt("m:"+m);
		

	}
	static void prt(String s) {
		System.out.println(s);
	}

}
