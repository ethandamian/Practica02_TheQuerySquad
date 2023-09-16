package vistas.consultas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import Clases.Veterinario;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.editar.VentanaEditarVeterinario;
import zoologico.ManipularVeterinario;

/**
 * Clase para la ventana de consulta de veterinarios
 */
public class VentanaConsultaVeterinarios extends VentanaConsultaTrabajador {
	

	private VentanaEditarVeterinario ventanaEditarVeterinario;
	private JLabel lblEspecialidadValor;
	private JLabel lblSalario;
	private JLabel lblSalarioValor;
	private static List<JLabel> listaJLabels;

	/**
	 * Crea el panel de la ventana consulta veterinarios.
	 */
	public VentanaConsultaVeterinarios() {
		super();

		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManipularVeterinario manipularVeterinario = new ManipularVeterinario();
				
				String input = textFieldInputUsuario.getText();
				if (ManejadorDeErrores.validarJTextField(input)) {
					
					JOptionPane.showMessageDialog(null,
							"No puede ingresar carcteres especiales, espacios o  dejar vacio el campo", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				if (input.length() == 12 || input.length() == 13) {
					Veterinario veterinario = manipularVeterinario.leerVeterinario(input);
					if(veterinario != null) {
						lblRFCValor.setText(veterinario.getRfc());
						lblNombreValor.setText(veterinario.getNombre());
						lblApellidoMaValor.setText(veterinario.getMaterno());
						lblApellidoPaValor.setText(veterinario.getPaterno());
						lblCalleValor.setText(veterinario.getCalle());
						lblNumInteriorValor.setText(String.valueOf(veterinario.getNumInterior()));
						lblNumeroExteriorValor.setText(String.valueOf(veterinario.getNumExterior()));
						lblColoniaValor.setText(veterinario.getColonia());
						lblTelefonosValor.setText(veterinario.getTelefonos().toString());
						lblEstadoValor.setText(veterinario.getEstado());
						lblFechaNacimientoValor.setText(veterinario.getNacimiento());
						lblEmailValor.setText(veterinario.getCorreos().toString());
						lblInicioContratoValor.setText(veterinario.getInicioContrato());
						lblFinContratoValor.setText(veterinario.getFinContrato());
						lblGeneroValor.setText(veterinario.getGenero());
						lblEspecialidadValor.setText(veterinario.getEspecialidad());
						lblSalarioValor.setText(String.valueOf(veterinario.getSalario()));
						
						
						
						
						
						btnEditar.setVisible(true);
						btnEditar.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								ventanaEditarVeterinario.setVisible(true);
							}
						});
					}else {
						JOptionPane.showMessageDialog(null,
								"El id no ha sido encontrado, intentente de nuevo", "Error",
								JOptionPane.ERROR_MESSAGE);
						
					}
				} else {
					JOptionPane.showMessageDialog(null, "Un RFC debe contener 12 o 13 caracteres", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
			}

		});

		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecialidad.setBounds(568, 137, 126, 26);
		panelSur.add(lblEspecialidad);

		lblEspecialidadValor = new JLabel("    ");
		lblEspecialidadValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEspecialidadValor.setBounds(568, 164, 126, 26);
		panelSur.add(lblEspecialidadValor);

		lblSalario = new JLabel("Salario:");
		lblSalario.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSalario.setBounds(568, 201, 126, 26);
		panelSur.add(lblSalario);

		lblSalarioValor = new JLabel("    ");
		lblSalarioValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblSalarioValor.setBounds(568, 228, 126, 26);
		panelSur.add(lblSalarioValor);
		
		listaJLabels = Arrays.asList(lblEspecialidadValor,lblSalarioValor);
	}

	/**
	 * Obtener la ventana para editar veterinarios
	 * @return VentanaEditarVeterinario
	 */
	public VentanaEditarVeterinario getVentanaEditarVeterinario() {
		return ventanaEditarVeterinario;
	}

	/**
	 * Asignar la ventana de editar veterinario
	 * @param ventanaEditarVeterinario
	 */
	public void setVentanaEditarVeterinario(VentanaEditarVeterinario ventanaEditarVeterinario) {
		this.ventanaEditarVeterinario = ventanaEditarVeterinario;
	}
	
	/**
	 * Metodo para limpiar todos los campos de la ventana
	 */
	public void limpiarTodosLosCampos() {
		limpiarCampos();
		btnEditar.setVisible(false);
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
	
	
}
