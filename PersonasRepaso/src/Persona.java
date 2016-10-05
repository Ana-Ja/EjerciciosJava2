import java.util.Random;


public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double altura;
	private double peso;
	public Persona(){
		this.nombre = "";
		this.edad = 0;
		this.dni = generaDNI();
		this.sexo = 'H';
		this.altura = 0;
		this.peso = 0;
	}
	
	
	public Persona(String nombre, int edad, char sexo) {
		//System.out.println("dni2" + this.dni);
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.dni = generaDNI();
		this.altura = 1.70;
		this.peso = 64;
	}

	public Persona(String nombre, int edad, String dni, char sexo,
			double altura, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = comprobarSexo(sexo);
		this.altura = altura;
		this.peso = peso;
	}
	
	public int calcularIMC(){
		double imc = this.peso/Math.pow(this.altura, 2);
		if (imc < 18.5){
			return -1;
		} else if (imc >= 18.5 && imc <= 24.99){
			return 0;
		} else {
			return 1;
		}
			
	}
	private String generaDNI(){
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		int dni = (int) (Math.random()*100000001);
		
		char letra = letras.charAt(dni % 23);
		return dni + "-"+letra;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni
				+ ", sexo=" + sexo + ", altura=" + altura + ", peso=" + peso
				+ "]";
	}


	public boolean esMayorDeEdad(){
		return this.edad>=18 ? true: false;
	}
	
	private char comprobarSexo(char sexo){
		return (sexo != 'H' && sexo !='M') ? 'H': sexo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
