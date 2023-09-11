package main;

import vistas.VentanaConsultas;
import vistas.VentanaEliminar;
import vistas.VentanaPrincipal;
import vistas.VentanaRegistro;

public class Relaciones {
	
	private VentanaPrincipal ventanaPrincipal;
	private VentanaRegistro ventanaRegistro;
	private VentanaConsultas ventanaConsultas;
	private VentanaEliminar ventanaEliminar;
	
	public void build() {
		//instanciamos las clases del proyecto
		ventanaPrincipal = new VentanaPrincipal();
		ventanaRegistro = new VentanaRegistro();
		ventanaConsultas = new VentanaConsultas();
		ventanaEliminar = new VentanaEliminar();
		
		
		//relaciones ventanaPrincipal - vistas
		ventanaPrincipal.setVentanaRegistro(ventanaRegistro);
		ventanaPrincipal.setVentanaConsultas(ventanaConsultas);
		ventanaPrincipal.setVentanaEliminar(ventanaEliminar);
		
		//mostramos la ventana principal
		ventanaPrincipal.setVisible(true);
		
	}

}
