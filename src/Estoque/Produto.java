package Estoque;

import java.util.ArrayList;
import principal.Principal;

public class Produto {
    String rotulo, descricao;
    float precoFabrica, precoVenda;
    int codProduto, qtdEstoque;

    public Produto(String rotulo, String descricao, float precoFabrica, float precoVenda, int qtdEstoque) {
        codProduto = Principal.estoque.size() + 1;
        this.rotulo = rotulo;
        this.descricao = descricao;
        this.precoFabrica = precoFabrica;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }
    
    public Produto() {
        codProduto = Principal.estoque.size() + 1;
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
}
