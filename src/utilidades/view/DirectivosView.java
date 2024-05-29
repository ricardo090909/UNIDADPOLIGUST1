package utilidades.view;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;
import static utilidades.view.GeneralView.*;
import static utilidades.view.PersonView.*;

import enumeraciones.TipoDirectivo;
import modelo.Directivos;

public class DirectivosView {
	// Método estático que solicita información sobre un directivo al usuario y devuelve un objeto Directivos con esa información
	public static Directivos getManagerView(String curp) {
		Directivos manager = new Directivos();
		manager.setCurp(curp);
		manager.setRfc(leer("Ingrese el rfc"));
		manager.setNombre(leer("Ingrese el nombre"));
		manager.setPaterno(leer("Ingres el apellido paterno"));
		manager.setMaterno(leer("Ingrese el apelido materno"));
		manager.setFechaNacimiento(getFechaNacimiento());
		manager.setGenero(getGenero());
		manager.setDomicilio(getDomicilio());
		manager.setPuesto(getPuestoTrabajo());
		manager.setHorario(getHorario());
		manager.setSueldo(leerDoble("Ingrese su sueldo "));
		manager.setGradoEstudios(leer("Ingrese su grado de estudios"));
		manager.setTipoDirectivo(getTipoDirectivo());
		manager.setCompensacion(leerDoble("Dijite su compensacion"));
		return manager;
	}
	
	private static TipoDirectivo getTipoDirectivo() {
		String[] opciones = {
				"Subdirector academico",
				"Sudirector administrativo"
			
		};
		int opcion = getOptionMenu(opciones,"Dijite el numero de la opcion");
		switch(opcion){
		case 1: return TipoDirectivo.SUBDIRECTOR_ACADEMICO;
		case 2: return TipoDirectivo.SUBDIRECTOR_ADMINISTRATIVO;

		}
		return null;
	}
}
