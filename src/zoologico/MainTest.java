package zoologico;

import Clases.Animal;

public class MainTest {
	public static void main(String[] args) {
		ManipularAnimal m = new ManipularAnimal();

		Animal a = new Animal("Alan", "Cocodrilo", 23, 380, "Masculino", 12, "Carnivora", "Ningun", 7);

		m.editar(a, "6");

		// System.out.println(a);

		// ManipularZoologico mz = new ManipularZoologico("src/archivosCSV/Animal.csv");
		// System.out.print(mz.inserta("Torito,Toro,1233Kg,2m,Hembra,111,carnivoro,oleee",
		// "HDFNVDA02312MXN"));
		// System.out.print(mz.editar("Jorge,squirt,13Kg,60cm,machitoOpresor,1,carnivoro,squirtsquirt",
		// "60"));

	}
}
