package controlador;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;
import static utilidades.view.PrestamosView.getPrestamoView;
import static dao.DaoUtility.getInputManagers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.Operable;
import modelo.Prestamo;

public class PrestamosController {
    private static Operable prestamos;

    public static void initDataPrestamos(Operable prestamos) {
        PrestamosController.prestamos = prestamos;
    }

    public static class OyenteRegistrarPrestamos implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!prestamos.isFull()) {
                do {
                    String identificador = null;
                    boolean identificadorValido = false;

                    while (!identificadorValido) {
                        String tipoIdentificador = leer("Ingrese el tipo de identificador (CURP o Numero de Control): ").trim().toUpperCase();

                        if (tipoIdentificador.equals("CURP") || tipoIdentificador.equals("NUMERO DE CONTROL")) {
                            identificador = leer("Ingrese el " + tipoIdentificador + ": ");
                            identificadorValido = true;
                        } else {
                            mostrar("Tipo de identificador no válido. Intente de nuevo.");
                        }
                    }

                    int position = prestamos.getPosition(identificador);
                    if (!prestamos.exist(position)) {
                        prestamos.add(getPrestamoView(identificador));
                        mostrar("Préstamo registrado.");
                    } else {
                        mostrar("Ya se ha prestado este libro.");
                    }

                } while (!prestamos.isFull() && continuar("¿Deseas registrar otro préstamo?"));
            } else {
                mostrar("El grupo de préstamos está lleno.");
            }
        }
    }
}
