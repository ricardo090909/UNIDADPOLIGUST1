package modelo;

import enumeraciones.TipoDirectivo;

public class Directivos extends Worker {
	private String gradoEstudios;
	private TipoDirectivo tipoDirectivo;
	private double compensacion;
	
	public String getGradoEstudios() {
		return gradoEstudios;
	}
	public void setGradoEstudios(String gradoEstudios) {
		this.gradoEstudios = gradoEstudios;
	}
	public TipoDirectivo getTipoDirectivo() {
		return tipoDirectivo;
	}
	public void setTipoDirectivo(TipoDirectivo tipoDirectivo) {
		this.tipoDirectivo = tipoDirectivo;
	}
	public double getCompensacion() {
		return compensacion;
	}
	public void setCompensacion(double compensacion) {
		this.compensacion = compensacion;
	}
	@Override
	public String toString() {
		return "Grado de estudios" + gradoEstudios + ", " + tipoDirectivo + ", compensacion "+ compensacion + "]";
	}
	
	
}
