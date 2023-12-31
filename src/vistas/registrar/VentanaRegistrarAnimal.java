package vistas.registrar;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Clases.Animal;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import zoologico.ManipularAnimal;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Clase de la ventana para registrar animal
 */
public class VentanaRegistrarAnimal extends VentanaRegistrarMenu {
	private JTextField textFieldNombre;
	private JTextField textFieldEspecie;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	private JTextField textFieldNumeroJaula;

	
	private JComboBox<String> comboBoxSexo;
	private JComboBox<String> comboBoxAlimentacion;
	private JTextField textFieldIndicacionesMedicas;

	/**
	 * Crea el panel de la Ventana de registrar animal.
	 */
	public VentanaRegistrarAnimal() {
		JLabel lblTituloDerecho = new JLabel("INGRESA DATOS DE [ ]");
		lblTituloDerecho.setForeground(new Color(227, 236, 233));
		lblTituloDerecho.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloDerecho.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblTituloDerecho.setBounds(39, 58, 384, 28);
		panelDerecho.add(lblTituloDerecho);
		
		lblTituloDerecho.setLocation(45, 11);
		lblLogo.setIcon(new ImageIcon(VentanaRegistrarAnimal.class.getResource("/imagenes/zoo.png")));

		lblTituloDerecho.setText("INGRESA DATOS DEL ANIMAL");

		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setForeground(new Color(227, 236, 233));
		lblNombre_1.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNombre_1.setBounds(72, 50, 122, 28);
		panelDerecho.add(lblNombre_1);

		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(227, 236, 233));
		textFieldNombre.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBackground(new Color(67, 83, 52));
		textFieldNombre.setBounds(72, 89, 136, 20);
		panelDerecho.add(textFieldNombre);
		textFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(72, 113, 136, 2);
		panelDerecho.add(separator_1);

		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(new Color(227, 236, 233));
		lblEspecie.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecie.setBounds(72, 126, 122, 28);
		panelDerecho.add(lblEspecie);

		textFieldEspecie = new JTextField();
		textFieldEspecie.setForeground(new Color(227, 236, 233));
		textFieldEspecie.setFont(null);
		textFieldEspecie.setColumns(10);
		textFieldEspecie.setBackground(new Color(67, 83, 52));
		textFieldEspecie.setBounds(72, 159, 136, 20);
		panelDerecho.add(textFieldEspecie);
		textFieldEspecie.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(72, 183, 136, 2);
		panelDerecho.add(separator_1_1);

		JLabel lblPeso = new JLabel("Peso(en kg):");
		lblPeso.setForeground(new Color(227, 236, 233));
		lblPeso.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblPeso.setBounds(72, 196, 122, 28);
		panelDerecho.add(lblPeso);

		textFieldPeso = new JTextField();
		textFieldPeso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					textFieldPeso.setText("");
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldPeso.setForeground(new Color(227, 236, 233));
		textFieldPeso.setFont(null);
		textFieldPeso.setColumns(10);
		textFieldPeso.setBackground(new Color(67, 83, 52));
		textFieldPeso.setBounds(72, 235, 136, 20);
		panelDerecho.add(textFieldPeso);
		textFieldPeso.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(72, 259, 136, 2);
		panelDerecho.add(separator_1_2);

		JLabel lblAltura = new JLabel("Altura(en cm):");
		lblAltura.setForeground(new Color(227, 236, 233));
		lblAltura.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblAltura.setBounds(72, 277, 122, 28);
		panelDerecho.add(lblAltura);

		textFieldAltura = new JTextField();
		textFieldAltura.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					textFieldAltura.setText("");
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textFieldAltura.setForeground(new Color(227, 236, 233));
		textFieldAltura.setFont(null);
		textFieldAltura.setColumns(10);
		textFieldAltura.setBackground(new Color(67, 83, 52));
		textFieldAltura.setBounds(72, 316, 136, 20);
		panelDerecho.add(textFieldAltura);
		textFieldAltura.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(72, 340, 136, 2);
		panelDerecho.add(separator_1_2_1);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(new Color(227, 236, 233));
		lblSexo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSexo.setBounds(255, 50, 122, 28);
		panelDerecho.add(lblSexo);

		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(255, 113, 136, 2);
		panelDerecho.add(separator_1_2_2);

		JLabel lblNumeroDeJaula = new JLabel("Numero de Jaula:");
		lblNumeroDeJaula.setForeground(new Color(227, 236, 233));
		lblNumeroDeJaula.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeJaula.setBounds(255, 126, 122, 28);
		panelDerecho.add(lblNumeroDeJaula);

