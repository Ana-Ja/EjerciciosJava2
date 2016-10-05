
public class Empleado extends Persona {
	
	private String direccion;
	private String departamento;
	private double sueldo;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}
	
	public Empleado(String nombre, String apellidos, String dni, String direccion, String departamento, float sueldo) {
		super(nombre, apellidos, dni);
		this.direccion = direccion;
		this.departamento = departamento;
		this.sueldo = sueldo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
