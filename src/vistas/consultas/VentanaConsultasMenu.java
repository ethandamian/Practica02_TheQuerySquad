package vistas.consultas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vistas.FuenteProyecto;

public class VentanaConsultasMenu extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JTextField textFieldInputUsuario;
	protected JPanel panelPrincipalMenu;
	protected JPanel panelNorte;
	protected JLabel lblTitulo;
	protected JLabel lblBusqueda;
	protected JButton btnBuscar;
	protected JPanel panelSur;
	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";

	/**
	 * Crea el panel de la ventana consulta menu.
	 */
	public VentanaConsultasMenu() {
		setLayout(null);

		panelPrincipalMenu = new JPanel();
		panelPrincipalMenu.setBounds(0, 0, 777, 407);
		add(panelPrincipalMenu);
		panelPrincipalMenu.setLayout(null);

		panelNorte = new JPanel();
		panelNorte.setBackground(new Color(54, 83, 97));
		panelNorte.setBounds(0, 0, 777, 115);
		panelPrincipalMenu.add(panelNorte);
		panelNorte.setLayout(null);

		lblTitulo = new JLabel("CONSULTAS DE [ ]");
		lblTitulo.setForeground(new Color(18, 31, 27));
		lblTitulo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblTitulo.setBounds(38, 41, 215, 35);
		panelNorte.add(lblTitulo);

		lblBusqueda = new JLabel("Buscar por [ ]");
		lblBusqueda.setForeground(new Color(18, 31, 27));
		lblBusqueda.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 14));
		lblBusqueda.setBounds(384, 28, 108, 28);
		panelNorte.add(lblBusqueda);

		textFieldInputUsuario = new JTextField();
		textFieldInputUsuario.setBounds(384, 64, 125, 28);
		panelNorte.add(textFieldInputUsuario);
		textFieldInputUsuario.setColumns(10);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(18, 31, 27));
		btnBuscar.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));
		btnBuscar.setBounds(526, 67, 89, 23);
		panelNorte.add(btnBuscar);

		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setForeground(new Color(18, 31, 27));
		btnEditar.setFont(null);
		btnEditar.setBounds(657, 67, 89, 23);
		panelNorte.add(btnEditar);
		btnEditar.setVisible(false);
		
		panelSur = new JPanel();
		panelSur.setBackground(new Color(138, 184, 168));
		panelSur.setBounds(0, 115, 777, 292);
		panelPrincipalMenu.add(panelSur);
		panelSur.setLayout(null);

	}
}
