package vistas;

import java.awt.Font;

import java.awt.FontFormatException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Clase para las fuentes (tipo de letra) del proyecto
 */
public class FuenteProyecto {
	
	/**
	 * Crea la fuente que se va a usar en el projecto
	 * @param urlFont La ruta donde se enceuntra la fuente
	 * @param fontsize El tamanio de la fuente   
	 * @return La fuente  
	 */
	public static Font createFont(String urlFont, float fontsize) {
		Font robotoCondesedBoldFont = null;
		try {
			InputStream inputStream = new BufferedInputStream(new FileInputStream(urlFont)); 
				
			robotoCondesedBoldFont = Font.createFont(Font.TRUETYPE_FONT, inputStream).deriveFont(fontsize);
			
		} catch (IOException |FontFormatException e ) {
			e.printStackTrace();
			
		}
		return robotoCondesedBoldFont;

	}
}
