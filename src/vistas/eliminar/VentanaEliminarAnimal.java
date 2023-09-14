package vistas.eliminar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEliminarAnimal extends VentanaEliminarMenu {

	/**
	 * Crea el panel de la ventana de eliminar animal.
	 */
	public VentanaEliminarAnimal() {
		btnEliminar.setForeground(new Color(41, 56, 47));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = textFieldOpcionUsuario.getText();
				try {
					int n = Integer.parseInt(t);

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Ingresa un ID valido");
					textFieldOpcionUsuario.setText("");
				}
			}
		});
		textFieldOpcionUsuario.setEditable(true);
		textFieldOpcionUsuario.setEnabled(true);
		lblOpcionParaEliminar.setForeground(new Color(227, 236, 233));
		lblMenuEliminarTitulo.setForeground(new Color(227, 236, 233));
		panelSur.setBackground(new Color(138, 184, 168));
		panelNorte.setBackground(new Color(41, 56, 47));
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
						"ID", "Especie", "Num_de_jaula"
				}));
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		lblOpcionParaEliminar.setText("Eliminar por ID");
		lblMenuEliminarTitulo.setBounds(27, 34, 224, 33);
		lblMenuEliminarTitulo.setText("ELIMINAR ANIMAL");

	}

}
