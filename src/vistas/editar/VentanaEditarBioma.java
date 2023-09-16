package vistas.editar;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Clases.Animal;
import Clases.Bioma;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.consultas.VentanaConsultaBioma;
import zoologico.ManipularBioma;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase de la ventana para editar biomas
 */
public class VentanaEditarBioma extends VentanaEditarMenu {
	private JTextField textFieldNumJaulas;
	private JTextField textFieldNumCuidadores;
	private JTextField textFieldNumVeterinarios;
	private JTextField textFieldNumAnimales;
	private JComboBox<String> comboBoxServicios;
	private JComboBox<String> comboBoxTipoBioma;
	
	private String idString;
	
	
	private VentanaConsultaBioma ventanaConsultaBioma;
	private ManipularBioma manipularBioma = new ManipularBioma();

	

	/**
	 * Crea la ventana
	 */
	public VentanaEditarBioma() {
		setSize(576, 480);
		setResizable(false);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {

				if (JOptionPane.showConfirmDialog(panelPrincipal,
						"¿Estás seguro que quieres salir del sistema?", "¿Cerrar ventana?",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					dispose();
					ventanaConsultaBioma.getBtnEditar().setVisible(false);

				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});
		
		
		btnGuardar.setLocation(397, 397);
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Boolean bandera = true;

				String numJaula = textFieldNumJaulas.getText();
				String cuidadores = textFieldNumCuidadores.getText();
				String animales = textFieldNumAnimales.getText();
				String veterinario = textFieldNumVeterinarios.getText(); 

				try {
					int numeroJaulas = Integer.parseInt(numJaula);
					int numCuidadores = Integer.parseInt(cuidadores);
					int numAnimales = Integer.parseInt(animales);
					int numVets = Integer.parseInt(veterinario);

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,
							"No puede ingresar palabras en todos los campos donde se requieren numeros",
							"error", JOptionPane.ERROR_MESSAGE);
				}
				
				if (ManejadorDeErrores.validarListaJtextFields(listaFields)) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"Los valores en los campos no pueden tener caracteres especiales, tener espacios o estas sin valor",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (ManejadorDeErrores.validarListaComboBox(listaComboBoxs)) {
					bandera = false;
					JOptionPane.showMessageDialog(null, "Selecciona una opcion en 'Tipo de Bioma' y 'Servicios'",
							"Error", JOptionPane.ERROR_MESSAGE);
				}

				
				
				if(bandera) {
					String tipo = comboBoxTipoBioma.getSelectedItem().toString();
					int numJaulas = Integer.valueOf(textFieldNumJaulas.getText());
					int numCuidadores = Integer.valueOf(textFieldNumCuidadores.getText());
					int numVeterinarios = Integer.valueOf(textFieldNumVeterinarios.getText());
					int numAnimales = Integer.valueOf(textFieldNumAnimales.getText());
					String servicio = comboBoxServicios.getSelectedItem().toString();
					
					Bioma bioma = new Bioma(Integer.valueOf(idString),tipo,servicio,numJaulas,numVeterinarios,numAnimales,numCuidadores);
					
					if(manipularBioma.editar(bioma, idString)) {
						limpiaCampos();
						setVisible(false);
						JOptionPane.showMessageDialog(null, "Se ha editado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
					}
				}

			}
		});
		
		
		lblTituloMenu.setText("MENU EDITAR BIOMA");
		
		
		
		JLabel lblTipoDeBioma = new JLabel("Tipo de Bioma:");
		lblTipoDeBioma.setForeground(new Color(227, 236, 233));
		lblTipoDeBioma.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblTipoDeBioma.setBounds(39, 84, 97, 35);
		panelPrincipalContenido.add(lblTipoDeBioma);
		
		JLabel lblNumJaulas = new JLabel("Numero de Jaulas:");
		lblNumJaulas.setForeground(new Color(227, 236, 233));
		lblNumJaulas.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumJaulas.setBounds(39, 165, 122, 28);
		panelPrincipalContenido.add(lblNumJaulas);
		
		textFieldNumJaulas = new JTextField();
		textFieldNumJaulas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldNumJaulas.setForeground(new Color(227, 236, 233));
		textFieldNumJaulas.setFont(null);
		textFieldNumJaulas.setColumns(10);
		textFieldNumJaulas.setBackground(new Color(24, 61, 61));
		textFieldNumJaulas.setBounds(39, 204, 136, 20);
		panelPrincipalContenido.add(textFieldNumJaulas);
		textFieldNumJaulas.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 228, 136, 2);
		panelPrincipalContenido.add(separator_1);
		
		JLabel lblNumCuidadores = new JLabel("Numero de Cuidadores:");
		lblNumCuidadores.setForeground(new Color(227, 236, 233));
		lblNumCuidadores.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumCuidadores.setBounds(39, 252, 147, 28);
		panelPrincipalContenido.add(lblNumCuidadores);
		
		textFieldNumCuidadores = new JTextField();
		textFieldNumCuidadores.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldNumCuidadores.setForeground(new Color(227, 236, 233));
		textFieldNumCuidadores.setFont(null);
		textFieldNumCuidadores.setColumns(10);
		textFieldNumCuidadores.setBackground(new Color(24, 61, 61));
		textFieldNumCuidadores.setBounds(39, 291, 136, 20);
		panelPrincipalContenido.add(textFieldNumCuidadores);
		textFieldNumCuidadores.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(39, 316, 136, 2);
		panelPrincipalContenido.add(separator_2);
		
		JLabel lblNumVeterinarios = new JLabel("Numero de Veterinarios:");
		lblNumVeterinarios.setForeground(new Color(227, 236, 233));
		lblNumVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumVeterinarios.setBounds(232, 84, 149, 28);
		panelPrincipalContenido.add(lblNumVeterinarios);
		
		textFieldNumVeterinarios = new JTextField();
		textFieldNumVeterinarios.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldNumVeterinarios.setForeground(new Color(227, 236, 233));
		textFieldNumVeterinarios.setFont(null);
		textFieldNumVeterinarios.setColumns(10);
		textFieldNumVeterinarios.setBackground(new Color(24, 61, 61));
		textFieldNumVeterinarios.setBounds(232, 123, 136, 20);
		panelPrincipalContenido.add(textFieldNumVeterinarios);
		textFieldNumVeterinarios.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(232, 146, 136, 2);
		panelPrincipalContenido.add(separator_3);
		
		JLabel lblNumeroDeAnimales = new JLabel("Numero de Animales:");
		lblNumeroDeAnimales.setForeground(new Color(227, 236, 233));
		lblNumeroDeAnimales.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumeroDeAnimales.setBounds(232, 165, 149, 28);
		panelPrincipalContenido.add(lblNumeroDeAnimales);
		
		textFieldNumAnimales = new JTextField();
		textFieldNumAnimales.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldNumAnimales.setForeground(new Color(227, 236, 233));
		textFieldNumAnimales.setFont(null);
		textFieldNumAnimales.setColumns(10);
		textFieldNumAnimales.setBackground(new Color(24, 61, 61));
		textFieldNumAnimales.setBounds(232, 204, 136, 20);
		panelPrincipalContenido.add(textFieldNumAnimales);
		textFieldNumAnimales.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(232, 228, 136, 2);
		panelPrincipalContenido.add(separator_4);
		
		JLabel lblServicios = new JLabel("Servicio a Visitantes:");
		lblServicios.setForeground(new Color(227, 236, 233));
		lblServicios.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblServicios.setBounds(232, 252, 136, 28);
		panelPrincipalContenido.add(lblServicios);
		
		comboBoxServicios = new JComboBox<String>();
		comboBoxServicios.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Baños", "Tiendas", "Comida"}));
		comboBoxServicios.setForeground(new Color(18, 31, 37));
		comboBoxServicios.setBackground(new Color(255, 255, 255));
		comboBoxServicios.setBounds(232, 290, 136, 22);
		panelPrincipalContenido.add(comboBoxServicios);
		comboBoxServicios.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		
		comboBoxTipoBioma = new JComboBox<String>();
		comboBoxTipoBioma.setEditable(true);
		comboBoxTipoBioma.setBackground(new Color(255, 255, 255));
		comboBoxTipoBioma.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Desierto", "Pastizales", "Franja Costera", "Tundra", "Aviario", "Bosque Templado", "Bosque Tropical"}));
		comboBoxTipoBioma.setBounds(38, 123, 137, 22);
		panelPrincipalContenido.add(comboBoxTipoBioma);
		comboBoxTipoBioma.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		
		listaFields = Arrays.asList(textFieldNumAnimales,textFieldNumCuidadores,textFieldNumJaulas,textFieldNumVeterinarios);
		listaComboBoxs = Arrays.asList(comboBoxServicios,comboBoxTipoBioma);
		

	}
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 */
	public void limpiaCampos() {
		limpiarCampos(listaFields);
		limpiarComboBoxes(listaComboBoxs);
	}

	/**
	 * Metodo para obtener la ventana para consultar biomas
	 * @return ventanaConsultaBioma
	 */
	public VentanaConsultaBioma getVentanaConsultaBioma() {
		return ventanaConsultaBioma;
	}


	/**
	 * Metodo para asignar la ventana de consulta de biomas
	 * @param ventanaConsultaBioma
	 */
	public void setVentanaConsultaBioma(VentanaConsultaBioma ventanaConsultaBioma) {
		this.ventanaConsultaBioma = ventanaConsultaBioma;
	}
	
	/**
	 *  Metodo para llenar los campos en la ventana 
	 * @param id id pasado por la ventana de consulta
	 */
	public void llenarCampos(String id) {
		idString = id;
		Bioma bioma  = manipularBioma.leerBioma(id);
		
		comboBoxTipoBioma.setSelectedItem(bioma.getTipo());
		textFieldNumJaulas.setText(String.valueOf(bioma.getNumJaulaas()));
		textFieldNumCuidadores.setText(String.valueOf(bioma.getNumCuidadores()));
		textFieldNumVeterinarios.setText(String.valueOf(bioma.getNumVeterinarios()));
		textFieldNumAnimales.setText(String.valueOf(bioma.getNumAnimales()));
		comboBoxServicios.setSelectedItem(bioma.getServicio());
		
		
		
	}
	
	

}
