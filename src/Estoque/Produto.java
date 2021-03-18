package Estoque;

import Database.AcessoDB;
import Principal.Principal;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Produto {

    String rotulo, descricao;
    float precoFabrica, precoVenda;
    int codProduto, qtdEstoque;

    public Produto(String rotulo, String descricao, float precoFabrica, float precoVenda, int qtdEstoque) {
        this.rotulo = rotulo;
        this.descricao = descricao;
        this.precoFabrica = precoFabrica;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }
    
    public Produto(String rotulo, String descricao, float precoFabrica, float precoVenda, int qtdEstoque, int codProduto) {
        this.codProduto = codProduto;
        this.rotulo = rotulo;
        this.descricao = descricao;
        this.precoFabrica = precoFabrica;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }
    
    public Produto (int codProduto) {
        AcessoDB db = new AcessoDB();
        
        String query = "SELECT * FROM produto WHERE codProduto = " + codProduto + ";";
        ResultSet dadosProduto = db.consultar(query);
        
        try {
            dadosProduto.next();
            this.rotulo = dadosProduto.getString("rotulo");
            this.descricao = dadosProduto.getString("descricao");
            this.precoFabrica = dadosProduto.getFloat("precoFabrica");
            this.precoVenda = dadosProduto.getFloat("precoVenda");
            this.qtdEstoque = dadosProduto.getInt("qtdEstoque");
        }
        catch (SQLException e){
            System.out.println("Erro ao buscar produto: " + e.toString());
        }
        
        db.fecharConexao();
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPrecoFabrica() {
        return precoFabrica;
    }

    public void setPrecoFabrica(float precoFabrica) {
        this.precoFabrica = precoFabrica;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void novoProduto() {
        String query = "INSERT INTO produto VALUES(null, '" + this.getRotulo() + "', "
                + "'" + this.getDescricao() + "', "
                + "" + this.getPrecoFabrica() + ", "
                + "" + this.getPrecoVenda() + ", "
                + "" + this.getQtdEstoque() + ");";
        
        AcessoDB db = new AcessoDB();
        db.executar(query);
    }
    
    public void atualizarProduto() {
        String query = "UPDATE produto SET "
                + "rotulo = '" + this.rotulo + "', "
                + "descricao = '" + this.descricao + "', "
                + "precoFabrica = " + this.precoFabrica + ", "
                + "precoVenda = " + this.precoVenda + ", "
                + "qtdEstoque = " + this.qtdEstoque + " "
                + "WHERE codProduto = " + this.codProduto + ";";
        
        AcessoDB db = new AcessoDB();
        db.executar(query);
    }
}
