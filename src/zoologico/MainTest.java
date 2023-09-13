package zoologico;

import java.util.Iterator;

public class MainTest {
	public static void main(String[] args) {

		ManipularZoologico mz = new ManipularZoologico("src/archivosCSV/Animal.csv");
		System.out.print(mz.inserta("Torito,Toro,1233Kg,2m,Hembra,111,carnivoro,oleee", "HDFNVDA02312MXN"));
	}
}
