package main;

import vistas.VentanaConsultas;
import vistas.VentanaPrincipal;
import vistas.VentanaRegistro;

public class Relaciones {
	
	private VentanaPrincipal ventanaPrincipal;
	private VentanaRegistro ventanaRegistro;
	private VentanaConsultas ventanaConsultas;
	
	public void build() {
		ventanaPrincipal = new VentanaPrincipal();
		ventanaRegistro = new VentanaRegistro();
		ventanaConsultas = new VentanaConsultas();
		
		
		//relaciones ventanaPrincipal - vistas
		ventanaPrincipal.setVentanaRegistro(ventanaRegistro);
		ventanaPrincipal.setVentanaConsultas(ventanaConsultas);
		
		
		ventanaPrincipal.setVisible(true);
		
	}

}
