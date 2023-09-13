package zoologico;

import java.util.Iterator;

public class MainTest {
	public static void main(String[] args) {

		ManipularZoologico mz = new ManipularZoologico("src/archivosCSV/Animal.csv");
		System.out.print(mz.inserta("Pedrito,ajolote,1Kg,19cm,Macho,13,Hervivoro,EsFeliz"));
	}
}
