package clases;

import java.util.Random;

public class Persona {
	private String nombre;
	public int edad;
	private String dNI;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona(){
		this.nombre = "";
		this.edad = 0;
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
		generaDNI();
	}
	
	public Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
		generaDNI();
	}
	
	/**
	 * Crea un objeto de la clase persona
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, char sexo, double peso,
			double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		generaDNI();
	}
	
	public int calcularIMC(){
		float imc= (float) (this.peso /(Math.pow(this.altura, 2)));
		
		if (imc<(float)18.5){
			return -1;
		}else if (imc<(float)25){
			return 0;
		}else{
			return 1;
		}
	}
	
	public boolean esMayorDeEdad(){
		return (this.edad >= 18);
	}
	
	private boolean comprobarSexo(char sexo){
		return this.sexo==sexo;
	}
	
	private void generaDNI(){
		Random rand = new Random();	
		//rand.nextInt ((max - min) +1) + min
		int num = rand.nextInt((99999999-1000000)+1)+10000000;
		char letra = this.generaLetra(num);
		this.dNI = num+"-"+letra;
	}
	
	private char generaLetra(int dni){
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letraBuena = letras.charAt(dni % 23);
		return letraBuena;
	}

	

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getdNI() {
		return dNI;
	}

	public void setdNI(String dNI) {
		this.dNI = dNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
}








