package bceplus;

import java.util.List;
import Entidades.Usuario;
import Entidades.Livro;
import Entidades.Administrador;
import Entidades.BancoDeDados;
import Entidades.Bibliotecario;
import Entidades.Emprestimo;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class BcePlus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
//        
//        String[] livro = bancoDeDados.getLivro()
//                             .stream()
//                             .map(Livro::getTitulo)
//                             .toArray(String[]::new);
//        
//        
    
        Login telaLogin = new Login();
        // Torna a janela visível
        telaLogin.setVisible(true);
        // Centraliza a janela na tela
        telaLogin.setLocationRelativeTo(null);
    
    }
};
