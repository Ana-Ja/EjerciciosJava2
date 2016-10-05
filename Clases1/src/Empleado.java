
public class Empleado {
	private String nombre;
	private String apellidos;
	private String puesto;
	private int salario;
	private String[][] arrayPuestos = {{"Desarrollador","2"}, {"Analista","5"}, {"Jefe Equipo","7"}, {"Jefe Depto","10"}};
	
	
	public Empleado(String nombre, String apellidos, int salario, String puesto) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	public Empleado() {
		this.nombre = "";
		this.apellidos = "";
		this.puesto = "";
		this.salario = 0;
	}
	public double AplicarPlus(){
		double nuevo_salario = 0;
		for (int i=0; i<4; i++){
			if (arrayPuestos[i][0].equals(this.puesto)){
				nuevo_salario= (double) (this.salario * (1 +(Double.parseDouble(arrayPuestos[i][1])/100)));
			
			}
		}
		return nuevo_salario;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
