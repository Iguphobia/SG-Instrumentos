/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Estoque.Produto;
import Usuario.Usuario;
import java.util.ArrayList;
import javax.swing.*;


public class Principal {
    
    public static ArrayList estoque = new ArrayList();
    public static ArrayList usuarios = new ArrayList();
    
    public static Usuario userLogado = new Usuario();
    
    public static void main(String[] args) {
        JFrame janela = new JFrameLogin();
        janela.setVisible(true);
        inicializarEstoque();
        cadastrarAdminTeste();
    }
    
    public static void inicializarEstoque(){
        Produto prod1 = new Produto("Violão Folk Memphis - Cordas de Aço - Sunburst", "Violão Folk Memphis para uso com cordas de aço. Feito com madeira Liden e acabamento em Walnut, com captador elétrico Piezo com 3 ajustes. Acabamento com pintura estilo Sunburst.", 450, 610, 8);
        estoque.add(prod1);
        Produto prod2 = new Produto("Palheta", "Qualquer palheta do estojo, todas têm o mesmo preço", 0.25f, 1, 60);
        estoque.add(prod2);
        Produto prod3 = new Produto("Cordas Nylon Rouxinol - Com Bolinha - Tensão Alta", "Cordas para violão feitas de Nylon, com fios encapados em bronze. Com bolinhas para facilitar colocação. Acompanha palheta.", 14.99f, 21.99f, 10);
        estoque.add(prod3);
    }
    
    public static void cadastrarAdminTeste(){
        Usuario admin = new Usuario("admin", "senha", "Igor Nogueira Melo", "+55 19 99642-7608", "Rua Existente, nº -1, Bairro Ambíguo, Terceira Portland", true );
        usuarios.add(admin);
    }
}
