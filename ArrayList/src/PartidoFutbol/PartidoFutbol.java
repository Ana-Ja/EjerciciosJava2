package PartidoFutbol;

public class PartidoFutbol {
	private String EquipoLocal;
	private String EquipoVisitante;
	public String getEquipoLocal() {
		return EquipoLocal;
	}
	public void setEquipoLocal(String equipoLocal) {
		EquipoLocal = equipoLocal;
	}
	public String getEquipoVisitante() {
		return EquipoVisitante;
	}
	public void setEquipoVisitante(String equipoVisitante) {
		EquipoVisitante = equipoVisitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisitante() {
		return golesVisitante;
	}
	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}
	private int golesLocal;
	private int golesVisitante;
	public PartidoFutbol() {
		
	}

}
