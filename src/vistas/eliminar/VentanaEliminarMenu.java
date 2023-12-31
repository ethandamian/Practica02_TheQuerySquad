package vistas.eliminar;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vistas.FuenteProyecto;

import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase de la ventana eliminar Menu
 */
public class VentanaEliminarMenu extends JPanel {
	protected JTextField textFieldOpcionUsuario;
	protected JTable table;
	protected JPanel panelEliminar;
	protected JPanel panelNorte;
	protected JLabel lblOpcionParaEliminar;
	protected JButton btnEliminar;
	protected JLabel lblMenuEliminarTitulo;
	protected JPanel panelSur;
	protected JScrollPane scrollPane;
	
	protected String urlFuenteStringBold = "fuentes/RobotoCondensed-Bold.ttf";
	protected String urlFuenteStringPlain = "fuentes/RobotoCondensed-Regular.ttf";

	/**
	 * Crea el panel de la ventana de eliminar menu.
	 */
	public VentanaEliminarMenu() {
		setLayout(null);

		panelEliminar = new JPanel();
		panelEliminar.setBounds(0, 0, 777, 407);
		add(panelEliminar);
		panelEliminar.setLayout(null);

		panelNorte = new JPanel();
		panelNorte.setBackground(new Color(166, 187, 141));
		panelNorte.setBounds(0, 0, 777, 105);
		panelEliminar.add(panelNorte);
		panelNorte.setLayout(null);

		textFieldOpcionUsuario = new JTextField();
		textFieldOpcionUsuario.setEnabled(false);
		textFieldOpcionUsuario.setEditable(false);
		textFieldOpcionUsuario.setForeground(new Color(32, 43, 36));
		textFieldOpcionUsuario.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldOpcionUsuario.setBounds(415, 54, 175, 28);
		panelNorte.add(textFieldOpcionUsuario);
		textFieldOpcionUsuario.setColumns(10);

		lblOpcionParaEliminar = new JLabel("Eliminar por [ ]");
		lblOpcionParaEliminar.setForeground(new Color(41, 56, 47));
		lblOpcionParaEliminar.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 16));
		lblOpcionParaEliminar.setBounds(415, 11, 175, 46);
		panelNorte.add(lblOpcionParaEliminar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(41, 56, 47));
		btnEliminar.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));
		btnEliminar.setBounds(619, 54, 89, 25);
		panelNorte.add(btnEliminar);

		lblMenuEliminarTitulo = new JLabel("ELIMINAR [  ]");
		lblMenuEliminarTitulo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblMenuEliminarTitulo.setBounds(27, 34, 186, 33);
		panelNorte.add(lblMenuEliminarTitulo);

		panelSur = new JPanel();
		panelSur.setBackground(new Color(97, 135, 110));
		panelSur.setBounds(0, 104, 777, 303);
		panelEliminar.add(panelSur);
		panelSur.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 32, 694, 240);
		panelSur.add(scrollPane);

		table = new JTable();
		table.setEnabled(false);
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
				},
				new String[] {
						"Colmuna1", "Columna2", "Columna3"
				}));
		scrollPane.setViewportView(table);

	}
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 * @param textField
	 */
	protected void limpiaCampos(JTextField textField) {
		textField.setText("");
	}
}
