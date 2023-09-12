package vistas.consultas;

import javax.swing.JPanel;

import vistas.FuenteProyecto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaConsultaAnimales extends VentanaConsultasMenu {
	private JLabel lblSexoValor;
	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";

	/**
	 * Create the panel.
	 */
	public VentanaConsultaAnimales() {
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t = textFieldInputUsuario.getText();
				try{
		            int n = Integer.parseInt(t);
		          
		        }
		        catch (NumberFormatException ex){
		        	JOptionPane.showMessageDialog(null, "Ingresa un ID valido");
		        	textFieldInputUsuario.setText("");
		        }
			}
		});
		lblBusqueda.setForeground(new Color(232, 238, 236));
		lblTitulo.setForeground(new Color(232, 238, 236));
		panelSur.setBackground(new Color(92, 131, 116));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNombre.setBounds(43, 32, 126, 26);
		panelSur.add(lblNombre);
		
		JLabel lblNombreValor = new JLabel("  ");
		lblNombreValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNombreValor.setBounds(43, 58, 126, 26);
		panelSur.add(lblNombreValor);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblEspecie.setBounds(43, 103, 126, 26);
		panelSur.add(lblEspecie);
		
		JLabel lblEspecieValor = new JLabel("  ");
		lblEspecieValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEspecieValor.setBounds(43, 129, 126, 26);
		panelSur.add(lblEspecieValor);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblPeso.setBounds(43, 189, 126, 26);
		panelSur.add(lblPeso);
		
		JLabel lblPesoValor = new JLabel("  ");
		lblPesoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblPesoValor.setBounds(43, 215, 126, 26);
		panelSur.add(lblPesoValor);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblAltura.setBounds(179, 32, 126, 26);
		panelSur.add(lblAltura);
		
		JLabel lblAlturaValor = new JLabel("  ");
		lblAlturaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblAlturaValor.setBounds(179, 58, 126, 26);
		panelSur.add(lblAlturaValor);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblSexo.setBounds(179, 103, 126, 26);
		panelSur.add(lblSexo);
		
		lblSexoValor = new JLabel("  ");
		lblSexoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblSexoValor.setBounds(179, 129, 126, 26);
		panelSur.add(lblSexoValor);
		
		JLabel lblNumDeJaula = new JLabel("Numero de Jaula:");
		lblNumDeJaula.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumDeJaula.setBounds(179, 189, 126, 26);
		panelSur.add(lblNumDeJaula);
		
		JLabel lblNumeroDeJaulaValor = new JLabel("  ");
		lblNumeroDeJaulaValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeJaulaValor.setBounds(179, 215, 126, 26);
		panelSur.add(lblNumeroDeJaulaValor);
		
		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medica:");
		lblIndicacionesMedicas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblIndicacionesMedicas.setBounds(347, 32, 152, 26);
		panelSur.add(lblIndicacionesMedicas);
		
		JLabel lblEspecieValor_1 = new JLabel("  ");
		lblEspecieValor_1.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblEspecieValor_1.setBounds(347, 58, 315, 157);
		panelSur.add(lblEspecieValor_1);
		panelNorte.setBackground(new Color(24, 61, 61));
		lblBusqueda.setText("Buscar por ID");
		lblTitulo.setBounds(38, 41, 294, 35);
		lblTitulo.setText("CONSULTAS DE ANIMALES");

	}

}
