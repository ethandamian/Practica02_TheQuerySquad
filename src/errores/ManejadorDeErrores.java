package errores;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ManejadorDeErrores {
	
	public static boolean validarJTextField(String string) {	 
		Pattern pattern = Pattern.compile("[\\s=_-]");
	    Matcher matcher = pattern.matcher(string);
	    if (string.length() <= 0 || matcher.find() || string.matches("[\\p{P}\\p{S}]")) {
	        return true;
	    }

	    return false;
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
	
			
 }
	
 


