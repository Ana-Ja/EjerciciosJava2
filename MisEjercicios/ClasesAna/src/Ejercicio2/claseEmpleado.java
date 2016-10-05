package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class claseEmpleado {
	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	public claseEmpleado() {
		this.nombre = "";
		generaDNI();
		this.edad=0;
		this.sexo='H';
		this.peso = 0;
		this.altura = 0;
	}
	public claseEmpleado(String nombre,int edad, char sexo) {
		this.nombre = nombre;
		generaDNI();
		this.edad=edad;
		this.sexo=sexo;
		this.peso = 0;
		this.altura = 0;
	}
	public claseEmpleado(String nombre,String dni,int edad, char sexo,double peso,double altura) {
		this.nombre = nombre;
		generaDNI();
		this.edad=edad;
		this.sexo=sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC(){
		double masa = 0;
		masa = this.peso/Math.pow(this.altura, 2);
		if (masa < 18.5) {
			return -1;
		} else if ((masa >= 18.5)&& (masa<= 24.99)) {
			return 0;			
		} else {
			return 1;
		}
		
	}
	public boolean esMayorEdad() {
		if (this.edad >=18) {
			return true;
		} else return false;
		// return (this.edad >= 18;
	}
	
	public char comprobarSexo(char sexo) {
		if ((sexo != 'H') || (sexo != 'M')) {
			return 'H';
		} else return sexo;
		
		
	}
	private void 	generaDNI() {
		String letra = "TRWAGMYFPDXBNJZSQVHLCKE";
		String dni_letra;
		long dni;
		int resto;
		char miletra;
		
		//si queremos que el numero tenga 8 digitos y no 3 o 5 o9
		Random rand = new Random();
		//rans.nextInt((max-min)+1) + min
		int num = rand.nextInt((99999999-10000000)+1)+ 10000000;
		
		
		
		 dni = (int) (Math.random()*100000000+1);
		 System.out.println(dni);
		
		resto = (int) dni % 23;
		//System.out.println("resto" + resto);
		miletra = letra.charAt(resto);
		System.out.println(miletra);
		this.dni =  "" + dni + miletra;
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
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
