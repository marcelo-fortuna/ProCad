package procad;

import procad.Util.Utils;

/**
 *
 * @author Marcelo
 * @since 09/11/2023
 */
public class ProCadController {
    
   private final ProCad procad; // its final because grants the reference to ProCad don't be change in another locale of the cod.

   /**
    * Contructor that receives a instance of Procad.
    * @param procad 
    */
    public ProCadController(ProCad procad) {
        this.procad = procad;
    }
    
    /**
     * Method to format date in fmtRegisterDate.
     */
    public void dateFormatter() {
        Utils.dateFieldFormatter(procad.fmtRegisterDate);
    }
    
    public void priceFormatter() {
        Utils.priceFieldFormatter(procad.fmtBuyPrice);
        Utils.priceFieldFormatter(procad.fmtSellPrice);
    }
    
    public void clear() {
        Utils.clearField(procad.txtCod, procad.txtProductName, procad.txtStockQuantity, procad.txtProfitFactor);
        Utils.clearField(procad.fmtRegisterDate, procad.fmtBuyPrice, procad.fmtSellPrice, procad.fmtNCM, procad.fmtBarCode);
        Utils.clearField(procad.txaDescription);
        Utils.clearField(procad.spiMinStock, procad.spiMaxStock);
    }
}
