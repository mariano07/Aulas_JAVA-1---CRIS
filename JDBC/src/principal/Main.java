package principal;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    static String url = "jdbc:mysql://localhost:3306/escola";
    static String user = "root";
    static String senha = "root";
    
    public static void main(String[] args) {
        Connection conexao = null;
        Connection con = conexao;
        Statement st = null;
        ResultSet result = null; 
        String instrucaoSQL = "Select * from aluno";
        try{
            System.out.println("Conectando ao banco . . .");
            conexao = DriverManager.getConnection(url,user,senha);
            System.out.println("Conectando efetuada com sucesso!!");
            
            System.out.println("Consultando dados da tabela aguarde . . .");
            st = conexao.createStatement();
            result = st.executeQuery(instrucaoSQL);
            while(result.next()){
                System.out.println("+-------------------------+");
                System.out.println("Matricula: " + result.getInt(1));
                System.out.println("Nome: " + result.getString(2));
                System.out.println("Email: " + result.getString(3));
                System.out.println("Idade: " + result.getInt(4));
            }
            st.close();
            conexao.close();
        }catch(Exception e){
            System.out.println("ERRO");
        }
        
    }
}
