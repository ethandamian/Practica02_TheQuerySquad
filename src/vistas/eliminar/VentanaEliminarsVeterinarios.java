package vistas.eliminar;
import javax.swing.table.DefaultTableModel;

public class VentanaEliminarsVeterinarios extends VentanaEliminarMenu{
	
	public VentanaEliminarsVeterinarios() {
		lblMenuEliminarTitulo.setBounds(27, 34, 262, 33);
		lblMenuEliminarTitulo.setText("ELIMINAR VETERINARIO");
		lblOpcionParaEliminar.setText("Eliminar por RFC");
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
				"RFC", "Nombre Veteriniario", "Especializacion"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		
	}

}
