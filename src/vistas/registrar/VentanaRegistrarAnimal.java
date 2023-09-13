package vistas.registrar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

import vistas.FuenteProyecto;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public class VentanaRegistrarAnimal extends VentanaRegistrarMenu{
	private JTextField textFieldNombre;
	private JTextField textFieldEspecie;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	private JTextField textField_5;

	private String urlFuenteBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuentePlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	private JComboBox<String> comboBoxSexo;
	private JComboBox<String> comboBoxAlimentacion;
	private JTextArea textArea;
	/**
	 * Create the panel.
	 */
	public VentanaRegistrarAnimal() {
		lblTituloDerecho.setLocation(45, 11);
		lblLogo.setIcon(new ImageIcon(VentanaRegistrarAnimal.class.getResource("/imagenes/zoo.png")));
		
		lblTituloDerecho.setText("INGRESA DATOS DEL ANIMAL");
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setForeground(new Color(227, 236, 233));
		lblNombre_1.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNombre_1.setBounds(72, 50, 122, 28);
		panelDerecho.add(lblNombre_1);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(227, 236, 233));
		textFieldNombre.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBackground(new Color(67, 83, 52));
		textFieldNombre.setBounds(72, 89, 136, 20);
		panelDerecho.add(textFieldNombre);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(72, 113, 136, 2);
		panelDerecho.add(separator_1);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(new Color(227, 236, 233));
		lblEspecie.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEspecie.setBounds(72, 126, 122, 28);
		panelDerecho.add(lblEspecie);
		
		textFieldEspecie = new JTextField();
		textFieldEspecie.setForeground(new Color(227, 236, 233));
		textFieldEspecie.setFont(null);
		textFieldEspecie.setColumns(10);
		textFieldEspecie.setBackground(new Color(67, 83, 52));
		textFieldEspecie.setBounds(72, 159, 136, 20);
		panelDerecho.add(textFieldEspecie);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(72, 183, 136, 2);
		panelDerecho.add(separator_1_1);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(227, 236, 233));
		lblPeso.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblPeso.setBounds(72, 196, 122, 28);
		panelDerecho.add(lblPeso);
		
		textFieldPeso = new JTextField();
		textFieldPeso.setForeground(new Color(227, 236, 233));
		textFieldPeso.setFont(null);
		textFieldPeso.setColumns(10);
		textFieldPeso.setBackground(new Color(67, 83, 52));
		textFieldPeso.setBounds(72, 235, 136, 20);
		panelDerecho.add(textFieldPeso);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(72, 259, 136, 2);
		panelDerecho.add(separator_1_2);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(new Color(227, 236, 233));
		lblAltura.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblAltura.setBounds(72, 277, 122, 28);
		panelDerecho.add(lblAltura);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setForeground(new Color(227, 236, 233));
		textFieldAltura.setFont(null);
		textFieldAltura.setColumns(10);
		textFieldAltura.setBackground(new Color(67, 83, 52));
		textFieldAltura.setBounds(72, 316, 136, 20);
		panelDerecho.add(textFieldAltura);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(72, 340, 136, 2);
		panelDerecho.add(separator_1_2_1);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(new Color(227, 236, 233));
		lblSexo.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblSexo.setBounds(255, 50, 122, 28);
		panelDerecho.add(lblSexo);
		
		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(255, 113, 136, 2);
		panelDerecho.add(separator_1_2_2);
		
		JLabel lblNumeroDeJaula = new JLabel("Numero de Jaula:");
		lblNumeroDeJaula.setForeground(new Color(227, 236, 233));
		lblNumeroDeJaula.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumeroDeJaula.setBounds(255, 126, 122, 28);
		panelDerecho.add(lblNumeroDeJaula);
		
		textField_5 = new JTextField();
		textField_5.setForeground(new Color(227, 236, 233));
		textField_5.setFont(null);
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(67, 83, 52));
		textField_5.setBounds(255, 165, 136, 20);
		panelDerecho.add(textField_5);
		
		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(255, 189, 136, 2);
		panelDerecho.add(separator_1_2_3);
		
		JLabel lblAlimentacion = new JLabel("Alimentacion:");
		lblAlimentacion.setForeground(new Color(227, 236, 233));
		lblAlimentacion.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblAlimentacion.setBounds(255, 196, 122, 28);
		panelDerecho.add(lblAlimentacion);
		
		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(255, 259, 136, 2);
		panelDerecho.add(separator_1_2_4);
		
		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medicas:");
		lblIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		lblIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblIndicacionesMedicas.setBounds(255, 277, 174, 28);
		panelDerecho.add(lblIndicacionesMedicas);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(FuenteProyecto.createFont(urlFuenteBold, 13));
		btnRegistrar.setBounds(72, 353, 104, 23);
		panelDerecho.add(btnRegistrar);
		
		comboBoxSexo = new JComboBox<>();
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Macho", "Hembra"}));
		comboBoxSexo.setBounds(255, 88, 136, 22);
		panelDerecho.add(comboBoxSexo);
		
		comboBoxAlimentacion = new JComboBox<>();
		comboBoxAlimentacion.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Carnivoro", "Herviboro", "Omnivoro"}));
		comboBoxAlimentacion.setBounds(255, 234, 136, 22);
		panelDerecho.add(comboBoxAlimentacion);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(67, 83, 52));
		textArea.setForeground(new Color(227, 236, 233));
		textArea.setBounds(255, 314, 136, 82);
		panelDerecho.add(textArea);

	}
}
