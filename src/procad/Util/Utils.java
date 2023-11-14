package procad.Util;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/**
 * Class created to make access to utilitties more easy.
 * @author Marcelo
 * @since 14/11/2023
 */
public class Utils {
    
    private static MaskFormatter maskformatter;
    
    public static void dateFieldFormatter(JFormattedTextField dateField) {
        try {
            maskformatter = new MaskFormatter("##/##/####");
            maskformatter.setPlaceholderCharacter('0');
            maskformatter.install(dateField);
        } catch (ParseException e) {
            e.printStackTrace(); // log errors
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void priceFieldFormatter(JFormattedTextField priceField) {
        try {
            maskformatter = new MaskFormatter("R$ ####,##");
            priceField.setColumns(10);
            maskformatter.setPlaceholderCharacter('0');
            maskformatter.install(priceField);
        } catch (ParseException e) {
            e.printStackTrace(); // log errors
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
        }
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
