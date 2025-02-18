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
//        System.out.println("TEset");
        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
        
        String[] livro = bancoDeDados.getLivro()
                             .stream()
                             .map(Livro::getTitulo)
                             .toArray(String[]::new);
        
        System.out.println(livro);
////        
//        List<Livro> listaLivro = bancoDeDados.getLivro();
//        List<String> listaTitulos = new ArrayList<>();
//////        
//        for (Livro livro : listaLivro) {
//            listaTitulos.add(livro.getTitulo());
//        }
//        String[] livro = listaTitulos.toArray(new String[0]);
//        System.out.println(listaTitulos);
//        System.out.println(livro);
////        System.out.println("");
//        Bibliotecario[] bibli = new Bibliotecario[0];
////        
//        Administrador admin = new Administrador(1, "Pedro Ximenes", "M", "000.000.000-00", "pecx", "teste", bibli);
////        
//        bancoDeDados.addAdmin(admin);
    
   /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    
    }
};
