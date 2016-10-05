package clases;

public class Empresa {
	private String nombre;
	private String direccion;
	private String nif;
	private  double facturacion;
	
	public Empresa(){
		
	}

	public Empresa(String nombre, String direccion, String nif,
			double facturacion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.nif = nif;
		this.facturacion = facturacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", direccion=" + direccion
				+ ", nif=" + nif + ", facturacion=" + facturacion + "]";
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
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return the facturacion
	 */
	public double getFacturacion() {
		return facturacion;
	}

	/**
	 * @param facturacion the facturacion to set
	 */
	public void setFacturacion(double facturacion) {
		this.facturacion = facturacion;
	}
	
}
