package errores;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ManejadorDeErrores {
	
	public static boolean validarJTextField(String string) {	 
		Pattern pattern = Pattern.compile("[\\s+=_-]");
	    Matcher matcher = pattern.matcher(string);
	    if (string.length() <= 0 || matcher.find() || string.matches("[\\p{P}\\p{S}]")) {
	        return true;
	    }

	    return false;
	}
	
	public static boolean validarJTextFieldConEspacios(String string) {
	    return string.contains(" "); // Devuelve true si la cadena contiene un espacio en blanco
	}
	
	public static boolean validarListaJtextFields(List<JTextField> listaJTextFields) {
		
		for (JTextField jTextField : listaJTextFields) {
			if(validarJTextField(jTextField.getText())) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean validarListaComboBox(List<JComboBox<String>> listaJComboBoxs) {
			
			for (JComboBox<String> jComboBox: listaJComboBoxs) {
				if(jComboBox.getSelectedItem().equals(jComboBox.getItemAt(0))) {
					return true;
				}
			}
			
			return false;
		}
	
	
	public static String  validarFecha() {
		String input ="";
		List<Integer> listaMeses = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12); 
		  String dia = registrarFecha(input, "Ingrese un dia:"); 
		  String mes = registrarFecha(input, "Ingrese un mes:"); 
		  String anio= registrarFecha(input,"Ingrese un año:");
		  int anioInt = Integer.parseInt(anio);
		  int mesInt = Integer.parseInt(mes);
	  
		  if((!dia.equals("") || !mes.equals("") || !anio.equals("")) && 
				  dia.length() == 2 && mes.length()== 2 && listaMeses.contains(mesInt) && (anioInt > 1937 && anioInt < 2025) && anio.length() == 4) {
	  
			   
			  return dia + "-" + mes + "-" + anio;
	  
		  }
		  
		  return "";
	}
	
	public static String registrarFecha(String input,String mensajeEnVentana) {
		String resultado = "";
		do {
			input = JOptionPane.showInputDialog(mensajeEnVentana);
            if (input.matches("\\d+")) {
                resultado = input;
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa solo numeros","Error",JOptionPane.ERROR_MESSAGE);
            }
        } while (!input.matches("\\d+"));
		return resultado;
	}
			
 }
	
 


