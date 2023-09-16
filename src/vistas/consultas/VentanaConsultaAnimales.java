package vistas.consultas;

import javax.swing.JPanel;

import vistas.FuenteProyecto;
import vistas.editar.VentanaEditarAnimal;
import zoologico.ManipularAnimal;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import Clases.Animal;
import errores.ManejadorDeErrores;

/**
 * Clase de la ventana de consulta de animales
 */
public class VentanaConsultaAnimales extends VentanaConsultasMenu {
	private JLabel lblSexoValor;

	private VentanaEditarAnimal ventanaEditarAnimal;

	private JLabel lblNombreValor;

	private JLabel lblEspecieValor;

	private JLabel lblPesoValor;

	private JLabel lblAlturaValor;

	private JLabel lblNumeroDeJaulaValor;

	private JTextArea textAreaIndicacionesMedicas;
	
	private List<JLabel> listaJLabels;

	/**
	 * Crea el panel de la ventana consulta animales.
	 */
	public VentanaConsultaAnimales() {
		textFieldInputUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				char keyChar = e.getKeyChar();
				if (Character.isLetter(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa un numero", "Error", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("");
				ManipularAnimal manipularAnimal = new ManipularAnimal();
				
				Boolean bandera = true;
				String input = textFieldInputUsuario.getText();
				System.out.println(input);
				if (ManejadorDeErrores.validarJTextField(input)) {
					System.out.println("Limones4");
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"No puede ingresar carcteres especiales, espacios o  dejar vacio el campo", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				if (bandera) {
					System.out.println("Limones1");
					Animal animal	= manipularAnimal.leerAnimal(input);
					if(animal != null) {
						lblNombreValor.setText(animal.getNombre());
						lblAlturaValor.setText(String.valueOf(animal.getAlturaCm()) + "cm");
						lblEspecieValor.setText(animal.getEspecie());
						lblSexoValor.setText(animal.getSexo());
						lblPesoValor.setText(animal.getSexo());
						lblNumeroDeJaulaValor.setText(String.valueOf(animal.getNumJaula()));
						textAreaIndicacionesMedicas.setText(animal.getIndicacionesMedicas());
						
						btnEditar.setVisible(true);
						btnEditar.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								ventanaEditarAnimal.setVisible(true);
							}
						});
						
					}else {
						JOptionPane.showMessageDialog(null,
								"El id no ha sido encontrado, intentente de nuevo", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					
					
				
					
					

				}

			}
		});
		lblBusqueda.setForeground(new Color(232, 238, 236));
		lblTitulo.setForeground(new Color(232, 238, 236));
		panelSur.setBackground(new Color(92, 131, 116));

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(19, 47, 47));
		lblNombre.setBackground(new Color(19, 49, 49));
		lblNombre.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNombre.setBounds(43, 32, 126, 26);
		panelSur.add(lblNombre);

		lblNombreValor = new JLabel("  ");
		lblNombreValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 14));
		lblNombreValor.setBounds(43, 58, 126, 26);
		panelSur.add(lblNombreValor);

		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setForeground(new Color(19, 47, 47));
		lblEspecie.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecie.setBounds(43, 103, 126, 26);
		panelSur.add(lblEspecie);

		lblEspecieValor = new JLabel("  ");
		lblEspecieValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 14));
		lblEspecieValor.setBounds(43, 129, 126, 26);
		panelSur.add(lblEspecieValor);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(19, 47, 47));
		lblPeso.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblPeso.setBounds(43, 189, 126, 26);
		panelSur.add(lblPeso);

		lblPesoValor = new JLabel("  ");
		lblPesoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 14));
		lblPesoValor.setBounds(43, 215, 126, 26);
		panelSur.add(lblPesoValor);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setForeground(new Color(19, 47, 47));
		lblAltura.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblAltura.setBounds(179, 32, 126, 26);
		panelSur.add(lblAltura);

		lblAlturaValor = new JLabel("  ");
		lblAlturaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 14));
		lblAlturaValor.setBounds(179, 58, 126, 26);
		panelSur.add(lblAlturaValor);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setForeground(new Color(19, 47, 47));
		lblSexo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSexo.setBounds(179, 103, 126, 26);
		panelSur.add(lblSexo);

		lblSexoValor = new JLabel("  ");
		lblSexoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 14));
		lblSexoValor.setBounds(179, 129, 126, 26);
		panelSur.add(lblSexoValor);

		JLabel lblNumDeJaula = new JLabel("Numero de Jaula:");
		lblNumDeJaula.setForeground(new Color(19, 47, 47));
		lblNumDeJaula.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumDeJaula.setBounds(179, 189, 126, 26);
		panelSur.add(lblNumDeJaula);

		lblNumeroDeJaulaValor = new JLabel("  ");
		lblNumeroDeJaulaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 14));
		lblNumeroDeJaulaValor.setBounds(179, 215, 126, 26);
		panelSur.add(lblNumeroDeJaulaValor);

		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medica:");
		lblIndicacionesMedicas.setForeground(new Color(19, 47, 47));
		lblIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblIndicacionesMedicas.setBounds(347, 32, 152, 26);
		panelSur.add(lblIndicacionesMedicas);

		textAreaIndicacionesMedicas = new JTextArea();
		textAreaIndicacionesMedicas.setLineWrap(true);
		textAreaIndicacionesMedicas.setForeground(new Color(19, 47, 47));
		textAreaIndicacionesMedicas.setEnabled(false);
		textAreaIndicacionesMedicas.setEditable(false);
		textAreaIndicacionesMedicas.setBackground(new Color(92, 131, 116));
		textAreaIndicacionesMedicas.setBounds(347, 59, 251, 144);
		textAreaIndicacionesMedicas.setOpaque(true);
		panelSur.add(textAreaIndicacionesMedicas);
		panelNorte.setBackground(new Color(24, 61, 61));
		lblBusqueda.setText("Buscar por ID");
		lblTitulo.setBounds(38, 41, 294, 35);
		lblTitulo.setText("CONSULTAS DE ANIMALES");
		
		listaJLabels = Arrays.asList(lblNombreValor,lblAlturaValor,lblEspecieValor,lblNumeroDeJaulaValor,lblPesoValor,lblSexoValor);

	}
	
	/**
	 * Metodo para limpiar los campos de la ventana
	 */
	public void limpiarCampos() {
		textAreaIndicacionesMedicas.setText("");
		limpiaCampos(textFieldInputUsuario);
		limpiarCampos(listaJLabels);
	}
	
	/**
	 * Metodo para limpiar campos de lista
	 * @param listaCampos
	 */
	private void limpiarCampos(List<JLabel> listaCampos) {
		for (JLabel jLabel : listaCampos) {
			jLabel.setText("");
		}
	}

	
	
	/**
	 * Obtener la ventana de editar animal
	 * @return VentanaEditarAnimal
	 */
	public VentanaEditarAnimal getVentanaEditarAnimal() {
		return ventanaEditarAnimal;
	}

	/**
	 * Asignar la ventana para editar animal
	 * @param ventanaEditarAnimal
	 */
	public void setVentanaEditarAnimal(VentanaEditarAnimal ventanaEditarAnimal) {
		this.ventanaEditarAnimal = ventanaEditarAnimal;
	}

}
