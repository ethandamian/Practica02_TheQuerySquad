package vistas.consultas;

import javax.swing.table.DefaultTableModel;

import vistas.FuenteProyecto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.SwingConstants;
import java.awt.Color;

public class VentanaConsultaTrabajador extends VentanaConsultasMenu {
	protected JLabel lblEmailValor;
	protected JLabel lblRFC;
	protected JLabel lblNombreValor;
	protected JLabel lblNombre;
	protected JLabel lblApellidoMaValor;
	protected JLabel lblApellidoMaterno;
	protected JLabel lblApellidoPaValor;
	protected JLabel lblApellidoPaterno;
	protected JLabel lblCalleValor;
	protected JLabel lblCalle;
	protected JLabel lblNumInteriorValor;
	protected JLabel lblNumeroInterior;
	protected JLabel lblNumeroExteriorValor;
	protected JLabel lblNumeroExterior;
	protected JLabel lblFechaNacimientoValor;
	protected JLabel lblFechaNacimiento;
	protected JLabel lblEmail;
	protected JLabel lblInicioContratoValor;
	protected JLabel lblIncioContrato;
	protected JLabel lblGeneroValor;
	protected JLabel lblGenero;
	
	private JLabel lblColonia;
	private JLabel lblColoniaValor;
	private JLabel lblEstado;
	private JLabel lblEstadoValor;

	/**
	 * Crea el panel de la ventana consulta trabajador.
	 */
	public VentanaConsultaTrabajador() {
		textFieldInputUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				char keyChar = e.getKeyChar();
				if (Character.isLowerCase(keyChar)) {
					JOptionPane.showMessageDialog(null, "Ingresa el RFC en mayusculas", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		lblTitulo.setForeground(new Color(18, 31, 37));
		lblBusqueda.setText("Buscar por RFC");
		lblTitulo.setBounds(38, 41, 339, 35);
		lblTitulo.setText("CONSULTAS DE VETERINARIOS");

		lblRFC = new JLabel("RFC:");
		lblRFC.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblRFC.setBounds(34, 11, 126, 26);
		panelSur.add(lblRFC);

		JLabel lblRFCValor = new JLabel("  ");
		lblRFCValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblRFCValor.setBounds(34, 37, 126, 26);
		panelSur.add(lblRFCValor);

		lblNombreValor = new JLabel("  ");
		lblNombreValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNombreValor.setBounds(34, 100, 126, 26);
		panelSur.add(lblNombreValor);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNombre.setBounds(34, 74, 126, 26);
		panelSur.add(lblNombre);

		lblApellidoMaValor = new JLabel("  ");
		lblApellidoMaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblApellidoMaValor.setBounds(34, 164, 126, 26);
		panelSur.add(lblApellidoMaValor);

		lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblApellidoMaterno.setBounds(34, 137, 126, 26);
		panelSur.add(lblApellidoMaterno);

		lblApellidoPaValor = new JLabel("   ");
		lblApellidoPaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblApellidoPaValor.setBounds(34, 227, 126, 26);
		panelSur.add(lblApellidoPaValor);

		lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblApellidoPaterno.setBounds(34, 201, 126, 26);
		panelSur.add(lblApellidoPaterno);

		lblCalleValor = new JLabel("  ");
		lblCalleValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblCalleValor.setBounds(202, 37, 169, 26);
		panelSur.add(lblCalleValor);

		lblCalle = new JLabel("Calle:");
		lblCalle.setHorizontalAlignment(SwingConstants.LEFT);
		lblCalle.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblCalle.setBounds(202, 11, 126, 26);
		panelSur.add(lblCalle);

		lblNumInteriorValor = new JLabel("   ");
		lblNumInteriorValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumInteriorValor.setBounds(202, 100, 126, 26);
		panelSur.add(lblNumInteriorValor);

		lblNumeroInterior = new JLabel("Numero interior:");
		lblNumeroInterior.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroInterior.setBounds(202, 74, 126, 26);
		panelSur.add(lblNumeroInterior);

		lblNumeroExteriorValor = new JLabel("   ");
		lblNumeroExteriorValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroExteriorValor.setBounds(202, 164, 126, 26);
		panelSur.add(lblNumeroExteriorValor);

		lblNumeroExterior = new JLabel("Numero Exterior:");
		lblNumeroExterior.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroExterior.setBounds(202, 137, 126, 26);
		panelSur.add(lblNumeroExterior);

		lblFechaNacimientoValor = new JLabel("   ");
		lblFechaNacimientoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblFechaNacimientoValor.setBounds(382, 101, 126, 26);
		panelSur.add(lblFechaNacimientoValor);

		lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblFechaNacimiento.setBounds(382, 74, 138, 26);
		panelSur.add(lblFechaNacimiento);

		lblEmailValor = new JLabel("    ");
		lblEmailValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEmailValor.setBounds(382, 164, 126, 26);
		panelSur.add(lblEmailValor);

		lblEmail = new JLabel("Email:");
		lblEmail.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEmail.setBounds(382, 137, 126, 26);
		panelSur.add(lblEmail);

		lblInicioContratoValor = new JLabel("    ");
		lblInicioContratoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblInicioContratoValor.setBounds(382, 227, 126, 26);
		panelSur.add(lblInicioContratoValor);

		lblIncioContrato = new JLabel("Inicio de Contrato:");
		lblIncioContrato.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncioContrato.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblIncioContrato.setBounds(382, 200, 126, 26);
		panelSur.add(lblIncioContrato);

		lblGeneroValor = new JLabel("   ");
		lblGeneroValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblGeneroValor.setBounds(568, 38, 126, 26);
		panelSur.add(lblGeneroValor);

		lblGenero = new JLabel("Genero:");
		lblGenero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenero.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblGenero.setBounds(568, 11, 126, 26);
		panelSur.add(lblGenero);

		lblColonia = new JLabel("Colonia:");
		lblColonia.setHorizontalAlignment(SwingConstants.LEFT);
		lblColonia.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblColonia.setBounds(202, 201, 126, 26);
		panelSur.add(lblColonia);

		lblColoniaValor = new JLabel("    ");
		lblColoniaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblColoniaValor.setBounds(202, 228, 126, 26);
		panelSur.add(lblColoniaValor);

		lblEstado = new JLabel("Estado:");
		lblEstado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEstado.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEstado.setBounds(382, 11, 126, 26);
		panelSur.add(lblEstado);

		lblEstadoValor = new JLabel("    ");
		lblEstadoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEstadoValor.setBounds(382, 38, 126, 26);
		panelSur.add(lblEstadoValor);
	}

}
