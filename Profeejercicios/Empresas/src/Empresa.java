
public class Empresa {
	private String nombre;
	private String nif;
	private String direccion;
	private float facturacion;
	
	public Empresa (){
		this.nombre = "";
		this.nif = "";
		this.direccion = "";
		this.facturacion = 0;
	}

	public Empresa(String nombre, String nif, String direccion,
			float facturacion) {
		this.nombre = nombre;
		this.nif = nif;
		this.direccion = direccion;
		this.facturacion = facturacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public float getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(float facturacion) {
		this.facturacion = facturacion;
	}
	
	
}
