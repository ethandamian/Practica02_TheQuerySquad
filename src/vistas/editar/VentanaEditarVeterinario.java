package vistas.editar;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Clases.Bioma;
import Clases.Veterinario;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.consultas.VentanaConsultaVeterinarios;
import zoologico.ManipularVeterinario;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Clase de la ventana para editar veterinarios
 */
public class VentanaEditarVeterinario extends VentanaEditarMenu {
	private JTextField textFieldRFC;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidoPaterno;
	private JTextField textFieldApellidoMaterno;
	private JTextField textFieldCalle;
	private JTextField textFieldNumInterior;
	private JTextField textFieldNumExterior;
	private JTextField textFieldColonia;
	private JTextField textFieldTelefonoUno;
	private JTextField textFieldTelefonoDos;
	private JTextField textFieldFechaInicioContrato;
	private JTextField textFieldFechaFinContrato;
	private JTextField textFieldFechaNacimiento;
	private JTextField textFieldEmailUno;
	private JTextField textFieldEmailDos;
	private JTextField textFieldEspecialidad;
	private JTextField textFieldSalario;
	private JComboBox<String> comboBoxGenero;
	
	private ManipularVeterinario manipularVeterinario = new ManipularVeterinario();

	private VentanaConsultaVeterinarios ventanaConsultaVeterinarios;

	private String idString;
	/**
	 * Crea la ventana
	 */
	public VentanaEditarVeterinario() {
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean bandera = true;
				try {
					float salario = Float.parseFloat(getTextFieldSalario().getText());
					

				} catch (NumberFormatException ex) {
					bandera = false;
					JOptionPane.showMessageDialog(null,	
							"No puede ingresar palabras en todos los campos donde se requieren numeros",
							"error", JOptionPane.ERROR_MESSAGE);
				}
				
				if (ManejadorDeErrores.validarListaJtextFields(listaFields) || ManejadorDeErrores.validarJTextFieldConEspacios(getTextFieldEmailUno().getText())
						|| ManejadorDeErrores.validarJTextFieldConEspacios(getTextFieldEmailDos().getText())) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"Los valores en los campos no pueden tener caracteres especiales o espacios",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (ManejadorDeErrores.validarListaComboBox(listaComboBoxs)) {
					bandera = false;
					JOptionPane.showMessageDialog(null, "Selecciona una opcion en 'Genero'",
							"Error", JOptionPane.ERROR_MESSAGE);
				}if(bandera) {
					String rfc = textFieldRFC.getText();
					String nombreString = textFieldNombre.getText();
					String apellidoMaterno = textFieldApellidoMaterno.getText();
					String apellidoPaterno = textFieldApellidoPaterno.getText();
					String calle = textFieldCalle.getText();
					String numInterior = textFieldNumInterior.getText();
					String numExterior = textFieldNumExterior.getText();
					String colonia = textFieldColonia.getText();
					String telUno = textFieldTelefonoUno.getText();
					String telDos = textFieldTelefonoDos.getText(); 
					String fechaInicioContrato = textFieldFechaInicioContrato.getText();
					String fechaFinContrato = textFieldFechaFinContrato.getText();
					String fechaNacimiento = textFieldFechaNacimiento.getText();
					String emailUno = textFieldEmailUno.getText();
					String emailDos = textFieldEmailDos.getText();
					String genero = comboBoxGenero.getSelectedItem().toString();
					String especialidad = textFieldEspecialidad.getText();
					float salario = Float.valueOf(textFieldSalario.getText());
					
					ArrayList<String> listaTelefonos = new ArrayList<String>();
					listaTelefonos.add(telUno);
					listaTelefonos.add(telDos);
					
					ArrayList<String> listaCorreos = new ArrayList<String>();
					listaCorreos.add(emailUno);
					listaCorreos.add(emailDos);
					
					Veterinario veterinario = new Veterinario(rfc, nombreString, apellidoPaterno, apellidoMaterno, genero,
							calle, numExterior, numInterior, colonia, genero, 
							fechaInicioContrato, fechaFinContrato, fechaNacimiento, 
							listaTelefonos, listaCorreos, especialidad, salario);
					
					if(manipularVeterinario.editar(veterinario, idString)) {
						limpiaCampos();
						setVisible(false);
						JOptionPane.showMessageDialog(null, "Se ha editado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
				}
			}
		});

