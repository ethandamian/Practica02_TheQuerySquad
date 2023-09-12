package vistas.consultas;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class VentanaConsultaVeterinarios extends VentanaConsultaTrabajador{
	
	
	public VentanaConsultaVeterinarios() {
		super();
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblEspecialidad.setBounds(392, 201, 126, 26);
		panelSur.add(lblEspecialidad);
		
		JLabel lblEspecialidadValor = new JLabel("   ");
		lblEspecialidadValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblEspecialidadValor.setBounds(392, 234, 126, 26);
		panelSur.add(lblEspecialidadValor);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblSalario.setBounds(570, 11, 126, 26);
		panelSur.add(lblSalario);
		
		JLabel lblSalarioValor = new JLabel("   ");
		lblSalarioValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblSalarioValor.setBounds(570, 44, 126, 26);
		panelSur.add(lblSalarioValor);
	}
}
