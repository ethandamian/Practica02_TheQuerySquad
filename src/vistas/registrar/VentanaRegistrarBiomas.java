package vistas.registrar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Clases.Bioma;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import zoologico.ManipularBioma;

import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 * Clase de la ventana para registrar biomas
 */
public class VentanaRegistrarBiomas extends VentanaRegistrarMenu {
	private JTextField textFieldNumJaulas;
	private JTextField textFieldNumCuidadores;
	private JTextField textFieldNumVeterinarios;
	private JTextField textFieldNumAnimales;
	
	private JComboBox<String> comboBoxServicios;
	private JComboBox<String> comboBoxTipoBioma;

	/**
	 * Crea el panel de la Ventana de registrar biomas.
	 */
	public VentanaRegistrarBiomas() {
		
		super();
		
		JLabel lblTituloDerecho = new JLabel("INGRESA DATOS DE [ ]");
		lblTituloDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDerecho.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		panelDerecho.add(lblTituloDerecho);
		lblTitulo.setForeground(new Color(18, 31, 37));
		lblTituloDerecho.setForeground(new Color(227, 236, 233));
		panelDerecho.setBounds(314, 0, 463, 407);
		lblTituloDerecho.setBounds(22, 38, 397, 28);
		lblTituloDerecho.setText("INGRESA DATOS DEL BIOMA");

		JLabel lblTipoDeBioma = new JLabel("Tipo de Bioma:");
		lblTipoDeBioma.setForeground(new Color(227, 236, 233));
		lblTipoDeBioma.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTipoDeBioma.setBounds(32, 86, 97, 28);
		panelDerecho.add(lblTipoDeBioma);

		JLabel lblNumJaulas = new JLabel("Numero de Jaulas:");
		lblNumJaulas.setForeground(new Color(227, 236, 233));
		lblNumJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumJaulas.setBounds(32, 167, 122, 28);
		panelDerecho.add(lblNumJaulas);

		textFieldNumJaulas = new JTextField();
		textFieldNumJaulas.setForeground(new Color(227, 236, 233));
		textFieldNumJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumJaulas.setColumns(10);
		textFieldNumJaulas.setBackground(new Color(67, 83, 52));
		textFieldNumJaulas.setBounds(32, 206, 136, 20);
		panelDerecho.add(textFieldNumJaulas);
		textFieldNumJaulas.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(32, 230, 136, 2);
		panelDerecho.add(separator_1);

		JLabel lblNumCuidadores = new JLabel("Numero de Cuidadores:");
		lblNumCuidadores.setForeground(new Color(227, 236, 233));
		lblNumCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumCuidadores.setBounds(32, 254, 147, 28);
		panelDerecho.add(lblNumCuidadores);

		textFieldNumCuidadores = new JTextField();
		textFieldNumCuidadores.setForeground(new Color(227, 236, 233));
		textFieldNumCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumCuidadores.setColumns(10);
		textFieldNumCuidadores.setBackground(new Color(67, 83, 52));
		textFieldNumCuidadores.setBounds(32, 293, 136, 20);
		panelDerecho.add(textFieldNumCuidadores);
		textFieldNumCuidadores.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(32, 318, 136, 2);
		panelDerecho.add(separator_2);

		JLabel lblNumVeterinarios = new JLabel("Numero de Veterinarios:");
		lblNumVeterinarios.setForeground(new Color(227, 236, 233));
		lblNumVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumVeterinarios.setBounds(225, 86, 149, 28);
		panelDerecho.add(lblNumVeterinarios);

		textFieldNumVeterinarios = new JTextField();
		textFieldNumVeterinarios.setForeground(new Color(227, 236, 233));
		textFieldNumVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumVeterinarios.setColumns(10);
		textFieldNumVeterinarios.setBackground(new Color(67, 83, 52));
		textFieldNumVeterinarios.setBounds(225, 125, 136, 20);
		panelDerecho.add(textFieldNumVeterinarios);
		textFieldNumVeterinarios.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(225, 148, 136, 2);
		panelDerecho.add(separator_3);

		JLabel lblNumeroDeAnimales = new JLabel("Numero de Animales:");
		lblNumeroDeAnimales.setForeground(new Color(227, 236, 233));
		lblNumeroDeAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeAnimales.setBounds(225, 167, 149, 28);
		panelDerecho.add(lblNumeroDeAnimales);

		textFieldNumAnimales = new JTextField();
		textFieldNumAnimales.setForeground(new Color(227, 236, 233));
		textFieldNumAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNumAnimales.setColumns(10);
		textFieldNumAnimales.setBackground(new Color(67, 83, 52));
		textFieldNumAnimales.setBounds(225, 206, 136, 20);
		panelDerecho.add(textFieldNumAnimales);
		textFieldNumAnimales.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(225, 230, 136, 2);
		panelDerecho.add(separator_4);

		JLabel lblServicios = new JLabel("Servicio a Visitantes:");
		lblServicios.setForeground(new Color(227, 236, 233));
		lblServicios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblServicios.setBounds(225, 254, 136, 28);
		panelDerecho.add(lblServicios);

		JButton buttonRegistrar = new JButton("Registrar");
		buttonRegistrar.setForeground(new Color(24, 61, 61));
		buttonRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean bandera = true;
				
				if (ManejadorDeErrores.validarListaJtextFields(listaTextFields)) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"Los valores en los campos no pueden tener caracteres especiales, tener espacios o estas sin valor",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				if (ManejadorDeErrores.validarListaComboBox(listaComboBoxs)) {
					bandera = false;
					JOptionPane.showMessageDialog(null, "Selecciona una opcion en 'Sexo' y 'Alimentacion'",
							"Error", JOptionPane.ERROR_MESSAGE);
				}

				String nVet = textFieldNumVeterinarios.getText();
				String nJaulas = textFieldNumJaulas.getText();
				String nAnimales = textFieldNumAnimales.getText();
				String nCuidadores = textFieldNumCuidadores.getText();

				try {
					int vet = Integer.parseInt(nVet);
					int jaulas = Integer.parseInt(nJaulas);
					int animales = Integer.parseInt(nAnimales);
					int cuidadores = Integer.parseInt(nCuidadores);

				} catch (NumberFormatException ex) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"No puede ingresar palabras en todos los campos donde se requieren numeros",
							"error", JOptionPane.ERROR_MESSAGE);
				}
				
				if(bandera) {
					ManipularBioma manipularBioma = new ManipularBioma();
					
					String tipo = comboBoxTipoBioma.getSelectedItem().toString();
					int numJaulas = Integer.valueOf(textFieldNumJaulas.getText());
					int numVets = Integer.valueOf(textFieldNumVeterinarios.getText());
					int numCuidadores = Integer.valueOf(textFieldNumCuidadores.getText());
					int numAnimales = Integer.valueOf(textFieldNumAnimales.getText());
					String servicio = comboBoxServicios.getSelectedItem().toString();
					
					Bioma bioma = new Bioma(tipo, servicio, numJaulas, numVets, numAnimales, numCuidadores);
					
					Boolean insertaBoolean = manipularBioma.inserta(bioma.toStringNoId());
					if(insertaBoolean) {
						limpiaCampos();
						JOptionPane.showMessageDialog(null, "registrado con exito", "Exito",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Error al registrar, intente de nuevo", "Error",JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		buttonRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonRegistrar.setBounds(149, 347, 117, 25);
		panelDerecho.add(buttonRegistrar);

		comboBoxServicios = new JComboBox<>();
		comboBoxServicios.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Baños", "Tiendas", "Comida" }));
		comboBoxServicios.setBackground(new Color(255, 255, 255));
		comboBoxServicios.setForeground(new Color(18, 31, 37));
		comboBoxServicios.setBounds(225, 292, 136, 22);
		panelDerecho.add(comboBoxServicios);
		comboBoxServicios.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		
		comboBoxTipoBioma = new JComboBox<String>();
		comboBoxTipoBioma.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Desierto", "Pastizales",
				"Franja Costera", "Tundra", "Aviario", "Bosque Templado", "Bosque Tropical" }));
		comboBoxTipoBioma.setBounds(31, 125, 137, 22);
		panelDerecho.add(comboBoxTipoBioma);
		comboBoxTipoBioma.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
	
		

		lblLogo.setIcon(new ImageIcon(VentanaRegistrarMenu.class.getResource("/imagenes/selva.png")));
		
		listaTextFields = Arrays.asList(textFieldNumAnimales,textFieldNumCuidadores,textFieldNumJaulas,textFieldNumVeterinarios);
		listaComboBoxs = Arrays.asList(comboBoxServicios,comboBoxTipoBioma);

	}
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 */
	public void limpiaCampos() {
		limpiarCampos(listaTextFields);
		
		limpiarComboBoxes(listaComboBoxs);
	}
}
