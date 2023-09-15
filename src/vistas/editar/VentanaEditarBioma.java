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

import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.consultas.VentanaConsultaBioma;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaEditarBioma extends VentanaEditarMenu {
	private JTextField textFieldNumJaulas;
	private JTextField textFieldNumCuidadores;
	private JTextField textFieldNumVeterinarios;
	private JTextField textFieldNumAnimales;
	private JComboBox<String> comboBoxServicios;
	private JComboBox<String> comboBoxTipoBioma;
	
	
	private VentanaConsultaBioma ventanaConsultaBioma;

	

	/**
	 * Create the panel.
	 */
	public VentanaEditarBioma() {
		setSize(576, 480);
		setResizable(false);
		
		btnGuardar.setLocation(397, 397);
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String numJaula = textFieldNumJaulas.getText();
				String cuidadores = textFieldNumCuidadores.getText();
				String animales = textFieldNumAnimales.getText();
				String veterinario = textFieldNumVeterinarios.getText(); 

				if (ManejadorDeErrores.validarListaJtextFields(listaFields)) {
					JOptionPane.showMessageDialog(null,
							"Los valores en los campos no pueden tener caracteres especiales, tener espacios o estas sin valor",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (ManejadorDeErrores.validarListaComboBox(listaComboBoxs)) {
					JOptionPane.showMessageDialog(null, "Selecciona una opcion en 'Tipo de Bioma' y 'Servicios'",
							"Error", JOptionPane.ERROR_MESSAGE);
				}

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
		comboBoxServicios.setBackground(new Color(67, 83, 52));
		comboBoxServicios.setBounds(232, 290, 136, 22);
		panelPrincipalContenido.add(comboBoxServicios);
		comboBoxServicios.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		
		comboBoxTipoBioma = new JComboBox<String>();
		comboBoxTipoBioma.setModel(new DefaultComboBoxModel<String>(new String[] {"", "Desierto", "Pastizales", "Franja Costera", "Tundra", "Aviario", "Bosque Templado", "Bosque Tropical"}));
		comboBoxTipoBioma.setBounds(38, 123, 137, 22);
		panelPrincipalContenido.add(comboBoxTipoBioma);
		comboBoxTipoBioma.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		
		listaFields = Arrays.asList(textFieldNumAnimales,textFieldNumCuidadores,textFieldNumJaulas,textFieldNumVeterinarios);
		listaComboBoxs = Arrays.asList(comboBoxServicios,comboBoxTipoBioma);
		

	}
	public void limpiaCampos() {
		limpiarCampos(listaFields);
		limpiarComboBoxes(listaComboBoxs);
	}


	public VentanaConsultaBioma getVentanaConsultaBioma() {
		return ventanaConsultaBioma;
	}



	public void setVentanaConsultaBioma(VentanaConsultaBioma ventanaConsultaBioma) {
		this.ventanaConsultaBioma = ventanaConsultaBioma;
	}
	
	

}
