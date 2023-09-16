package vistas.registrar;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

import vistas.FuenteProyecto;

/**
 * Clase de la ventana de registrar menu
 */
public class VentanaRegistrarMenu extends JPanel {

	protected JPanel panelPrincipalRegistrar;
	protected JPanel panelizquierdo;
	protected JLabel lblTitulo;
	protected JLabel lblLogo;
	protected static JPanel panelDerecho;
	protected String urlFuenteStringBold = "fuentes/RobotoCondensed-Bold.ttf";
	protected String urlFuenteStringPlain = "fuentes/RobotoCondensed-Regular.ttf";

	protected List<JTextField> listaTextFields = new ArrayList<JTextField>();
	protected List<JComboBox<String>> listaComboBoxs = new ArrayList<JComboBox<String>>();

	/**
	 * Crea el panel de la Ventana de registrar menu.
	 */
	public VentanaRegistrarMenu() {
		setLayout(null);

		panelPrincipalRegistrar = new JPanel();
		panelPrincipalRegistrar.setBackground(new Color(255, 255, 255));
		panelPrincipalRegistrar.setBounds(0, 0, 777, 407);
		add(panelPrincipalRegistrar);
		panelPrincipalRegistrar.setLayout(null);

		panelizquierdo = new JPanel();
		panelizquierdo.setBackground(new Color(158, 179, 132));
		panelizquierdo.setBounds(0, 0, 316, 407);
		panelPrincipalRegistrar.add(panelizquierdo);
		panelizquierdo.setLayout(null);

		lblTitulo = new JLabel("REGISTRO");
		lblTitulo.setForeground(new Color(18, 31, 37));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 33));
		lblTitulo.setBounds(71, 57, 176, 28);
		panelizquierdo.add(lblTitulo);

		lblLogo = new JLabel("   ");
		lblLogo.setBounds(34, 108, 256, 256);
		panelizquierdo.add(lblLogo);

		panelDerecho = new JPanel();
		panelDerecho.setBackground(new Color(67, 83, 52));
		panelDerecho.setBounds(314, 0, 463, 407);
		panelPrincipalRegistrar.add(panelDerecho);
		panelDerecho.setLayout(null);

	}
	
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 * @param listaCampos
	 */
	protected void limpiarCampos(List<JTextField> listaCampos) {
		for (JTextField textField : listaCampos) {
			textField.setText("");
		}
	}

	/**
	 * Metodo para limpiar los comboBoxes de lista
	 * @param comboBoxes
	 */
	protected void limpiarComboBoxes(List<JComboBox<String>> comboBoxes) {
		for (JComboBox<String> comboBox : comboBoxes) {
			comboBox.setSelectedIndex(0);
		}
	}

	
}
