package vistas;

import javax.swing.ImageIcon;

public class VentanaRegistro extends VentanaMenu{
	
	public VentanaRegistro(){
		super();
		
		lblTituloMenu.setText("MENU REGISTRO");
		descripcion = "<html><body>En este menu podrás registrar los veterinarios, animales y biomas que el zoologico necesite</body></html>";
		lblNewLabel.setText(descripcion);
		descripcionDos = "<html><body>Selecciona alguna de las opciones que se encuentran en el lado izquierdo</body></html>"; 
		lblNewLabel_1.setText(descripcionDos);
		
		lblOpcionUno.setText(" Registrar Veterinario");
		lblOpcionUno.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/revision-medica.png")));
		
		lblOpcionDos.setText("  Registrar Cuidador");
		lblOpcionDos.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/guardia-de-seguridad.png")));
		
		lblOpcionTres.setText("  Registrar Bioma");
		lblOpcionTres.setIcon(new ImageIcon(VentanaRegistro.class.getResource("/imagenes/hojas.png")));
		
		
		
		
	}

}
