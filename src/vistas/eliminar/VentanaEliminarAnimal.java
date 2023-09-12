package vistas.eliminar;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class VentanaEliminarAnimal extends VentanaEliminarMenu{
	
	public VentanaEliminarAnimal() {
		textFieldOpcionUsuario.setEditable(true);
		textFieldOpcionUsuario.setEnabled(true);
		lblOpcionParaEliminar.setForeground(new Color(227, 236, 233));
		lblMenuEliminarTitulo.setForeground(new Color(227, 236, 233));
		panelSur.setBackground(new Color(138, 184, 168));
		panelNorte.setBackground(new Color(41, 56, 47));
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
				"ID", "Especie", "Num_de_jaula"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		lblOpcionParaEliminar.setText("Eliminar por ID");
		lblMenuEliminarTitulo.setBounds(27, 34, 224, 33);
		lblMenuEliminarTitulo.setText("ELIMINAR ANIMAL");
		
	}

}
