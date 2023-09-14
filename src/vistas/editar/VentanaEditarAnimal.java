package vistas.editar;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.List;

import javax.swing.JTextField;

import vistas.FuenteProyecto;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class VentanaEditarAnimal extends VentanaEditarMenu{
	private JTextField textFieldNombre;
	private JTextField textFieldEspecie;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	private JTextField textFieldNumJaula;
	private JComboBox<String> comboBoxSexo;
	private JComboBox<String> comboBoxAlimentacion;
	private JTextArea textAreaIndicacionesMedicas;
	

	/**
	 * Create the panel.
	 */
	public VentanaEditarAnimal() {
		lblTituloMenu.setText("MENU EDITAR ANIMAL");
		btnGuardar.setLocation(413, 397);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setForeground(new Color(227, 236, 233));
		lblNombre_1.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNombre_1.setBounds(40, 74, 122, 28);
		panelPrincipalContenido.add(lblNombre_1);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(227, 236, 233));
		textFieldNombre.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBackground(new Color(24, 61, 61));
		textFieldNombre.setBounds(40, 113, 136, 20);
		panelPrincipalContenido.add(textFieldNombre);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 137, 136, 2);
		panelPrincipalContenido.add(separator_1);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(new Color(227, 236, 233));
		lblEspecie.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEspecie.setBounds(40, 150, 122, 28);
		panelPrincipalContenido.add(lblEspecie);
		
		textFieldEspecie = new JTextField();
		textFieldEspecie.setForeground(new Color(227, 236, 233));
		textFieldEspecie.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEspecie.setColumns(10);
		textFieldEspecie.setBackground(new Color(24, 61, 61));
		textFieldEspecie.setBounds(40, 183, 136, 20);
		panelPrincipalContenido.add(textFieldEspecie);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(40, 207, 136, 2);
		panelPrincipalContenido.add(separator_1_1);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(227, 236, 233));
		lblPeso.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblPeso.setBounds(40, 220, 122, 28);
		panelPrincipalContenido.add(lblPeso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setForeground(new Color(227, 236, 233));
		textFieldPeso.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldPeso.setColumns(10);
		textFieldPeso.setBackground(new Color(24, 61, 61));
		textFieldPeso.setBounds(40, 259, 136, 20);
		panelPrincipalContenido.add(textFieldPeso);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(40, 283, 136, 2);
		panelPrincipalContenido.add(separator_1_2);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(new Color(227, 236, 233));
		lblAltura.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblAltura.setBounds(40, 301, 122, 28);
		panelPrincipalContenido.add(lblAltura);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setForeground(new Color(227, 236, 233));
		textFieldAltura.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldAltura.setColumns(10);
		textFieldAltura.setBackground(new Color(24, 61, 61));
		textFieldAltura.setBounds(40, 340, 136, 20);
		panelPrincipalContenido.add(textFieldAltura);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(40, 364, 136, 2);
		panelPrincipalContenido.add(separator_1_2_1);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(new Color(227, 236, 233));
		lblSexo.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblSexo.setBounds(223, 74, 122, 28);
		panelPrincipalContenido.add(lblSexo);
		
		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(223, 137, 136, 2);
		panelPrincipalContenido.add(separator_1_2_2);
		
		JLabel lblNumeroDeJaula = new JLabel("Numero de Jaula:");
		lblNumeroDeJaula.setForeground(new Color(227, 236, 233));
		lblNumeroDeJaula.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumeroDeJaula.setBounds(223, 150, 122, 28);
		panelPrincipalContenido.add(lblNumeroDeJaula);
		
		textFieldNumJaula = new JTextField();
		textFieldNumJaula.setForeground(new Color(227, 236, 233));
		textFieldNumJaula.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNumJaula.setColumns(10);
		textFieldNumJaula.setBackground(new Color(24, 61, 61));
		textFieldNumJaula.setBounds(223, 189, 136, 20);
		panelPrincipalContenido.add(textFieldNumJaula);
		
		JLabel lblAlimentacion = new JLabel("Alimentacion:");
		lblAlimentacion.setForeground(new Color(227, 236, 233));
		lblAlimentacion.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblAlimentacion.setBounds(223, 220, 122, 28);
		panelPrincipalContenido.add(lblAlimentacion);
		
		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(223, 283, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4);
		
		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medicas:");
		lblIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		lblIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblIndicacionesMedicas.setBounds(223, 301, 174, 28);
		panelPrincipalContenido.add(lblIndicacionesMedicas);
		
		comboBoxSexo = new JComboBox<String>();
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Macho", "Hembra"}));
		comboBoxSexo.setBounds(223, 112, 136, 22);
		panelPrincipalContenido.add(comboBoxSexo);
		comboBoxSexo.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		
		comboBoxAlimentacion = new JComboBox<String>();
		comboBoxAlimentacion.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Carnivoro", "Herviboro", "Omnivoro"}));
		comboBoxAlimentacion.setBounds(223, 258, 136, 22);
		panelPrincipalContenido.add(comboBoxAlimentacion);
		comboBoxAlimentacion.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		
		textAreaIndicacionesMedicas = new JTextArea();
		textAreaIndicacionesMedicas.setLineWrap(true);
		textAreaIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		textAreaIndicacionesMedicas.setBackground(new Color(24, 61, 61));
		textAreaIndicacionesMedicas.setBounds(223, 338, 136, 82);
		panelPrincipalContenido.add(textAreaIndicacionesMedicas);
		textAreaIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));

	}
}
