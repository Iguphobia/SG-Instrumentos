
package Usuario;

public class Usuario {
    String Username = "";
    String Senha = "";
    String Nome = "";
    String Telefone = "";
    String Endereço = "";
    boolean Admin = false;

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    public Usuario() {
        
    }
    
    public Usuario(String username, String senha, String nome, String telefone, String endereco, boolean admin) {
        this.Username = username;
        this.Senha = senha;
        this.Nome = nome;
        this.Telefone = telefone;
        this.Endereço = endereco;
        this.Admin = admin;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.Admin = isAdmin;
    }
    
    
    
}
