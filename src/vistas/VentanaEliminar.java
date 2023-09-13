package vistas;

import java.awt.Color;

import javax.swing.ImageIcon;

public class VentanaEliminar extends VentanaMenu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Crea el panel de la ventana de eliminar.
	 */
	public VentanaEliminar() {

		panelMenuOpciones.setBackground(new Color(60, 98, 85));
		panelDescripcion.setBackground(new Color(97, 135, 110));

		btnOpcionUno.setBackground(new Color(60, 98, 85));
		btnOpcion2.setBackground(new Color(60, 98, 85));
		btnOpcion3.setBackground(new Color(60, 98, 85));

		lblOpcionUno.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/borrar-vet.png")));
		lblOpcionUno.setText("  Eliminar Veterinario");
		lblOpcionDos.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/borrar-cuidador.png")));
		lblOpcionDos.setText("  Eliminar Cuidador");
		lblOpcionTres.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/borrar-bioma.png")));
		lblOpcionTres.setText("  Eliminar Bioma");

		lblTituloMenu.setText("MENU DE ELIMINACION");

		descripcion = "<html><body>En este menu se puede eliminar a algun veterinario, bioma o cuidador</body></html>";
		descripcionDos = "<html><body>Los diferentes opciones de eliminacion que se pueden realizar se encuentran a la izquierda de este menu.</body></html>";

		lblNewLabel.setText(descripcion);
		lblNewLabel_1.setText(descripcionDos);

	}

}
