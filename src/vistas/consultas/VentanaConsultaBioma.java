package vistas.consultas;

import javax.swing.JPanel;

import vistas.FuenteProyecto;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaConsultaBioma extends VentanaConsultasMenu {

	private String urlFuenteStringBold = "src/fuentes/RobotoCondensed-Bold.ttf";
	private String urlFuenteStringPlain = "src/fuentes/RobotoCondensed-Regular.ttf";

	/**
	 * Crea el panel de la ventana consulta bioma.
	 */
	public VentanaConsultaBioma() {
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String t = textFieldInputUsuario.getText();
				try {
					int n = Integer.parseInt(t);

				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Ingresa un ID valido");
					textFieldInputUsuario.setText("");
				}
			}
		});
		lblBusqueda.setText("Buscar por ID");
		lblTitulo.setBounds(38, 41, 258, 35);
		lblTitulo.setText("CONSULTAS DE BIOMA");
		panelSur.setBackground(new Color(166, 187, 141));

		JLabel lblTipo = new JLabel("Tipo de Bioma:");
		lblTipo.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblTipo.setBounds(30, 24, 126, 26);
		panelSur.add(lblTipo);

		JLabel lblTipoValor = new JLabel("  ");
		lblTipoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblTipoValor.setBounds(30, 50, 126, 26);
		panelSur.add(lblTipoValor);

		JLabel lblNumeroDeJaulas = new JLabel("Numero de jaulas:");
		lblNumeroDeJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeJaulas.setBounds(30, 97, 126, 26);
		panelSur.add(lblNumeroDeJaulas);

		JLabel lblNumeroDeJaulasValor = new JLabel("  ");
		lblNumeroDeJaulasValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeJaulasValor.setBounds(30, 123, 126, 26);
		panelSur.add(lblNumeroDeJaulasValor);

		JLabel lblNumeroDeCuidadores = new JLabel("Numero de Cuidadores: ");
		lblNumeroDeCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeCuidadores.setBounds(30, 184, 145, 26);
		panelSur.add(lblNumeroDeCuidadores);

		JLabel lblNumeroDeCuidadoresValor = new JLabel("  ");
		lblNumeroDeCuidadoresValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeCuidadoresValor.setBounds(30, 210, 126, 26);
		panelSur.add(lblNumeroDeCuidadoresValor);

		JLabel lblNumeroDeVeterinarios = new JLabel("Numero de Veterinarios:");
		lblNumeroDeVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeVeterinarios.setBounds(235, 24, 153, 26);
		panelSur.add(lblNumeroDeVeterinarios);

		JLabel lblNumeroDeVeterinariosValor = new JLabel("  ");
		lblNumeroDeVeterinariosValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeVeterinariosValor.setBounds(235, 50, 126, 26);
		panelSur.add(lblNumeroDeVeterinariosValor);

		JLabel lblNumeroDeAnimales = new JLabel("Numero de Animales:");
		lblNumeroDeAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeAnimales.setBounds(235, 97, 153, 26);
		panelSur.add(lblNumeroDeAnimales);

		JLabel lblNumeroDeAnimalesValor = new JLabel("  ");
		lblNumeroDeAnimalesValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeAnimalesValor.setBounds(235, 123, 126, 26);
		panelSur.add(lblNumeroDeAnimalesValor);

		JLabel lblServicioAVisitantes = new JLabel("Servicio a visitantes:");
		lblServicioAVisitantes.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblServicioAVisitantes.setBounds(235, 184, 153, 26);
		panelSur.add(lblServicioAVisitantes);

		JLabel lblServicioAVisitantesValor = new JLabel("  ");
		lblServicioAVisitantesValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblServicioAVisitantesValor.setBounds(235, 210, 126, 26);
		panelSur.add(lblServicioAVisitantesValor);
		panelNorte.setBackground(new Color(60, 98, 85));

	}

}
