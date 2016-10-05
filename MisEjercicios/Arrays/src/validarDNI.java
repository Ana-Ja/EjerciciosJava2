
public class validarDNI {
	public static void main(String[] args){
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		String dni = "12345678-Z";
		
		String[] partido = dni.split("-");
		
		int num = Integer.parseInt(partido[0]);
		char letra = letras.charAt(num % 23);
				
		if (letra == partido[1].charAt(0)){
			System.out.print("DNI correcto");
		}else{
			System.out.print("DNI incorrecto");
		}
	}
}
