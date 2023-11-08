package procad.Data;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Marcelo
 * @since 07/11/2023
 */
public class Data {
    
    private Connection cn = null;
    private PreparedStatement pst = null;
    
    private String getPrefix(){
        String prefix = "jdbc:mysql";
        return prefix;
    }
    
    private String getAddress() {
        String address = "localhost";
        return address;
    }
    
    private int getPort() {
        int port = 3307;
        return port;
    }
    
    private String getDatabase() {
        String db = "procad";
        return db;
    }
    
    private String getUsername() {
        String username = "root";
        return username;
    }
    
    private String getPassword() {
        String pw = "qnq32800";
        return pw;
    }
    
    public void connect() {
        String server = getPrefix() + "://" + getAddress() + ":" + String.valueOf(getPort()) + "/" + getDatabase();
        
        try {
            cn = DriverManager.getConnection(server, getUsername(), getPassword());
        } catch (SQLException e) {
            System.out.println("""
                               Erro ao tentar se conectar com o banco de dados.
                               Mensagem: """ + e.getMessage());
        }
    }
    
    public void disconnect() {
        try {
            cn.close();
        } catch (SQLException e) {
            System.out.println("""
                               Erro ao tentar se desconectar do banco de dados.
                               Mensagem: """ + e.getMessage());
        }
    }
}
