
public class Cliente extends Persona {
	private String telefono;
	private Empresa empresa;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}
	
	public Cliente(String nombre, String apellidos, String dni, String telefono) {
		super(nombre, apellidos, dni);
		this.telefono = telefono;
		
	}
	
	public Cliente(String nombre, String apellidos, String dni, String telefono, Empresa empresa) {
		super(nombre, apellidos, dni);
		this.telefono = telefono;
		this.empresa = empresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
