package vistas.consultas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class VentanaConsultasMenu extends JPanel {
	protected JTextField textFieldInputUsuario;
	protected JPanel panelPrincipalMenu;
	protected JPanel panelNorte;
	protected JLabel lblTitulo;
	protected JLabel lblBusqueda;
	protected JButton btnBuscar;
	protected JPanel panelSur;

	/**
	 * Create the panel.
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
		lblTitulo.setFont(new Font("Roboto Condensed", Font.BOLD, 25));
		lblTitulo.setBounds(38, 41, 215, 35);
		panelNorte.add(lblTitulo);
		
		lblBusqueda = new JLabel("Buscar por [ ]");
		lblBusqueda.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		lblBusqueda.setBounds(484, 28, 108, 28);
		panelNorte.add(lblBusqueda);
		
		textFieldInputUsuario = new JTextField();
		textFieldInputUsuario.setBounds(484, 64, 125, 28);
		panelNorte.add(textFieldInputUsuario);
		textFieldInputUsuario.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Roboto Condensed", Font.BOLD, 13));
		btnBuscar.setBounds(626, 67, 89, 23);
		panelNorte.add(btnBuscar);
		
		panelSur = new JPanel();
		panelSur.setBackground(new Color(138, 184, 168));
		panelSur.setBounds(0, 115, 777, 292);
		panelPrincipalMenu.add(panelSur);
		panelSur.setLayout(null);

	}

}