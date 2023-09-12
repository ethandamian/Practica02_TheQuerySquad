package vistas.consultas;
import javax.swing.table.DefaultTableModel;

import vistas.FuenteProyecto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VentanaConsultaVeterinarios extends VentanaConsultaTrabajador{
	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	
	public VentanaConsultaVeterinarios() {
		super();
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecialidad.setBounds(392, 201, 126, 26);
		panelSur.add(lblEspecialidad);
		
		JLabel lblEspecialidadValor = new JLabel("   ");
		lblEspecialidadValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEspecialidadValor.setBounds(392, 234, 126, 26);
		panelSur.add(lblEspecialidadValor);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSalario.setBounds(570, 11, 126, 26);
		panelSur.add(lblSalario);
		
		JLabel lblSalarioValor = new JLabel("   ");
		lblSalarioValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblSalarioValor.setBounds(570, 44, 126, 26);
		panelSur.add(lblSalarioValor);
	}
}
