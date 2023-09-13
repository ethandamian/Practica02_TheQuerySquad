package zoologico;

import java.util.Iterator;

/**
 * ? Clase para fines de pruebas de la funcionalidad del sistema.
 */
public class MainTest {
	public static void main(String[] args) {

		ManipularZoologico mz = new ManipularZoologico("src/archivosCSV/Animal.csv");
		// System.out.print(mz.inserta("Torito,Toro,1233Kg,2m,Hembra,111,carnivoro,oleee",
		// "HDFNVDA02312MXN"));
		System.out.print(mz.editar("Jorge,squirt,13Kg,60cm,machitoOpresor,1,carnivoro,squirtsquirt", "60"));

	}
}
