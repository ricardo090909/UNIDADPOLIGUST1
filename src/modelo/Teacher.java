package modelo;

public class Teacher extends Worker {
	private String titulo;
	private String academia;
	private String jefeInmediato;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAcademia() {
		return academia;
	}
	public void setAcademia(String academia) {
		this.academia = academia;
	}
	public String getJefeInmediato() {
		return jefeInmediato;
	}
	public void setJefeInmediato(String jefeInmediato) {
		this.jefeInmediato = jefeInmediato;
	}
	@Override
	public String toString() {
		return  super.toString() + " " + titulo + " Academia " + academia + " Jefe inmediato " + jefeInmediato;
	}
	
}
