/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vendas;

import Database.AcessoDB;
import Estoque.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author igorn
 */
public class JPanelVenda extends javax.swing.JPanel {

    DefaultListModel<String> listaCompras = new DefaultListModel<>();
    
    public JPanelVenda() {
        initComponents();
        atualizarComboBox();
    }

    private void atualizarComboBox(){
        cbProdutos.removeAll();
        ArrayList cbOpcoes = new ArrayList();
        String opcoes;
        
        AcessoDB db = new AcessoDB();
        ResultSet rsProdutos = db.consultar("SELECT codProduto, rotulo FROM produto");
        
        try {
            while (rsProdutos.next()) {
                opcoes = rsProdutos.getInt("codProduto") + " - " + rsProdutos.getString("rotulo");
                cbOpcoes.add(opcoes);
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar atualizar a lista de produtos: " + e.toString());
        }
        finally {
            db.fecharConexao();
        }
        
        cbProdutos.setModel(new javax.swing.DefaultComboBoxModel(cbOpcoes.toArray()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lsProdutos = new javax.swing.JList<>();
        lbProduto = new javax.swing.JLabel();
        cbProdutos = new javax.swing.JComboBox<>();
        btAdicionar = new javax.swing.JButton();
        spQuantidade = new javax.swing.JSpinner();
        lbQuantidade = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btConcluir = new javax.swing.JButton();

        jScrollPane1.setViewportView(lsProdutos);

        lbProduto.setText("Produto:");

        cbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutosActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        spQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        lbQuantidade.setText("Qtd:");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btConcluir.setText("Concluir");
        btConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btConcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduto)
                    .addComponent(cbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar)
                    .addComponent(spQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btRemover)
                    .addComponent(btConcluir))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try {
            spQuantidade.commitEdit();
        }
        catch (java.text.ParseException e ) {
            System.out.println(e);
        }
        
        String opcao = (String)cbProdutos.getSelectedItem();
        String[] cod = opcao.split(" ", 2);
        
        Produto prod = new Produto(Integer.parseInt(cod[0]));
        
        if ((int)spQuantidade.getValue() < 1 ) {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar pelo menos uma unidade.");
        }
        else if (prod.getQtdEstoque() < (int)spQuantidade.getValue()) {
            JOptionPane.showMessageDialog(null, "Estoque insuficiente, selecione uma quantidade menor.");
        }
        else {
            String linha = opcao + " - " + spQuantidade.getValue() + " Unidades";
            listaCompras.addElement(linha);
            lsProdutos.setModel(listaCompras);
            lsProdutos.validate();
        }
        
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void cbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutosActionPerformed
        String opcao = (String)cbProdutos.getSelectedItem();
        String[] cod = opcao.split(" ", 2);
        Produto prod = new Produto(Integer.parseInt(cod[0]));
        
        spQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, prod.getQtdEstoque(), 1));
    }//GEN-LAST:event_cbProdutosActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparLista();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        listaCompras.removeElementAt(lsProdutos.getSelectedIndex());
        lsProdutos.setModel(listaCompras);
        lsProdutos.validate();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConcluirActionPerformed
        for (int i = 0; i < listaCompras.getSize(); i++){
            String linha = (String)listaCompras.getElementAt(i);
            String[] cod = linha.split(" ");
            
            Produto prod = new Produto(Integer.parseInt(cod[0]));
            
            int qtdVendida = Integer.parseInt(cod[cod.length - 2]);
            prod.setQtdEstoque(prod.getQtdEstoque() - qtdVendida);
            
            prod.atualizarProduto();
        }
        
        JOptionPane.showMessageDialog(null, "Venda concluída!");
        limparLista();
        atualizarComboBox();
    }//GEN-LAST:event_btConcluirActionPerformed

    private void limparLista() {
        listaCompras.removeAllElements();
        lsProdutos.setModel(listaCompras);
        lsProdutos.validate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btConcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemover;
    private javax.swing.JComboBox<String> cbProdutos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JList<String> lsProdutos;
    private javax.swing.JSpinner spQuantidade;
    // End of variables declaration//GEN-END:variables
}
