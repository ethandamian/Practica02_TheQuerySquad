package vistas.eliminar;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class VentanaEliminarBioma extends VentanaEliminarMenu{
	
	public VentanaEliminarBioma() {
		panelSur.setBackground(new Color(24, 61, 61));
		panelNorte.setBackground(new Color(147, 177, 166));
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
				"Id_bioma", "Tipo ", "Num_jaulas"
			}
		));
		lblOpcionParaEliminar.setText("Eliminar por ID del Bioma");
		lblMenuEliminarTitulo.setText("ELIMINAR BIOMA");
		
	}

}