		textFieldNumeroJaula = new JTextField();
		textFieldNumeroJaula.setForeground(new Color(227, 236, 233));
		textFieldNumeroJaula.setFont(null);
		textFieldNumeroJaula.setColumns(10);
		textFieldNumeroJaula.setBackground(new Color(67, 83, 52));
		textFieldNumeroJaula.setBounds(255, 165, 136, 20);
		panelDerecho.add(textFieldNumeroJaula);
		textFieldNumeroJaula.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_2_3 = new JSeparator();
		separator_1_2_3.setBounds(255, 189, 136, 2);
		panelDerecho.add(separator_1_2_3);

		JLabel lblAlimentacion = new JLabel("Alimentacion:");
		lblAlimentacion.setForeground(new Color(227, 236, 233));
		lblAlimentacion.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblAlimentacion.setBounds(255, 196, 122, 28);
		panelDerecho.add(lblAlimentacion);

		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(255, 259, 136, 2);
		panelDerecho.add(separator_1_2_4);

		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medicas:");
		lblIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		lblIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblIndicacionesMedicas.setBounds(255, 277, 174, 28);
		panelDerecho.add(lblIndicacionesMedicas);
		
		textFieldIndicacionesMedicas = new JTextField();
		textFieldIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		textFieldIndicacionesMedicas.setFont(null);
		textFieldIndicacionesMedicas.setColumns(10);
		textFieldIndicacionesMedicas.setBackground(new Color(67, 83, 52));
		textFieldIndicacionesMedicas.setBounds(255, 316, 136, 20);
		panelDerecho.add(textFieldIndicacionesMedicas);
		textFieldIndicacionesMedicas.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		
		JSeparator separator_1_2_1_1 = new JSeparator();
		separator_1_2_1_1.setBounds(255, 340, 136, 2);
		panelDerecho.add(separator_1_2_1_1);


		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Boolean bandera = true;
				String numJaula = textFieldNumeroJaula.getText();
				String peso = textFieldPeso.getText();
				String altura = textFieldAltura.getText();

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

				try {
					int numeroJaulas = Integer.parseInt(numJaula);
					int pesoA = Integer.parseInt(peso);
					int alturaA = Integer.parseInt(altura);

				} catch (NumberFormatException ex) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"No puede ingresar palabras en todos los campos donde se requieren numeros",
							"error", JOptionPane.ERROR_MESSAGE);
				}
				
				if(bandera) {
					ManipularAnimal manipularAnimal = new ManipularAnimal();
					String nombre = textFieldNombre.getText();
					String especie = textFieldEspecie.getText();
					float pesofloat = Float.valueOf(textFieldPeso.getText());
					float alturaFloat = Float.valueOf(textFieldAltura.getText());
					String sexoString = comboBoxSexo.getSelectedItem().toString();
					int numJaulas = Integer.valueOf(textFieldNumeroJaula.getText());
					String alimentacion = comboBoxAlimentacion.getSelectedItem().toString();
					String indicacionesMedica = textFieldIndicacionesMedicas.getText();
 					
					
					Animal animal = new Animal(nombre,especie,pesofloat,alturaFloat,sexoString,
							numJaulas,alimentacion,indicacionesMedica);
					if(manipularAnimal.inserta(animal)) {
						limpiaCampos();
						JOptionPane.showMessageDialog(null, "Se ha registrado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
					}
				}

			}
		});
		btnRegistrar.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));
		btnRegistrar.setBounds(72, 353, 104, 23);
		panelDerecho.add(btnRegistrar);

		comboBoxSexo = new JComboBox<>();
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Macho", "Hembra" }));
		comboBoxSexo.setBounds(255, 88, 136, 22);
		panelDerecho.add(comboBoxSexo);

		comboBoxSexo.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));

		comboBoxAlimentacion = new JComboBox<>();
		comboBoxAlimentacion
				.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Carnivoro", "Herviboro", "Omnivoro" }));
		comboBoxAlimentacion.setBounds(255, 234, 136, 22);
		panelDerecho.add(comboBoxAlimentacion);
		comboBoxAlimentacion.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));

		listaTextFields = Arrays.asList(textFieldAltura, textFieldEspecie, textFieldNombre, textFieldNumeroJaula,
				textFieldPeso);
		listaComboBoxs = Arrays.asList(comboBoxAlimentacion, comboBoxSexo);
		
		
	}
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 */
	public void limpiaCampos() {
		textFieldIndicacionesMedicas.setText("");
		limpiarCampos(listaTextFields);
		
		limpiarComboBoxes(listaComboBoxs);
	}
}
