package vistas.registrar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Clase de la continuacion de la ventana para registrar trabajador
 */
public class VentanaRegistrarTrabajadorContinuacion extends JPanel {
	private String urlFuenteStringBold = "fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "fuentes/RobotoCondensed-Regular.ttf";

	private JTextField textFieldTelefonoUno;
	private JTextField textFieldTelefonoDos;
	private JTextField textFieldFechaInicioContrato;
	private JTextField textFieldFinContrato;
	private JTextField textFieldFechaNacimiento;
	private JTextField textFieldEmailUno;
	private JTextField textFieldEmailDos;
	private JComboBox<String> comboBoxGenero;
	private JComboBox<String> comboBoxTipoTrabajador;
	private JPanel panelPrincipal;

	private VentanaRegistrarTrabajador ventanaRegistrarTrabajador;

	private List<JTextField> listaTextFields;
	private List<JComboBox<String>> listaComBoxs;

	/**
	 * Crea el panel de la Ventana de registrar trabajador continuacion.
	 */
	public VentanaRegistrarTrabajadorContinuacion() {
		UIManager.put("TextField.caretForeground", Color.WHITE);
		setLayout(null);

		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(67, 83, 52));
		panelPrincipal.setBounds(0, 0, 463, 407);
		add(panelPrincipal);
		panelPrincipal.setLayout(null);

		JLabel lblIngresaDatosDel = new JLabel("INGRESA DATOS DEL TRABAJADOR");
		lblIngresaDatosDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaDatosDel.setForeground(new Color(227, 236, 233));
		lblIngresaDatosDel.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblIngresaDatosDel.setBounds(38, 11, 384, 28);
		panelPrincipal.add(lblIngresaDatosDel);

		JLabel lblTelefonoUno = new JLabel("Telefono 1:");
		lblTelefonoUno.setForeground(new Color(227, 236, 233));
		lblTelefonoUno.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTelefonoUno.setBounds(38, 52, 122, 28);
		panelPrincipal.add(lblTelefonoUno);

