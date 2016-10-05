
public class Videojuego implements Entregable {
	private String titulo;
	private int horas_estimadas;
	private boolean entregado;
	private String genero;
	private String compa�ia;
	
	protected final int HORAS_ESTIMADAS = 10;
	
	public Videojuego() {
		this.titulo = "";
		this.horas_estimadas = HORAS_ESTIMADAS;
		this.entregado = false;
		this.genero = "";
		this.compa�ia = "";
	}
	public Videojuego(String titulo, int horas_estimadas, String genero,
			String compa�ia) {
		super();
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}
	public Videojuego(String titulo, int horas) {
		this.titulo = titulo;
		this.horas_estimadas = horas;
		this.entregado = false;
		this.genero = "";
		this.compa�ia = "";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas_estimadas="
				+ horas_estimadas + ", entregado=" + entregado + ", genero="
				+ genero + ", compa�ia=" + compa�ia + ", HORAS_ESTIMADAS="
				+ HORAS_ESTIMADAS + "]";
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}
	
	@Override
	public void devolver() {
		this.entregado = false;
	}
	
	@Override
	public boolean esEntregado() {
		return this.entregado;
	}
	
	@Override
	public int compareTo(Object a) {
		//si a no se puede convertir a tipo Videojuego daria error y habria que controlarlo con excepciones
		// estamos comparando los dos objetos en base al campo horas, pero se podr�a hacer por otras razones
		Videojuego comp = (Videojuego)a;
		if (this.horas_estimadas == comp.horas_estimadas) {
			return 0;
		}else if (this.horas_estimadas > comp.horas_estimadas) {
			return 1;
		} else {
		return -1;
		}
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the horas_estimadas
	 */
	public int getHoras_estimadas() {
		return horas_estimadas;
	}
	/**
	 * @param horas_estimadas the horas_estimadas to set
	 */
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}
	/**
	 * @return the entregado
	 */
	public boolean isEntregado() {
		return entregado;
	}
	/**
	 * @param entregado the entregado to set
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the compa�ia
	 */
	public String getCompa�ia() {
		return compa�ia;
	}
	/**
	 * @param compa�ia the compa�ia to set
	 */
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

}
