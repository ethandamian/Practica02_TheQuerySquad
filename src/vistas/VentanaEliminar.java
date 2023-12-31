package vistas;

import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase de la ventana para eliminar
 */
public class VentanaEliminar extends VentanaMenu {
	private VentanaPrincipal ventanaPrincipal;

	
	private static final long serialVersionUID = 1L;

	/**
	 * Crea el panel de la ventana de eliminar.
	 */
	public VentanaEliminar() {
		btnOpcionUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaEliminarVeterinario());

			}
		});
		btnOpcionDos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaEliminarAnimal());

			}
		});
		btnOpcionTres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaEliminarBioma());

			}
		});

		panelMenuOpciones.setBackground(new Color(60, 98, 85));
		panelDescripcion.setBackground(new Color(97, 135, 110));

		btnOpcionUno.setBackground(new Color(60, 98, 85));
		btnOpcionDos.setBackground(new Color(60, 98, 85));
		btnOpcionTres.setBackground(new Color(60, 98, 85));

		lblOpcionUno.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/borrar-veterinario.png")));
		lblOpcionUno.setText("  Eliminar Veterinario");
		lblOpcionDos.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/borrar-animal.png")));
		lblOpcionDos.setText("  Eliminar Animal");
		lblOpcionTres.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/borrar-bioma.png")));
		lblOpcionTres.setText("  Eliminar Bioma");

		lblTituloMenu.setText("MENU DE ELIMINACION");

		descripcion = "<html><body>En este menu se puede eliminar a algun veterinario, bioma o cuidador</body></html>";
		descripcionDos = "<html><body>Los diferentes opciones de eliminacion que se pueden realizar se encuentran a la izquierda de este menu.</body></html>";

		lblNewLabel.setText(descripcion);
		lblNewLabel_1.setText(descripcionDos);

	}

	/**
	 * Metodo para obtener la ventana principal
	 * @return
	 */
	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	/**
	 * Metodo para asignar la ventana principal
	 * @param ventanaPrincipal
	 */
	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

}
