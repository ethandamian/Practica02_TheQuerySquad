package vistas.consultas;

import javax.swing.JPanel;

import Clases.Bioma;
import errores.ManejadorDeErrores;
import vistas.FuenteProyecto;
import vistas.editar.VentanaEditarBioma;
import zoologico.ManipularBioma;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.List;

public class VentanaConsultaBioma extends VentanaConsultasMenu {
	
	private VentanaEditarBioma ventanaEditarBioma;
	private JLabel lblTipoValor;
	private JLabel lblNumeroDeJaulasValor;
	private JLabel lblNumeroDeCuidadoresValor;
	private JLabel lblNumeroDeVeterinariosValor;
	private JLabel lblNumeroDeAnimalesValor;
	private JLabel lblServicioAVisitantesValor;
	
	private List<JLabel> listaJLabels;

	
	

	/**
	 * Crea el panel de la ventana consulta bioma.
	 */
	public VentanaConsultaBioma() {
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ManipularBioma manipularBioma = new ManipularBioma();
				Boolean bandera = true;
				String input = textFieldInputUsuario.getText();
				if (ManejadorDeErrores.validarJTextField(input)) {
					bandera = false;
					JOptionPane.showMessageDialog(null,
							"No puede ingresar carcteres especiales, espacios o  dejar vacio el campo", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				if (bandera) {
					
					Bioma bioma = manipularBioma.leerBioma(input);
					if(bioma != null) {
						lblTipoValor.setText(bioma.getTipo());
						lblNumeroDeJaulasValor.setText(String.valueOf(bioma.getNumJaulaas()));
						lblNumeroDeVeterinariosValor.setText(String.valueOf(bioma.getNumVeterinarios()));
						lblNumeroDeCuidadoresValor.setText(String.valueOf(bioma.getNumCuidadores()));
						lblNumeroDeAnimalesValor.setText(String.valueOf(bioma.getNumAnimales()));
						lblServicioAVisitantesValor.setText(String.valueOf(bioma.getServicio()));
						
						btnEditar.setVisible(true);
						btnEditar.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								ventanaEditarBioma.setVisible(true);
							}
						});
					}else {
						JOptionPane.showMessageDialog(null,
								"El id no ha sido encontrado, intentente de nuevo", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
					
					
					
					
					

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

		lblTipoValor = new JLabel("  ");
		lblTipoValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblTipoValor.setBounds(30, 50, 126, 26);
		panelSur.add(lblTipoValor);

		JLabel lblNumeroDeJaulas = new JLabel("Numero de jaulas:");
		lblNumeroDeJaulas.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeJaulas.setBounds(30, 97, 126, 26);
		panelSur.add(lblNumeroDeJaulas);

		lblNumeroDeJaulasValor = new JLabel("  ");
		lblNumeroDeJaulasValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeJaulasValor.setBounds(30, 123, 126, 26);
		panelSur.add(lblNumeroDeJaulasValor);

		JLabel lblNumeroDeCuidadores = new JLabel("Numero de Cuidadores: ");
		lblNumeroDeCuidadores.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeCuidadores.setBounds(30, 184, 145, 26);
		panelSur.add(lblNumeroDeCuidadores);

		lblNumeroDeCuidadoresValor = new JLabel("  ");
		lblNumeroDeCuidadoresValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeCuidadoresValor.setBounds(30, 210, 126, 26);
		panelSur.add(lblNumeroDeCuidadoresValor);

		JLabel lblNumeroDeVeterinarios = new JLabel("Numero de Veterinarios:");
		lblNumeroDeVeterinarios.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeVeterinarios.setBounds(235, 24, 153, 26);
		panelSur.add(lblNumeroDeVeterinarios);

		lblNumeroDeVeterinariosValor = new JLabel("  ");
		lblNumeroDeVeterinariosValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeVeterinariosValor.setBounds(235, 50, 126, 26);
		panelSur.add(lblNumeroDeVeterinariosValor);

		JLabel lblNumeroDeAnimales = new JLabel("Numero de Animales:");
		lblNumeroDeAnimales.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblNumeroDeAnimales.setBounds(235, 97, 153, 26);
		panelSur.add(lblNumeroDeAnimales);

		lblNumeroDeAnimalesValor = new JLabel("  ");
		lblNumeroDeAnimalesValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblNumeroDeAnimalesValor.setBounds(235, 123, 126, 26);
		panelSur.add(lblNumeroDeAnimalesValor);

		JLabel lblServicioAVisitantes = new JLabel("Servicio a visitantes:");
		lblServicioAVisitantes.setFont(FuenteProyecto.createFont(urlFuenteStringBold, 15));
		lblServicioAVisitantes.setBounds(235, 184, 153, 26);
		panelSur.add(lblServicioAVisitantes);

		lblServicioAVisitantesValor = new JLabel("  ");
		lblServicioAVisitantesValor.setFont(FuenteProyecto.createFont(urlFuenteStringPlain, 13));
		lblServicioAVisitantesValor.setBounds(235, 210, 126, 26);
		panelSur.add(lblServicioAVisitantesValor);
		
		JLabel lblNumeroDeVeterinariosValor_1 = new JLabel("  ");
		lblNumeroDeVeterinariosValor_1.setFont(null);
		lblNumeroDeVeterinariosValor_1.setBounds(432, 50, 126, 26);
		panelSur.add(lblNumeroDeVeterinariosValor_1);
		panelNorte.setBackground(new Color(60, 98, 85));
		
		listaJLabels = Arrays.asList(lblNumeroDeAnimalesValor,lblNumeroDeCuidadoresValor,lblNumeroDeJaulasValor,lblNumeroDeVeterinariosValor,lblServicioAVisitantesValor,lblTipoValor);

	}
	
	public void limpiarCampos() {
		
		limpiaCampos(textFieldInputUsuario);
		limpiarCampos(listaJLabels);
	}
	
	private void limpiarCampos(List<JLabel> listaCampos) {
		for (JLabel jLabel : listaCampos) {
			jLabel.setText("");
		}
	}


	public VentanaEditarBioma getVentanaEditarBioma() {
		return ventanaEditarBioma;
	}




	public void setVentanaEditarBioma(VentanaEditarBioma ventanaEditarBioma) {
		this.ventanaEditarBioma = ventanaEditarBioma;
	}
}
