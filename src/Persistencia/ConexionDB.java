package Persistencia;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionDB {
    private final String host=this.LeerProperties("host");
    private final String port=this.LeerProperties("port");
    private final String db=this.LeerProperties("db");
    private final String user=this.LeerProperties("user");
    private final String pass=this.LeerProperties("pass");
   
    
    private Connection conexion=null;
    public ConexionDB(){};
    
    public String LeerProperties(String caso) {
           
        switch (caso) {
            case "host":  return "127.0.0.1";//prop.getProperty("host");
       
            case "port":  return "3306";//prop.getProperty("port");
                     
            case "db":  return "sofkachallenge";//prop.getProperty("db");
                     
            case "user":  return "root";//prop.getProperty("user");
                     
            case "pass":  return "federico12349";//prop.getProperty("pass");

            default: return "";
              
        }     
    }
   
    public Connection getConexion() {
           
        if (conexion == null) {
            try {
                Driver driver = new com.mysql.jdbc.Driver();
                DriverManager.registerDriver(driver);
                
                conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?characterEncoding=utf8", user, pass);
                System.out.println("Conectado");
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion;
    }
    
    public void cerrar(){
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
}