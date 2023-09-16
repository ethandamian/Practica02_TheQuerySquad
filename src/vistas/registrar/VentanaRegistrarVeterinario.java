package vistas.registrar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Clases.Trabajador;
import Clases.Veterinario;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import zoologico.ManipularVeterinario;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Clase de la ventana para registrar veterinario
 */
public class VentanaRegistrarVeterinario extends JPanel {
	private String urlFuenteStringBold = "fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "fuentes/RobotoCondensed-Regular.ttf";

	private JTextField textFieldEspecialidad;
	private JTextField textFieldSalario;
	private JPanel panelPrincipal;

	private VentanaRegistrarTrabajador ventanaRegistrarTrabajador;

	private List<JTextField> listaTextFields;

	/**
	 * Crea el panel de la Ventana de registrar veterinario.
	 */
	public VentanaRegistrarVeterinario() {
		
		UIManager.put("TextField.caretForeground", Color.WHITE);
		setLayout(null);

		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(67, 83, 52));
		panelPrincipal.setBounds(0, 0, 464, 407);
		add(panelPrincipal);
		panelPrincipal.setLayout(null);

		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setForeground(new Color(227, 236, 233));
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecialidad.setBounds(38, 52, 122, 28);
		panelPrincipal.add(lblEspecialidad);

		textFieldEspecialidad = new JTextField();
		textFieldEspecialidad.setForeground(new Color(227, 236, 233));
		textFieldEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldEspecialidad.setColumns(10);
		textFieldEspecialidad.setBackground(new Color(67, 83, 52));
		textFieldEspecialidad.setBounds(38, 91, 136, 20);
		panelPrincipal.add(textFieldEspecialidad);
		textFieldEspecialidad.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 115, 136, 2);
		panelPrincipal.add(separator_1);

		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setForeground(new Color(227, 236, 233));
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSalario.setBounds(253, 58, 122, 28);
		panelPrincipal.add(lblSalario);

		textFieldSalario = new JTextField();
		textFieldSalario.setForeground(new Color(227, 236, 233));
		textFieldSalario.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		textFieldSalario.setColumns(10);
		textFieldSalario.setBackground(new Color(67, 83, 52));
		textFieldSalario.setBounds(253, 91, 136, 20);
		panelPrincipal.add(textFieldSalario);
		textFieldSalario.setBorder(javax.swing.BorderFactory.createEmptyBorder());

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(253, 115, 136, 2);
		panelPrincipal.add(separator_1_1);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				boolean bandera = true;
				try {
					float salario = Float.parseFloat(textFieldSalario.getText());
					

				} catch (NumberFormatException ex) {
					bandera = false;
					JOptionPane.showMessageDialog(null,	
							"No puede ingresar palabras en todos los campos donde se requieren numeros",
							"error", JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (ManejadorDeErrores.validarListaJtextFields(listaTextFields)) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"Los valores en los campos no pueden tener caracteres especiales o espacios", "Error",
							JOptionPane.ERROR_MESSAGE);
				} if(bandera){
					ManipularVeterinario manipularVeterinario = new ManipularVeterinario();
					
					
					String rfc = ventanaRegistrarTrabajador.getTextFieldRFC().getText();
					String nombreString = ventanaRegistrarTrabajador.getTextFieldNombre().getText();
					String apellidoMaterno = ventanaRegistrarTrabajador.getTextFieldApellidoMaterno().getText();
					String apellidoPaterno = ventanaRegistrarTrabajador.getTextFieldApellidoPaterno().getText();
					String calle = ventanaRegistrarTrabajador.getTextFieldCalle().getText();
					String numInterior = ventanaRegistrarTrabajador.getTextFieldNumInterior().getText();
					String numExterior = ventanaRegistrarTrabajador.getTextFieldNumExterior().getText();
					String colonia = ventanaRegistrarTrabajador.getTextFieldColonia().getText();
					String telUno = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldTelefonoUno().getText();
					String telDos = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldTelefonoDos().getText(); 
					String fechaInicioContrato = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldFechaInicioContrato().getText();
					String fechaFinContrato = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldFinContrato().getText();
					String fechaNacimiento = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldFechaNacimiento().getText();
					String emailUno = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldEmailUno().getText();
					String emailDos = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getTextFieldEmailDos().getText();
					String genero = ventanaRegistrarTrabajador.getVentanaRegistrarTrabajadorContinuacion().getComboBoxGenero().getSelectedItem().toString();
					String especialidad = textFieldEspecialidad.getText();
					float salario = Float.valueOf(textFieldSalario.getText());
					
					ArrayList<String> listaTelefonos = new ArrayList<String>();
					listaTelefonos.add(telUno);
					listaTelefonos.add(telDos);
					
					ArrayList<String> listaCorreos = new ArrayList<String>();
					listaCorreos.add(emailUno);
					listaCorreos.add(emailDos);
					
					Veterinario veterinario = new Veterinario(rfc, nombreString, apellidoPaterno, apellidoMaterno, genero,
							calle, numExterior, numInterior, colonia, genero, 
							fechaInicioContrato, fechaFinContrato, fechaNacimiento, 
							listaTelefonos, listaCorreos, especialidad, salario);
					
					Boolean insertaBoolean = manipularVeterinario.inserta(veterinario);
					
					if(insertaBoolean) {
						ventanaRegistrarTrabajador.limpiaCampos();
						JOptionPane.showMessageDialog(null, "registrado con exito", "Exito",JOptionPane.INFORMATION_MESSAGE);
						VentanaRegistrarTrabajador
						.changePrincipalPanel(ventanaRegistrarTrabajador.getPanelDerechoContenedor());
					}else {
						JOptionPane.showMessageDialog(null, "Error al registrar, intente de nuevo", "Error",JOptionPane.ERROR_MESSAGE);
					}
					
					
					
					
				}

			}
		});
		btnRegistrar.setBounds(305, 335, 84, 23);
		panelPrincipal.add(btnRegistrar);
		btnRegistrar.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 13));

		JLabel lblIngresaDatosDel = new JLabel("INGRESA DATOS DEL VETERINARIO");
		lblIngresaDatosDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaDatosDel.setForeground(new Color(227, 236, 233));
		lblIngresaDatosDel.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 25));
		lblIngresaDatosDel.setBounds(38, 11, 384, 28);
		panelPrincipal.add(lblIngresaDatosDel);

		listaTextFields = Arrays.asList(textFieldEspecialidad, textFieldSalario);

	}

	/**
	 * Metodo para crear el panel principal
	 * @return JPanel
	 */
	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	/**
	 * Metodo para obtener la ventana de registrar trabajador
	 * @param ventanaRegistrarTrabajador
	 */
	public void setVentanaRegistrarTrabajador(VentanaRegistrarTrabajador ventanaRegistrarTrabajador) {
		this.ventanaRegistrarTrabajador = ventanaRegistrarTrabajador;
	}

	/**
	 * Obtener la lista de campos de texto
	 * @return list JTextField
	 */
	public List<JTextField> getListaTextFields() {
		return listaTextFields;
	}

	/**
	 * Ontener el campo de Especialidad
	 * @return JTextField
	 */
	public JTextField getTextFieldEspecialidad() {
		return textFieldEspecialidad;
	}

	/**
	 * Obtener el campo de salario
	 * @return JTextField
	 */
	public JTextField getTextFieldSalario() {
		return textFieldSalario;
	}
	
	

}
