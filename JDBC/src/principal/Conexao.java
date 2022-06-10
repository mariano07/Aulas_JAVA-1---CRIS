package principal;

import principal.JMain;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
    
    JMain jm = new JMain();
    Connection conexao = null;
    Connection con = conexao;
    Statement st = null;
    static String url = "jdbc:mysql://localhost:3306/escola";
    static String user = "root";
    static String senha = "root";
    
    public void conectar(){
         try{
            conexao = DriverManager.getConnection(url,user,senha);
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "ERRO", "Erro de conexão ao banco de dados!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void desconectar(){
        try {
            conexao.close();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO", "Erro banco não foi desconectado!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void incluir(String matricula, String nome, String email, String idade){
        conectar();
        try{
            String instrucaoSQL = "INSERT INTO Alunos(Matricula,Nome,Email,Idade)"
                    + "VALUES('" +matricula+ "','" +nome+ "','" +email+ "','" +idade+ "')";
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO", "Erro Dados não inseridos", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    
    public void alterar(String matricula, String nome, String email, String idade){
        conectar();
        try{
            
        }catch(Exception e){
            
        }
        desconectar();
    }
    
    public void excluir(String matricula, String nome, String email, String idade){
        conectar();
        try{
           String instrucaoSQL = "DELETE FROM alunos "
                   + "WHERE `alunos`.`Matricula` = '"+matricula+"' ";
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso"); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERRO", "Erro Dados não foram deletados", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    
    public void buscar(String matricula, String nome, String email, String idade){
        conectar();
        try{
            
        }catch(Exception e){
            
        }
        desconectar();
    }
}
