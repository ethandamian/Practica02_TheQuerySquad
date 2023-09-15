package vistas.eliminar;

import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class VentanaEliminarBioma extends VentanaEliminarMenu {

	/**
	 * Crea el panel de la ventana de eliminar bioma.
	 */
	public VentanaEliminarBioma() {
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t = textFieldOpcionUsuario.getText();
				try {
					int n = Integer.parseInt(t);

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Ingresa un ID valido");
					textFieldOpcionUsuario.setText("");
				}
			}
		});
		panelSur.setBackground(new Color(24, 61, 61));
		panelNorte.setBackground(new Color(147, 177, 166));
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
						"Id_bioma", "Tipo ", "Num_jaulas"
				}));
		lblOpcionParaEliminar.setText("Eliminar por ID del Bioma");
		lblMenuEliminarTitulo.setText("ELIMINAR BIOMA");

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
	public void limpiarCampos() {
		limpiaCampos(textFieldOpcionUsuario);
	}
}
