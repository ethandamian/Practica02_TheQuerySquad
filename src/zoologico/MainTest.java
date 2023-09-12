package zoologico;

import java.util.Iterator;

public class MainTest {
	public static void main(String[] args) {
		ManipularZoologico manipularTest = new ManipularZoologico("src/archivosCSV/Animal.csv", "1");

		System.out.println(manipularTest.eliminar());

	}
}
