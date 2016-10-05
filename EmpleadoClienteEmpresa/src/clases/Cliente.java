package clases;

public class Cliente extends Persona {
	private String telefono;
	private Empresa empresa;
	
	public Cliente() {
		
	}

	public Cliente(String nombre, String apellidos ,String dni,String telefono, Empresa empresa) {
		super(nombre, apellidos, dni);
		this.telefono = telefono;
		this.empresa = empresa;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the empresa
	 */
	public Empresa getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa the empresa to set
	 */
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
}
