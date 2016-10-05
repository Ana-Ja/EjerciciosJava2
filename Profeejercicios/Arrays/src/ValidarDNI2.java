
public class ValidarDNI2 {

	public static void main(String[] args) {
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		String dni = "12345678-Z";
		
		int numero = Integer.parseInt(dni.substring(0, 8));
		char letra = dni.charAt(9);
		
		char letraBuena = letras.charAt(numero % 23);
		
		if (letra == letraBuena){
			System.out.print("DNI correcto");
		}else{
			System.out.print("DNI incorrecto");
		}

	}

}
