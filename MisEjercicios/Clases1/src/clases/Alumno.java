package clases;

public class Alumno extends Persona {
	private int asignaturas;
	
	
	
	public Alumno() {
		
	}

	public Alumno(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		this.asignaturas = 0;
	}

	public Alumno(String nombre, int edad, String dNI, char sexo, double peso,
			double altura) {
		super(nombre, edad, dNI, sexo, peso, altura);
		this.asignaturas = 0;
	}
	
	public void matricular() {
		this.asignaturas ++;
	}

	/**
	 * @return the asignaturas
	 */
	public int getAsignaturas() {
		return asignaturas;
	}

}
