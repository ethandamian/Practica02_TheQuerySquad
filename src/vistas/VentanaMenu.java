package vistas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaMenu extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel panelMenu;
	protected JComponent panelMenuOpciones;
	protected JComponent btnOpcionUno;
	protected JLabel lblOpcionUno;
	protected JPanel btnOpcion2;
	protected JLabel lblOpcionDos;
	protected JPanel btnOpcion3;
	protected JComponent panelDescripcion;
	protected JLabel lblTituloMenu;
	protected String descripcion;
	protected JLabel lblNewLabel;
	protected String descripcionDos;
	protected JLabel lblNewLabel_1;
	protected JLabel lblOpcionTres;

	/**
	 * Create the panel.
	 */
	public VentanaMenu() {
		setLayout(null);
		
		panelMenu = new JPanel();
		panelMenu.setBounds(0, 0, 777, 407);
		add(panelMenu);
		panelMenu.setLayout(null);
		
		panelMenuOpciones = new JPanel();
		panelMenuOpciones.setBackground(new Color(67, 83, 52));
		panelMenuOpciones.setBounds(0, 0, 292, 407);
		panelMenu.add(panelMenuOpciones);
		panelMenuOpciones.setLayout(null);
		
		btnOpcionUno = new JPanel();
		btnOpcionUno.setBackground(new Color(67, 83, 52));
		btnOpcionUno.setBounds(0, 117, 292, 50);
		panelMenuOpciones.add(btnOpcionUno);
		btnOpcionUno.setLayout(null);
		
		lblOpcionUno = new JLabel("   Opcion 1");
		lblOpcionUno.setForeground(new Color(225, 234, 231));
		lblOpcionUno.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		lblOpcionUno.setBounds(22, 0, 260, 50);
		btnOpcionUno.add(lblOpcionUno);
		
		btnOpcion2 = new JPanel();
		btnOpcion2.setLayout(null);
		btnOpcion2.setBackground(new Color(67, 83, 52));
		btnOpcion2.setBounds(0, 166, 292, 50);
		panelMenuOpciones.add(btnOpcion2);
		
		lblOpcionDos = new JLabel("   Opcion 2");
		lblOpcionDos.setForeground(new Color(225, 234, 231));
		lblOpcionDos.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		lblOpcionDos.setBounds(20, 0, 262, 50);
		btnOpcion2.add(lblOpcionDos);
		
		btnOpcion3 = new JPanel();
		btnOpcion3.setForeground(new Color(147, 177, 166));
		btnOpcion3.setLayout(null);
		btnOpcion3.setBackground(new Color(67, 83, 52));
		btnOpcion3.setBounds(0, 216, 292, 50);
		panelMenuOpciones.add(btnOpcion3);
		
		lblOpcionTres = new JLabel("   Opcion 3");
		lblOpcionTres.setForeground(new Color(225, 234, 231));
		lblOpcionTres.setFont(new Font("Roboto Condensed", Font.BOLD, 14));
		lblOpcionTres.setBounds(22, 0, 260, 50);
		btnOpcion3.add(lblOpcionTres);
		
		panelDescripcion = new JPanel();
		panelDescripcion.setBackground(new Color(158, 179, 132));
		panelDescripcion.setBounds(291, 0, 486, 407);
		panelMenu.add(panelDescripcion);
		panelDescripcion.setLayout(null);
		
		lblTituloMenu = new JLabel("TITULO MENU");
		lblTituloMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMenu.setForeground(new Color(15, 36, 36));
		lblTituloMenu.setFont(new Font("Roboto Condensed", Font.BOLD, 30));
		lblTituloMenu.setBounds(65, 75, 365, 36);
		panelDescripcion.add(lblTituloMenu);
		

		descripcion = "<html><body>DESCRIPCION 1</body></html>";
		lblNewLabel = new JLabel(descripcion);
		lblNewLabel.setForeground(new Color(24, 61, 61));
		lblNewLabel.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		lblNewLabel.setBounds(65, 142, 354, 51);
		panelDescripcion.add(lblNewLabel);
		
		descripcionDos = "<html><body>DESCRIPCION2</body></html>";
		lblNewLabel_1 = new JLabel(descripcionDos);
		lblNewLabel_1.setForeground(new Color(24, 61, 61));
		lblNewLabel_1.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		lblNewLabel_1.setBounds(65, 209, 354, 68);
		panelDescripcion.add(lblNewLabel_1);

	}
}
