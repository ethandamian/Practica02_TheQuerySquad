package vistas.eliminar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaEliminarsVeterinarios extends VentanaEliminarMenu {

	/**
	 * Crea el panel de la ventana de eliminar veterinarios.
	 */
	public VentanaEliminarsVeterinarios() {
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t = textFieldOpcionUsuario.getText();
				if (t.length() == 12 || t.length() == 13) {

				} else {
					JOptionPane.showMessageDialog(null, "Ingresa un RFC valido");
					textFieldOpcionUsuario.setText("");
				}
			}
		});
		lblMenuEliminarTitulo.setBounds(27, 34, 262, 33);
		lblMenuEliminarTitulo.setText("ELIMINAR VETERINARIO");
		lblOpcionParaEliminar.setText("Eliminar por RFC");
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
						"RFC", "Nombre Veteriniario", "Especializacion"
				}));
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);

	}

}
