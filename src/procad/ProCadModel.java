package procad;

/**
 *
 * @author Marcelo
 * @since 09/11/2023
 */
public class ProCadModel {
    
    private int id;
    private String cod;
    private char status;
    private String name;
    private String description;
    private int stockQuantity;
    private int minStock;
    private int maxStock;
    private float buyValue;
    private float sellValue;
    private int barCode;
    private int NCM;
    private float factor;
    private String registerDate;
    private String image;
    
    public int getId(){
        return this.id;
    }
    
    public String getCod() {
        return this.cod;
    }
    
    public char getStatus() {
        return this.status;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public int getStockQuantity() {
        return this.stockQuantity;
    }
    
    public int getMinStock() {
        return this.minStock;
    }
    
    public int getMaxStock() {
        return this.maxStock;
    }
    
    public float getBuyValue() {
        return this.buyValue;
    }
    
    public float getSellValue() {
        return this.sellValue;
    }
    
    public int getBarCode() {
        return this.barCode;
    }
    
    public int getNCM() {
        return this.NCM;
    }
    
    public float getFactor() {
        return this.factor;
    }
    
    public String getRegisterDate() {
        return this.registerDate;
    }
    
    public String getImage() {
        return this.image;
    }
}
