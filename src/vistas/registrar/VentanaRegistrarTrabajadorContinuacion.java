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

import vistas.FuenteProyecto;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

public class VentanaRegistrarTrabajadorContinuacion extends JPanel {
	private String urlFuenteBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuentePlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	
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
	 * Create the panel.
	 */
	public VentanaRegistrarTrabajadorContinuacion() {
		
		
		
		setLayout(null);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(67, 83, 52));
		panelPrincipal.setBounds(0, 0, 463, 407);
		add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblIngresaDatosDel = new JLabel("INGRESA DATOS DEL TRABAJADOR");
		lblIngresaDatosDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaDatosDel.setForeground(new Color(227, 236, 233));
		lblIngresaDatosDel.setFont(FuenteProyecto.createFont(urlFuenteBold, 25));
		lblIngresaDatosDel.setBounds(38, 11, 384, 28);
		panelPrincipal.add(lblIngresaDatosDel);
		
		JLabel lblTelefonoUno = new JLabel("Telefono 1:");
		lblTelefonoUno.setForeground(new Color(227, 236, 233));
		lblTelefonoUno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTelefonoUno.setBounds(38, 52, 122, 28);
		panelPrincipal.add(lblTelefonoUno);
		
		textFieldTelefonoUno = new JTextField();
		textFieldTelefonoUno.setForeground(new Color(227, 236, 233));
		textFieldTelefonoUno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldTelefonoUno.setColumns(10);
		textFieldTelefonoUno.setBackground(new Color(67, 83, 52));
		textFieldTelefonoUno.setBounds(38, 91, 136, 20);
		panelPrincipal.add(textFieldTelefonoUno);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 115, 136, 2);
		panelPrincipal.add(separator_1);
		
		JLabel lblTelefonoDos = new JLabel("Telefono Dos:");
		lblTelefonoDos.setForeground(new Color(227, 236, 233));
		lblTelefonoDos.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTelefonoDos.setBounds(38, 128, 122, 28);
		panelPrincipal.add(lblTelefonoDos);
		
		textFieldTelefonoDos = new JTextField();
		textFieldTelefonoDos.setForeground(new Color(227, 236, 233));
		textFieldTelefonoDos.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldTelefonoDos.setColumns(10);
		textFieldTelefonoDos.setBackground(new Color(67, 83, 52));
		textFieldTelefonoDos.setBounds(38, 161, 136, 20);
		panelPrincipal.add(textFieldTelefonoDos);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(38, 185, 136, 2);
		panelPrincipal.add(separator_1_1);
		
		JLabel lblFechaDeInicio = new JLabel("Fecha de Inicio de Contratacion:");
		lblFechaDeInicio.setForeground(new Color(227, 236, 233));
		lblFechaDeInicio.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblFechaDeInicio.setBounds(38, 198, 160, 34);
		panelPrincipal.add(lblFechaDeInicio);
		
		textFieldFechaInicioContrato = new JTextField();
		textFieldFechaInicioContrato.setForeground(new Color(227, 236, 233));
		textFieldFechaInicioContrato.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaInicioContrato.setColumns(10);
		textFieldFechaInicioContrato.setBackground(new Color(67, 83, 52));
		textFieldFechaInicioContrato.setBounds(38, 237, 136, 20);
		panelPrincipal.add(textFieldFechaInicioContrato);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(38, 261, 136, 2);
		panelPrincipal.add(separator_1_2_1);
		
		JLabel lblFechaFinContrato = new JLabel("Fecha de Finalizacion de Contrato:");
		lblFechaFinContrato.setForeground(new Color(227, 236, 233));
		lblFechaFinContrato.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblFechaFinContrato.setBounds(38, 279, 181, 28);
		panelPrincipal.add(lblFechaFinContrato);
		
		textFieldFinContrato = new JTextField();
		textFieldFinContrato.setForeground(new Color(227, 236, 233));
		textFieldFinContrato.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFinContrato.setColumns(10);
		textFieldFinContrato.setBackground(new Color(67, 83, 52));
		textFieldFinContrato.setBounds(38, 318, 136, 20);
		panelPrincipal.add(textFieldFinContrato);
		
		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(38, 342, 136, 2);
		panelPrincipal.add(separator_1_2_2);
		
		JLabel lbl = new JLabel("Fecha de Nacimiento:");
		lbl.setForeground(new Color(227, 236, 233));
		lbl.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lbl.setBounds(260, 52, 122, 28);
		panelPrincipal.add(lbl);
		
		textFieldFechaNacimiento = new JTextField();
		textFieldFechaNacimiento.setForeground(new Color(227, 236, 233));
		textFieldFechaNacimiento.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldFechaNacimiento.setColumns(10);
		textFieldFechaNacimiento.setBackground(new Color(67, 83, 52));
		textFieldFechaNacimiento.setBounds(260, 91, 136, 20);
		panelPrincipal.add(textFieldFechaNacimiento);
		
		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(260, 115, 136, 2);
		panelPrincipal.add(separator_1_2_3);
		
		JLabel lblEmailUno = new JLabel("Email 1:");
		lblEmailUno.setForeground(new Color(227, 236, 233));
		lblEmailUno.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEmailUno.setBounds(260, 122, 122, 28);
		panelPrincipal.add(lblEmailUno);
		
		textFieldEmailUno = new JTextField();
		textFieldEmailUno.setForeground(new Color(227, 236, 233));
		textFieldEmailUno.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEmailUno.setColumns(10);
		textFieldEmailUno.setBackground(new Color(67, 83, 52));
		textFieldEmailUno.setBounds(260, 161, 136, 20);
		panelPrincipal.add(textFieldEmailUno);
		
		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(260, 185, 136, 2);
		panelPrincipal.add(separator_1_2_4);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(227, 236, 233));
		lblGenero.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblGenero.setBounds(260, 279, 122, 28);
		panelPrincipal.add(lblGenero);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String opcionTrabajador = comboBoxTipoTrabajador.getSelectedItem().toString(); 
				
				switch (opcionTrabajador) {
					case "Veterinario": {
						
						VentanaRegistrarTrabajador.changePrincipalPanel(ventanaRegistrarTrabajador.getVentanaRegistrarVeterinario().getPanelPrincipal());
						break;
					}case "Cuidador": {
						break;
					}case "Proveedor": {
						break;
					}
				}
				
				
				
			}
		});
		btnSiguiente.setBounds(292, 362, 104, 23);
		panelPrincipal.add(btnSiguiente);
		btnSiguiente.setFont(FuenteProyecto.createFont(urlFuenteBold, 13));
		
		
		
		JLabel lblEmailDos = new JLabel("Email 2:");
		lblEmailDos.setForeground(new Color(227, 236, 233));
		lblEmailDos.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEmailDos.setBounds(260, 198, 122, 28);
		panelPrincipal.add(lblEmailDos);
		
		textFieldEmailDos = new JTextField();
		textFieldEmailDos.setForeground(new Color(227, 236, 233));
		textFieldEmailDos.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEmailDos.setColumns(10);
		textFieldEmailDos.setBackground(new Color(67, 83, 52));
		textFieldEmailDos.setBounds(260, 237, 136, 20);
		panelPrincipal.add(textFieldEmailDos);
		
		JSeparator separator_1_2_4_1 = new JSeparator();
		separator_1_2_4_1.setBounds(260, 261, 136, 2);
		panelPrincipal.add(separator_1_2_4_1);
		
		comboBoxGenero = new JComboBox<>();
		comboBoxGenero.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		comboBoxGenero.setModel(new DefaultComboBoxModel(new String[] {"", "Masculino", "Femenino", "No Binario"}));
		comboBoxGenero.setBounds(260, 317, 136, 22);
		panelPrincipal.add(comboBoxGenero);
		
		JLabel lblTipoDeTrabajador = new JLabel("Tipo de Trabajador:");
		lblTipoDeTrabajador.setForeground(new Color(227, 236, 233));
		lblTipoDeTrabajador.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTipoDeTrabajador.setBounds(38, 349, 181, 28);
		panelPrincipal.add(lblTipoDeTrabajador);
		
		comboBoxTipoTrabajador = new JComboBox<>();
		comboBoxTipoTrabajador.setModel(new DefaultComboBoxModel(new String[] {"", "Veterinario", "Cuidador", "Proveedor"}));
		comboBoxTipoTrabajador.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		comboBoxTipoTrabajador.setBounds(38, 374, 136, 22);
		panelPrincipal.add(comboBoxTipoTrabajador);
		
		listaTextFields = 
				Arrays.asList(textFieldTelefonoUno,
						textFieldTelefonoDos,
						textFieldFechaInicioContrato,
						textFieldFinContrato,
						textFieldFechaNacimiento,
						textFieldEmailUno,
						textFieldEmailDos);
		
		listaComBoxs = Arrays.asList(comboBoxGenero,comboBoxTipoTrabajador);
		

	}


	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}


	

	public VentanaRegistrarTrabajador getVentanaRegistrarTrabajador() {
		return ventanaRegistrarTrabajador;
	}


	public void setVentanaRegistrarTrabajador(VentanaRegistrarTrabajador ventanaRegistrarTrabajador) {
		this.ventanaRegistrarTrabajador = ventanaRegistrarTrabajador;
	}


	public List<JTextField> getListaTextFields() {
		return listaTextFields;
	}


	public List<JComboBox<String>> getListaComBoxs() {
		return listaComBoxs;
	}
	
	
	
	

	
	
	
}
