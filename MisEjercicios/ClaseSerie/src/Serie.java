
public class Serie  implements Entregable {
	private boolean entregado;
	private String titulo;
	private String genero;
	private String creador;
	private int num_temporadas;
	
	protected final  int NUM_TEMP = 3;
	public Serie() {
		this.num_temporadas = NUM_TEMP;
		this.entregado = false;
		this.genero = "";
		this.titulo= "";
		this.creador = "";
				
				
	}
	public Serie(String titulo, String creador) {
		this();
		this.titulo = titulo;
		this.creador = creador;
	}
	public Serie(String titulo, String creador, String genero, int num_temp) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.num_temporadas = num_temp;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Serie [entregado=" + entregado + ", titulo=" + titulo
				+ ", genero=" + genero + ", creador=" + creador
				+ ", num_temporadas=" + num_temporadas + "]";
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
		return 0;
	}
	
	/**
	 * @param entregado the entregado to set
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
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
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}
	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}
	/**
	 * @return the num_temporadas
	 */
	public int getNum_temporadas() {
		return num_temporadas;
	}
	/**
	 * @param num_temporadas the num_temporadas to set
	 */
	public void setNum_temporadas(int num_temporadas) {
		this.num_temporadas = num_temporadas;
	}
	/**
	 * @return the nUM_TEMP
	 */
	public int getNUM_TEMP() {
		return NUM_TEMP;
	}
}

