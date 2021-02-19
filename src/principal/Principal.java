/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Estoque.Produto;
import java.util.ArrayList;
import javax.swing.*;



public class Principal {
    
    public static ArrayList estoque = new ArrayList();
    
    public static void main(String[] args) {
        JFrame janela = new JFramePrincipal();
        janela.setVisible(true);
        inicializarEstoque();
    }
    
    public static void inicializarEstoque(){
        Produto prod1 = new Produto("Violão Folk Memphis - Cordas de Aço - Sunburst", "Violão Folk Memphis para uso com cordas de aço. Feito com madeira Liden e acabamento em Walnut, com captador elétrico Piezo com 3 ajustes. Acabamento com pintura estilo Sunburst.", 450, 610, 8);
        estoque.add(prod1);
        Produto prod2 = new Produto("Palheta", "Qualquer palheta do estojo, todas têm o mesmo preço", 0.25f, 1, 60);
        estoque.add(prod2);
        Produto prod3 = new Produto("Cordas Nylon Rouxinol - Com Bolinha - Tensão Alta", "Cordas para violão feitas de Nylon, com fios encapados em bronze. Com bolinhas para facilitar colocação. Acompanha palheta.", 14.99f, 21.99f, 10);
        estoque.add(prod3);
    }
}
