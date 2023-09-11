package vistas;

import java.awt.Color;

import javax.swing.ImageIcon;

public class VentanaConsultas extends VentanaMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public VentanaConsultas() {
		super();
		
		panelMenuOpciones.setBackground(new Color(24,61,61));
		panelDescripcion.setBackground(new Color(92,131,116));
		
		btnOpcionUno.setBackground(new Color(24,61,61));
		btnOpcion2.setBackground(new Color(24,61,61));
		btnOpcion3.setBackground(new Color(24,61,61));
		
		
		
		lblOpcionUno.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/buscar.png")));
		lblOpcionUno.setText("  Consulta de Veterinarios");
		lblOpcionDos.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/demandante-de-empleo.png")));
		lblOpcionDos.setText("  Consulta de Cuidadores");
		lblOpcionTres.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/buscar-bioma.png")));
		lblOpcionTres.setText("  Consulta de Biomas");
		
		lblTituloMenu.setText("MENU CONSULTAS");
		
		descripcion = "<html><body>En este menu se pueden realizar las consultas de los veterinarios, biomas y cuidadores</body></html>";
		descripcionDos = "<html><body>Las diferentes consultas que se pueden realizar estan en las opciones que se encuentran a la izquierda.</body></html>";
		
		lblNewLabel.setText(descripcion);
		lblNewLabel_1.setText(descripcionDos);

	}

}
