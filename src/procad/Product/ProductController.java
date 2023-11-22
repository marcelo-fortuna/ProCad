package procad.Product;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import procad.Data.DataController;
import procad.Data.DataModel;

/**
 *
 * @author Marcelo
 * @since 08/11/2023
 */
public class ProductController {
    
    private PreparedStatement pst;
    private ResultSet rs;
    private final Connection cn;
    private final DataController dataControl = new DataController();
    private final DataModel data = new DataModel();

    public ProductController() {
        data.setPort("3307");
        data.setPassword("qnq32800");
        data.setUsername("root");
        this.cn = dataControl.connect();
    }
    
    public void insertProduct(ProductModel product){
        try {
            String query = "INSERT INTO produto (cod,status,nome,descricao,"
                    + "qtd_estoque,estoque_minimo,estoque_maximo,preco_compra,preco_venda,"
                    + "bar_code,ncm,fator,"
                    + "data_cadastro,imagem)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
        
            pst = cn.prepareStatement(query);
            
            pst.setString(1,product.getProductCod());
            pst.setString(2,String.valueOf(product.getProductStatus()));   
            pst.setString(3,product.getProductName());
            pst.setString(4,product.getProductDesc());
            pst.setInt(5,product.getProductStockQuantity());
            pst.setInt(6,product.getProductMinStockQuantity());
            pst.setInt(7,product.getProductMaxStockQuantity());
            pst.setFloat(8,product.getProductBuyPrice());
            pst.setFloat(9,product.getProductSellPrice());
            pst.setString(10,product.getProductBarCode());
            pst.setInt(11,product.getProductNCM());
            pst.setFloat(12,product.getProductProfit());
            pst.setString(13,product.getProductRegisterDate()); 
            pst.setString(14,product.getProductImage());
            
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Produto não cadastrado. Erro: " + e);

        }
    }
  
    public ArrayList<ProductModel> showProducts(){
        ArrayList<ProductModel> list = new ArrayList<>();
        try{
            
            String query = "SELECT * FROM produto";
            
            pst = cn.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next()){
                ProductModel obj = new ProductModel();
                obj.setProductId(rs.getInt("id"));
                obj.setProductCod(rs.getString("cod"));
                obj.setProductId(rs.getInt("id"));
                obj.setProductStatus(rs.getString("status").charAt(0));                
                obj.setProductName(rs.getString("nome"));
                obj.setProductStockQuantity(rs.getInt("qtd_estoque"));
                obj.setProductMinStockQuantity(rs.getInt("estoque_minimo"));
                obj.setProductMaxStockQuantity(rs.getInt("estoque_maximo"));
                obj.setProductBuyPrice(rs.getFloat("preco_compra"));                
                obj.setProductSellPrice(rs.getFloat("preco_venda"));
                obj.setProductProfit(rs.getFloat("fator"));
                obj.setProductDesc(rs.getString("descricao"));                
                obj.setProductBarCode(rs.getString("bar_code"));         
                obj.setProductNCM(rs.getInt("ncm"));                
                                
                obj.setProductRegisterDate(rs.getString("data_cadastro")); 
                obj.setProductImage(rs.getString("imagem")); 

                list.add(obj);
            } 
            return list;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro: " + e.getMessage());
            return null;
        }
    }

    public void changeProduct(ProductModel product){
        try {
            String query ="UPDATE produto SET cod=?,nome=?,descricao=?,"
                    + "status=?,preco_venda=?,preco_compra=?,"
                    + "qtd_estoque=?,estoque_minimo=?,estoque_maximo=?,"
                    + "fator=?,bar_code=?,ncm=?,"
                    + "data_cadastro=?,imagem=? "
                    + "WHERE id=? AND cod=?;";
            
            pst = cn.prepareStatement(query);
            
            pst.setString(1,product.getProductCod());
            pst.setString(2,product.getProductName());
            pst.setString(3,product.getProductDesc());
            pst.setString(4,String.valueOf(product.getProductStatus()));           
            pst.setFloat(5,product.getProductSellPrice());
            pst.setFloat(6,product.getProductBuyPrice());
            pst.setInt(7,product.getProductStockQuantity());
            pst.setInt(8,product.getProductMinStockQuantity());
            pst.setInt(9,product.getProductMaxStockQuantity());
            pst.setFloat(10,product.getProductProfit());
            pst.setString(11,product.getProductBarCode());
            pst.setInt(12,product.getProductNCM());
            pst.setString(13,product.getProductRegisterDate()); 
            pst.setString(14,product.getProductImage());
            pst.setInt(15, product.getProductId());
            pst.setString(16,product.getProductCod());
            
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null,"Produto Alterado com sucesso!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Produto não Alterado. Erro: " + e);

        }
    }
    
    public void deleteProduct(ProductModel product){
        try {
            String query ="DELETE FROM produto WHERE id=? AND cod=?";
            pst = cn.prepareStatement(query);
            
            pst.setInt(1, product.getProductId());
            pst.setString(2, product.getProductCod());
            
            pst.execute();
            pst.close();
            
            JOptionPane.showMessageDialog(null,"Produto Excluido com sucesso!!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir produto: " + e);
        }
    }
    
}