		textFieldTelefonoUno = new JTextField();
		textFieldTelefonoUno.setForeground(new Color(227, 236, 233));
		textFieldTelefonoUno.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldTelefonoUno.setColumns(10);
		textFieldTelefonoUno.setBackground(new Color(67, 83, 52));
		textFieldTelefonoUno.setBounds(38, 91, 136, 20);
		panelPrincipal.add(textFieldTelefonoUno);
		textFieldTelefonoUno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 115, 136, 2);
		panelPrincipal.add(separator_1);

		JLabel lblTelefonoDos = new JLabel("Telefono Dos:");
		lblTelefonoDos.setForeground(new Color(227, 236, 233));
		lblTelefonoDos.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTelefonoDos.setBounds(38, 128, 122, 28);
		panelPrincipal.add(lblTelefonoDos);

		textFieldTelefonoDos = new JTextField();
		textFieldTelefonoDos.setForeground(new Color(227, 236, 233));
		textFieldTelefonoDos.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldTelefonoDos.setColumns(10);
		textFieldTelefonoDos.setBackground(new Color(67, 83, 52));
		textFieldTelefonoDos.setBounds(38, 161, 136, 20);
		panelPrincipal.add(textFieldTelefonoDos);
		textFieldTelefonoDos.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(38, 185, 136, 2);
		panelPrincipal.add(separator_1_1);

		JLabel lblFechaDeInicio = new JLabel("Fecha de Inicio de Contratacion:");
		lblFechaDeInicio.setForeground(new Color(227, 236, 233));
		lblFechaDeInicio.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblFechaDeInicio.setBounds(38, 198, 238, 34);
		panelPrincipal.add(lblFechaDeInicio);

		textFieldFechaInicioContrato = new JTextField();
		
		  textFieldFechaInicioContrato.addFocusListener(new FocusAdapter() {
		  
		  @Override public void focusGained(FocusEvent e) { 
			  String input = ManejadorDeErrores.validarFecha(); 
			  if(!input.equals("")) {
				  textFieldFechaInicioContrato.setText(input);
				  lblIngresaDatosDel.requestFocus();
			  }
			  else {
				  JOptionPane.showMessageDialog(null, 
						  "La fecha debe estar en formato dd mm aaaa, con un mes valido y una año mayor a 1938",
						  "Error",JOptionPane.ERROR_MESSAGE);
			  }
		  
		  
		  
		  } });
		 
		textFieldFechaInicioContrato.setForeground(new Color(227, 236, 233));
		textFieldFechaInicioContrato.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldFechaInicioContrato.setColumns(10);
		textFieldFechaInicioContrato.setBackground(new Color(67, 83, 52));
		textFieldFechaInicioContrato.setBounds(38, 237, 136, 20);
		panelPrincipal.add(textFieldFechaInicioContrato);
		textFieldFechaInicioContrato.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(38, 261, 136, 2);
		panelPrincipal.add(separator_1_2_1);

		JLabel lblFechaFinContrato = new JLabel("Fecha de Finalizacion de Contrato:");
		lblFechaFinContrato.setForeground(new Color(227, 236, 233));
		lblFechaFinContrato.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblFechaFinContrato.setBounds(38, 279, 238, 28);
		panelPrincipal.add(lblFechaFinContrato);

		textFieldFinContrato = new JTextField();
		
		  textFieldFinContrato.addFocusListener(new FocusAdapter() {
		  
		  @Override public void focusGained(FocusEvent e) { 
			  String input = ManejadorDeErrores.validarFecha(); 
			  if(!input.equals("")) {
				  textFieldFinContrato.setText(input);
				  lblIngresaDatosDel.requestFocus();
			  }
			  else {
				  JOptionPane.showMessageDialog(null, 
						  "La fecha debe estar en formato dd mm aaaa, con un mes valido y una año mayor a 1938",
						  "Error",JOptionPane.ERROR_MESSAGE);
			  }
			  
		  } });
		 
		textFieldFinContrato.setForeground(new Color(227, 236, 233));
		textFieldFinContrato.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldFinContrato.setColumns(10);
		textFieldFinContrato.setBackground(new Color(67, 83, 52));
		textFieldFinContrato.setBounds(38, 318, 136, 20);
		panelPrincipal.add(textFieldFinContrato);
		textFieldFinContrato.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(38, 342, 136, 2);
		panelPrincipal.add(separator_1_2_2);

		JLabel lbl = new JLabel("Fecha de Nacimiento:");
		lbl.setForeground(new Color(227, 236, 233));
		lbl.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lbl.setBounds(286, 50, 167, 28);
		panelPrincipal.add(lbl);

		textFieldFechaNacimiento = new JTextField();
		
		  textFieldFechaNacimiento.addFocusListener(new FocusAdapter() {
		  
		  @Override public void focusGained(FocusEvent e) { 
			  String input = ManejadorDeErrores.validarFecha(); 
			  if(!input.equals("")) {
				  textFieldFechaNacimiento.setText(input);
				  lblIngresaDatosDel.requestFocus();
			  }
			  else {
				  JOptionPane.showMessageDialog(null, 
						  "La fecha debe estar en formato dd mm aaaa, con un mes valido y una año mayor a 1938",
						  "Error",JOptionPane.ERROR_MESSAGE);
				  
			  }
			  
		  } });
		 
		textFieldFechaNacimiento.setForeground(new Color(227, 236, 233));
		textFieldFechaNacimiento.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldFechaNacimiento.setColumns(10);
		textFieldFechaNacimiento.setBackground(new Color(67, 83, 52));
		textFieldFechaNacimiento.setBounds(286, 89, 136, 20);
		panelPrincipal.add(textFieldFechaNacimiento);
		textFieldFechaNacimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(286, 113, 136, 2);
		panelPrincipal.add(separator_1_2_3);

		JLabel lblEmailUno = new JLabel("Email 1:");
		lblEmailUno.setForeground(new Color(227, 236, 233));
		lblEmailUno.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEmailUno.setBounds(286, 120, 122, 28);
		panelPrincipal.add(lblEmailUno);

		textFieldEmailUno = new JTextField();
		textFieldEmailUno.setForeground(new Color(227, 236, 233));
		textFieldEmailUno.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldEmailUno.setColumns(10);
		textFieldEmailUno.setBackground(new Color(67, 83, 52));
		textFieldEmailUno.setBounds(286, 159, 136, 20);
		panelPrincipal.add(textFieldEmailUno);
		textFieldEmailUno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(286, 183, 136, 2);
		panelPrincipal.add(separator_1_2_4);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(227, 236, 233));
		lblGenero.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblGenero.setBounds(286, 277, 122, 28);
		panelPrincipal.add(lblGenero);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				btnSiguiente.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Boolean bandera = true;
						String telUnoString = textFieldTelefonoUno.getText();
						String telDosString = textFieldTelefonoDos.getText();

						try {
							long telUNo = Long.valueOf(telUnoString);
							long telDos = Long.valueOf(telDosString);

						} catch (NumberFormatException ex) {
							bandera = false;
							JOptionPane.showMessageDialog(null,	
									"No puede ingresar palabras en todos los campos donde se requieren numeros",
									"error", JOptionPane.ERROR_MESSAGE);
						}

						if (ManejadorDeErrores.validarListaJtextFields(listaTextFields) || ManejadorDeErrores.validarJTextFieldConEspacios(getTextFieldEmailUno().getText())
								|| ManejadorDeErrores.validarJTextFieldConEspacios(getTextFieldEmailDos().getText())) {
							bandera = false;
							JOptionPane.showMessageDialog(null,
									"Los valores en los campos no pueden tener caracteres especiales o espacios",
									"Error", JOptionPane.ERROR_MESSAGE);
						}
						if (ManejadorDeErrores.validarListaComboBox(listaComBoxs)) {
							bandera = false;
							JOptionPane.showMessageDialog(null,
									"Se debe elegir una opcion en 'Genero' y 'Tipo de Trabajador'", "Error",
									JOptionPane.ERROR_MESSAGE);

						} if(bandera) {
							
							
							String opcionTrabajador = comboBoxTipoTrabajador.getSelectedItem().toString();

							switch (opcionTrabajador) {

								case "Veterinario": {

									VentanaRegistrarTrabajador.changePrincipalPanel(
											ventanaRegistrarTrabajador.getVentanaRegistrarVeterinario()
													.getPanelPrincipal());
									break;
								}
								case "Cuidador": {
									break;
								}
								case "Proveedor": {
									break;
								}
							}
						}

					}
				});

			}
		});
		btnSiguiente.setBounds(292, 362, 104, 23);
		panelPrincipal.add(btnSiguiente);
		btnSiguiente.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));

		JLabel lblEmailDos = new JLabel("Email 2:");
		lblEmailDos.setForeground(new Color(227, 236, 233));
		lblEmailDos.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEmailDos.setBounds(286, 196, 122, 28);
		panelPrincipal.add(lblEmailDos);

		textFieldEmailDos = new JTextField();
		textFieldEmailDos.setForeground(new Color(227, 236, 233));
		textFieldEmailDos.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldEmailDos.setColumns(10);
		textFieldEmailDos.setBackground(new Color(67, 83, 52));
		textFieldEmailDos.setBounds(286, 235, 136, 20);
		panelPrincipal.add(textFieldEmailDos);
		textFieldEmailDos.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_4_1 = new JSeparator();
		separator_1_2_4_1.setBounds(286, 259, 136, 2);
		panelPrincipal.add(separator_1_2_4_1);

		comboBoxGenero = new JComboBox<>();
		comboBoxGenero.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		comboBoxGenero.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Masculino", "Femenino", "No Binario" }));

		comboBoxGenero.setBounds(286, 315, 136, 22);
		panelPrincipal.add(comboBoxGenero);

		JLabel lblTipoDeTrabajador = new JLabel("Tipo de Trabajador:");
		lblTipoDeTrabajador.setForeground(new Color(227, 236, 233));
		lblTipoDeTrabajador.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTipoDeTrabajador.setBounds(38, 349, 181, 28);
		panelPrincipal.add(lblTipoDeTrabajador);

		comboBoxTipoTrabajador = new JComboBox<>();

		comboBoxTipoTrabajador
				.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Veterinario"}));

		comboBoxTipoTrabajador.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		comboBoxTipoTrabajador.setBounds(38, 374, 136, 22);
		panelPrincipal.add(comboBoxTipoTrabajador);

		listaTextFields = Arrays.asList(textFieldTelefonoUno,
				textFieldTelefonoDos);

		listaComBoxs = Arrays.asList(comboBoxGenero, comboBoxTipoTrabajador);

	}
	
	
	
	/**
	 * Obtener el panel principal
	 * @return JPanel
	 */
	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	/**
	 * Obtener la ventana para registrar al trabajador
	 * @return VentanaRegistrarTrabajador
	 */
	public VentanaRegistrarTrabajador getVentanaRegistrarTrabajador() {
		return ventanaRegistrarTrabajador;
	}

	/**
	 * Asignar la ventana de registrar trabajador
	 * @param ventanaRegistrarTrabajador
	 */
	public void setVentanaRegistrarTrabajador(VentanaRegistrarTrabajador ventanaRegistrarTrabajador) {
		this.ventanaRegistrarTrabajador = ventanaRegistrarTrabajador;
	}

	/**
	 * Obtener la lista de campos de texto
	 * @return list JTextField
	 */
	public List<JTextField> getListaTextFields() {
		return listaTextFields;
	}

	/**
	 * Obtener la lista de Combobox
	 * @return list JComboBox
	 */
	public List<JComboBox<String>> getListaComBoxs() {
		return listaComBoxs;
	}



	/**
	 * Obtener el campo de telefonoUno
	 * @return JTextField
	 */
	public JTextField getTextFieldTelefonoUno() {
		return textFieldTelefonoUno;
	}



	/**
	 * Obtener el campo de TelefonoDos
	 * @return JTextField
	 */
	public JTextField getTextFieldTelefonoDos() {
		return textFieldTelefonoDos;
	}



	/**
	 * Obtener el campo de fecha de inicio de contrato
	 * @return JTextField
	 */
	public JTextField getTextFieldFechaInicioContrato() {
		return textFieldFechaInicioContrato;
	}



	/**
	 * Obtener el campo de fecha de fin de contrato
	 * @return JTextField
	 */
	public JTextField getTextFieldFinContrato() {
		return textFieldFinContrato;
	}



	/**
	 * Obtener el campo de fecha de nacimiento
	 * @return JTextField
	 */
	public JTextField getTextFieldFechaNacimiento() {
		return textFieldFechaNacimiento;
	}



	/**
	 * Obtener el campo de emailUno
	 * @return JTextField
	 */
	public JTextField getTextFieldEmailUno() {
		return textFieldEmailUno;
	}



	/**
	 * Obtener el campo de emailDos
	 * @return JTextField
	 */
	public JTextField getTextFieldEmailDos() {
		return textFieldEmailDos;
	}



	/**
	 * Obtener el comboBox de genero
	 * @return JComboBox String
	 */
	public JComboBox<String> getComboBoxGenero() {
		return comboBoxGenero;
	}



	/**
	 * Obtener el combobox de tipo de trabajador
	 * @return JComboBox String
	 */
	public JComboBox<String> getComboBoxTipoTrabajador() {
		return comboBoxTipoTrabajador;
	}
	
	
	

}
