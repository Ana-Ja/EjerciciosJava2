import java.util.Scanner;


public class crearPassword {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce longitud del array");
		int longitud = entrada.nextInt();
		System.out.println("Introduce longitud de password");
		int longpass = entrada.nextInt();
		String password[] = new String[longitud];
		Boolean fuerte[] = new Boolean[longitud];
		for(int i=0;i<longitud;i++) {
			Password pas =  new Password(longpass);
			password[i]= pas.getContraseña();
			fuerte[i]= pas.esFuerte();
		}
		for(int i=0;i<longitud;i++) {
			System.out.println("password =" + password[i] + " fuerte=" +fuerte[i]) ;
		}
		
	}

}
