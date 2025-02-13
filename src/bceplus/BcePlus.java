package bceplus;

import java.util.List;
import Entidades.CSV;
import Entidades.Usuario;
import Entidades.Livro;
import Entidades.Administrador;
import Entidades.BancoDeDados;
import Entidades.Bibliotecario;
import Entidades.Emprestimo;

/**
 *
 * @author pedro
 */
public class BcePlus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("TEset");
//        BancoDeDados bancoDeDados = BancoDeDados.getInstance();
//        
//        List<Administrador> listaAdmin = bancoDeDados.getAdmin();
//        
//        System.out.println(listaAdmin.get(listaAdmin.size() - 1).getNome());
//        System.out.println("");
//        Bibliotecario[] bibli = new Bibliotecario[0];
//        
//        Administrador admin = new Administrador(1, "Pedro Ximenes", "M", "000.000.000-00", "pecx", "teste", bibli);
//        
//        bancoDeDados.addAdmin(admin);
    
   /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    
    }
};
