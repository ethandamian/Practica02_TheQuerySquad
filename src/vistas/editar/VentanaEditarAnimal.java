package vistas.editar;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.TextArea;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

import Clases.Animal;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.consultas.VentanaConsultaAnimales;
import zoologico.ManipularAnimal;

import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase de la ventana para editar animales
 */
public class VentanaEditarAnimal extends VentanaEditarMenu {
	private JTextField textFieldNombre;
	private JTextField textFieldEspecie;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	private JTextField textFieldNumJaula;
	private JComboBox<String> comboBoxSexo;
	private JComboBox<String> comboBoxAlimentacion;
	private JTextArea textAreaIndicacionesMedicas;
	
	private String leerId; 

	private VentanaConsultaAnimales ventanaConsultaAnimales;
	
	private ManipularAnimal manipularAnimal = new ManipularAnimal();

	/**
	 * Crea la ventana
	 */
	public VentanaEditarAnimal() {
		
		
		
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
					ventanaConsultaAnimales.getBtnEditar().setVisible(false);

				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});

		lblTituloMenu.setBounds(46, 26, 436, 58);
		lblTituloMenu.setText("MENU EDITAR ANIMAL");
		btnGuardar.setLocation(413, 397);
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Boolean bandera = true;
				String numJaula = textFieldNumJaula.getText();
				String peso = textFieldPeso.getText();
				String altura = textFieldAltura.getText();

				try {
					int numeroJaulas = Integer.parseInt(numJaula);
					float pesoA = Float.parseFloat(peso);
					float alturaA = Float.parseFloat(altura);
					
				} catch (NumberFormatException ex) {
					ex.printStackTrace();
					bandera = false;
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
					JOptionPane.showMessageDialog(null, "Selecciona una opcion en 'Sexo' y 'Alimentacion'",
							"Error", JOptionPane.ERROR_MESSAGE);
				}

				
				
				if(bandera) {
					String nombre = textFieldNombre.getText();
					String especie = textFieldEspecie.getText();
					float pesofloat = Float.valueOf(textFieldPeso.getText());
					System.out.println(peso);
					float alturaFloat = Float.valueOf(textFieldAltura.getText());
					String sexoString = comboBoxSexo.getSelectedItem().toString();
					int numJaulas = Integer.valueOf(textFieldNumJaula.getText());
					String alimentacion = comboBoxAlimentacion.getSelectedItem().toString();
					String indicacionesMedica = textAreaIndicacionesMedicas.getText();
 					
					
					Animal animal = new Animal(nombre,especie,pesofloat,alturaFloat,sexoString,
							numJaulas,alimentacion,indicacionesMedica,Integer.valueOf(leerId));
					if(manipularAnimal.editar(animal,leerId)) {
						limpiaCampos();
						setVisible(false);
						JOptionPane.showMessageDialog(null, "Se ha editado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
					}
				}

			}
		});

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(227, 236, 233));
		lblNombre.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNombre.setBounds(40, 74, 122, 28);
		panelPrincipalContenido.add(lblNombre);

		textFieldNombre = new JTextField();
		textFieldNombre.setForeground(new Color(227, 236, 233));
		textFieldNombre.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNombre.setColumns(10);
		textFieldNombre.setBackground(new Color(24, 61, 61));
		textFieldNombre.setBounds(40, 113, 136, 20);
		panelPrincipalContenido.add(textFieldNombre);
		textFieldNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 137, 136, 2);
		panelPrincipalContenido.add(separator_1);

		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(new Color(227, 236, 233));
		lblEspecie.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEspecie.setBounds(40, 150, 122, 28);
		panelPrincipalContenido.add(lblEspecie);

		textFieldEspecie = new JTextField();
		textFieldEspecie.setForeground(new Color(227, 236, 233));
		textFieldEspecie.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEspecie.setColumns(10);
		textFieldEspecie.setBackground(new Color(24, 61, 61));
		textFieldEspecie.setBounds(40, 183, 136, 20);
		panelPrincipalContenido.add(textFieldEspecie);
		textFieldEspecie.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(40, 207, 136, 2);
		panelPrincipalContenido.add(separator_1_1);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(227, 236, 233));
		lblPeso.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblPeso.setBounds(40, 220, 122, 28);
		panelPrincipalContenido.add(lblPeso);

		textFieldPeso = new JTextField();
		textFieldPeso.setForeground(new Color(227, 236, 233));
		textFieldPeso.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldPeso.setBackground(new Color(24, 61, 61));
		textFieldPeso.setBounds(40, 259, 136, 20);
		panelPrincipalContenido.add(textFieldPeso);
		textFieldPeso.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldPeso.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(40, 283, 136, 2);
		panelPrincipalContenido.add(separator_1_2);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(new Color(227, 236, 233));
		lblAltura.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblAltura.setBounds(40, 301, 122, 28);
		panelPrincipalContenido.add(lblAltura);
		

		textFieldAltura = new JTextField();
		textFieldAltura.setForeground(new Color(227, 236, 233));
		textFieldAltura.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldAltura.setColumns(10);
		textFieldAltura.setBackground(new Color(24, 61, 61));
		textFieldAltura.setBounds(40, 340, 136, 20);
		panelPrincipalContenido.add(textFieldAltura);
		textFieldAltura.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldAltura.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(40, 364, 136, 2);
		panelPrincipalContenido.add(separator_1_2_1);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(new Color(227, 236, 233));
		lblSexo.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblSexo.setBounds(223, 74, 122, 28);
		panelPrincipalContenido.add(lblSexo);

		JSeparator separator_1_2_2 = new JSeparator();
		separator_1_2_2.setBounds(223, 137, 136, 2);
		panelPrincipalContenido.add(separator_1_2_2);

		JLabel lblNumeroDeJaula = new JLabel("Numero de Jaula:");
		lblNumeroDeJaula.setForeground(new Color(227, 236, 233));
		lblNumeroDeJaula.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblNumeroDeJaula.setBounds(223, 150, 122, 28);
		panelPrincipalContenido.add(lblNumeroDeJaula);

		textFieldNumJaula = new JTextField();
		textFieldNumJaula.setForeground(new Color(227, 236, 233));
		textFieldNumJaula.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldNumJaula.setColumns(10);
		textFieldNumJaula.setBackground(new Color(24, 61, 61));
		textFieldNumJaula.setBounds(223, 183, 136, 20);
		panelPrincipalContenido.add(textFieldNumJaula);
		textFieldNumJaula.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textFieldNumJaula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		JLabel lblAlimentacion = new JLabel("Alimentacion:");
		lblAlimentacion.setForeground(new Color(227, 236, 233));
		lblAlimentacion.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblAlimentacion.setBounds(223, 220, 122, 28);
		panelPrincipalContenido.add(lblAlimentacion);

		JSeparator separator_1_2_4 = new JSeparator();
		separator_1_2_4.setBounds(223, 283, 136, 2);
		panelPrincipalContenido.add(separator_1_2_4);

		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medicas:");
		lblIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		lblIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblIndicacionesMedicas.setBounds(223, 301, 174, 28);
		panelPrincipalContenido.add(lblIndicacionesMedicas);

		comboBoxSexo = new JComboBox<String>();
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Macho", "Hembra" }));
		comboBoxSexo.setBounds(223, 112, 136, 22);
		panelPrincipalContenido.add(comboBoxSexo);
		comboBoxSexo.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));

		comboBoxAlimentacion = new JComboBox<String>();
		comboBoxAlimentacion
				.setModel(new DefaultComboBoxModel<String>(new String[] { "", "Carnivoro", "Herviboro", "Omnivoro" }));
		comboBoxAlimentacion.setBounds(223, 258, 136, 22);
		panelPrincipalContenido.add(comboBoxAlimentacion);
		comboBoxAlimentacion.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));

		textAreaIndicacionesMedicas = new JTextArea();
		textAreaIndicacionesMedicas.setWrapStyleWord(true);
		textAreaIndicacionesMedicas.setLineWrap(true);
		textAreaIndicacionesMedicas.setForeground(new Color(227, 236, 233));
		textAreaIndicacionesMedicas.setBackground(new Color(24, 61, 61));
		textAreaIndicacionesMedicas.setBounds(223, 338, 136, 82);
		panelPrincipalContenido.add(textAreaIndicacionesMedicas);
		textAreaIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textAreaIndicacionesMedicas.setCaretColor(Color.WHITE);
		Border border = BorderFactory.createLineBorder(Color.WHITE);
		textAreaIndicacionesMedicas.setBorder(BorderFactory.createCompoundBorder(border,
				BorderFactory.createEmptyBorder(10, 10, 10, 10)));


		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(223, 207, 136, 2);
		panelPrincipalContenido.add(separator_1_1_1);
		
		listaFields = Arrays.asList(textFieldAltura, textFieldEspecie, textFieldNombre, textFieldNumJaula,
				textFieldPeso);
		listaComboBoxs = Arrays.asList(comboBoxAlimentacion, comboBoxSexo);

	}
	
	/**
	 * MEtodo para limpiar campos de la ventana
	 */
	public void limpiaCampos() {
		textAreaIndicacionesMedicas.setText("");
		limpiarCampos(listaFields);
		limpiarComboBoxes(listaComboBoxs);
	}

	/**
	 * Obtener la ventana para consultar animales
	 * @return
	 */
	public VentanaConsultaAnimales getVentanaConsultaAnimales() {
		return ventanaConsultaAnimales;
	}

	/**
	 * Asignar la ventana para consultar animales
	 * @param ventanaConsultaAnimales
	 */
	public void setVentanaConsultaAnimales(VentanaConsultaAnimales ventanaConsultaAnimales) {
		this.ventanaConsultaAnimales = ventanaConsultaAnimales;
	}

	/**
	 *  Metodo para llenar los campos en la ventana 
	 * @param id id pasado por la ventana de consulta
	 */
	public void llenarCampos(String id) {
		leerId = id;
		System.out.println(leerId);
		Animal animal  = manipularAnimal.leerAnimal(id);
		
		textFieldNombre.setText(animal.getNombre());
		textFieldEspecie.setText(animal.getEspecie());
		textFieldPeso.setText(String.valueOf(animal.getPesoKg()));
		textFieldAltura.setText(String.valueOf(animal.getAlturaCm()));
		comboBoxSexo.setSelectedItem(animal.getSexo());
		textFieldNumJaula.setText(String.valueOf(animal.getNumJaula()));
		comboBoxAlimentacion.setSelectedItem(animal.getAlimentacion());
		textAreaIndicacionesMedicas.setText(animal.getIndicacionesMedicas());
		
	}
	
	
}
