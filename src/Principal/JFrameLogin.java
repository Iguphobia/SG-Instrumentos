/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import static Principal.Principal.usuarios;
import Usuario.JanelaCadUsuario;
import Usuario.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author igorn
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
    }                               

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbHeader = new javax.swing.JLabel();
        lbBemVindo = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        btCadUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbHeader.setText("SG Instrumentos");

        lbBemVindo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lbBemVindo.setText("Bem vindo(a)!");

        lbUsuario.setText("Usuário:");

        lbSenha.setText("Senha:");

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btCadUsuario.setText("Cadastrar usuário");
        btCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSenha)
                                    .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbBemVindo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfUsuario)
                                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCadUsuario)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBemVindo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrar)
                    .addComponent(btCadUsuario))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario user = (Usuario)usuarios.get(i);
            
            if (tfUsuario.getText().equals(user.getUsername())) {
                if ( (tfSenha.getText().equals(user.getSenha()))) {
                    Principal.userLogado = user;
                    JFrame janela = new JFramePrincipal();
                    janela.setVisible(true);
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente.");
                    break;
                }
            }
            else {
                if (i == usuarios.size() - 1){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
            }
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadUsuarioActionPerformed
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario user = (Usuario)usuarios.get(i);
            
            if (tfUsuario.getText().equals(user.getUsername())) {
                if ( (tfSenha.getText().equals(user.getSenha()))) {
                    if (user.isAdmin()){
                        JFrame cadastro = new JanelaCadUsuario();
                        cadastro.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Usuário não é administrador! Insira credenciais de administrador para continuar.");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente.");
                    break;
                }
            }
            else {
                if (i == usuarios.size() - 1){
                    JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                }
            }
        }
    }//GEN-LAST:event_btCadUsuarioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadUsuario;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel lbBemVindo;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
