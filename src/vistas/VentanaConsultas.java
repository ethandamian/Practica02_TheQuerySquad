package vistas;

import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase de la ventana para hacer consultas
 */
public class VentanaConsultas extends VentanaMenu {

	private VentanaPrincipal ventanaPrincipal;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Crea el panel de la ventana de consultas.
	 */
	public VentanaConsultas() {
		super();
		btnOpcionTres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventanaPrincipal.getVentanaConsultaBioma().getTextFieldInputUsuario().setText("");
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaConsultaBioma());

			}
		});
		btnOpcionDos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventanaPrincipal.getVentanaConsultaAnimales().getTextFieldInputUsuario().setText("");
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaConsultaAnimales());
			}
		});
		btnOpcionUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventanaPrincipal.getVentanaConsultaVeterinarios().getTextFieldInputUsuario().setText("");
				VentanaPrincipal.changePrincipalPanel(ventanaPrincipal.getVentanaConsultaVeterinarios());
			}

		});

		panelMenuOpciones.setBackground(new Color(24, 61, 61));
		panelDescripcion.setBackground(new Color(92, 131, 116));

		btnOpcionUno.setBackground(new Color(24, 61, 61));
		btnOpcionDos.setBackground(new Color(24, 61, 61));
		btnOpcionTres.setBackground(new Color(24, 61, 61));

		lblOpcionUno.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/consulta-vet.png")));
		lblOpcionUno.setText("  Consulta de Veterinarios");
		lblOpcionDos.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/consulta-animal.png")));
		lblOpcionDos.setText("  Consulta de Animales");
		lblOpcionTres.setIcon(new ImageIcon(VentanaConsultas.class.getResource("/imagenes/buscar-bioma.png")));
		lblOpcionTres.setText("  Consulta de Biomas");

		lblTituloMenu.setText("MENU CONSULTAS");

		descripcion = "<html><body>En este menu se pueden realizar las consultas de los veterinarios, biomas y cuidadores</body></html>";
		descripcionDos = "<html><body>Las diferentes consultas que se pueden realizar estan en las opciones que se encuentran a la izquierda.</body></html>";

		lblNewLabel.setText(descripcion);
		lblNewLabel_1.setText(descripcionDos);

	}

	/**
	 * Metodo para obtener la ventana principal
	 * @return VentanaPrincipal
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
