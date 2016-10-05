package clases;

public class Empleado {
	
	private String nombre;
	private String apellidos;
	private int sueldo;
	private String puesto;
	
	public Empleado(String nombre, String apellidos, int sueldo, String puesto){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldo = sueldo;
		this.puesto = puesto;
	}
	
	public void aplicarPlus(){
		switch (this.puesto) {
		case "Desarrollador":
			this.sueldo = (int) (this.sueldo *1.02);
			break;
		case "Analista":
			this.sueldo = (int) (this.sueldo *1.05);
			break;
		case "Jefe_Equipo":
			this.sueldo = (int) (this.sueldo *1.07);
			break;
		case "Jefe_Dpto":
			this.sueldo = (int) (this.sueldo *1.10);
			break;
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
