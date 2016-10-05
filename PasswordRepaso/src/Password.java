import java.util.Random;


public class Password {
	private int longitud;
	private String contraseña;
	private String cars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*.,?!$@#_()=+{}[]<>|";

	public Password(){
		this.longitud = 9;
		this.contraseña=generarPassword();
	}
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña=generarPassword();
	}
	
	public String generarPassword(){
		int longitud = this.longitud;
		String contra = "";
		Random rand = new Random();
		for (int i=0;i<longitud;i++){
			rand.nextInt(cars.length());
			contra += cars.charAt(rand.nextInt(cars.length()));
		}
		return contra;
	}
	public boolean esFuerte(){
		int cuentamayusculas=0;
		int cuentaminusculas=0;
		int cuentacaracter=0;
		int simbolos=0;
		for(int i=0;i<this.longitud;i++){
			
			if (Character.isUpperCase(this.contraseña.charAt(i)) ) {
				cuentamayusculas++;
			}
			else if (Character.isLowerCase(this.contraseña.charAt(i)) ) {
				cuentaminusculas++;
			}
			else if (Character.isDigit(this.contraseña.charAt(i)) ) {
				cuentacaracter++;
			}else{
			   simbolos++;
			}
		}
		System.out.println("cuentamayusculas =" + cuentamayusculas + " cuentaminusculas=" +cuentaminusculas +"cuentacaracter =" + cuentacaracter + " simbolos=" +simbolos) ;
		return (cuentamayusculas>=2 && cuentaminusculas >=1 && cuentacaracter>=5 && simbolos>=1) ? true : false;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
}
