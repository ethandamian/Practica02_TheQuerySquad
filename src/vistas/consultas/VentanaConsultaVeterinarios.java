package vistas.consultas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.editar.VentanaEditarVeterinario;

public class VentanaConsultaVeterinarios extends VentanaConsultaTrabajador {
	

	private VentanaEditarVeterinario ventanaEditarVeterinario;

	/**
	 * Crea el panel de la ventana consulta veterinarios.
	 */
	public VentanaConsultaVeterinarios() {
		super();

		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t = textFieldInputUsuario.getText();
				if (ManejadorDeErrores.validarJTextField(t)) {
					JOptionPane.showMessageDialog(null,
							"No puede ingresar carcteres especiales, espacios o  dejar vacio el campo", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				if (t.length() == 12 || t.length() == 13) {
					// TODO logica para consultar
				} else {
					JOptionPane.showMessageDialog(null, "Un RFC debe contener 12 o 13 caracteres", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				// TODO validacion para id
				if (true) {
					btnEditar.setVisible(true);
					btnEditar.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							ventanaEditarVeterinario.setVisible(true);
						}
					});
				}
			}

		});

		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setHorizontalAlignment(SwingConstants.LEFT);
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecialidad.setBounds(568, 73, 126, 26);
		panelSur.add(lblEspecialidad);

		JLabel lblEspecialidadValor = new JLabel("    ");
		lblEspecialidadValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEspecialidadValor.setBounds(568, 100, 126, 26);
		panelSur.add(lblEspecialidadValor);

		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setHorizontalAlignment(SwingConstants.LEFT);
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSalario.setBounds(568, 137, 126, 26);
		panelSur.add(lblSalario);

		JLabel lblSalarioValor = new JLabel("    ");
		lblSalarioValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblSalarioValor.setBounds(568, 164, 126, 26);
		panelSur.add(lblSalarioValor);

		JLabel lblColoniaValor = new JLabel("    ");
		lblColoniaValor.setFont(null);
		lblColoniaValor.setBounds(568, 201, 126, 26);
		panelSur.add(lblColoniaValor);
	}

	public VentanaEditarVeterinario getVentanaEditarVeterinario() {
		return ventanaEditarVeterinario;
	}

	public void setVentanaEditarVeterinario(VentanaEditarVeterinario ventanaEditarVeterinario) {
		this.ventanaEditarVeterinario = ventanaEditarVeterinario;
	}
	
	public void limpiarCampos() {
		limpiaCampos(textFieldInputUsuario);
	}

}
