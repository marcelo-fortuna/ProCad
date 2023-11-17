package procad.Util;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class created to make access to utilitties more easy.
 * @author Marcelo
 * @since 14/11/2023
 */
public class Utils {
    
    /**
     * Method to return the current date.
     * @return returns the current date that Brazillians uses.
     */
    public static String getTodayDate() {
        SimpleDateFormat formatDateToBrazillianDate = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = new Date(System.currentTimeMillis());
        
        return formatDateToBrazillianDate.format(currentDate);
    }
    
    /**
    * Method to clear textFields of format JTextField.
    * @param textFields Text Fields separated for ",".
    */
    public static void clearField(JTextField... textFields) {
        for (JTextField textField : textFields) {
            textField.setText("");
        }
    }
    
    /**
     * Method to clear formattedFields of format JFormattedTextField.
     * @param formattedFields Formatted Text Fields separated for ",".
     */
    public static void clearField(JFormattedTextField... formattedFields) {
        for (JFormattedTextField formattedField : formattedFields) {
            formattedField.setText("");
        }
    }
    
    /**
     * Method to clear spinnerFields of format JSpinner.
     * @param spinnerFields Spinner Fields separated for ",".
     */
    public static void clearField(JSpinner... spinnerFields) {
        for (JSpinner spinnerField : spinnerFields) {
            spinnerField.setValue(0);
        }
    }
    
    /**
     * Method to clear textAreaFields of format JTextArea.
     * @param textAreaFields Text Area Fields separated for ",".
     */
    public static void clearField(JTextArea ... textAreaFields) {
        for (JTextArea textAreaField : textAreaFields) {
            textAreaField.setText("");
        }
    }
    
}
