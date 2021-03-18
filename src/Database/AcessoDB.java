package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AcessoDB {
    private Connection con;
    private Statement st;
    
    public AcessoDB() {
        con = null;
        st = null;
    }
    
    public void executar(String query){
        conectar();
        
        try{
            st.executeUpdate(query);
            System.out.println("Comando executado.");
        }
        catch (SQLException e){
            System.out.println("Erro ao executar comando: " + e.toString());
        }
        finally {
            fecharConexao();
        }
    }
    
    public ResultSet consultar(String query){
        ResultSet rs = null;
        conectar();
        
        try{
            rs = st.executeQuery(query);
        }
        catch (SQLException e) {
            System.out.println("Erro ao tentar consulta: " + e.toString());
        }
        
        return rs;
    }
    
    public void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sgInstrumentos?user=root&&password=SQLStrongRootPassword");
            System.out.println("Conexão com BD estabelecida");
            
            st = con.createStatement();
        }
        catch (SQLException e){
            System.out.println("Erro ao conectar com o banco: " + e.toString());
        }
        catch (ClassNotFoundException e) {
            System.out.println("Erro ao conectar com o banco: " + e.toString());
        }
        
    }
    
    public void fecharConexao(){
        try{
            st.close();
            con.close();
        }
        catch (SQLException e){
            System.out.println("Erro ao fechar conexão: " + e.toString());
        }
    }
}
