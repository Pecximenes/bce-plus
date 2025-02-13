import Entidades.BancoDeDados;
import Entidades.Livro;
import Entidades.Bibliotecario;
import java.awt.Image;
import java.awt.MediaTracker;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author samuelcds
 */

public class cadastroLivro extends javax.swing.JFrame {
     private Bibliotecario bibliotecario;
     private Livro livro;

    public cadastroLivro(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
        
        initComponents();
    }
    
    public cadastroLivro(Livro livro, Bibliotecario bibliotecario) {
        this.livro = livro;
        initComponents();
        
        if (livro != null) {
            tituloInserido.setText(livro.getTitulo());
            autorInserido.setText(livro.getAutor());
            editora.setText(livro.getEditora());
            anoInserido.setText(String.valueOf(livro.getAnoPublicacao()));
            copiaFisica.setSelected(livro.isDisponivelFisico());
            livroRaro.setSelected(livro.isLivroRaro());
            copiaDigital.setSelected(livro.isDisponivelDigital());
            caminhoImagem.setText(livro.getCaminhoImagem());
            Categoria.setText(livro.getCategoria());
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

        CadastroDeLivros = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        tituloInserido = new javax.swing.JTextField();
        autor = new javax.swing.JLabel();
        autorInserido = new javax.swing.JTextField();
        editora = new javax.swing.JLabel();
        editoraInserida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        anoInserido = new javax.swing.JTextField();
        copiaFisica = new javax.swing.JCheckBox();
        copiaDigital = new javax.swing.JCheckBox();
        livroRaro = new javax.swing.JCheckBox();
        caminhoImagem = new javax.swing.JTextField();
        selecImagem = new javax.swing.JToggleButton();
        caminhoPDF = new javax.swing.JTextField();
        pdfSelec = new javax.swing.JButton();
        botaoCalcelar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Categoria = new javax.swing.JTextField();
        imagemLocal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        CadastroDeLivros.setFont(new java.awt.Font("Annapurna SIL", 1, 24)); // NOI18N
        CadastroDeLivros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CadastroDeLivros.setText("Cadastro de Livros");

        Titulo.setText("Título:");

        tituloInserido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloInseridoActionPerformed(evt);
            }
        });

        autor.setText("Autor:");

        editora.setText("Editora:");

        jLabel1.setText("Ano da Publicação:");

        copiaFisica.setText("Cópia Física.");

        copiaDigital.setText("Cópia Digital.");

        livroRaro.setText("Livro Raro.");

        caminhoImagem.setEditable(false);

        selecImagem.setText("Selecionar Imagem");
        selecImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecImagemActionPerformed(evt);
            }
        });

        caminhoPDF.setEditable(false);
        caminhoPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminhoPDFActionPerformed(evt);
            }
        });

        pdfSelec.setText("Selecionar PDF");
        pdfSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfSelecActionPerformed(evt);
            }
        });

        botaoCalcelar.setText("Cancelar");
        botaoCalcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcelarActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloInserido)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(autorInserido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editoraInserida, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(autor)
                                .addGap(245, 245, 245)
                                .addComponent(editora))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(anoInserido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(copiaFisica)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(livroRaro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(copiaDigital)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(caminhoImagem)
                                    .addComponent(caminhoPDF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(botaoCalcelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoSalvar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selecImagem, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pdfSelec, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(CadastroDeLivros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastroDeLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloInserido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autor)
                    .addComponent(editora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorInserido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editoraInserida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(copiaFisica)
                    .addComponent(livroRaro)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(anoInserido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(copiaDigital))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagemLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caminhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecImagem)
                        .addGap(31, 31, 31)
                        .addComponent(caminhoPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pdfSelec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoSalvar)
                            .addComponent(botaoCalcelar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloInseridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloInseridoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloInseridoActionPerformed

    private void selecImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecImagemActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos (JPG, JPEG e PNG)", "jpg", "jpeg", "png");
        arquivo.setFileFilter(filter);
        arquivo.setDialogTitle("Abrir Imagem");
        arquivo.showOpenDialog(null);
        File selecArq = arquivo.getSelectedFile();
        caminhoImagem.setText(selecArq.getAbsolutePath());
        
        // Verifica se o arquivo selecionado não é nulo
            if (selecArq != null) {
                ImageIcon icon = new ImageIcon(selecArq.getPath());
                // Verifica se a imagem foi carregada corretamente
                if (icon.getImageLoadStatus() == MediaTracker.COMPLETE) {
                    // Redimensionando a imagem para se ajustar à JLabel
                    Image image = icon.getImage();
                    Image newImg = image.getScaledInstance(imagemLocal.getWidth(), imagemLocal.getHeight(),
                            java.awt.Image.SCALE_SMOOTH);
                    icon = new ImageIcon(newImg);

                    // Definindo a imagem na JLabel
                    imagemLocal.setIcon(icon);

                    caminhoImagem.setText(selecArq.getAbsolutePath());

                } else {
                    System.out.println("Erro ao carregar a imagem.");
                }
            } else {
                System.out.println("Nenhum arquivo foi selecionado.");
            }
    }//GEN-LAST:event_selecImagemActionPerformed

    private void caminhoPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminhoPDFActionPerformed
        
    }//GEN-LAST:event_caminhoPDFActionPerformed

    private void botaoCalcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCalcelarActionPerformed

    private void pdfSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfSelecActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos PDF (PDF)", "pdf");
        arquivo.setFileFilter(filter);
        arquivo.setDialogTitle("Abrir PDF");
        arquivo.showOpenDialog(null);
        File selecArq = arquivo.getSelectedFile();
        caminhoPDF.setText(selecArq.getAbsolutePath());
    }//GEN-LAST:event_pdfSelecActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        
        if (tituloInserido == null) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o título do livro!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        if (editoraInserida == null) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome da editora!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (autorInserido == null) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha o nome do autor!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (anoInserido == null) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um ano de publicação válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (caminhoImagem == null) {
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma imagem para o livro!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (Categoria == null) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha a categoria do livro!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Livro novoLivro = new Livro(tituloInserido.getText(), 
                autorInserido.getText(),
                editoraInserida.getText(), 
                Integer.parseInt(anoInserido.getText()), 
                copiaFisica.isSelected(), 
                livroRaro.isSelected(), 
                copiaDigital.isSelected(), 
                caminhoImagem.getText(), 
                bibliotecario, 
                Categoria.getText());
        
        BancoDeDados banquinho = BancoDeDados.getInstance();
        banquinho.addLivro(novoLivro);
        
        this.dispose();
    }//GEN-LAST:event_botaoSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CadastroDeLivros;
    private javax.swing.JTextField Categoria;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField anoInserido;
    private javax.swing.JLabel autor;
    private javax.swing.JTextField autorInserido;
    private javax.swing.JButton botaoCalcelar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField caminhoImagem;
    private javax.swing.JTextField caminhoPDF;
    private javax.swing.JCheckBox copiaDigital;
    private javax.swing.JCheckBox copiaFisica;
    private javax.swing.JLabel editora;
    private javax.swing.JTextField editoraInserida;
    private javax.swing.JLabel imagemLocal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox livroRaro;
    private javax.swing.JButton pdfSelec;
    private javax.swing.JToggleButton selecImagem;
    private javax.swing.JTextField tituloInserido;
    // End of variables declaration//GEN-END:variables
}
