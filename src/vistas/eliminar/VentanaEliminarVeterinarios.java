package vistas.eliminar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.Animal;
import Clases.Veterinario;
import errores.ManejadorDeErrores;
import zoologico.ManipularVeterinario;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * Clase de la ventana para eliminar veterinarios
 */
public class VentanaEliminarVeterinarios extends VentanaEliminarMenu {
	
	private ManipularVeterinario manipularVeterinario = new ManipularVeterinario();
	/**
	 * Crea el panel de la ventana de eliminar veterinario.
	 */
	public VentanaEliminarVeterinarios() {
		
		llenarTabla();
		textFieldOpcionUsuario.setEditable(true);
		textFieldOpcionUsuario.setEnabled(true);
		
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Boolean bandera = true; 
				String input = textFieldOpcionUsuario.getText();

				if (ManejadorDeErrores.validarJTextField(input)) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"No puede ingresar caracteres especiales, espacios o  dejar vacio el campo", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				if (input.length() == 12 || input.length() == 13 && bandera) {
					if(manipularVeterinario.eliminar(input)) {
						JOptionPane.showMessageDialog(null,
								"Elemento eliminado", "Eliminado",
								JOptionPane.INFORMATION_MESSAGE);
						llenarTabla();
					}else {
						JOptionPane.showMessageDialog(null,
								"El id no ha sido encontrado, intentente de nuevo", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Ingresa un RFC valido");
					textFieldOpcionUsuario.setText("");
				}
			}
		});
		
		
		lblMenuEliminarTitulo.setBounds(27, 34, 262, 33);
		lblMenuEliminarTitulo.setText("ELIMINAR VETERINARIO");
		lblOpcionParaEliminar.setText("Eliminar por RFC");
		table.getColumnModel().getColumn(1).setPreferredWidth(120);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);

	}
	
	/**
	 * Metodo que llena toda la tabla de la ventana con los elementos en los archivos .csv
	 */
	private void llenarTabla() {
		
		
		List<Veterinario> listaVets = manipularVeterinario.devolverListaVeterinariosEnArchivo();
		DefaultTableModel mDefaultTableModel = new DefaultTableModel(new String[] {"RFC", "Nombre_Veterinario", "Especializacion"},listaVets.size());
		table.setModel(mDefaultTableModel);
		
		TableModel tModel = table.getModel();
		
		for(int i = 0; i < listaVets.size(); i++) {
			Veterinario veterinario = listaVets.get(i);
			tModel.setValueAt(veterinario.getRfc(), i, 0);
			tModel.setValueAt(veterinario.getNombre(), i,1);
			tModel.setValueAt(veterinario.getEspecialidad(), i,2);
		}
		
		
	}
	
	/**
	 * Metodo para limpiar campos de la ventana
	 */
	public void limpiarCampos() {
		limpiaCampos(textFieldOpcionUsuario);
	}

}
