package procad;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Marcelo
 * @since 09/11/2023
 */
public class ProCadController {
    
    ProCad procad = new ProCad();
    
    public void dateFormatter() {

        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(procad.fmtRegisterDate);
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(null, "Erro ao formatar campo de texto.", "Mensagem de erro" ,JOptionPane.ERROR);
        }
    }
    
    public void clear() {
        procad.txtCod.setText("");
        procad.txtProductName.setText("");;
        procad.txtStockQuantity.setText("");
        procad.txtProfitFactor.setText("");
        
        procad.fmtRegisterDate.setText("");
        procad.fmtBuyPrice.setText("");
        procad.fmtSellPrice.setText("");
        procad.fmtNCM.setText("");
        procad.fmtBarCode.setText("");
        
        procad.txaDescription.setText("");
        
        procad.spiMinStock.setValue(0);
        procad.spiMaxStock.setValue(0);
    }
}
