package procad.Data;

/**
 *
 * @author Marcelo
 */
public class DataModel {
    private String port = "3306";
    private String database = "ProCad";
    private String username = "root";
    private String password = "root";
    
    
    public String getPort() {
        return this.port;
    }
    
    public void setPort(String port) {
        this.port = port;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    /**
     * Method to set username of the connection with the database
     * @param username 
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }
 
    /**
     * Method to set password of the connection with the database
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getDatabaseInConnectionString() {
        return this.database;
    }
    
    /**
     * Method to set the database in connection string.
     * @param database 
     */
    public void setDatabaseInConnectionString(String database) {
        this.database = database;
    }

}
