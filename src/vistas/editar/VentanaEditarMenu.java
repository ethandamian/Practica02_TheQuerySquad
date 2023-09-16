package vistas.editar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import vistas.FuenteProyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase de la ventana de editar menu
 */
public class VentanaEditarMenu extends JFrame {

	private JPanel contentPane;
	protected static JPanel panelPrincipal;
	protected JPanel panelPrincipalContenido;
	protected JLabel lblTituloMenu;
	protected JButton btnGuardar;
	protected String urlFuenteBold = "fuentes/RobotoCondensed-Bold.ttf";
	protected String urlFuentePlain = "fuentes/RobotoCondensed-Regular.ttf";

	protected List<JTextField> listaFields = new ArrayList<JTextField>();
	protected List<JComboBox<String>> listaComboBoxs = new ArrayList<JComboBox<String>>();

	/**
	 * Crea la ventana
	 */
	public VentanaEditarMenu() {
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 935, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//UIManager.put("TextField.caretForeground", Color.WHITE);

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 921, 443);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		panelPrincipalContenido = new JPanel();
		panelPrincipalContenido.setBackground(new Color(24, 61, 61));
		panelPrincipalContenido.setBounds(0, 0, 921, 443);
		panelPrincipal.add(panelPrincipalContenido);
		panelPrincipalContenido.setLayout(null);

		lblTituloMenu = new JLabel("MENU EDITAR [ ]");
		lblTituloMenu.setForeground(new Color(227, 236, 233));
		lblTituloMenu.setFont(FuenteProyecto.createFont(urlFuenteBold, 35));
		lblTituloMenu.setBounds(46, 26, 375, 58);
		panelPrincipalContenido.add(lblTituloMenu);

		btnGuardar = new JButton("GUARDAR");
		
		btnGuardar.setForeground(new Color(41, 56, 47));
		btnGuardar.setFont(FuenteProyecto.createFont(urlFuenteBold, 13));
		btnGuardar.setBounds(716, 387, 110, 23);
		panelPrincipalContenido.add(btnGuardar);
	}

	/**
	 * Metodo para cambiar el panel principal
	 * @param panel
	 */
	public static void changePrincipalPanel(JPanel panel) {
		panel.setSize(886, 443);
		panel.setLocation(0, 0);

		panelPrincipal.removeAll();
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panelPrincipal.revalidate();
		panelPrincipal.repaint();
	}
	
	/**
	 * Metodo para limpiar campos de lista
	 * @param listaCampos
	 */
	protected void limpiarCampos(List<JTextField> listaCampos) {
		for (JTextField textField : listaCampos) {
			textField.setText("");
		}
	}

	/**
	 * Metodo para limpiar ComboBoxes recibiendo una lista de ellos
	 * @param comboBoxes
	 */
	protected void limpiarComboBoxes(List<JComboBox<String>> comboBoxes) {
		for (JComboBox<String> comboBox : comboBoxes) {
			comboBox.setSelectedIndex(0);
		}
	}
}
