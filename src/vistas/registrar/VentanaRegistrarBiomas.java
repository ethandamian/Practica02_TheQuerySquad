package vistas.registrar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import vistas.FuenteProyecto;

import javax.swing.JSeparator;

public class VentanaRegistrarBiomas extends VentanaRegistrarMenu {
	private JTextField textFieldTipoDeBioma;
	private JTextField textFieldNumJaulas;
	private JTextField textFieldNumCuidadores;
	private JTextField textFieldNumVeterinarios;
	private JTextField textFieldNumAnimales;
	private JTextField textFieldServicios;
	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	
	
	/**
	 * Create the panel.
	 */
	public VentanaRegistrarBiomas() {
		lblTituloDerecho.setBounds(38, 57, 397, 28);
		lblTituloDerecho.setText("INGRESA DATOS DEL BIOMA");
		
		JLabel lblTipoDeBioma = new JLabel("Tipo de Bioma:");
		lblTipoDeBioma.setForeground(new Color(227, 236, 233));
		lblTipoDeBioma.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTipoDeBioma.setBounds(38, 118, 97, 28);
		panelDerecho.add(lblTipoDeBioma);
		
		textFieldTipoDeBioma = new JTextField();
		textFieldTipoDeBioma.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldTipoDeBioma.setForeground(new Color(227, 236, 233));
		textFieldTipoDeBioma.setBackground(new Color(67, 83, 52));
		textFieldTipoDeBioma.setBounds(38, 157, 136, 20);
		panelDerecho.add(textFieldTipoDeBioma);
		textFieldTipoDeBioma.setColumns(10);
		//textFieldTipoDeBioma.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 180, 136, 2);
		panelDerecho.add(separator);
		
		JLabel lblNumJaulas = new JLabel("Numero de Jaulas:");
		lblNumJaulas.setForeground(new Color(227, 236, 233));
		lblNumJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumJaulas.setBounds(38, 199, 122, 28);
		panelDerecho.add(lblNumJaulas);
		
		textFieldNumJaulas = new JTextField();
		textFieldNumJaulas.setForeground(new Color(227, 236, 233));
		textFieldNumJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumJaulas.setColumns(10);
		textFieldNumJaulas.setBackground(new Color(67, 83, 52));
		textFieldNumJaulas.setBounds(38, 238, 136, 20);
		panelDerecho.add(textFieldNumJaulas);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 262, 136, 2);
		panelDerecho.add(separator_1);
		
		JLabel lblNumCuidadores = new JLabel("Numero de Cuidadores:");
		lblNumCuidadores.setForeground(new Color(227, 236, 233));
		lblNumCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumCuidadores.setBounds(38, 286, 147, 28);
		panelDerecho.add(lblNumCuidadores);
		
		textFieldNumCuidadores = new JTextField();
		textFieldNumCuidadores.setForeground(new Color(227, 236, 233));
		textFieldNumCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumCuidadores.setColumns(10);
		textFieldNumCuidadores.setBackground(new Color(67, 83, 52));
		textFieldNumCuidadores.setBounds(38, 325, 136, 20);
		panelDerecho.add(textFieldNumCuidadores);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(38, 350, 136, 2);
		panelDerecho.add(separator_2);
		
		JLabel lblNumVeterinarios = new JLabel("Numero de Veterinarios:");
		lblNumVeterinarios.setForeground(new Color(227, 236, 233));
		lblNumVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumVeterinarios.setBounds(231, 118, 149, 28);
		panelDerecho.add(lblNumVeterinarios);
		
		textFieldNumVeterinarios = new JTextField();
		textFieldNumVeterinarios.setForeground(new Color(227, 236, 233));
		textFieldNumVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumVeterinarios.setColumns(10);
		textFieldNumVeterinarios.setBackground(new Color(67, 83, 52));
		textFieldNumVeterinarios.setBounds(231, 157, 136, 20);
		panelDerecho.add(textFieldNumVeterinarios);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(231, 180, 136, 2);
		panelDerecho.add(separator_3);
		
		JLabel lblNumeroDeAnimales = new JLabel("Numero de Animales:");
		lblNumeroDeAnimales.setForeground(new Color(227, 236, 233));
		lblNumeroDeAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeAnimales.setBounds(231, 199, 149, 28);
		panelDerecho.add(lblNumeroDeAnimales);
		
		textFieldNumAnimales = new JTextField();
		textFieldNumAnimales.setForeground(new Color(227, 236, 233));
		textFieldNumAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumAnimales.setColumns(10);
		textFieldNumAnimales.setBackground(new Color(67, 83, 52));
		textFieldNumAnimales.setBounds(231, 238, 136, 20);
		panelDerecho.add(textFieldNumAnimales);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(231, 262, 136, 2);
		panelDerecho.add(separator_4);
		
		JLabel lblServicios = new JLabel("Servicio a Visitantes:");
		lblServicios.setForeground(new Color(227, 236, 233));
		lblServicios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblServicios.setBounds(231, 286, 136, 28);
		panelDerecho.add(lblServicios);
		
		textFieldServicios = new JTextField();
		textFieldServicios.setForeground(new Color(227, 236, 233));
		textFieldServicios.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldServicios.setColumns(10);
		textFieldServicios.setBackground(new Color(67, 83, 52));
		textFieldServicios.setBounds(231, 325, 136, 20);
		panelDerecho.add(textFieldServicios);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(231, 350, 136, 2);
		panelDerecho.add(separator_5);
		
		lblLogo.setIcon(new ImageIcon(VentanaRegistrarMenu.class.getResource("/imagenes/selva.png")));
		
		

	}
}
