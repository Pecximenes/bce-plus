package bceplus;

import Entidades.BancoDeDados;
import Entidades.Bibliotecario;
import Entidades.Usuario;
import Entidades.Livro;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
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
    List<Livro> livrosSelec;
    

public listaLivros() {
    initComponents();

    int colunas = 3; // Máximo de 4 livros por linha
    int maxLivros = 12; // Máximo de livros a exibir (opcional)

    // Calcula quantas linhas são necessárias
    int linhas = (int) Math.ceil(Math.min(banco.getLivro().size(), maxLivros) / (double) colunas);

    // Se não houver livros, encerra
    if (banco.getLivro() == null || banco.getLivro().isEmpty()) {
        System.out.println("Erro: banco de dados não foi inicializado ou está vazio!");
        return;
    }

    // Layout fixo com linhas variáveis e colunas fixas
    livrosPainel.setLayout(new GridLayout(linhas, colunas, 10, 10)); 

    // Adiciona livros até o limite
    int count = 0;
    for (Livro livro : banco.getLivro()) {
        if (count >= maxLivros) break; // Limita a quantidade de livros

        JLabel labelLivro = new JLabel(livro.getTitulo(), SwingConstants.CENTER);
        labelLivro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        labelLivro.addMouseListener(new MouseAdapter() {
            private boolean clicado = false;
            @Override
            public void mouseClicked(MouseEvent e) {
                if (clicado) {
                    labelLivro.setBackground(Color.LIGHT_GRAY); // Volta à cor original
                } else {
                    labelLivro.setBackground(Color.GREEN); // Muda para verde
                }
                clicado = !clicado; // Alterna o estado
            }
        });
        
        labelLivro.setOpaque(true); // Permite que a cor de fundo apareça
        labelLivro.setBackground(Color.LIGHT_GRAY); // Define a cor de fundo
        labelLivro.setForeground(Color.BLACK); // Define a cor do texto
        livrosPainel.add(labelLivro);
        count++;
    }

    livrosPainel.revalidate();
    livrosPainel.repaint();
}
    
public listaLivros(Usuario user) {
    initComponents();

    int colunas = 3; // Máximo de 4 livros por linha
    int maxLivros = 12; // Máximo de livros a exibir (opcional)

    // Calcula quantas linhas são necessárias
    int linhas = (int) Math.ceil(Math.min(banco.getLivro().size(), maxLivros) / (double) colunas);

    // Se não houver livros, encerra
    if (banco.getLivro() == null || banco.getLivro().isEmpty()) {
        System.out.println("Erro: banco de dados não foi inicializado ou está vazio!");
        return;
    }

    // Layout fixo com linhas variáveis e colunas fixas
    livrosPainel.setLayout(new GridLayout(linhas, colunas, 10, 10)); 

    // Adiciona livros até o limite
    int count = 0;
    for (Livro livro : banco.getLivro()) {
        if (count >= maxLivros) break; // Limita a quantidade de livros

        JLabel labelLivro = new JLabel(livro.getTitulo(), SwingConstants.CENTER);
        labelLivro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        labelLivro.addMouseListener(new MouseAdapter() {
            private boolean clicado = false;
            @Override
            public void mouseClicked(MouseEvent e) {
                if (clicado) {
                    labelLivro.setBackground(Color.LIGHT_GRAY); // Volta à cor original
                } else {
                    labelLivro.setBackground(Color.GREEN); // Muda para verde
                }
                clicado = !clicado; // Alterna o estado
            }
        });
        
        labelLivro.setOpaque(true); // Permite que a cor de fundo apareça
        labelLivro.setBackground(Color.LIGHT_GRAY); // Define a cor de fundo
        labelLivro.setForeground(Color.BLACK); // Define a cor do texto
        livrosPainel.add(labelLivro);
        count++;
    }

    livrosPainel.revalidate();
    livrosPainel.repaint();
}
    
public listaLivros(Usuario user, Bibliotecario bibliotecario) {
    initComponents();

    int colunas = 3; // Máximo de 4 livros por linha
    int maxLivros = 12; // Máximo de livros a exibir (opcional)

    // Calcula quantas linhas são necessárias
    int linhas = (int) Math.ceil(Math.min(banco.getLivro().size(), maxLivros) / (double) colunas);

    // Se não houver livros, encerra
    if (banco.getLivro() == null || banco.getLivro().isEmpty()) {
        System.out.println("Erro: banco de dados não foi inicializado ou está vazio!");
        return;
    }

    // Layout fixo com linhas variáveis e colunas fixas
    livrosPainel.setLayout(new GridLayout(linhas, colunas, 10, 10)); 

    // Adiciona livros até o limite
    int count = 0;
    for (Livro livro : banco.getLivro()) {
        if (count >= maxLivros) break; // Limita a quantidade de livros

        JLabel labelLivro = new JLabel(livro.getTitulo(), SwingConstants.CENTER);
        labelLivro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        labelLivro.addMouseListener(new MouseAdapter() {
            private boolean clicado = false;
            @Override
            public void mouseClicked(MouseEvent e) {
                if (clicado) {
                    labelLivro.setBackground(Color.LIGHT_GRAY); // Volta à cor original
                } else {
                    labelLivro.setBackground(Color.GREEN); // Muda para verde
                }
                clicado = !clicado; // Alterna o estado
            }
        });
        
        labelLivro.setOpaque(true); // Permite que a cor de fundo apareça
        labelLivro.setBackground(Color.LIGHT_GRAY); // Define a cor de fundo
        labelLivro.setForeground(Color.BLACK); // Define a cor do texto
        livrosPainel.add(labelLivro);
        count++;
    }

    livrosPainel.revalidate();
    livrosPainel.repaint();
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
            .addGap(0, 410, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(livrosPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
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
