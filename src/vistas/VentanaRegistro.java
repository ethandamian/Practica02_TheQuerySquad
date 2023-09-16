package vistas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import vistas.registrar.VentanaRegistrarTrabajador;

/**
 * Clase de la ventana de registro
 */
public class VentanaRegistro extends VentanaMenu {

	private static final long serialVersionUID = 1L;

	private VentanaPrincipal ventanaPrincipal;

	/**
	 * Crea un panel de la ventana de registro.
	 */
	public VentanaRegistro() {
		super();

		btnOpcionUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaRegistrarTrabajador());

			}
		});

		btnOpcionDos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaRegitrarAnimal());

			}
		});

		btnOpcionTres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getRegistrarVentanaBioma());

			}
		});

		lblTituloMenu.setText("MENU REGISTRO");
		descripcion = "<html><body>En este menu podrás registrar los veterinarios, animales y biomas que el zoologico necesite</body></html>";
		lblNewLabel.setText(descripcion);
		descripcionDos = "<html><body>Selecciona alguna de las opciones que se encuentran en el lado izquierdo</body></html>";
		lblNewLabel_1.setText(descripcionDos);

		lblOpcionUno.setText(" Registrar Veterinario");
		lblOpcionUno.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/registro-veterinario.png")));

		lblOpcionDos.setText("  Registrar Animal");
		lblOpcionDos.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/registrar-animal.png")));

		lblOpcionTres.setText("  Registrar Bioma");
		lblOpcionTres.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/hojas.png")));

	}

	/**
	 * Obtener la ventana principal
	 * @return ventanaPrincipal
	 */
	public VentanaPrincipal getVentanaPrincipal() {
		return ventanaPrincipal;
	}

	/**
	 * Asignar la ventana principal
	 * @param ventanaPrincipal
	 */
	public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
		this.ventanaPrincipal = ventanaPrincipal;
	}

}