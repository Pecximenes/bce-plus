/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bceplus;

/**
 *
 * @author Davy
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    private String tipoUsuario; // Variável para armazenar o tipo de usuário

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
        initComponents();
        ajustarBotoesPorTipoUsuario();
    }

    private void ajustarBotoesPorTipoUsuario() {
        // Resetar visibilidade de todos os botões
        BotaoCadastroUsuario.setVisible(false);
        BotaoCadastroLivros.setVisible(false);
        BotaoCadastroBibliotecario.setVisible(false);

        switch (tipoUsuario) {
            case "comum":
                // Comum: Empréstimo e Acervo
                BotaoCadastroUsuario.setVisible(false);
                BotaoCadastroLivros.setVisible(false);
                BotaoCadastroBibliotecario.setVisible(false);
                break;
            case "professor":
                // Professor: Empréstimo e Acervo
                BotaoCadastroUsuario.setVisible(false);
                BotaoCadastroLivros.setVisible(false);
                BotaoCadastroBibliotecario.setVisible(false);
                break;
            case "bibliotecario":
                // Bibliotecário: Empréstimo, Acervo, Cadastro de Usuário e Livro
                BotaoCadastroUsuario.setVisible(true);
                BotaoCadastroLivros.setVisible(true);
                BotaoCadastroBibliotecario.setVisible(false);
                break;
            case "adm":
                // Administrador: Todos os botões
                BotaoCadastroUsuario.setVisible(true);
                BotaoCadastroLivros.setVisible(true);
                BotaoCadastroBibliotecario.setVisible(true);
                break;
            default:
                // Caso padrão (não deve acontecer)
                BotaoCadastroUsuario.setVisible(false);
                BotaoCadastroLivros.setVisible(false);
                BotaoCadastroBibliotecario.setVisible(false);
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightComponent = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotaoEmprestimo = new javax.swing.JButton();
        BotaoAcervo = new javax.swing.JButton();
        BotaoCadastroUsuario = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        BotaoCadastroBibliotecario = new javax.swing.JButton();
        BotaoCadastroLivros = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RightComponent.setBackground(new java.awt.Color(255, 255, 255));
        RightComponent.setMaximumSize(new java.awt.Dimension(1920, 1080));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 150);
        flowLayout1.setAlignOnBaseline(true);
        RightComponent.setLayout(flowLayout1);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bceLogo.png"))); // NOI18N
        RightComponent.add(jLabel5);

        jPanel4.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel1.setFont(new java.awt.Font("Roboto Condensed", 1, 18)); // NOI18N
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(169, 169, 169))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        BotaoEmprestimo.setText("Empréstimos");
        BotaoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEmprestimoActionPerformed(evt);
            }
        });

        BotaoAcervo.setText("Acervo");
        BotaoAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAcervoActionPerformed(evt);
            }
        });

        BotaoCadastroUsuario.setText("Cadastro de Usuário");
        BotaoCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroUsuarioActionPerformed(evt);
            }
        });

        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        BotaoCadastroBibliotecario.setText("Cadastro de Bibliotecários");
        BotaoCadastroBibliotecario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroBibliotecarioActionPerformed(evt);
            }
        });

        BotaoCadastroLivros.setText("Cadastro de Livros");
        BotaoCadastroLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastroLivrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotaoSair)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoCadastroBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoCadastroLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(BotaoAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCadastroLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCadastroBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(BotaoSair)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 229, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 412, Short.MAX_VALUE)
                    .addComponent(RightComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(RightComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroUsuarioActionPerformed
        // TODO add your handling code here:
        // Cria uma instância da janela de cadastro de usuário
        //CadastroUsuario cadastroUsuario = new CadastroUsuario();
        // Torna a janela visível
        //cadastroUsuario.setVisible(true);
        // Centraliza a janela na tela
        //cadastroUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoCadastroUsuarioActionPerformed

    private void BotaoAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAcervoActionPerformed
        // TODO add your handling code here:
        listaLivros lista = new listaLivros();
        // Torna a janela visível
        lista.setVisible(true);
        // Centraliza a janela na tela
        lista.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoAcervoActionPerformed

    private void BotaoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEmprestimoActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoCadastroBibliotecarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroBibliotecarioActionPerformed
        // TODO add your handling code here:
        // Cria uma instância da janela de cadastro de bibliotecário
    CadastroBibliotecario cadastroBibliotecario = new CadastroBibliotecario();
    // Torna a janela visível
    cadastroBibliotecario.setVisible(true);
    // Centraliza a janela na tela
    cadastroBibliotecario.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoCadastroBibliotecarioActionPerformed

    private void BotaoCadastroLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastroLivrosActionPerformed
        // TODO add your handling code here:
        // Cria uma instância da janela de cadastro de livro
        //cadastroLivro cadastroLivro = new cadastroLivro(bibliotecario); // Passa o bibliotecário como parâmetro
        // Torna a janela visível
        //cadastroLivro.setVisible(true);
        // Centraliza a janela na tela
        //cadastroLivro.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotaoCadastroLivrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Exemplo de uso:
                // Para usuário comum
                new TelaMenu("comum").setVisible(true);

                // Para professor
                new TelaMenu("professor").setVisible(true);

                // Para bibliotecário
                new TelaMenu("bibliotecario").setVisible(true);

                // Para administrador
                new TelaMenu("adm").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAcervo;
    private javax.swing.JButton BotaoCadastroBibliotecario;
    private javax.swing.JButton BotaoCadastroLivros;
    private javax.swing.JButton BotaoCadastroUsuario;
    private javax.swing.JButton BotaoEmprestimo;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JPanel RightComponent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
