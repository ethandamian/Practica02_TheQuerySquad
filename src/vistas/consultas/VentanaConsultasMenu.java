package vistas.consultas;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vistas.FuenteProyecto;

/**
 * Clase de la ventana del menu de consultas
 */
public class VentanaConsultasMenu extends JPanel {
	
	private static final long serialVersionUID = 1L;
	protected JTextField textFieldInputUsuario;
	protected JPanel panelPrincipalMenu;
	protected JPanel panelNorte;
	protected JLabel lblTitulo;
	protected JLabel lblBusqueda;
	protected JButton btnBuscar;
	protected JPanel panelSur;
	protected String urlFuenteStringBold = "fuentes/RobotoCondensed-Bold.ttf";
	protected String urlFuenteStringPlain = "fuentes/RobotoCondensed-Regular.ttf";
	protected JButton btnEditar;

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

		btnEditar = new JButton("Editar");
		btnEditar.setForeground(new Color(0, 0, 255));
		btnEditar.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));
		btnEditar.setBounds(643, 67, 89, 23);
		panelNorte.add(btnEditar);
		btnEditar.setVisible(false);

		panelSur = new JPanel();
		panelSur.setBackground(new Color(138, 184, 168));
		panelSur.setBounds(0, 115, 777, 292);
		panelPrincipalMenu.add(panelSur);
		panelSur.setLayout(null);

	}

	/**
	 * Metodo para obtener el campo delinput del usuario
	 * @return
	 */
	public JTextField getTextFieldInputUsuario() {
		return textFieldInputUsuario;
	}

	/**
	 * Metodo para obtener el boton de buscar
	 * @return JButton
	 */
	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	/**
	 * Metodo paraasignar el boton para buscar
	 * @param btnBuscar
	 */
	public void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	/**
	 * Metodo para obtener el boton de editar
	 * @return JButton
	 */
	public JButton getBtnEditar() {
		return btnEditar;
	}

	/**
	 * Metodo para asignar el boton de editar
	 * @param btnEditar
	 */
	public void setBtnEditar(JButton btnEditar) {
		this.btnEditar = btnEditar;
	}

	/**
	 * Metodo para limpiar campos de texto
	 * @param textField
	 */
	protected static void limpiaCampos(JTextField textField) {
		textField.setText("");
	}
}
