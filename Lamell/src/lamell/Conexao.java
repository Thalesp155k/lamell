
package lamell;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public Connection conn;
    public String url = "jdbc:mysql://localhost:3306/lamelldb"; 
    public String user = "root"; 
    public String password = "farcrys2"; 
    
     public boolean conectar(){
        
        try {
                        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
            return true;
             } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco" +" "+ ex.getMessage());
            return false;
        }
    }
      public Connection getConnection() {
    return conn;
}
}
