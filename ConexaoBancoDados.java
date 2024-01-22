import java.sql.*;
import java.util.*;

public class ConexaoBancoDados {
    public static void main(String[] args) {
        Connection conexao = null;

        try {
           
            Class.forName("jdbc:mysql://localhost:3306/id_in\"");

          
            String url = "jdbc:sua:url:jdbc";
            String usuario = "seuUsuario";
            String senha = "suaSenha";
            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
         

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar ao banco de dados.");
        } finally {
            try {
                
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
