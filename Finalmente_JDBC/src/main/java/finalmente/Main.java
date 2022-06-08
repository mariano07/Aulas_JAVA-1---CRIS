package finalmente;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    
    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/clinica";
    static String user = "root";
    static String senha = "root";

    public static void main(String[] args) {
        
        try{
            System.out.println("Carregando o driver JDBC . . .");
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso!!");
        }catch(Exception e){
            System.out.println("Falha no carregamento!!");
        }
        
        try{
            System.out.println("Conectando ao banco . . .");
            Connection conexao = DriverManager.getConnection(url,user,senha);
            System.out.println("Conectando efetuada com sucesso!!");
        }catch(Exception e){
            System.out.println("Falha na conexao!!");
        }
    }
}
