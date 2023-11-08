package procad.Data;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Marcelo
 * @since 07/11/2023
 */
public class DataModel {
    
    private Connection cn = null;
    
    private String dbconnection;
    private String username;
    private String password;
    
    public String setUsername(String username) {
        return this.username = username;
    }
    
    public String getUsername() {
        return this.username;
    }
 
    public String setPassword(String password) {
        return this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String setDatabaseConnectionString(String prefix, String url, int port, String database) {
        return this.dbconnection = prefix + "://" + url + ":" + String.valueOf(port) + "/" + database;
    }
    
    public String getDatabaseConnectionString() {
        return this.dbconnection;
    }

    public void connect() {
        try {
            cn = DriverManager.getConnection(getDatabaseConnectionString(), getUsername(), getPassword());
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
