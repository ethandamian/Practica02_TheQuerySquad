package vistas.registrar;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.SwingConstants;

import vistas.FuenteProyecto;

public class VentanaRegistrarMenu extends JPanel {

	protected JPanel panelPrincipalRegistrar;
	protected JPanel panelizquierdo;
	protected JLabel lblTitulo;
	protected JLabel lblLogo;
	protected static JPanel panelDerecho;
	protected JLabel lblTituloDerecho;
	protected String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	protected String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	

	/**
	 * Create the panel.
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
		
		lblTituloDerecho = new JLabel("INGRESA DATOS DE [ ]");
		lblTituloDerecho.setForeground(new Color(227, 236, 233));
		lblTituloDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDerecho.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblTituloDerecho.setBounds(39, 58, 384, 28);
		panelDerecho.add(lblTituloDerecho);

	}

	public static JPanel getPanelDerecho() {
		return panelDerecho;
	}
	
	
}
