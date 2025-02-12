/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bceplus;

import java.util.List;
import Entidades.CSV;
import Entidades.Usuario;
import Entidades.Livro;

/**
 *
 * @author pedro
 */
public class BcePlus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

//        String caminhoUsuario = "src/data/DadosUsuario.csv";
//        String caminhoLivro = "src/data/DadosLivro.csv";
//        CSV csv = new CSV();
//        
//        List<Usuario> listaUsuarios = csv.CSVToListaUsuario(caminhoUsuario);
//        
//        for (Usuario usuario : listaUsuarios) {
//            System.out.println(usuario.getNome());
//        }
//        
//        System.out.println("");
//        
//        List<Livro> listaLivros = csv.CSVToListaLivro(caminhoLivro);
//        
//        for (Livro livro : listaLivros) {
//            System.out.println(livro.getTitulo());
//        }
    }
    
}