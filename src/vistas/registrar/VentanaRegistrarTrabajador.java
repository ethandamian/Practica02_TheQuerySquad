package vistas.registrar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;

import vistas.FuenteProyecto;

import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import errores.ManejadorDeErrores;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase para la ventana de registrar trabajador
 */
public class VentanaRegistrarTrabajador extends VentanaRegistrarMenu {
	

	private VentanaRegistrarTrabajadorContinuacion ventanaRegistrarTrabajadorContinuacion;
	private VentanaRegistrarVeterinario ventanaRegistrarVeterinario;

	private static JPanel panelDerechoContenido;

	private JTextField textFieldRFC;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidoPaterno;
	private JTextField textFieldApellidoMaterno;
	private JTextField textFieldCalle;
	private JTextField textFieldNumInterior;
	private JTextField textFieldNumExterior;
	private JTextField textFieldColonia;
	private static JPanel panelDerechoContenedor;

	/**
	 * Crea el panel de la Ventana de registrar trabajador.
	 */
	public VentanaRegistrarTrabajador() {
		UIManager.put("TextField.caretForeground", Color.WHITE);

		panelDerecho.setBackground(new Color(67, 83, 52));
		lblLogo.setIcon(new ImageIcon(VentanaRegistrarTrabajador.class.getResource("/imagenes/registrar-vet.png")));


		panelDerechoContenido = new JPanel();
		panelDerechoContenido.setBackground(new Color(67, 83, 52));
		panelDerechoContenido.setBounds(0, 0, 463, 407);
		panelDerecho.add(panelDerechoContenido);
		panelDerechoContenido.setLayout(null);
		
		panelDerechoContenedor = new JPanel();
		panelDerechoContenedor.setBackground(new Color(67, 83, 52));
		panelDerechoContenedor.setBounds(0, 0, 463, 407);
		panelDerechoContenido.add(panelDerechoContenedor);
		panelDerechoContenedor.setLayout(null);
		
		JLabel lblRfc = new JLabel("RFC:");
		lblRfc.setForeground(new Color(227, 236, 233));
		lblRfc.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblRfc.setBounds(45, 48, 122, 28);
		panelDerechoContenedor.add(lblRfc);

		textFieldRFC = new JTextField();
		textFieldRFC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa el RFC en mayusculas", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldRFC.setForeground(new Color(227, 236, 233));
		textFieldRFC.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));
		textFieldRFC.setColumns(10);
		textFieldRFC.setBackground(new Color(67, 83, 52));
		textFieldRFC.setBounds(45, 87, 136, 20);
		panelDerechoContenedor.add(textFieldRFC);
		textFieldRFC.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(45, 111, 136, 2);
		panelDerechoContenedor.add(separator_1);

		JLabel lblNombre = new JLabel("Nombre(s):");
		lblNombre.setForeground(new Color(227, 236, 233));
		lblNombre.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNombre.setBounds(45, 124, 122, 28);
		panelDerechoContenedor.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(227, 236, 233));
		textFieldNombre.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBackground(new Color(67, 83, 52));
		textFieldNombre.setBounds(45, 157, 136, 20);
		panelDerechoContenedor.add(textFieldNombre);
		textFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(45, 181, 136, 2);
		panelDerechoContenedor.add(separator_1_1);

		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setForeground(new Color(227, 236, 233));
		lblApellidoPaterno.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblApellidoPaterno.setBounds(45, 194, 122, 28);
		panelDerechoContenedor.add(lblApellidoPaterno);

		textFieldApellidoPaterno = new JTextField();
		textFieldApellidoPaterno.setForeground(new Color(227, 236, 233));
		textFieldApellidoPaterno.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldApellidoPaterno.setColumns(10);
		textFieldApellidoPaterno.setBackground(new Color(67, 83, 52));
		textFieldApellidoPaterno.setBounds(45, 233, 136, 20);
		panelDerechoContenedor.add(textFieldApellidoPaterno);
		textFieldApellidoPaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(45, 257, 136, 2);
		panelDerechoContenedor.add(separator_1_2);

		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setForeground(new Color(227, 236, 233));
		lblApellidoMaterno.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblApellidoMaterno.setBounds(45, 275, 122, 28);
		panelDerechoContenedor.add(lblApellidoMaterno);

		textFieldApellidoMaterno = new JTextField();
		textFieldApellidoMaterno.setForeground(new Color(227, 236, 233));
		textFieldApellidoMaterno.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldApellidoMaterno.setColumns(10);
		textFieldApellidoMaterno.setBackground(new Color(67, 83, 52));
		textFieldApellidoMaterno.setBounds(45, 314, 136, 20);
		panelDerechoContenedor.add(textFieldApellidoMaterno);
		textFieldApellidoMaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(45, 338, 136, 2);
		panelDerechoContenedor.add(separator_1_2_1);

		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setForeground(new Color(227, 236, 233));
		lblCalle.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblCalle.setBounds(228, 48, 122, 28);
		panelDerechoContenedor.add(lblCalle);

		textFieldCalle = new JTextField();
		textFieldCalle.setForeground(new Color(227, 236, 233));
		textFieldCalle.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldCalle.setBackground(new Color(67, 83, 52));
		textFieldCalle.setBounds(228, 87, 136, 20);
		panelDerechoContenedor.add(textFieldCalle);
		textFieldCalle.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(228, 111, 136, 2);
		panelDerechoContenedor.add(separator_1_2_2);

		JLabel lblNumInterior = new JLabel("Numero Interior:");
		lblNumInterior.setForeground(new Color(227, 236, 233));
		lblNumInterior.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumInterior.setBounds(228, 124, 122, 28);
		panelDerechoContenedor.add(lblNumInterior);

		textFieldNumInterior = new JTextField();
		textFieldNumInterior.setForeground(new Color(227, 236, 233));
		textFieldNumInterior.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumInterior.setColumns(10);
		textFieldNumInterior.setBackground(new Color(67, 83, 52));
		textFieldNumInterior.setBounds(228, 163, 136, 20);
		panelDerechoContenedor.add(textFieldNumInterior);
		textFieldNumInterior.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(228, 187, 136, 2);
		panelDerechoContenedor.add(separator_1_2_3);

		JLabel lblNumExterior = new JLabel("Numero Exterior:");
		lblNumExterior.setForeground(new Color(227, 236, 233));
		lblNumExterior.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumExterior.setBounds(228, 194, 122, 28);
		panelDerechoContenedor.add(lblNumExterior);

		textFieldNumExterior = new JTextField();
		textFieldNumExterior.setForeground(new Color(227, 236, 233));
		textFieldNumExterior.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumExterior.setColumns(10);
		textFieldNumExterior.setBackground(new Color(67, 83, 52));
		textFieldNumExterior.setBounds(228, 233, 136, 20);
		panelDerechoContenedor.add(textFieldNumExterior);
		textFieldNumExterior.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(228, 257, 136, 2);
		panelDerechoContenedor.add(separator_1_2_4);

		JLabel lblColonia = new JLabel("Colonia:");
		lblColonia.setForeground(new Color(227, 236, 233));
		lblColonia.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblColonia.setBounds(228, 275, 122, 28);
		panelDerechoContenedor.add(lblColonia);

		textFieldColonia = new JTextField();
		textFieldColonia.setForeground(new Color(227, 236, 233));
		textFieldColonia.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldColonia.setColumns(10);
		textFieldColonia.setBackground(new Color(67, 83, 52));
		textFieldColonia.setBounds(228, 314, 136, 20);
		panelDerechoContenedor.add(textFieldColonia);
		textFieldColonia.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_5 = new JSeparator();
		separator_1_2_5.setBounds(228, 338, 136, 2);
		panelDerechoContenedor.add(separator_1_2_5);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				boolean bandera = true;
				if (textFieldRFC.getText().length() == 12 || textFieldRFC.getText().length() == 13) {
				} else {
					bandera = false;
					JOptionPane.showMessageDialog(null, "Un RFC debe contener 12 o 13 caracteres", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				if (ManejadorDeErrores.validarListaJtextFields(listaTextFields)) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"Los valores en los campos no pueden tener caracteres especiales o espacios", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

				if (bandera) {
					changePrincipalPanel(ventanaRegistrarTrabajadorContinuacion.getPanelPrincipal());
				}

			}
		});

		btnSiguiente.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));
		btnSiguiente.setBounds(260, 360, 104, 23);
		panelDerechoContenedor.add(btnSiguiente);

		JLabel lblIngresaDatosDel = new JLabel("INGRESA DATOS DEL TRABAJADOR");
		lblIngresaDatosDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaDatosDel.setForeground(new Color(227, 236, 233));
		lblIngresaDatosDel.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblIngresaDatosDel.setBounds(45, 11, 384, 28);
		panelDerechoContenedor.add(lblIngresaDatosDel);

		listaTextFields = Arrays.asList(textFieldRFC,
				textFieldNombre,
				textFieldApellidoPaterno,
				textFieldApellidoMaterno,
				textFieldCalle,
				textFieldNumInterior,
				textFieldNumExterior,
				textFieldColonia);

	}

	/**
	 * Obtener la ventana de registrar trabajador
	 * @return VentanaRegistrarTrabajadorContinuacion
	 */
	public VentanaRegistrarTrabajadorContinuacion getVentanaRegistrarTrabajadorContinuacion() {
		return ventanaRegistrarTrabajadorContinuacion;
	}

	/**
	 * Asignar la ventana para registrar trabajadores
	 * @param ventanaRegistrarTrabajadorContinuacion
	 */
	public void setVentanaRegistrarTrabajadorContinuacion(
			VentanaRegistrarTrabajadorContinuacion ventanaRegistrarTrabajadorContinuacion) {
		this.ventanaRegistrarTrabajadorContinuacion = ventanaRegistrarTrabajadorContinuacion;
	}

	/**
	 * Obtener la ventana para registrar veterinarios
	 * @return VentanaRegistrarVeterinario
	 */
	public VentanaRegistrarVeterinario getVentanaRegistrarVeterinario() {
		return ventanaRegistrarVeterinario;
	}

	/**
	 * Asignar la ventana de registrar veterinario
	 * @param ventanaRegistrarVeterinario
	 */
	public void setVentanaRegistrarVeterinario(VentanaRegistrarVeterinario ventanaRegistrarVeterinario) {
		this.ventanaRegistrarVeterinario = ventanaRegistrarVeterinario;
	}

	/**
	 * Obtener la lista de los campos de texto
	 * @return list JTextField
	 */
	public List<JTextField> getListaTextFields() {
		return listaTextFields;
	}

	/**
	 * Obtener el panel derecho
	 * @return JPanel
	 */
	public JPanel getPanelDerechoContenido() {
		return panelDerechoContenido;
	}

	/**
	 * Cambiar el panel principal
	 * @param panel
	 */
	public static void changePrincipalPanel(JPanel panel) {
		panel.setSize(463, 407);
		panel.setLocation(0, 0);

		panelDerechoContenido.removeAll();
		panelDerechoContenido.add(panel, BorderLayout.CENTER);
		panelDerechoContenido.revalidate();
		panelDerechoContenido.repaint();
	}

	/**
	 * Metodo para limpiar los campos de la ventana
	 */
	public void limpiaCampos() {
		limpiarCampos(listaTextFields);
		limpiarCampos(ventanaRegistrarTrabajadorContinuacion.getListaTextFields());
		limpiarCampos(ventanaRegistrarVeterinario.getListaTextFields());
		limpiarComboBoxes(ventanaRegistrarTrabajadorContinuacion.getListaComBoxs());
	}
	
	/**
	 * Obtener el panel derecho
	 * @return JPanel
	 */
	public static JPanel getPanelDerecho() {
		return panelDerecho;
	}

	/**
	 * Obtener el PanelDerecho contenedor
	 * @return JPanel
	 */
	public JPanel getPanelDerechoContenedor() {
		return panelDerechoContenedor;
	}

	/**
	 * Asignar el panel derecho
	 * @param panelDerechoContenedor
	 */
	public static void setPanelDerechoContenedor(JPanel panelDerechoContenedor) {
		VentanaRegistrarTrabajador.panelDerechoContenedor = panelDerechoContenedor;
	}

	/**
	 * Obtener el campo de RFC
	 * @return JTextField
	 */
	public JTextField getTextFieldRFC() {
		return textFieldRFC;
	}

	/**
	 * Obtener el campo de nombre
	 * @return JTextField
	 */
	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	/**
	 * Obtener el campo de apellido paterno
	 * @return JTextField
	 */
	public JTextField getTextFieldApellidoPaterno() {
		return textFieldApellidoPaterno;
	}

	/**
	 * Obtener el campo de apellido materno
	 * @return JTextField
	 */
	public JTextField getTextFieldApellidoMaterno() {
		return textFieldApellidoMaterno;
	}

	/**
	 * Obtener el campo de Calle
	 * @return JTextField
	 */
	public JTextField getTextFieldCalle() {
		return textFieldCalle;
	}

	/**
	 * Obtener el campo de num Interior
	 * @return JTextField
	 */
	public JTextField getTextFieldNumInterior() {
		return textFieldNumInterior;
	}

	/**
	 * Obtener el campo de num Exterior
	 * @return JTextField
	 */
	public JTextField getTextFieldNumExterior() {
		return textFieldNumExterior;
	}

	/**
	 * Obtener el campo de colonia
	 * @return JTextField
	 */
	public JTextField getTextFieldColonia() {
		return textFieldColonia;
	}
	
	
	
	


}
