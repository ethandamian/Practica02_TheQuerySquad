package vistas.eliminar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Clases.Animal;
import errores.ManejadorDeErrores;
import zoologico.ManipularAnimal;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase de la ventana para eliminar animales
 */
public class VentanaEliminarAnimal extends VentanaEliminarMenu {

	private ManipularAnimal manipularAnimal = new ManipularAnimal();
	/**
	 * Crea el panel de la ventana de eliminar animal.
	 */
	public VentanaEliminarAnimal() {
		
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
					if(manipularAnimal.eliminar(input)) {
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
		llenarTabla();
		
		btnEliminar.setForeground(new Color(41, 56, 47));
		
		textFieldOpcionUsuario.setEditable(true);
		textFieldOpcionUsuario.setEnabled(true);
		lblOpcionParaEliminar.setForeground(new Color(227, 236, 233));
		lblMenuEliminarTitulo.setForeground(new Color(227, 236, 233));
		panelSur.setBackground(new Color(138, 184, 168));
		panelNorte.setBackground(new Color(41, 56, 47));
		
		table.getColumnModel().getColumn(1).setPreferredWidth(83);
		lblOpcionParaEliminar.setText("Eliminar por ID");
		lblMenuEliminarTitulo.setBounds(27, 34, 224, 33);
		lblMenuEliminarTitulo.setText("ELIMINAR ANIMAL");

	}
	
	/**
	 * Metodo que llena toda la tabla de la ventana con los elementos en los archivos .csv
	 */
	private void llenarTabla() {
		
		
		List<Animal> listaAnimales = manipularAnimal.devolverListaAnimalesEnArchivo();
		DefaultTableModel mDefaultTableModel = new DefaultTableModel(new String[] {"ID", "Especie", "Num_jaula"},listaAnimales.size());
		table.setModel(mDefaultTableModel);
		
		TableModel tModel = table.getModel();
		
		for(int i = 0; i < listaAnimales.size(); i++) {
			Animal animal = listaAnimales.get(i);
			tModel.setValueAt(animal.getId(), i, 0);
			tModel.setValueAt(animal.getEspecie(), i,1);
			tModel.setValueAt(animal.getNumJaula(), i,2);
		}
		
		
	}

	/**
	 * Metodo para limpiar campos de la ventana
	 */
	public void limpiarCampos() {
		limpiaCampos(textFieldOpcionUsuario);
	}

}
