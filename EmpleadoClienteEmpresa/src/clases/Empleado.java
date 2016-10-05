package clases;

public class Empleado extends Persona {
	private String direccion;
	private String departamento;
	private float sueldo;
	
	public Empleado() {
		this.direccion = "";
		this.departamento = "";
		this.sueldo = 0;
	}

	public Empleado(String nombre, String apellidos ,String dni,String direccion, String departamento, float sueldo) {
		super(nombre, apellidos, dni);
		this.direccion = direccion;
		this.departamento = departamento;
		this.sueldo = sueldo;
	}

	public String maximoSueldo(Empleado[] array){
		float max = Float.MIN_VALUE;
		float min = Float.MAX_VALUE;
		int suma =0;
		String empleado="";
		
		for (int i = 0; i<array.length;i++){
			if (array[i].getSueldo() >max){
				max = array[i].getSueldo() ;
				empleado = array[i].getNombre() + " " + array[i].getApellidos();
			}
			if (array[i].getSueldo() <min){
				min = array[i].getSueldo() ;
			}
			//suma = suma + arrayNums[i];
			suma += array[i].getSueldo() ;
		}
		
		return empleado;	
			
		}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empleado [nombre=" + this.getNombre() + ", apellidos= " + this.getApellidos() + ", direccion= " + direccion + ", departamento="
				+ departamento + ", sueldo=" + sueldo + "]";
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
}
