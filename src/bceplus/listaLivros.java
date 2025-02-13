package bceplus;

import Entidades.BancoDeDados;
import Entidades.Bibliotecario;
import Entidades.Usuario;
import Entidades.Livro;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author samuelcds
 */
public class listaLivros extends javax.swing.JFrame {
    Usuario user;
    Bibliotecario bibliotecario;
    BancoDeDados banco = BancoDeDados.getInstance();
    

    public listaLivros() {
        initComponents();
        
        livrosPainel.setLayout(new GridLayout(0 ,4 ,10, 10));
        
        for (Livro livro : banco.getLivro()) {
            try {
                // Verifica se o caminho da imagem não é nulo ou vazio
                String caminhoImagem = livro.getCaminhoImagem();
                ImageIcon imagemLivro;

                if (caminhoImagem != null && !caminhoImagem.isEmpty()) {
                    ImageIcon imagemOriginal = new ImageIcon(caminhoImagem);
                    Image imgRedimensionada = imagemOriginal.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                    imagemLivro = new ImageIcon(imgRedimensionada);
                } else {
                    // Imagem padrão caso não tenha uma imagem válida
                    imagemLivro = new ImageIcon("/home/samuelcds/Imagens/juri.jpeg");
                }

                JLabel labelLivro = new JLabel(imagemLivro);
                labelLivro.setToolTipText(livro.getTitulo()); // Mostra título ao passar o mouse
                labelLivro.setHorizontalAlignment(SwingConstants.CENTER);

                // Adiciona evento de clique para selecionar livro
                labelLivro.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, "Livro selecionado: " + livro.getTitulo());
                    }
                });

                livrosPainel.add(labelLivro);
            } catch (Exception e) {
                System.out.println("Erro ao carregar imagem: " + e.getMessage());
            }
        }

        // Ajusta o tamanho do painel para evitar problemas de exibição
        livrosPainel.setPreferredSize(new Dimension(450, 300)); 

        // Adiciona painel com rolagem
        JScrollPane scrollPane = new JScrollPane(livrosPainel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);
        
    }
    
    public listaLivros(Usuario user) {
        initComponents();

        livrosPainel.setLayout(new GridLayout(0, 4, 10, 10)); // Grade flexível

        for (Livro livro : banco.getLivro()) {
            try {
                // Verifica se o caminho da imagem não é nulo ou vazio
                String caminhoImagem = livro.getCaminhoImagem();
                ImageIcon imagemLivro;

                if (caminhoImagem != null && !caminhoImagem.isEmpty()) {
                    ImageIcon imagemOriginal = new ImageIcon(caminhoImagem);
                    Image imgRedimensionada = imagemOriginal.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
                    imagemLivro = new ImageIcon(imgRedimensionada);
                } else {
                    // Imagem padrão caso não tenha uma imagem válida
                    imagemLivro = new ImageIcon("/home/samuelcds/Imagens/juri.jpeg");
                }

                JLabel labelLivro = new JLabel(imagemLivro);
                labelLivro.setToolTipText(livro.getTitulo()); // Mostra título ao passar o mouse
                labelLivro.setHorizontalAlignment(SwingConstants.CENTER);

                // Adiciona evento de clique para selecionar livro
                labelLivro.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JOptionPane.showMessageDialog(null, "Livro selecionado: " + livro.getTitulo());
                    }
                });

                livrosPainel.add(labelLivro);
            } catch (Exception e) {
                System.out.println("Erro ao carregar imagem: " + e.getMessage());
            }
        }

        // Ajusta o tamanho do painel para evitar problemas de exibição
        livrosPainel.setPreferredSize(new Dimension(450, 300)); 

        // Adiciona painel com rolagem
        JScrollPane scrollPane = new JScrollPane(livrosPainel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    public listaLivros(Usuario user, Bibliotecario bibliotecario) {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLivros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botaoSelecionarLivro = new javax.swing.JButton();
        botaoEditarLivro = new javax.swing.JButton();
        livrosPainel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLivros.setFont(new java.awt.Font("Annapurna SIL", 1, 24)); // NOI18N
        tituloLivros.setText("Livros Disponveis:");

        jLabel1.setFont(new java.awt.Font("Annapurna SIL", 0, 15)); // NOI18N
        jLabel1.setText("Selecione um livro:");

        botaoSelecionarLivro.setText("Selecionar Livro");
        botaoSelecionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarLivroActionPerformed(evt);
            }
        });

        botaoEditarLivro.setText("Editar Livro");
        botaoEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout livrosPainelLayout = new javax.swing.GroupLayout(livrosPainel);
        livrosPainel.setLayout(livrosPainelLayout);
        livrosPainelLayout.setHorizontalGroup(
            livrosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        livrosPainelLayout.setVerticalGroup(
            livrosPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(tituloLivros))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 220, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoEditarLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSelecionarLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(livrosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(livrosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSelecionarLivro)
                    .addComponent(botaoEditarLivro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSelecionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarLivroActionPerformed
        
    }//GEN-LAST:event_botaoSelecionarLivroActionPerformed

    private void botaoEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarLivroActionPerformed
        JOptionPane.showMessageDialog(null, "Voce não possui autorizacao para alterar livros!", "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }//GEN-LAST:event_botaoEditarLivroActionPerformed

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
            java.util.logging.Logger.getLogger(listaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listaLivros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaLivros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarLivro;
    private javax.swing.JButton botaoSelecionarLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel livrosPainel;
    private javax.swing.JLabel tituloLivros;
    // End of variables declaration//GEN-END:variables
}
