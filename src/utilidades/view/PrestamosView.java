package utilidades.view;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;
import modelo.Prestamo;

public class PrestamosView {
    public static Prestamo getPrestamoView(String identificador) {
        Prestamo prestamo = new Prestamo();
        prestamo.setIdentificador(identificador);
        prestamo.setTituloLibro(leer("Ingrese el título del libro"));
        prestamo.setFechaPrestamo(getFechaPrestamo());
        prestamo.setFechaDevolucion(getFechaDevolucion());
        prestamo.setEstado(leer("Ingrese el estado del libro"));
        return prestamo;
    }

    private static String getFechaPrestamo() {
        return leer("Ingrese la fecha de préstamo (dd/MM/yyyy)");
    }

    private static String getFechaDevolucion() {
        return leer("Ingrese la fecha de devolución (dd/MM/yyyy)");
    }
}
