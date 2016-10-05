package clases;

public class Password {
	private int longitud;
	private String contrasena;
	
	private String cars ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*.,?!$@#_()=+{}[]<>|";
	
	
	public Password(){
		this.longitud = 8;
	}
	
	public Password(int longitud){
		this.longitud = longitud;
	}
	
	public void generarPassword(){
		String pass="";
		for (int i=0;i<this.longitud;i++){
			int pos = (int)(Math.random()*cars.length());
			pass = pass+cars.charAt(pos);
			//pass += cars.charAt(pos);
		}
		this.contrasena = pass;
	}
	
	public boolean esFuerte(){
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		int simbolos =0;
		
		for (int i = 0;i<this.longitud;i++){
			if (Character.isUpperCase(this.contrasena.charAt(i))){
				mayusculas++;
			}else if (Character.isLowerCase(this.contrasena.charAt(i))){
				minusculas++;
			}else if (Character.isDigit(this.contrasena.charAt(i))){
				numeros++;
			}else{
				simbolos++;
			}
		}
		
		if (mayusculas>2 && minusculas>1 && numeros>5 && simbolos>1){
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean esFuerte2(){
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;
		int simbolos =0;
		
		for (int i = 0;i<this.longitud;i++){
			if (this.contrasena.charAt(i)>='A' && this.contrasena.charAt(i)<='Z'){
				mayusculas++;
			}else if (this.contrasena.charAt(i)>='a' && this.contrasena.charAt(i)<='z'){
				minusculas++;
			}else if (this.contrasena.charAt(i)>='0' && this.contrasena.charAt(i)<='9'){
				numeros++;
			}else{
				simbolos++;
			}
		}
		
		if (mayusculas>2 && minusculas>1 && numeros>5 && simbolos>1){
			return true;
		}else{
			return false;
		}
		
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasena() {
		return contrasena;
	}


	
}
