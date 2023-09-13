package vistas.registrar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import vistas.FuenteProyecto;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

public class VentanaRegistrarVeterinario extends JPanel {
	private String urlFuenteBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuentePlain = "src/fuentes/RobotoCondensed-Regular.ttf";
	
	private JTextField textFieldEspecialidad;
	private JTextField textSalario;
	private JPanel panelPrincipal;
	
	private VentanaRegistrarTrabajador ventanaRegistrarTrabajador;
	
	private List<JTextField> listaTextFields;
	
	
	

	/**
	 * Create the panel.
	 */
	public VentanaRegistrarVeterinario() {
		setLayout(null);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(67, 83, 52));
		panelPrincipal.setBounds(0, 0, 463, 407);
		add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setForeground(new Color(227, 236, 233));
		lblEspecialidad.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblEspecialidad.setBounds(38, 52, 122, 28);
		panelPrincipal.add(lblEspecialidad);
		
		textFieldEspecialidad = new JTextField();
		textFieldEspecialidad.setForeground(new Color(227, 236, 233));
		textFieldEspecialidad.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textFieldEspecialidad.setColumns(10);
		textFieldEspecialidad.setBackground(new Color(67, 83, 52));
		textFieldEspecialidad.setBounds(38, 91, 136, 20);
		panelPrincipal.add(textFieldEspecialidad);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 115, 136, 2);
		panelPrincipal.add(separator_1);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setForeground(new Color(227, 236, 233));
		lblSalario.setFont(FuenteProyecto.createFont(urlFuenteBold, 15));
		lblSalario.setBounds(253, 58, 122, 28);
		panelPrincipal.add(lblSalario);
		
		textSalario = new JTextField();
		textSalario.setForeground(new Color(227, 236, 233));
		textSalario.setFont(FuenteProyecto.createFont(urlFuentePlain, 13));
		textSalario.setColumns(10);
		textSalario.setBackground(new Color(67, 83, 52));
		textSalario.setBounds(253, 91, 136, 20);
		panelPrincipal.add(textSalario);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(253, 115, 136, 2);
		panelPrincipal.add(separator_1_1);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ventanaRegistrarTrabajador.limpiaCampos();
				
				VentanaRegistrarTrabajador.changePrincipalPanel(ventanaRegistrarTrabajador.getPanelDerechoContenido());
				
			}
		});
		btnRegistrar.setBounds(305, 335, 84, 23);
		panelPrincipal.add(btnRegistrar);
		btnRegistrar.setFont(FuenteProyecto.createFont(urlFuenteBold, 13));
		
		JLabel lblIngresaDatosDel = new JLabel("INGRESA DATOS DEL VETERINARIO");
		lblIngresaDatosDel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresaDatosDel.setForeground(new Color(227, 236, 233));
		lblIngresaDatosDel.setFont(FuenteProyecto.createFont(urlFuenteBold, 25));
		lblIngresaDatosDel.setBounds(38, 11, 384, 28);
		panelPrincipal.add(lblIngresaDatosDel);
		
		listaTextFields =  Arrays.asList(textFieldEspecialidad,textSalario);

	}





	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}





	public void setVentanaRegistrarTrabajador(VentanaRegistrarTrabajador ventanaRegistrarTrabajador) {
		this.ventanaRegistrarTrabajador = ventanaRegistrarTrabajador;
	}





	public List<JTextField> getListaTextFields() {
		return listaTextFields;
	}
	
	




	
	
	
	



	
	

	
	
	
}