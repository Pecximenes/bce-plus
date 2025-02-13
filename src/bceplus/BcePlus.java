/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bceplus;

import java.util.List;
import Entidades.CSV;
import Entidades.Usuario;
import Entidades.Livro;
import Entidades.Administrador;
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
//         Coletando informações do banco de dados CSV
//         Caminho dos arquivos
        String caminhoBibliiotecario = "src/data/DadosBibliotecario.csv";
        String caminhoUsuario        = "src/data/DadosUsuario.csv";
        String caminhoLivro          = "src/data/DadosLivro.csv";
        String caminhoAdmin          = "src/data/DadosAdmin.csv";
        String caminhoEmprestimo     = "src/data/DadosEmprestimo.csv";
        
//        Criando listas das Classes
        List<Bibliotecario> listaBibliotecarios  = CSV.CSVToListaBibliotecario(caminhoBibliiotecario);
        List<Usuario>       listaUsuarios        = CSV.CSVToListaUsuario(caminhoUsuario);
        List<Livro>         listaLivro           = CSV.CSVToListaLivro(caminhoLivro, listaBibliotecarios);
        List<Administrador> listaAdministradores = CSV.CSVToListaAdministrador(caminhoAdmin);
        Livro[] listaLivrosEmprestados = { listaLivro.get(0) };
        List<Emprestimo>    listaEmprestimos     = CSV.CSVToListaEmprestimo(caminhoEmprestimo, listaUsuarios, listaBibliotecarios, listaLivrosEmprestados);

        
        
        for (Usuario usuario : listaUsuarios) {
            System.out.println(usuario.getNome());
        }
        
        System.out.println("");
        
        for (Livro livro : listaLivro) {
            System.out.println(livro.getBibliotecario());
        }
        
        System.out.println("");

        for (Bibliotecario bibliotecario : listaBibliotecarios) {
            System.out.println(bibliotecario.getUsuario());
        }
        
        System.out.println("");
        
        for (Administrador admin : listaAdministradores) {
            System.out.println(admin.getNome());
        }
        
        System.out.println("");
        
        for (Emprestimo emprestimo : listaEmprestimos) {
            System.out.println(emprestimo.getLivro()[0].getTitulo());
        }  
    
   /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    
    }
};