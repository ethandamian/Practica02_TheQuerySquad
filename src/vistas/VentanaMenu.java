package vistas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	protected JPanel btnOpcionDos;
	protected JLabel lblOpcionDos;
	protected JPanel btnOpcionTres;
	protected JComponent panelDescripcion;
	protected JLabel lblTituloMenu;
	protected String descripcion;
	protected JLabel lblNewLabel;
	protected String descripcionDos;
	protected JLabel lblNewLabel_1;
	protected JLabel lblOpcionTres;
	private String urlFuenteString = "src/fuentes/RobotoCondensed-Bold.ttf";

	/**
	 * Crea el panel de la ventana de menu.
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
		btnOpcionUno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOpcionUno.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		btnOpcionUno.setBackground(new Color(67, 83, 52));
		btnOpcionUno.setBounds(0, 117, 292, 50);
		panelMenuOpciones.add(btnOpcionUno);
		btnOpcionUno.setLayout(null);

		lblOpcionUno = new JLabel("   Opcion 1");
		lblOpcionUno.setForeground(new Color(225, 234, 231));
		lblOpcionUno.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblOpcionUno.setBounds(22, 0, 260, 50);
		btnOpcionUno.add(lblOpcionUno);

		btnOpcionDos = new JPanel();
		btnOpcionDos.setLayout(null);
		btnOpcionDos.setBackground(new Color(67, 83, 52));
		btnOpcionDos.setBounds(0, 166, 292, 50);
		panelMenuOpciones.add(btnOpcionDos);
		btnOpcionDos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOpcionDos.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		lblOpcionDos = new JLabel("   Opcion 2");
		lblOpcionDos.setForeground(new Color(225, 234, 231));
		lblOpcionDos.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblOpcionDos.setBounds(20, 0, 262, 50);
		btnOpcionDos.add(lblOpcionDos);

		btnOpcionTres = new JPanel();
		btnOpcionTres.setForeground(new Color(147, 177, 166));
		btnOpcionTres.setLayout(null);
		btnOpcionTres.setBackground(new Color(67, 83, 52));
		btnOpcionTres.setBounds(0, 216, 292, 50);
		panelMenuOpciones.add(btnOpcionTres);

		btnOpcionTres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnOpcionTres.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});

		lblOpcionTres = new JLabel("   Opcion 3");
		lblOpcionTres.setForeground(new Color(225, 234, 231));
		lblOpcionTres.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblOpcionTres.setBounds(22, 0, 260, 50);
		btnOpcionTres.add(lblOpcionTres);

		panelDescripcion = new JPanel();
		panelDescripcion.setBackground(new Color(158, 179, 132));
		panelDescripcion.setBounds(291, 0, 486, 407);
		panelMenu.add(panelDescripcion);
		panelDescripcion.setLayout(null);

		lblTituloMenu = new JLabel("TITULO MENU");
		lblTituloMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMenu.setForeground(new Color(15, 36, 36));
		lblTituloMenu.setFont(FuenteProyecto.createFont(urlFuenteString, 30));
		lblTituloMenu.setBounds(65, 75, 365, 36);
		panelDescripcion.add(lblTituloMenu);

		descripcion = "<html><body>DESCRIPCION 1</body></html>";
		lblNewLabel = new JLabel(descripcion);
		lblNewLabel.setForeground(new Color(24, 61, 61));
		lblNewLabel.setFont(FuenteProyecto.createFont(urlFuenteString, 18));
		lblNewLabel.setBounds(65, 142, 354, 51);
		panelDescripcion.add(lblNewLabel);

		descripcionDos = "<html><body>DESCRIPCION2</body></html>";
		lblNewLabel_1 = new JLabel(descripcionDos);
		lblNewLabel_1.setForeground(new Color(24, 61, 61));
		lblNewLabel_1.setFont(FuenteProyecto.createFont(urlFuenteString, 18));
		lblNewLabel_1.setBounds(65, 209, 354, 68);
		panelDescripcion.add(lblNewLabel_1);

	}

}
