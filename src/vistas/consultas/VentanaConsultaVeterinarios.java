package vistas.consultas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import vistas.FuenteProyecto;

public class VentanaConsultaVeterinarios extends VentanaConsultaTrabajador{
	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	
	public VentanaConsultaVeterinarios() {
		super();
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t = textFieldInputUsuario.getText();
				if(t.length()==12 || t.length()==13) {
					
				}else {
					JOptionPane.showMessageDialog(null, "Ingresa un RFC valido");
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
}
