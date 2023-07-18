package cadastro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
   public static Connection getConnection(String driver, String url, String user, String pwd) {
      Connection conn = null;

      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, user, pwd);
      } catch (ClassNotFoundException cnfe) {
         System.out.println("Não foi possível encontrar o driver JDBC");
      } catch (SQLException se) {
         System.out.println("Não foi possível conectar ao Banco de Dados");
      }

      return conn;
   }
}
