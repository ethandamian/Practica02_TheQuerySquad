package vistas.editar;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;

import vistas.FuenteProyecto;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

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
	
	
	private JComboBox<String> comboBoxTipoTrabajador;
	private JComboBox<String> comboBoxGenero;
	
	

	/**
	 * Create the panel.
	 */
	public VentanaEditarVeterinario() {
		lblTituloMenu.setText("MENU EDITAR VETERINARIO");
		btnGuardar.setLocation(730, 398);
		
		JLabel lblRfc = new JLabel("RFC:");
		lblRfc.setForeground(new Color(227, 236, 233));
		lblRfc.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblRfc.setBounds(46, 82, 122, 28);
		panelPrincipalContenido.add(lblRfc);
		
		textFieldRFC = new JTextField();
		textFieldRFC.setForeground(new Color(227, 236, 233));
		textFieldRFC.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldRFC.setColumns(10);
		textFieldRFC.setBackground(new Color(24, 61, 61));
		textFieldRFC.setBounds(46, 121, 136, 20);
		panelPrincipalContenido.add(textFieldRFC);
		
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
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(398, 215, 136, 2);
		panelPrincipalContenido.add(separator_1_1_1);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de Inicio de Contratacion:");
		lblFechaDeInicio.setForeground(new Color(227, 236, 233));
		lblFechaDeInicio.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblFechaDeInicio.setBounds(398, 228, 160, 34);
		panelPrincipalContenido.add(lblFechaDeInicio);
		
		textFieldFechaInicioContrato = new JTextField();
		textFieldFechaInicioContrato.setForeground(new Color(227, 236, 233));
		textFieldFechaInicioContrato.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaInicioContrato.setColumns(10);
		textFieldFechaInicioContrato.setBackground(new Color(24, 61, 61));
		textFieldFechaInicioContrato.setBounds(398, 267, 136, 20);
		panelPrincipalContenido.add(textFieldFechaInicioContrato);
		
		JSeparator separator_1_2_1_1 = new JSeparator();
		separator_1_2_1_1.setBounds(398, 291, 136, 2);
		panelPrincipalContenido.add(separator_1_2_1_1);
		
		JLabel lblFechaFinContrato = new JLabel("Fecha de Finalizacion de Contrato:");
		lblFechaFinContrato.setForeground(new Color(227, 236, 233));
		lblFechaFinContrato.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblFechaFinContrato.setBounds(398, 309, 181, 28);
		panelPrincipalContenido.add(lblFechaFinContrato);
		
		textFieldFechaFinContrato = new JTextField();
		textFieldFechaFinContrato.setForeground(new Color(227, 236, 233));
		textFieldFechaFinContrato.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaFinContrato.setColumns(10);
		textFieldFechaFinContrato.setBackground(new Color(24, 61, 61));
		textFieldFechaFinContrato.setBounds(398, 348, 136, 20);
		panelPrincipalContenido.add(textFieldFechaFinContrato);
		
		JSeparator separator_1_2_2_1 = new JSeparator();
		separator_1_2_2_1.setBounds(398, 372, 136, 2);
		panelPrincipalContenido.add(separator_1_2_2_1);
		
		JLabel lbl = new JLabel("Fecha de Nacimiento:");
		lbl.setForeground(new Color(227, 236, 233));
		lbl.setFont(null);
		lbl.setBounds(589, 26, 122, 28);
		panelPrincipalContenido.add(lbl);
		
		textFieldFechaNacimiento = new JTextField();
		textFieldFechaNacimiento.setForeground(new Color(227, 236, 233));
		textFieldFechaNacimiento.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaNacimiento.setColumns(10);
		textFieldFechaNacimiento.setBackground(new Color(24, 61, 61));
		textFieldFechaNacimiento.setBounds(589, 65, 136, 20);
		panelPrincipalContenido.add(textFieldFechaNacimiento);
		
		JSeparator separator_1_2_3_1 = new JSeparator();
		separator_1_2_3_1.setBounds(589, 89, 136, 2);
		panelPrincipalContenido.add(separator_1_2_3_1);
		
		JLabel lblEmailUno = new JLabel("Email 1:");
		lblEmailUno.setForeground(new Color(227, 236, 233));
		lblEmailUno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEmailUno.setBounds(589, 96, 122, 28);
		panelPrincipalContenido.add(lblEmailUno);
		
		textFieldEmailUno = new JTextField();
		textFieldEmailUno.setForeground(new Color(227, 236, 233));
		textFieldEmailUno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEmailUno.setColumns(10);
		textFieldEmailUno.setBackground(new Color(24, 61, 61));
		textFieldEmailUno.setBounds(589, 135, 136, 20);
		panelPrincipalContenido.add(textFieldEmailUno);
		
		JSeparator separator_1_2_4_1 = new JSeparator();
		separator_1_2_4_1.setBounds(589, 159, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4_1);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(227, 236, 233));
		lblGenero.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblGenero.setBounds(589, 253, 122, 28);
		panelPrincipalContenido.add(lblGenero);
		
		JLabel lblEmailDos = new JLabel("Email 2:");
		lblEmailDos.setForeground(new Color(227, 236, 233));
		lblEmailDos.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEmailDos.setBounds(589, 172, 122, 28);
		panelPrincipalContenido.add(lblEmailDos);
		
		textFieldEmailDos = new JTextField();
		textFieldEmailDos.setForeground(new Color(227, 236, 233));
		textFieldEmailDos.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEmailDos.setColumns(10);
		textFieldEmailDos.setBackground(new Color(24, 61, 61));
		textFieldEmailDos.setBounds(589, 211, 136, 20);
		panelPrincipalContenido.add(textFieldEmailDos);
		
		JSeparator separator_1_2_4_1_1 = new JSeparator();
		separator_1_2_4_1_1.setBounds(589, 235, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4_1_1);
		
		comboBoxGenero = new JComboBox<String>();
		comboBoxGenero.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Masculino", "Femenino", "No Binario"}));
		comboBoxGenero.setFont(null);
		comboBoxGenero.setBounds(589, 291, 136, 22);
		panelPrincipalContenido.add(comboBoxGenero);
		
		JLabel lblTipoDeTrabajador = new JLabel("Tipo de Trabajador:");
		lblTipoDeTrabajador.setForeground(new Color(227, 236, 233));
		lblTipoDeTrabajador.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTipoDeTrabajador.setBounds(589, 329, 181, 28);
		panelPrincipalContenido.add(lblTipoDeTrabajador);
		
		comboBoxTipoTrabajador = new JComboBox<String>();
		comboBoxTipoTrabajador.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Veterinario", "Cuidador", "Proveedor"}));
		comboBoxTipoTrabajador.setFont(null);
		comboBoxTipoTrabajador.setBounds(589, 354, 136, 22);
		panelPrincipalContenido.add(comboBoxTipoTrabajador);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setForeground(new Color(227, 236, 233));
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEspecialidad.setBounds(760, 26, 122, 28);
		panelPrincipalContenido.add(lblEspecialidad);
		
		textFieldEspecialidad = new JTextField();
		textFieldEspecialidad.setForeground(new Color(227, 236, 233));
		textFieldEspecialidad.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEspecialidad.setColumns(10);
		textFieldEspecialidad.setBackground(new Color(24, 61, 61));
		textFieldEspecialidad.setBounds(760, 65, 136, 20);
		panelPrincipalContenido.add(textFieldEspecialidad);
		
		JSeparator separator_1_4 = new JSeparator();
		separator_1_4.setBounds(760, 89, 136, 2);
		panelPrincipalContenido.add(separator_1_4);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setForeground(new Color(227, 236, 233));
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblSalario.setBounds(760, 112, 122, 28);
		panelPrincipalContenido.add(lblSalario);
		
		textFieldSalario = new JTextField();
		textFieldSalario.setForeground(new Color(227, 236, 233));
		textFieldSalario.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldSalario.setColumns(10);
		textFieldSalario.setBackground(new Color(24, 61, 61));
		textFieldSalario.setBounds(760, 145, 136, 20);
		panelPrincipalContenido.add(textFieldSalario);
		
		JSeparator separator_1_1_2 = new JSeparator();
		separator_1_1_2.setBounds(760, 169, 136, 2);
		panelPrincipalContenido.add(separator_1_1_2);
		
		listaFields = Arrays.asList(textFieldRFC,
				textFieldNombre,
				textFieldApellidoPaterno,
				textFieldApellidoMaterno,
				textFieldCalle,
				textFieldNumInterior,
				textFieldNumExterior,
				textFieldColonia,textFieldTelefonoUno,
				textFieldTelefonoDos,
				textFieldFechaInicioContrato,
				textFieldFechaFinContrato,
				textFieldFechaNacimiento,
				textFieldEmailUno,
				textFieldEmailDos,textFieldEspecialidad,textFieldSalario);
		
		
		listaComboBoxs = Arrays.asList(comboBoxGenero,comboBoxTipoTrabajador);

	}

	public JTextField getTextFieldRFC() {
		return textFieldRFC;
	}

	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}

	public JTextField getTextFieldApellidoPaterno() {
		return textFieldApellidoPaterno;
	}

	public JTextField getTextFieldApellidoMaterno() {
		return textFieldApellidoMaterno;
	}

	public JTextField getTextFieldCalle() {
		return textFieldCalle;
	}

	public JTextField getTextFieldNumInterior() {
		return textFieldNumInterior;
	}

	public JTextField getTextFieldNumExterior() {
		return textFieldNumExterior;
	}

	public JTextField getTextFieldColonia() {
		return textFieldColonia;
	}

	public JTextField getTextFieldTelefonoUno() {
		return textFieldTelefonoUno;
	}

	public JTextField getTextFieldTelefonoDos() {
		return textFieldTelefonoDos;
	}

	public JTextField getTextFieldFechaInicioContrato() {
		return textFieldFechaInicioContrato;
	}

	public JTextField getTextFieldFechaFinalizacionContrato() {
		return textFieldFechaFinContrato;
	}

	public JTextField getTextFieldFechaNacimiento() {
		return textFieldFechaNacimiento;
	}

	public JTextField getTextFieldEmailUno() {
		return textFieldEmailUno;
	}

	public JTextField getTextFieldEmailDos() {
		return textFieldEmailDos;
	}

	public JTextField getTextFieldEspecialidad() {
		return textFieldEspecialidad;
	}

	public JTextField getTextFieldSalario() {
		return textFieldSalario;
	}

	public JComboBox<String> getComboBoxTipoTrabajador() {
		return comboBoxTipoTrabajador;
	}

	public JComboBox<String> getComboBoxGenero() {
		return comboBoxGenero;
	}

	public List<JTextField> getListaFields() {
		return listaFields;
	}

	public List<JComboBox<String>> getLisaComboBoxs() {
		return listaComboBoxs;
	}
	
	
}
