
import Entidades.BancoDeDados;
import Entidades.Bibliotecario;
import Entidades.Livro;
import Entidades.Usuario;
import Entidades.Emprestimo;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



/**
 *
 * @author samuelcds
 */

public class Emprestimos extends javax.swing.JFrame {
    Bibliotecario bibliotecario;
    Usuario usuario;
    List<Livro> livros;
    JList<String> listaSugestoes;
    DefaultListModel<String> modeloLista;
    List<String> usuarios;
    LocalDate dataAtual = LocalDate.now();
    double multa;
    LocalDate devolucao;
    Integer idTemp;

    /**
     * Creates new form Emprestimo
     */
    
    public Emprestimos() {
        initComponents();
    }
    
    public Emprestimos(Usuario usuario, List<Livro> livro) {
        initComponents();
        
        this.usuario = usuario;
        this.livros = livro;
        
        textoUsuario.setText(usuario.getUsuario());
        
        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
        String[] lv = bancoDeDados.getLivro()
                             .stream()
                             .map(Livro::getTitulo)
                             .toArray(String[]::new);
        
        livroSelecionado.setText(Arrays.toString(lv));
        
        if (usuario.isProfessor()) { //Data de Devolucao e Multa.
            this.devolucao = dataAtual.plusDays(60);
            
            // Define um formato (por exemplo, dd/MM/yyyy)
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            // Converte LocalDate para String
            String dataFormatada = dataAtual.format(formato);
            
            dataDevolucao.setText(devolucao.toString());
            multa = 0.80;
            valorMulta.setText("Valor da multa pelo atraso: 0,80/dia");
        }
        
        if (!(usuario.isProfessor())) { //Data de Devolucao e Multa.
            this.devolucao = dataAtual.plusDays(30);
            
            // Define um formato (por exemplo, dd/MM/yyyy)
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            // Converte LocalDate para String
            String dataFormatada = dataAtual.format(formato);
            
            dataDevolucao.setText(devolucao.toString());
            multa = 0.50;
            valorMulta.setText("Valor da multa pelo atraso: 0,50/dia");
        }
    }
    public Emprestimos(Bibliotecario bibliotecario, List<Livro> livros) {
        initComponents();
        textoUsuario.setEditable(true);
        
        this.bibliotecario = bibliotecario;
        this.livros = livros;
        this.dataAtual = LocalDate.now();
        List<String> exemplares = new ArrayList<>();

        
        for (Livro lv : livros) {
            exemplares.add(lv.getTitulo());
        }
        
        livroSelecionado.setText(String.join(", ", exemplares));
        
        modeloLista = new DefaultListModel<>();
        listaSugestoes = new JList<>(modeloLista);

        textoUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                atualizarSugestoes(textoUsuario.getText());
            }
        });

        listaSugestoes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!listaSugestoes.isSelectionEmpty()) {
                    String nomeSelecionado = (String) Sugeridos.getSelectedItem();;

                    List<Usuario> usuariosEncontrados = buscarUsuariosPorNome(nomeSelecionado);
                    System.out.println("Usuários encontrados: " + usuariosEncontrados.size());

                    usuario = usuariosEncontrados.stream()
                                .filter(u -> u.getNome().equalsIgnoreCase(nomeSelecionado))
                                .findFirst()
                                .orElse(null);

                    if (usuario != null) {
                        textoUsuario.setText(usuario.getNome());
                        calcularDataDevolucao();
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                }
            }
        });
    }
    
    private List<Usuario> buscarUsuariosPorNome(String palavra) {
        Sugeridos.removeAllItems();
        System.out.println(palavra);
        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
        List<Usuario> usuarios = bancoDeDados.getUsuario();
        List<Usuario> usuFiltrados = new ArrayList<>();
        
        for (Usuario user : usuarios) {
            boolean cpfGeneroUsuario = false;
            boolean nomeCursoId = false;
            
            if ((user.getCpf().toLowerCase().contains(palavra.toLowerCase())) || user.getGenero().toLowerCase().contains(palavra.toLowerCase()) || (user.getUsuario().toLowerCase().contains(palavra.toLowerCase()))) {
                cpfGeneroUsuario = true;
            }
            
            if ((user.getNome().toLowerCase().contains(palavra.toLowerCase())) || (user.getCurso().toLowerCase().contains(palavra.toLowerCase())) || (Integer.toString(user.getId()).toString().contains(palavra))) {
                nomeCursoId = true;
            }
            
            if (cpfGeneroUsuario || nomeCursoId) {
                usuFiltrados.add(user);
            }
        }
        for (Usuario lv : usuFiltrados) {
            String str = lv.getNome();
            idTemp = lv.getId();
            Sugeridos.addItem(str);
        }
        System.out.println(usuFiltrados);
        return usuFiltrados;
    }

    private void atualizarSugestoes(String texto) {
        System.out.println(texto);
        modeloLista.clear();
        if (texto.isEmpty()) {
            return;
        }
        List<Usuario> usuarios = buscarUsuariosPorNome(texto);
        for (Usuario u : usuarios) {
            modeloLista.addElement(u.getNome());
        }
        listaSugestoes.setVisible(!modeloLista.isEmpty());
    }

    private void calcularDataDevolucao() {
        if (usuario == null) return;
        int dias = usuario.isProfessor() ? 30 : 15;
        this.devolucao = dataAtual.plusDays(dias);
        dataDevolucao.setText(devolucao.toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        livroSelecionado = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        dataDevolucao = new javax.swing.JTextPane();
        botaoFinalizar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        valorMulta = new javax.swing.JTextArea();
        Sugeridos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Annapurna SIL", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Realizar Emprestimo");

        jLabel2.setText("Usuario:");

        textoUsuario.setEditable(false);
        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Livros Selecionados:");

        livroSelecionado.setEditable(false);
        livroSelecionado.setColumns(20);
        livroSelecionado.setRows(5);
        jScrollPane1.setViewportView(livroSelecionado);

        jLabel4.setText("Data para devolução:");

        jScrollPane2.setViewportView(dataDevolucao);

        botaoFinalizar.setText("Finalizar Emprestimo");
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        valorMulta.setEditable(false);
        valorMulta.setColumns(2);
        valorMulta.setRows(2);
        valorMulta.setTabSize(2);
        valorMulta.setText("Valor da multa pelo atraso: 0,80/dia, para Professor.\n0,50/dia para Aluno.");
        jScrollPane3.setViewportView(valorMulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoFinalizar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Sugeridos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sugeridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoFinalizar)
                            .addComponent(botaoCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
        Object selecionado = Sugeridos.getSelectedItem();
        if (selecionado != null) {
            String itemSelecionado = selecionado.toString();
            System.out.println("Item selecionado: " + itemSelecionado);

            // Faz o split da string usando ", " como delimitador
            String[] partes = itemSelecionado.split(", ");

            // Verifica se o array tem pelo menos um elemento
            if (partes.length > 0) {
                // Pega o último item do array
                String ultimoItem = partes[partes.length - 1];

                try {
                    // Converte o último item para inteiro
                    int valorInteiro = Integer.parseInt(ultimoItem);
                    System.out.println("Último item como inteiro: " + valorInteiro);
                    this.usuario = bancoDeDados.getUsuarioById(valorInteiro);
                } catch (NumberFormatException e) {
                    System.out.println("O último item não é um número válido: " + ultimoItem);
                }
            }
        }
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        System.out.println(bibliotecario);
        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
        for (Usuario usr : bancoDeDados.getUsuario()) {
            if (usr.getNome() == Sugeridos.getSelectedItem()){
                this.usuario = usr;
            }
        }
        
        if (bibliotecario != null) {
            if (Sugeridos.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(this, "Selecione um usuário antes de finalizar o empréstimo.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (livros.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhum livro selecionado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            System.out.println(Sugeridos.getSelectedItem());
            System.out.println(this.usuario);
            Emprestimo emprestimo = new Emprestimo(usuario, bibliotecario,livros, devolucao, multa);
            BancoDeDados banquinho = BancoDeDados.getInstance();
            banquinho.addEmprestimo(emprestimo);
            JOptionPane.showMessageDialog(this, "Empréstimo realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            for (Livro livro : livros) {
                if (livro.isLivroRaro() && (bibliotecario == null)) {
                    JOptionPane.showMessageDialog(this, "Apenas bibliotecarios podem pegar livros Raros emprestados.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                } 
            }
            Emprestimo emprestimo = new Emprestimo(usuario,livros, devolucao, multa);
            BancoDeDados banquinho = BancoDeDados.getInstance();
            banquinho.addEmprestimo(emprestimo);
            JOptionPane.showMessageDialog(this, "Empréstimo realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_botaoFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Emprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Sugeridos;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JTextPane dataDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea livroSelecionado;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JTextArea valorMulta;
    // End of variables declaration//GEN-END:variables
}