		lblTituloMenu.setBounds(46, 26, 474, 58);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {

				if (JOptionPane.showConfirmDialog(panelPrincipal,
						"¿Estás seguro que quieres salir del sistema?", "¿Cerrar ventana?",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					dispose();
					ventanaConsultaVeterinarios.getBtnEditar().setVisible(false);

				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});

		lblTituloMenu.setText("MENU EDITAR VETERINARIO");
		btnGuardar.setLocation(730, 398);

		JLabel lblRfc = new JLabel("RFC:");
		lblRfc.setForeground(new Color(227, 236, 233));
		lblRfc.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblRfc.setBounds(46, 82, 122, 28);
		panelPrincipalContenido.add(lblRfc);

		textFieldRFC = new JTextField();
		textFieldRFC.setEnabled(false);
		textFieldRFC.setEditable(false);
		textFieldRFC.setForeground(new Color(227, 236, 233));
		textFieldRFC.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldRFC.setColumns(10);
		textFieldRFC.setBackground(new Color(24, 61, 61));
		textFieldRFC.setBounds(46, 121, 136, 20);
		panelPrincipalContenido.add(textFieldRFC);
		textFieldRFC.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(46, 145, 136, 2);
		panelPrincipalContenido.add(separator_1);

		JLabel lblNombre = new JLabel("Nombre(s):");
		lblNombre.setForeground(new Color(227, 236, 233));
		lblNombre.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNombre.setBounds(46, 158, 122, 28);
		panelPrincipalContenido.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(227, 236, 233));
		textFieldNombre.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBackground(new Color(24, 61, 61));
		textFieldNombre.setBounds(46, 191, 136, 20);
		panelPrincipalContenido.add(textFieldNombre);
		textFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(46, 215, 136, 2);
		panelPrincipalContenido.add(separator_1_1);

		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setForeground(new Color(227, 236, 233));
		lblApellidoPaterno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblApellidoPaterno.setBounds(46, 228, 122, 28);
		panelPrincipalContenido.add(lblApellidoPaterno);

		textFieldApellidoPaterno = new JTextField();
		textFieldApellidoPaterno.setForeground(new Color(227, 236, 233));
		textFieldApellidoPaterno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldApellidoPaterno.setColumns(10);
		textFieldApellidoPaterno.setBackground(new Color(24, 61, 61));
		textFieldApellidoPaterno.setBounds(46, 267, 136, 20);
		panelPrincipalContenido.add(textFieldApellidoPaterno);
		textFieldApellidoPaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(46, 291, 136, 2);
		panelPrincipalContenido.add(separator_1_2);

		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setForeground(new Color(227, 236, 233));
		lblApellidoMaterno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblApellidoMaterno.setBounds(46, 309, 122, 28);
		panelPrincipalContenido.add(lblApellidoMaterno);

		textFieldApellidoMaterno = new JTextField();
		textFieldApellidoMaterno.setForeground(new Color(227, 236, 233));
		textFieldApellidoMaterno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldApellidoMaterno.setColumns(10);
		textFieldApellidoMaterno.setBackground(new Color(24, 61, 61));
		textFieldApellidoMaterno.setBounds(46, 348, 136, 20);
		panelPrincipalContenido.add(textFieldApellidoMaterno);
		textFieldApellidoMaterno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(46, 372, 136, 2);
		panelPrincipalContenido.add(separator_1_2_1);

		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setForeground(new Color(227, 236, 233));
		lblCalle.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblCalle.setBounds(229, 82, 122, 28);
		panelPrincipalContenido.add(lblCalle);

		textFieldCalle = new JTextField();
		textFieldCalle.setForeground(new Color(227, 236, 233));
		textFieldCalle.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldCalle.setColumns(10);
		textFieldCalle.setBackground(new Color(24, 61, 61));
		textFieldCalle.setBounds(229, 121, 136, 20);
		panelPrincipalContenido.add(textFieldCalle);
		textFieldCalle.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(229, 145, 136, 2);
		panelPrincipalContenido.add(separator_1_2_2);

