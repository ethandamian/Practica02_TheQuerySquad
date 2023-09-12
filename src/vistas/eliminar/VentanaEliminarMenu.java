package vistas.eliminar;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

	/**
	 * Create the panel.
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
		textFieldOpcionUsuario.setFont(new Font("Roboto Condensed", Font.BOLD, 13));
		textFieldOpcionUsuario.setBounds(415, 54, 175, 28);
		panelNorte.add(textFieldOpcionUsuario);
		textFieldOpcionUsuario.setColumns(10);
		
		lblOpcionParaEliminar = new JLabel("Eliminar por [ ]");
		lblOpcionParaEliminar.setForeground(new Color(41, 56, 47));
		lblOpcionParaEliminar.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
		lblOpcionParaEliminar.setBounds(415, 11, 175, 46);
		panelNorte.add(lblOpcionParaEliminar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String t = textFieldOpcionUsuario.getText();
				try{
		            int n = Integer.parseInt(t);
		          
		        }
		        catch (NumberFormatException ex){
		        	JOptionPane.showMessageDialog(null, "Ingresa un ID valido");
		        	textFieldOpcionUsuario.setText("");
		        }
			}
		});
		btnEliminar.setForeground(new Color(41, 56, 47));
		btnEliminar.setFont(new Font("Roboto Condensed", Font.BOLD, 13));
		btnEliminar.setBounds(619, 54, 89, 25);
		panelNorte.add(btnEliminar);
		
		lblMenuEliminarTitulo = new JLabel("ELIMINAR [  ]");
		lblMenuEliminarTitulo.setFont(new Font("Roboto Condensed", Font.BOLD, 25));
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
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Colmuna1", "Columna2", "Columna3"
			}
		));
		scrollPane.setViewportView(table);

	}
}
