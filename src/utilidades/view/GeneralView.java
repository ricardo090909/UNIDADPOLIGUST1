package utilidades.view;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;

import enumeraciones.Orientacion;
import enumeraciones.PuestoTrabajo;
import modelo.Domicilio;

public class GeneralView {
	// Método estático que solicita información sobre un domicilio al usuario y devuelve un objeto Domicilio con esa información
	public static Domicilio getDomicilio() {
		String calle = leer("Ingrese la calle del domicilio");
		int numeroCasa = leerInt("Ingrese el numero de casa");
		Orientacion orientacion = getOrientacion();
		String colonia = leer("Ingrese la colonia");
		String ciudad = leer("Ingrese la ciudad");
		String estado = leer("Ingrese el estado");
		String codigoPostal = leer("Ingrese el codigo postal");
		Domicilio domicilio = new Domicilio();
		
		domicilio.setCalle(calle);
		domicilio.setNumeroCasa(numeroCasa);
		domicilio.setOrientacion(orientacion);
		domicilio.setColonia(colonia);
		domicilio.setCiudad(ciudad);
		domicilio.setEstado(estado);
		domicilio.setCodigoPostal(codigoPostal);
		
		return domicilio;
	}
	
	private static Orientacion getOrientacion() {
		String orienta = "Orientacion\n"
				+ "[N] Norte\n"
				+ "[S] Sur\n"
				+ "[O] Oriente\n"
				+ "[P] Poniente\n"
				+ "Dijite una opcion";
		String leerOri = leer(orienta);
		String mayus = leerOri.toUpperCase();
		char ori = mayus.charAt(0);
		
		if (ori == 'S')
			return Orientacion.SUR;
		else if (ori == 'O')
			return Orientacion.ORIENTE;
		else if (ori == 'P')
			return Orientacion.PONIENTE;
		else
			return Orientacion.NORTE;
	}
	
	public static PuestoTrabajo getPuestoTrabajo() {
		String[] opciones = {
				"Director",
				"Subdirector",
				"Jefe de departamento",
				"Coordinador",
				"Docente",
				"Auxiliar administrativo",
				"Prefectura",
				"Bibliotecario",
				"Orientador"};
		int opcion = getOptionMenu(opciones, "Puesto de trabajo");
		switch(opcion) {
		case 1: return PuestoTrabajo.DIRECTOR;
		case 2: return PuestoTrabajo.SUBDIRECTOR;
		case 3: return PuestoTrabajo.JEFE_DEPARTAMENTO;
		case 4: return PuestoTrabajo.COORDINADOR;
		case 5: return PuestoTrabajo.DOCENTE;
		case 6: return PuestoTrabajo.AUXILIAR_ADMINISTRATIVO;
		case 7: return PuestoTrabajo.PREFECTO;
		case 8: return PuestoTrabajo.BIBLIOTECARIO;
		case 9: return PuestoTrabajo.ORIENTADOR;
		}
		return null;
	}
	
	public static String getHorario() {
		String horario = leer("Ingrese la hora de entrada");
		horario += leer("Ingrese la hora de salida");
		return horario;
	}
	
	
	
	
	
	
	
}
