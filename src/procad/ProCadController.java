package procad;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import procad.swing.UIManagerConfiguration.UIManagerConfiguration;
import procad.Util.Utils;

/**
 *
 * @author Marcelo
 * @since 09/11/2023
 */
public class ProCadController {
    
   private final ProCad procad; // its final because grants the reference to ProCad don't be change in another locale of the code.
   private static MaskFormatter maskformatter;
   
   /**
    * Contructor that receives a instance of Procad.
    * @param procad 
    */
    public ProCadController(ProCad procad) {
        this.procad = procad;
    }
    
    /**
     * Method to define the current date in a specified JFormattedTextField.
     * @param dateField 
     */
    public void setTodayDate(JFormattedTextField dateField) {
       try {
            dateField.setText(Utils.getTodayDate());
       } catch (Exception e) {
            System.out.println("Erro ao definir a data de hoje no componente: " + dateField + "\nMensagem de erro: " + e);
       }
    }
    
    /**
     * Method to define the format of the date inserted by the user in a JFormattedTextField. 
     * @param dateFields
     */
    public static void setDateFieldFormatter(JFormattedTextField... dateFields) {
        UIManagerConfiguration.setLanguageConfiguration();
        
        for (JFormattedTextField dateField : dateFields) {
            try {
                maskformatter = new MaskFormatter("##/##/####");
                maskformatter.install(dateField);
            } catch (ParseException e) {
                System.err.println("Erro ao formatar componente: " + dateField + "\nMensagem de erro: " + e);
                JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**
     * Method to define the format of the BRL price inserted by the user in a JFormattedTextField.
     * @param priceFields 
     */
    public static void setPriceFieldFormatter(JFormattedTextField... priceFields) {
        UIManagerConfiguration.setLanguageConfiguration();
        
        for (JFormattedTextField priceField : priceFields) {
            try {
                maskformatter = new MaskFormatter("####,## R$");
                maskformatter.setPlaceholderCharacter('0');
                maskformatter.install(priceField);
            } catch (ParseException e) {
                System.err.println("Erro ao formatar componente: " + priceField + "\nMensagem de erro: " + e);
                JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    /**
     * Method to define the format of the EAN bar code field inserted by the user in a JFormattedTextField.
     * @param barCodeField 
     */
    public static void setBarCodeFormatter(JFormattedTextField barCodeField) {
        UIManagerConfiguration.setLanguageConfiguration();
      
         try {
                maskformatter = new MaskFormatter("#############");
                maskformatter.setPlaceholderCharacter('0');
                maskformatter.install(barCodeField);
         } catch (ParseException e) {
                System.err.println("Erro ao formatar componente: " + barCodeField + "\nMensagem de erro: " + e);
                JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    public static void setNCMFormatter(JFormattedTextField ncmField) {
        UIManagerConfiguration.setLanguageConfiguration();
      
         try {
                maskformatter = new MaskFormatter("########");
                maskformatter.setPlaceholderCharacter('0');
                maskformatter.install(ncmField);
         } catch (ParseException e) {
                System.err.println("Erro ao formatar componente: " + ncmField + "\nMensagem de erro: " + e);
                JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    
    public static void setProfitFactorFormatter(JFormattedTextField profitFactorField) {
        UIManagerConfiguration.setLanguageConfiguration();
      
         try {
                maskformatter = new MaskFormatter("% ##,##");
                maskformatter.setPlaceholderCharacter('0');
                maskformatter.install(profitFactorField);
         } catch (ParseException e) {
                System.err.println("Erro ao formatar componente: " + profitFactorField + "\nMensagem de erro: " + e);
                JOptionPane.showMessageDialog(null, "Erro ao formatar campo de texto.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    /**
     * Method to clear the value of specified fields.
     */
    public void clearFields() {
        Utils.clearField(procad.txtCod, procad.txtProductName, procad.txtStockQuantity, procad.fmtProfitFactor);
        Utils.clearField(procad.fmtRegisterDate, procad.fmtBuyPrice, procad.fmtSellPrice, procad.fmtNCM, procad.fmtBarCode);
        Utils.clearField(procad.txaDescription);
        Utils.clearField(procad.spiMinStock, procad.spiMaxStock);
    }
}
