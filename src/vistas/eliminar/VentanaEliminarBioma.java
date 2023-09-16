package vistas.eliminar;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.Animal;
import Clases.Bioma;
import errores.ManejadorDeErrores;
import zoologico.ManipularAnimal;
import zoologico.ManipularBioma;

import java.awt.Color;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

/**
 * Clase para la ventana de eliminar bioma
 */
public class VentanaEliminarBioma extends VentanaEliminarMenu {
	private ManipularBioma manipularBioma = new ManipularBioma();

	/**
	 * Crea el panel de la ventana de eliminar bioma.
	 */
	public VentanaEliminarBioma() {
		llenarTabla();
		
		textFieldOpcionUsuario.setEditable(true);
		textFieldOpcionUsuario.setEnabled(true);
		
		textFieldOpcionUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					textFieldOpcionUsuario.setText("");
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		
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
				
				if(bandera) {
					if(manipularBioma.eliminar(input)) {
						JOptionPane.showMessageDialog(null,
								"Elemento eliminado", "Eliminado",
								JOptionPane.INFORMATION_MESSAGE);
						llenarTabla();
					}else {
						JOptionPane.showMessageDialog(null,
								"El id no ha sido encontrado, intentente de nuevo", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		panelSur.setBackground(new Color(24, 61, 61));
		panelNorte.setBackground(new Color(147, 177, 166));
	
		lblOpcionParaEliminar.setText("Eliminar por ID del Bioma");
		lblMenuEliminarTitulo.setText("ELIMINAR BIOMA");

	}
	
	/**
	 * Metodo que llena toda la tabla de la ventana con los elementos en los archivos .csv
	 */
	private void llenarTabla() {
		
		
		List<Bioma> listaBiomas = manipularBioma.devolverListaBiomasEnArchivo();
		DefaultTableModel mDefaultTableModel = new DefaultTableModel(new String[] {"ID", "Tipo", "Num_jaulas"},listaBiomas.size());
		table.setModel(mDefaultTableModel);
		
		TableModel tModel = table.getModel();
		
		for(int i = 0; i < listaBiomas.size(); i++) {
			Bioma bioma = listaBiomas.get(i);
			tModel.setValueAt(bioma.getId(), i, 0);
			tModel.setValueAt(bioma.getTipo(), i,1);
			tModel.setValueAt(bioma.getNumJaulaas(), i,2);
		}
		
		
	}
	/**
	 * Metodo para limpiar campos de la ventana
	 */
	public void limpiarCampos() {
		limpiaCampos(textFieldOpcionUsuario);
	}
}
