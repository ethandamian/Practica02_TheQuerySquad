package vistas;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.Map;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private final String urlFuenteString = "src/fuentes/RobotoCondensed-Bold.ttf";
	private JPanel panelPrincipal;
	
	private static JPanel panelCentral;
	private VentanaRegistro ventanaRegistro;
	private VentanaConsultas ventanaConsultas;


	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("VentanaPrincipal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	
		        if (JOptionPane.showConfirmDialog(contentPane, 
		            "¿Estás seguro que quieres salir del sistema?", "¿Cerrar ventana?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
		            System.exit(0);
		        }else {
		        	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		        }
		        
		    }
		});
		
		
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(24, 61, 61));
		panelPrincipal.setBounds(0, 0, 777, 454);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(new Color(4, 13, 18));
		header.setBounds(0, 0, 777, 48);
		panelPrincipal.add(header);
		header.setLayout(null);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setForeground(new Color(225, 234, 231));
		lblHome.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblHome.setBounds(21, 11, 49, 29);
		header.add(lblHome);
		
		JLabel lblRegistrar = new JLabel("Registrar");
		lblRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePrincipalPanel(ventanaRegistro);
				
			}
		});
		lblRegistrar.setForeground(new Color(225, 234, 231));
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblRegistrar.setBounds(550, 11, 62, 29);
		header.add(lblRegistrar);
		
		JLabel lblConsultar = new JLabel("Consultar");
		lblConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePrincipalPanel(ventanaConsultas);
			}
		});
		lblConsultar.setForeground(new Color(225, 234, 231));
		lblConsultar.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultar.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblConsultar.setBounds(622, 11, 62, 29);
		header.add(lblConsultar);
		
		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.setForeground(new Color(225, 234, 231));
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblEliminar.setBounds(694, 11, 62, 29);
		header.add(lblEliminar);
		
		panelCentral = new JPanel();
		panelCentral.setBackground(new Color(24, 61, 61));
		panelCentral.setBounds(0, 47, 777, 407);
		panelPrincipal.add(panelCentral);
		panelCentral.setLayout(null);
		
		JLabel lblLogo = new JLabel("   ");
		lblLogo.setBounds(169, 122, 421, 205);
		panelCentral.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/logo.png")));
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO! ");
		lblNewLabel.setForeground(new Color(225, 234, 231));
		lblNewLabel.setFont(FuenteProyecto.createFont(urlFuenteString, 40));
		lblNewLabel.setBounds(273, 63, 233, 32);
		panelCentral.add(lblNewLabel);
		
	}
	
	
	/**
	 * Subraya el texto de un JLabel cuando se le pasa por parametro "true"
	 * 
	 * @param labelAsButton El JLabel que va a ser subrayado
	 * @param underlineOnOf true Si se quiere subrayar el texto, false si no 
	 */
	private void setUnderline(JLabel labelAsButton, Boolean underlineOnOf) {
		Font fontUnderlined = labelAsButton.getFont();
		Map attribute = fontUnderlined.getAttributes();
		if (underlineOnOf) {
			attribute.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		} else {
			attribute.put(TextAttribute.UNDERLINE, -1);
		}

		labelAsButton.setFont(fontUnderlined.deriveFont(attribute));
	}
	
	/**
	 * Cambia el panelCentral cuando un menu es seleccionado en alguna parte de la aplicacion
	 * 
	 * @param panel El panel por el que se va a cambiar el panelPrincipal
	 */
	public static void changePrincipalPanel(JPanel panel) {
		panel.setSize(777, 407);
		panel.setLocation(0, 0);

		panelCentral.removeAll();
		panelCentral.add(panel, BorderLayout.CENTER);
		panelCentral.revalidate();
		panelCentral.repaint();
	}
	

	public VentanaMenu getVentanaRegistro() {
		return ventanaRegistro;
	}


	public void setVentanaRegistro(VentanaRegistro ventanaRegistro) {
		this.ventanaRegistro = ventanaRegistro;
	}


	public VentanaConsultas getVentanaConsultas() {
		return ventanaConsultas;
	}


	public void setVentanaConsultas(VentanaConsultas ventanaConsultas) {
		this.ventanaConsultas = ventanaConsultas;
	}
	
	


	
}
