package vistas.editar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import vistas.FuenteProyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class VentanaEditarMenu extends JFrame {

	private JPanel contentPane;
	protected static JPanel panelPrincipal;
	protected JPanel panelPrincipalContenido;
	protected JLabel lblTituloMenu;
	protected JButton btnGuardar;
	protected String urlFuenteBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	protected String urlFuentePlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	
	protected List<JTextField> listaFields;
	protected List<JComboBox<String>> listaComboBoxs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEditarMenu frame = new VentanaEditarMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaEditarMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 921, 443);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		panelPrincipalContenido = new JPanel();
		panelPrincipalContenido.setBackground(new Color(24, 61, 61));
		panelPrincipalContenido.setBounds(0, 0, 921, 443);
		panelPrincipal.add(panelPrincipalContenido);
		panelPrincipalContenido.setLayout(null);
		
		lblTituloMenu = new JLabel("MENU EDITAR [ ]");
		lblTituloMenu.setForeground(new Color(227, 236, 233));
		lblTituloMenu.setFont(FuenteProyecto.createFont("src/fuentes/RobotoCondensed-Bold.ttf", 35));
		lblTituloMenu.setBounds(46, 26, 273, 58);
		panelPrincipalContenido.add(lblTituloMenu);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(new Color(41, 56, 47));
		btnGuardar.setFont(FuenteProyecto.createFont("src/fuentes/RobotoCondensed-Bold.ttf", 13));
		btnGuardar.setBounds(716, 387, 110, 23);
		panelPrincipalContenido.add(btnGuardar);
	}
	
	public static void changePrincipalPanel(JPanel panel) {
		panel.setSize(886, 443);
		panel.setLocation(0, 0);

		panelPrincipal.removeAll();
		panelPrincipal.add(panel, BorderLayout.CENTER);
		panelPrincipal.revalidate();
		panelPrincipal.repaint();
	}
}
