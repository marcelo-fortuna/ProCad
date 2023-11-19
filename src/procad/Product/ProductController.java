package procad.Product;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import procad.swing.UIManagerConfiguration.UIManagerConfiguration;

/**
 *
 * @author Marcelo
 * @since 08/11/2023
 */
public class ProductController {
    
    private PreparedStatement pst;
    
    public void insertData(int cod, int status, String date, String name, int stock, String description, int minStock, int maxStock, float buyPrice, float sellPrice, float profitFactor, int NCM, int barCode) throws SQLException {
        UIManagerConfiguration.setLanguageConfiguration();
        
        // order and send it to the database.
    }
}
