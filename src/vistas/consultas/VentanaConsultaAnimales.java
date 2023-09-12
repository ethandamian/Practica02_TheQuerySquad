package vistas.consultas;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaConsultaAnimales extends VentanaConsultasMenu {
	private JLabel lblSexoValor;

	/**
	 * Create the panel.
	 */
	public VentanaConsultaAnimales() {
		lblBusqueda.setForeground(new Color(232, 238, 236));
		lblTitulo.setForeground(new Color(232, 238, 236));
		panelSur.setBackground(new Color(92, 131, 116));
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblNombre.setBounds(43, 32, 126, 26);
		panelSur.add(lblNombre);
		
		JLabel lblNombreValor = new JLabel("  ");
		lblNombreValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblNombreValor.setBounds(43, 58, 126, 26);
		panelSur.add(lblNombreValor);
		
		JLabel lblEspecie = new JLabel("Especie:");
		lblEspecie.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblEspecie.setBounds(43, 103, 126, 26);
		panelSur.add(lblEspecie);
		
		JLabel lblEspecieValor = new JLabel("  ");
		lblEspecieValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblEspecieValor.setBounds(43, 129, 126, 26);
		panelSur.add(lblEspecieValor);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblPeso.setBounds(43, 189, 126, 26);
		panelSur.add(lblPeso);
		
		JLabel lblPesoValor = new JLabel("  ");
		lblPesoValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblPesoValor.setBounds(43, 215, 126, 26);
		panelSur.add(lblPesoValor);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblAltura.setBounds(179, 32, 126, 26);
		panelSur.add(lblAltura);
		
		JLabel lblAlturaValor = new JLabel("  ");
		lblAlturaValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblAlturaValor.setBounds(179, 58, 126, 26);
		panelSur.add(lblAlturaValor);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblSexo.setBounds(179, 103, 126, 26);
		panelSur.add(lblSexo);
		
		lblSexoValor = new JLabel("  ");
		lblSexoValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblSexoValor.setBounds(179, 129, 126, 26);
		panelSur.add(lblSexoValor);
		
		JLabel lblNumDeJaula = new JLabel("Numero de Jaula:");
		lblNumDeJaula.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblNumDeJaula.setBounds(179, 189, 126, 26);
		panelSur.add(lblNumDeJaula);
		
		JLabel lblNumeroDeJaulaValor = new JLabel("  ");
		lblNumeroDeJaulaValor.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblNumeroDeJaulaValor.setBounds(179, 215, 126, 26);
		panelSur.add(lblNumeroDeJaulaValor);
		
		JLabel lblIndicacionesMedicas = new JLabel("Indicaciones Medica:");
		lblIndicacionesMedicas.setFont(new Font("Roboto Condensed", Font.BOLD, 15));
		lblIndicacionesMedicas.setBounds(347, 32, 152, 26);
		panelSur.add(lblIndicacionesMedicas);
		
		JLabel lblEspecieValor_1 = new JLabel("  ");
		lblEspecieValor_1.setFont(new Font("Roboto Condensed", Font.PLAIN, 13));
		lblEspecieValor_1.setBounds(347, 58, 315, 157);
		panelSur.add(lblEspecieValor_1);
		panelNorte.setBackground(new Color(24, 61, 61));
		lblBusqueda.setText("Buscar por ID");
		lblTitulo.setBounds(38, 41, 294, 35);
		lblTitulo.setText("CONSULTAS DE ANIMALES");

	}

}
