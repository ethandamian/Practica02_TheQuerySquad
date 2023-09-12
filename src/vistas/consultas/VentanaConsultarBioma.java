package vistas.consultas;

import javax.swing.JPanel;

import vistas.FuenteProyecto;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaConsultarBioma extends VentanaConsultasMenu{
	
	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";

	/**
	 * Create the panel.
	 */
	public VentanaConsultarBioma() {
		lblBusqueda.setText("Buscar por ID");
		lblTitulo.setBounds(38, 41, 258, 35);
		lblTitulo.setText("CONSULTAS DE BIOMA");
		panelSur.setBackground(new Color(166, 187, 141));
		
		JLabel lblTipo = new JLabel("Tipo de Bioma:");
		lblTipo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTipo.setBounds(81, 22, 126, 26);
		panelSur.add(lblTipo);
		
		JLabel lblTipoValor = new JLabel("  ");
		lblTipoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblTipoValor.setBounds(81, 48, 126, 26);
		panelSur.add(lblTipoValor);
		
		JLabel lblNumeroDeJaulas = new JLabel("Numero de jaulas:");
		lblNumeroDeJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeJaulas.setBounds(81, 95, 126, 26);
		panelSur.add(lblNumeroDeJaulas);
		
		JLabel lblNumeroDeJaulasValor = new JLabel("  ");
		lblNumeroDeJaulasValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeJaulasValor.setBounds(81, 121, 126, 26);
		panelSur.add(lblNumeroDeJaulasValor);
		
		JLabel lblNumeroDeCuidadores = new JLabel("Numero de Cuidadores: ");
		lblNumeroDeCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeCuidadores.setBounds(81, 182, 145, 26);
		panelSur.add(lblNumeroDeCuidadores);
		
		JLabel lblNumeroDeCuidadoresValor = new JLabel("  ");
		lblNumeroDeCuidadoresValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeCuidadoresValor.setBounds(81, 208, 126, 26);
		panelSur.add(lblNumeroDeCuidadoresValor);
		
		JLabel lblNumeroDeVeterinarios = new JLabel("Numero de Veterinarios:");
		lblNumeroDeVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeVeterinarios.setBounds(286, 22, 153, 26);
		panelSur.add(lblNumeroDeVeterinarios);
		
		JLabel lblNumeroDeVeterinariosValor = new JLabel("  ");
		lblNumeroDeVeterinariosValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeVeterinariosValor.setBounds(286, 48, 126, 26);
		panelSur.add(lblNumeroDeVeterinariosValor);
		
		JLabel lblNumeroDeAnimales = new JLabel("Numero de Animales:");
		lblNumeroDeAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeAnimales.setBounds(286, 95, 153, 26);
		panelSur.add(lblNumeroDeAnimales);
		
		JLabel lblNumeroDeAnimalesValor = new JLabel("  ");
		lblNumeroDeAnimalesValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeAnimalesValor.setBounds(286, 121, 126, 26);
		panelSur.add(lblNumeroDeAnimalesValor);
		
		JLabel lblServicioAVisitantes = new JLabel("Servicio a visitantes:");
		lblServicioAVisitantes.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblServicioAVisitantes.setBounds(286, 182, 153, 26);
		panelSur.add(lblServicioAVisitantes);
		
		JLabel lblServicioAVisitantesValor = new JLabel("  ");
		lblServicioAVisitantesValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblServicioAVisitantesValor.setBounds(286, 208, 126, 26);
		panelSur.add(lblServicioAVisitantesValor);
		panelNorte.setBackground(new Color(60, 98, 85));

	}

}
