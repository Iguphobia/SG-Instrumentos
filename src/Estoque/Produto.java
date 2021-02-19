package Estoque;

import java.util.ArrayList;
import principal.Principal;

public class Produto {
    String rotulo, descricao;
    float precoCusto, precoVenda;
    int codProduto, qtdEstoque;

    public Produto(String rotulo, String descricao, float precoCusto, float precoVenda, int qtdEstoque) {
        codProduto = Principal.estoque.size() + 1;
        this.rotulo = rotulo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
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

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
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
