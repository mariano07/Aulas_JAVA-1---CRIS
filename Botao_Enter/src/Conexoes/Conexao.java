package Conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    ResultSet result = null;
    static String url = "jdbc:mysql://localhost:3306/testes";
    static String user = "root";
    static String senha = "";
    
    public void conectar(){
         try{
            conexao = DriverManager.getConnection(url,user,senha);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro de conexão ao banco de dados!!","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void desconectar(){
        try {
            st.close();
            conexao.close();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro banco não foi desconectado!!","ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void incluir(String nome){
        conectar();
        try{
            String instrucaoSQL = "INSERT INTO nomes(Nome)"
                    + "VALUES('"+nome+"')";
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro Dados não inseridos","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
}
