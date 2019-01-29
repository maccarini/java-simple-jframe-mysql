
package clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Sergio Aguayo
 */
public class ConnToMysql {
    private static Connection conn;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root2018";
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    //Constructor
    public ConnToMysql()
    {
        conn = null;
        String url = URL ;
        try{
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(url, USER, PASSWORD);
        if (conn != null){
            System.out.println("Conexión Establecida...");
        }
        }catch (ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al intentar conectar: "+e);
        }
    
    }
    //Este metodo nos devuelve la conexión
    public Connection getConnection()
    {
        return conn;
    }
    
    
}