		JLabel lblNumInterior = new JLabel("Numero Interior:");
		lblNumInterior.setForeground(new Color(227, 236, 233));
		lblNumInterior.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumInterior.setBounds(229, 158, 122, 28);
		panelPrincipalContenido.add(lblNumInterior);

		textFieldNumInterior = new JTextField();
		textFieldNumInterior.setForeground(new Color(227, 236, 233));
		textFieldNumInterior.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNumInterior.setColumns(10);
		textFieldNumInterior.setBackground(new Color(24, 61, 61));
		textFieldNumInterior.setBounds(229, 197, 136, 20);
		panelPrincipalContenido.add(textFieldNumInterior);
		textFieldNumInterior.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(229, 221, 136, 2);
		panelPrincipalContenido.add(separator_1_2_3);

		JLabel lblNumExterior = new JLabel("Numero Exterior:");
		lblNumExterior.setForeground(new Color(227, 236, 233));
		lblNumExterior.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumExterior.setBounds(229, 228, 122, 28);
		panelPrincipalContenido.add(lblNumExterior);

		textFieldNumExterior = new JTextField();
		textFieldNumExterior.setForeground(new Color(227, 236, 233));
		textFieldNumExterior.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNumExterior.setColumns(10);
		textFieldNumExterior.setBackground(new Color(24, 61, 61));
		textFieldNumExterior.setBounds(229, 267, 136, 20);
		panelPrincipalContenido.add(textFieldNumExterior);
		textFieldNumExterior.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(229, 291, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4);

		JLabel lblColonia = new JLabel("Colonia:");
		lblColonia.setForeground(new Color(227, 236, 233));
		lblColonia.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblColonia.setBounds(229, 309, 122, 28);
		panelPrincipalContenido.add(lblColonia);

		textFieldColonia = new JTextField();
		textFieldColonia.setForeground(new Color(227, 236, 233));
		textFieldColonia.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldColonia.setColumns(10);
		textFieldColonia.setBackground(new Color(24, 61, 61));
		textFieldColonia.setBounds(229, 348, 136, 20);
		panelPrincipalContenido.add(textFieldColonia);
		textFieldColonia.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_5 = new JSeparator();
		separator_1_2_5.setBounds(229, 372, 136, 2);
		panelPrincipalContenido.add(separator_1_2_5);

		JLabel lblTelefonoUno = new JLabel("Telefono 1:");
		lblTelefonoUno.setForeground(new Color(227, 236, 233));
		lblTelefonoUno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTelefonoUno.setBounds(398, 82, 122, 28);
		panelPrincipalContenido.add(lblTelefonoUno);

		textFieldTelefonoUno = new JTextField();
		textFieldTelefonoUno.setForeground(new Color(227, 236, 233));
		textFieldTelefonoUno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldTelefonoUno.setColumns(10);
		textFieldTelefonoUno.setBackground(new Color(24, 61, 61));
		textFieldTelefonoUno.setBounds(398, 121, 136, 20);
		panelPrincipalContenido.add(textFieldTelefonoUno);
		textFieldTelefonoUno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(398, 145, 136, 2);
		panelPrincipalContenido.add(separator_1_3);

		JLabel lblTelefonoDos = new JLabel("Telefono Dos:");
		lblTelefonoDos.setForeground(new Color(227, 236, 233));
		lblTelefonoDos.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTelefonoDos.setBounds(398, 158, 122, 28);
		panelPrincipalContenido.add(lblTelefonoDos);

		textFieldTelefonoDos = new JTextField();
		textFieldTelefonoDos.setForeground(new Color(227, 236, 233));
		textFieldTelefonoDos.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldTelefonoDos.setColumns(10);
		textFieldTelefonoDos.setBackground(new Color(24, 61, 61));
		textFieldTelefonoDos.setBounds(398, 191, 136, 20);
		panelPrincipalContenido.add(textFieldTelefonoDos);
		textFieldTelefonoDos.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(398, 215, 136, 2);
		panelPrincipalContenido.add(separator_1_1_1);

