package zoologico;

import java.util.ArrayList;
import java.util.Arrays;

import Clases.Veterinario;

public class ManipularVeterinario extends ManipularZoologico {

    String path = "src/archivosCSV/Veterinario.csv";

    /**
     * Método para hacer consulta de un veterinario de archivo csv.
     * 
     * @param id Id del veterinario a consultar.
     * @return Regresa el veterinario consultado. Null si no se encontró con ese id.
     */
    public Veterinario leerVeterinario(String id) {
        String[] values = this.leer(id, path);
        if (values == null) {
            return null;
        }

        String rfc = values[0];
        String nombre = values[1];
        String paterno = values[2];
        String materno = values[3];
        String genero = values[4];
        String calle = values[5];
        int numExterior = Integer.valueOf(values[6]);
        int numInterior = Integer.valueOf(values[7]);
        String colonia = values[8];
        String estado = values[9];
        String inicioContrato = values[9];
        String finContrato = values[10];
        String nacimiento = values[11];
        ArrayList<String> telefonosString = new ArrayList<String>(
                Arrays.asList(values[12].substring(1, values[12].length() - 2).split(":")));
        ArrayList<Long> telefonos = new ArrayList<Long>();
        for (String telefono : telefonosString) {
            telefonos.add(Long.valueOf(telefono));
        }
        ArrayList<String> correos = new ArrayList<String>(
                Arrays.asList(values[13].substring(1, values[13].length() - 2).split(":")));
        String especialidad = values[14];
        Float salario = Float.valueOf(values[15]);

        Veterinario veterinario = new Veterinario(rfc, nombre, paterno, materno, genero, calle, numExterior,
                numInterior, colonia, estado, inicioContrato, finContrato, nacimiento, telefonos, correos, especialidad,
                salario);

        return veterinario;
    }

    /**
     * Método que elimina eliminar.
     * 
     * @param id Id del eliminar a eliminar.
     * @return Verdadero si se eliminó, falso si no se eliminó.
     */
    public boolean eliminar(String id) {
        return this.eliminar(id, path);
    }

    /**
     * Método que inserta veterinario.
     * 
     * @param veterinario veterinario a insertar.
     * @return Verdadero si se insertó, falso si no se insertó.
     */
    public boolean inserta(Veterinario veterinario) {
        return this.inserta(veterinario.toStringCsv(), veterinario.getRfc(), path);
    }

    /**
     * Funcion que editar veterinario.
     * 
     * @param veterinario veterinario a insertar en lugar del anterior.
     * @return Verdadero si se editó, falso si no se editó.
     */
    public boolean editar(Veterinario veterinario, String id) {
        return this.editar(veterinario.toStringCsv(), id, path);
    }

}
