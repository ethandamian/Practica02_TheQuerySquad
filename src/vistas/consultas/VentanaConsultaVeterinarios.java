package vistas.consultas;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VentanaConsultaVeterinarios extends VentanaConsultasMenu{
	private JLabel lblEmailValor;
	public VentanaConsultaVeterinarios() {
		lblBusqueda.setText("Buscar por RFC");
		lblTitulo.setBounds(38, 41, 339, 35);
		lblTitulo.setText("CONSULTAS DE VETERINARIOS");
		
		JLabel lblRFC = new JLabel("RFC:");
		lblRFC.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblRFC.setBounds(34, 11, 126, 26);
		panelSur.add(lblRFC);
		
		JLabel lblRFCValor = new JLabel("  ");
		lblRFCValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblRFCValor.setBounds(34, 37, 126, 26);
		panelSur.add(lblRFCValor);
		
		JLabel lblNombreValor = new JLabel("  ");
		lblNombreValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblNombreValor.setBounds(34, 100, 126, 26);
		panelSur.add(lblNombreValor);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblNombre.setBounds(34, 74, 126, 26);
		panelSur.add(lblNombre);
		
		JLabel lblApellidoMaValor = new JLabel("  ");
		lblApellidoMaValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblApellidoMaValor.setBounds(34, 164, 126, 26);
		panelSur.add(lblApellidoMaValor);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		lblApellidoMaterno.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblApellidoMaterno.setBounds(34, 137, 126, 26);
		panelSur.add(lblApellidoMaterno);
		
		JLabel lblApellidoPaValor = new JLabel("   ");
		lblApellidoPaValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblApellidoPaValor.setBounds(34, 227, 126, 26);
		panelSur.add(lblApellidoPaValor);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		lblApellidoPaterno.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblApellidoPaterno.setBounds(34, 201, 126, 26);
		panelSur.add(lblApellidoPaterno);
		
		JLabel lblCalleValor = new JLabel("  ");
		lblCalleValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblCalleValor.setBounds(202, 37, 169, 26);
		panelSur.add(lblCalleValor);
		
		JLabel lblCalle = new JLabel("Calle:");
		lblCalle.setHorizontalAlignment(SwingConstants.LEFT);
		lblCalle.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblCalle.setBounds(202, 11, 126, 26);
		panelSur.add(lblCalle);
		
		JLabel lblNumInteriorValor = new JLabel("   ");
		lblNumInteriorValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblNumInteriorValor.setBounds(202, 100, 126, 26);
		panelSur.add(lblNumInteriorValor);
		
		JLabel lblNumeroInterior = new JLabel("Numero interior:");
		lblNumeroInterior.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblNumeroInterior.setBounds(202, 74, 126, 26);
		panelSur.add(lblNumeroInterior);
		
		JLabel lblNumeroExteriorValor = new JLabel("   ");
		lblNumeroExteriorValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblNumeroExteriorValor.setBounds(202, 164, 126, 26);
		panelSur.add(lblNumeroExteriorValor);
		
		JLabel lblNumeroExterior = new JLabel("Numero Exterior:");
		lblNumeroExterior.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblNumeroExterior.setBounds(202, 137, 126, 26);
		panelSur.add(lblNumeroExterior);
		
		JLabel lblFechaNacimientoValor = new JLabel("   ");
		lblFechaNacimientoValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblFechaNacimientoValor.setBounds(202, 228, 126, 26);
		panelSur.add(lblFechaNacimientoValor);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblFechaNacimiento.setBounds(202, 201, 138, 26);
		panelSur.add(lblFechaNacimiento);
		
		lblEmailValor = new JLabel("    ");
		lblEmailValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblEmailValor.setBounds(392, 38, 126, 26);
		panelSur.add(lblEmailValor);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblEmail.setBounds(392, 11, 126, 26);
		panelSur.add(lblEmail);
		
		JLabel lblInicioContratoValor = new JLabel("    ");
		lblInicioContratoValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblInicioContratoValor.setBounds(392, 101, 126, 26);
		panelSur.add(lblInicioContratoValor);
		
		JLabel lblIncioContrato = new JLabel("Inicio de Contrato:");
		lblIncioContrato.setHorizontalAlignment(SwingConstants.LEFT);
		lblIncioContrato.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblIncioContrato.setBounds(392, 74, 126, 26);
		panelSur.add(lblIncioContrato);
		
		JLabel lblGeneroValor = new JLabel("   ");
		lblGeneroValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblGeneroValor.setBounds(392, 164, 126, 26);
		panelSur.add(lblGeneroValor);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setHorizontalAlignment(SwingConstants.LEFT);
		lblGenero.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblGenero.setBounds(392, 137, 126, 26);
		panelSur.add(lblGenero);
		
		JLabel lblEspecialidadValor = new JLabel("    ");
		lblEspecialidadValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblEspecialidadValor.setBounds(392, 227, 126, 26);
		panelSur.add(lblEspecialidadValor);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblEspecialidad.setBounds(392, 200, 126, 26);
		panelSur.add(lblEspecialidad);
		
		JLabel lblSalarioValor = new JLabel("    ");
		lblSalarioValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblSalarioValor.setBounds(575, 37, 126, 26);
		panelSur.add(lblSalarioValor);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblSalario.setBounds(575, 10, 126, 26);
		panelSur.add(lblSalario);
	}

}