		JLabel lblFechaDeInicio = new JLabel("Fecha de Inicio de Contratacion:");
		lblFechaDeInicio.setForeground(new Color(227, 236, 233));
		lblFechaDeInicio.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblFechaDeInicio.setBounds(398, 228, 160, 34);
		panelPrincipalContenido.add(lblFechaDeInicio);

		textFieldFechaInicioContrato = new JTextField();
		textFieldFechaInicioContrato.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				String input = ManejadorDeErrores.validarFecha(); 
				  if(!input.equals("")) {
					  textFieldFechaInicioContrato.setText(input);
					  lblTituloMenu.requestFocus();
				  }
				  else {
					  JOptionPane.showMessageDialog(null, 
							  "La fecha debe estar en formato dd mm aaaa, con un mes valido y una año mayor a 1938",
							  "Error",JOptionPane.ERROR_MESSAGE);
				  }
			}
		});
		textFieldFechaInicioContrato.setForeground(new Color(227, 236, 233));
		textFieldFechaInicioContrato.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaInicioContrato.setColumns(10);
		textFieldFechaInicioContrato.setBackground(new Color(24, 61, 61));
		textFieldFechaInicioContrato.setBounds(398, 267, 136, 20);
		panelPrincipalContenido.add(textFieldFechaInicioContrato);
		textFieldFechaInicioContrato.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_1_1 = new JSeparator();
		separator_1_2_1_1.setBounds(398, 291, 136, 2);
		panelPrincipalContenido.add(separator_1_2_1_1);

		JLabel lblFechaFinContrato = new JLabel("Fecha de Finalizacion de Contrato:");
		lblFechaFinContrato.setForeground(new Color(227, 236, 233));
		lblFechaFinContrato.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblFechaFinContrato.setBounds(398, 309, 181, 28);
		panelPrincipalContenido.add(lblFechaFinContrato);

		textFieldFechaFinContrato = new JTextField();
		textFieldFechaFinContrato.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String input = ManejadorDeErrores.validarFecha(); 
				  if(!input.equals("")) {
					  textFieldFechaFinContrato.setText(input);
					  lblTituloMenu.requestFocus();
				  }
				  else {
					  JOptionPane.showMessageDialog(null, 
							  "La fecha debe estar en formato dd mm aaaa, con un mes valido y una año mayor a 1938",
							  "Error",JOptionPane.ERROR_MESSAGE);
				  }
			}
		});
		textFieldFechaFinContrato.setForeground(new Color(227, 236, 233));
		textFieldFechaFinContrato.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaFinContrato.setColumns(10);
		textFieldFechaFinContrato.setBackground(new Color(24, 61, 61));
		textFieldFechaFinContrato.setBounds(398, 348, 136, 20);
		panelPrincipalContenido.add(textFieldFechaFinContrato);
		textFieldFechaFinContrato.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_2_1 = new JSeparator();
		separator_1_2_2_1.setBounds(398, 372, 136, 2);
		panelPrincipalContenido.add(separator_1_2_2_1);

		JLabel lbl = new JLabel("Fecha de Nacimiento:");
		lbl.setForeground(new Color(227, 236, 233));
		lbl.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lbl.setBounds(590, 81, 122, 28);
		panelPrincipalContenido.add(lbl);

		textFieldFechaNacimiento = new JTextField();
		textFieldFechaNacimiento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String input = ManejadorDeErrores.validarFecha(); 
				  if(!input.equals("")) {
					  textFieldFechaNacimiento.setText(input);
					  lblTituloMenu.requestFocus();
				  }
				  
				  
				  
				  else {
					  JOptionPane.showMessageDialog(null, 
							  "La fecha debe estar en formato dd mm aaaa, con un mes valido y una año mayor a 1938",
							  "Error",JOptionPane.ERROR_MESSAGE);
				  }
			}
		});
		textFieldFechaNacimiento.setForeground(new Color(227, 236, 233));
		textFieldFechaNacimiento.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaNacimiento.setColumns(10);
		textFieldFechaNacimiento.setBackground(new Color(24, 61, 61));
		textFieldFechaNacimiento.setBounds(590, 120, 136, 20);
		panelPrincipalContenido.add(textFieldFechaNacimiento);
		getTextFieldFechaNacimiento().setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_3_1 = new JSeparator();
		separator_1_2_3_1.setBounds(590, 144, 136, 2);
		panelPrincipalContenido.add(separator_1_2_3_1);

		JLabel lblEmailUno = new JLabel("Email 1:");
		lblEmailUno.setForeground(new Color(227, 236, 233));
		lblEmailUno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEmailUno.setBounds(590, 151, 122, 28);
		panelPrincipalContenido.add(lblEmailUno);

		textFieldEmailUno = new JTextField();
		textFieldEmailUno.setForeground(new Color(227, 236, 233));
		textFieldEmailUno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEmailUno.setColumns(10);
		textFieldEmailUno.setBackground(new Color(24, 61, 61));
		textFieldEmailUno.setBounds(590, 190, 136, 20);
		panelPrincipalContenido.add(textFieldEmailUno);
		textFieldEmailUno.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_4_1 = new JSeparator();
		separator_1_2_4_1.setBounds(590, 214, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4_1);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(227, 236, 233));
		lblGenero.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblGenero.setBounds(590, 308, 122, 28);
		panelPrincipalContenido.add(lblGenero);

		JLabel lblEmailDos = new JLabel("Email 2:");
		lblEmailDos.setForeground(new Color(227, 236, 233));
		lblEmailDos.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEmailDos.setBounds(590, 227, 122, 28);
		panelPrincipalContenido.add(lblEmailDos);

		textFieldEmailDos = new JTextField();
		textFieldEmailDos.setForeground(new Color(227, 236, 233));
		textFieldEmailDos.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEmailDos.setColumns(10);
		textFieldEmailDos.setBackground(new Color(24, 61, 61));
		textFieldEmailDos.setBounds(590, 266, 136, 20);
		panelPrincipalContenido.add(textFieldEmailDos);
		textFieldEmailDos.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_4_1_1 = new JSeparator();
		separator_1_2_4_1_1.setBounds(590, 290, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4_1_1);

		comboBoxGenero = new JComboBox<String>();
		comboBoxGenero
				.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Masculino", "Femenino", "No Binario" }));
		comboBoxGenero.setFont(null);
		comboBoxGenero.setBounds(590, 346, 136, 22);
		panelPrincipalContenido.add(comboBoxGenero);

		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setForeground(new Color(227, 236, 233));
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEspecialidad.setBounds(761, 82, 122, 28);
		panelPrincipalContenido.add(lblEspecialidad);

		textFieldEspecialidad = new JTextField();
		textFieldEspecialidad.setForeground(new Color(227, 236, 233));
		textFieldEspecialidad.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEspecialidad.setColumns(10);
		textFieldEspecialidad.setBackground(new Color(24, 61, 61));
		textFieldEspecialidad.setBounds(761, 121, 136, 20);
		panelPrincipalContenido.add(textFieldEspecialidad);
		textFieldEspecialidad.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBounds(761, 145, 136, 2);
		panelPrincipalContenido.add(separator_1_4);

		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setForeground(new Color(227, 236, 233));
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblSalario.setBounds(761, 168, 122, 28);
		panelPrincipalContenido.add(lblSalario);

		textFieldSalario = new JTextField();
		textFieldSalario.setForeground(new Color(227, 236, 233));
		textFieldSalario.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldSalario.setColumns(10);
		textFieldSalario.setBackground(new Color(24, 61, 61));
		textFieldSalario.setBounds(761, 201, 136, 20);
		panelPrincipalContenido.add(textFieldSalario);
		textFieldSalario.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setBounds(761, 225, 136, 2);
		panelPrincipalContenido.add(separator_1_1_2);

		listaFields = Arrays.asList(textFieldRFC,
				textFieldNombre,
				textFieldApellidoPaterno,
				textFieldApellidoMaterno,
				textFieldCalle,
				textFieldColonia,textFieldEspecialidad, textFieldSalario);
		listaComboBoxs = Arrays.asList(comboBoxGenero);

	}
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 */
	public void limpiaCampos() {
		limpiarCampos(listaFields);
		limpiarComboBoxes(listaComboBoxs);
	}
	
	/**
	 *  Metodo para llenar los campos en la ventana 
	 * @param id id pasado por la ventana de consulta
	 */
	public void llenarCampos(String id) {
		idString = id;
		Veterinario veterinario = manipularVeterinario.leerVeterinario(id);
		textFieldRFC.setText(veterinario.getRfc());
		textFieldNombre.setText(veterinario.getNombre());
		textFieldApellidoPaterno.setText(veterinario.getPaterno());
		textFieldApellidoMaterno.setText(veterinario.getMaterno());
		comboBoxGenero.setSelectedItem(veterinario.getGenero());
		textFieldCalle.setText(veterinario.getCalle());
		textFieldNumInterior.setText(veterinario.getNumInterior());
		textFieldNumExterior.setText(veterinario.getNumExterior());
		textFieldColonia.setText(veterinario.getColonia()); 
		textFieldTelefonoUno.setText(veterinario.getTelefonos().get(0));
		textFieldTelefonoDos.setText(veterinario.getTelefonos().get(1));
		textFieldFechaInicioContrato.setText(veterinario.getInicioContrato());
		textFieldFechaFinContrato.setText(veterinario.getFinContrato());
		textFieldFechaNacimiento.setText(veterinario.getNacimiento());
		textFieldEmailUno.setText(veterinario.getCorreos().get(0));
		textFieldEmailDos.setText(veterinario.getCorreos().get(1));
		textFieldEspecialidad.setText(veterinario.getEspecialidad()); 
		textFieldSalario.setText(Float.valueOf(veterinario.getSalario()).toString());
		
		
		
		
	}
	
	/**
	 * Metodo para obtener el campo de RFC
	 * @return JTextField
	 */
	public JTextField getTextFieldRFC() {
		return textFieldRFC;
	}

	/**
	 * Metodo para obtener el campo nombre
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
	 * Obtener el campo Calle
	 * @return JTextField
	 */
	public JTextField getTextFieldCalle() {
		return textFieldCalle;
	}

	/**
	 * Obtener el campo NumInterior
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
	 * Obtener el campo de Colonia
	 * @return JTextField
	 */
	public JTextField getTextFieldColonia() {
		return textFieldColonia;
	}

	/**
	 * Obtener el campo de telefonoUno
	 * @return JTextField
	 */
	public JTextField getTextFieldTelefonoUno() {
		return textFieldTelefonoUno;
	}

	/**
	 * Obtener el campo de telefonoDos
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
	public JTextField getTextFieldFechaFinalizacionContrato() {
		return textFieldFechaFinContrato;
	}

	/**
	 * Obtener el campo de fecha de nacimiento
	 * @return JTextField
	 */
	public JTextField getTextFieldFechaNacimiento() {
		return textFieldFechaNacimiento;
	}

	/**
	 * Obtener el campo de EmailUno
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
	 * Obtener el campo de Especialidad
	 * @return JTextField
	 */
	public JTextField getTextFieldEspecialidad() {
		return textFieldEspecialidad;
	}

	/**
	 * Obtener el campo de salario
	 * @return JTextField
	 */
	public JTextField getTextFieldSalario() {
		return textFieldSalario;
	}

	/**
	 * Obtener el comboBox de genero
	 * @return JComboBox
	 */
	public JComboBox<String> getComboBoxGenero() {
		return comboBoxGenero;
	}

	/**
	 * Obtener la lista de campos
	 * @return List JTextField
	 */
	public List<JTextField> getListaFields() {
		return listaFields;
	}

	/**
	 * Obtener la lista de combobox
	 * @return list JComboBox
	 */
	public List<JComboBox<String>> getLisaComboBoxs() {
		return listaComboBoxs;
	}

	/**
	 * Obtener la venta de consulta de veterinarios
	 * @return VentanaConsultaVeterinarios
	 */
	public VentanaConsultaVeterinarios getVentanaConsultaVeterinarios() {
		return ventanaConsultaVeterinarios;
	}

	/**
	 * Asignar la ventana de consulta de veterinarios
	 * @param ventanaConsultaVeterinarios
	 */
	public void setVentanaConsultaVeterinarios(VentanaConsultaVeterinarios ventanaConsultaVeterinarios) {
		this.ventanaConsultaVeterinarios = ventanaConsultaVeterinarios;
	}

}
