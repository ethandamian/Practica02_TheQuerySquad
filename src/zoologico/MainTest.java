package zoologico;

import java.util.List;

import Clases.Animal;
import Clases.Bioma;
import Clases.Veterinario;

/**
 * Clase para test
 */
public class MainTest {
	/**
	 * Metodo principal
	 * @param args
	 */
	public static void main(String[] args) {
		ManipularAnimal m = new ManipularAnimal();
//
//		Animal a = new Animal("Alan", "Cocodrilo", 23, 380, "Masculino", 12, "Carnivora", "Ningun", 7);
//
//		m.editar(a, "6");
		
//		float numero = 19.5f;
//		System.out.println(String.valueOf(numero));
		
		Animal animal = new Animal("Pedrito","Mamifero",23f,134f,"Hembra",368,"Herviboro","Ayuda",12);
		
		m.editar(animal, "12");
		
		
		ManipularBioma biomas = new ManipularBioma();
		
		ManipularVeterinario manipularAnimal = new ManipularVeterinario();
		
		List<Veterinario> list = manipularAnimal.devolverListaVeterinariosEnArchivo();
		
		for (Veterinario veterinario : list) {
			System.out.println(veterinario.toStringTresAtributos());
		}
		
		// System.out.println(a);

		// ManipularZoologico mz = new ManipularZoologico("src/archivosCSV/Animal.csv");
		// System.out.print(mz.inserta("Torito,Toro,1233Kg,2m,Hembra,111,carnivoro,oleee",
		// "HDFNVDA02312MXN"));
		// System.out.print(mz.editar("Jorge,squirt,13Kg,60cm,machitoOpresor,1,carnivoro,squirtsquirt",
		// "60"));

	}
}
