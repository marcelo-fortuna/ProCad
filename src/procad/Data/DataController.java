package procad.Data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import procad.swing.UIManagerConfiguration.UIManagerConfiguration;

/**
 *
 * @author Marcelo
 * @since 07/11/2023
 */
public final class DataController {
    
    private Connection cn;
    private final DataModel data = new DataModel();
    
    public DataController() {
        this.cn = connect();
    }
    
    /**
     * Method to stabilish the connection with the database.
     * @return 
     */
    public Connection connect() {
        UIManagerConfiguration.setLanguageConfiguration();
        
        try {
            cn = DriverManager.getConnection("jdbc:mysql://localhost:"+ data.getPort() + "/" + data.getDatabaseInConnectionString(), data.getUsername(), data.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
            
            if(e.getMessage().equals("Access denied for user 'root'@'localhost' (using password: YES)"))
                JOptionPane.showMessageDialog(null, "Erro ao tentar se conectar com o banco de dados. Não é possível iniciar o programa.\nErro: Verifique os dados de conexão.\nUsuário ou Senha incorretos.", "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Erro ao tentar se conectar com o banco de dados. Não é possível iniciar o programa.\nErro: " + e.getMessage(), "MENSAGEM DE ERRO", JOptionPane.ERROR_MESSAGE);
            
            System.exit(-1);
        }
        return cn;
    }
    
    /**
     * Method to close the connection with the database.
     * @return 
     */
    public Connection disconnect() {
        UIManagerConfiguration.setLanguageConfiguration();
        
        try {
            cn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao tentar se desconectar do banco de dados.\nMensagem: " + e.getMessage());
        }
        return cn;
    }
    
}
