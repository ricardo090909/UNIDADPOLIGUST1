package controlador;

import static mx.edu.itzitacuaro.tecnm.utilidades.Utility.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.Operable;

public class DepartmentController {
	private static Operable departmentGroup;
	
	public static void intitDataDepartmenHead(Operable departmentGroup) {
		DepartmentController.departmentGroup = departmentGroup;
	}
	
	public static class OyenteRegistrarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar("");
    	}
    }
	
	public static class OyenteConsultarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar(" ");
    	}
    }
	
	public static class OyenteEliminarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar("");
    	}
    }
	
	public static class OyenteModificarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar("");
    	}
    }
	
	public static class OyenteListarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar("");
    	}
    }
	
	public static class OyenteOrdenarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar("");
    	}
    }
	
	public static class OyenteCargarAdministrativos implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		mostrar("");
    	}
    }
	 
	
}
