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
    ResultSet result = null;
    static String url = "jdbc:mysql://localhost:3306/escola";
    static String user = "root";
    static String senha = "root";
    
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
    
    public void incluir(String matricula, String nome, String email, String idade){
        conectar();
        try{
            String instrucaoSQL = "INSERT INTO alunos(Matricula,Nome,Email,Idade)"
                    + "VALUES('" +matricula+ "','" +nome+ "','" +email+ "','" +idade+ "')";
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro Dados não inseridos","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    
    public void alterar(String matricula, String nome, String email, String idade){
        conectar();
        try{
            String instrucaoSQL = "UPDATE `alunos` SET "
                    + "`Matricula`='"+matricula+"',`Nome`='"+nome+"',`Email`='"+email+"',`Idade`='"+idade+"' "
                    + "WHERE `Matricula` = '"+matricula+"'";
            st = conexao.createStatement();
            st.executeUpdate(instrucaoSQL);
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro Dados não atualizados","ERRO", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Erro Dados não foram deletados","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
    }
    
    public String[] buscar(String matricula, String nome, String email, String idade){
        conectar();
        String[] dados = new String[4];
        try{
            String instrucaoSQL = "SELECT `Matricula`, `Nome`, `Email`, `Idade` FROM `alunos` "
                    + "WHERE `Matricula` = '"+matricula+"'";
            st = conexao.createStatement();
            result = st.executeQuery(instrucaoSQL);
            while(result.next()){
                dados[0] = result.getString(1);
                dados[1] = result.getString(2);
                dados[2] = result.getString(3);
                dados[3] = result.getString(4);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro não foi possivel buscar os dados","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectar();
        return dados;
    }
}
