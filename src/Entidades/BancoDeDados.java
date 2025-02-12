package Entidades;

import java.util.List;

/**
 *
 * @author pedro
 */
public class BancoDeDados {
    private static BancoDeDados instance;
    
    String caminhoBibliiotecario = "src/data/DadosBibliotecario.csv";
    String caminhoUsuario        = "src/data/DadosUsuario.csv";
    String caminhoLivro          = "src/data/DadosLivro.csv";
    String caminhoAdmin          = "src/data/DadosAdmin.csv";
    String caminhoEmprestimo     = "src/data/DadosEmprestimo.csv";
    
//    private List<String> nomes;
//    private List<Integer> idades;
    
    private List<Bibliotecario> listaBibliotecarios;
    private List<Usuario>       listaUsuarios;
    private List<Livro>         listaLivro;
    private List<Administrador> listaAdministradores;
    private List<Emprestimo>    listaEmprestimos;

    
    private BancoDeDados() {
        listaBibliotecarios  = CSV.CSVToListaBibliotecario(caminhoBibliiotecario);
        listaUsuarios        = CSV.CSVToListaUsuario(caminhoUsuario);
        listaLivro           = CSV.CSVToListaLivro(caminhoLivro, listaBibliotecarios);
        listaAdministradores = CSV.CSVToListaAdministrador(caminhoAdmin);
        
        Livro[] listaLivrosEmprestados = { listaLivro.get(0) };
        listaEmprestimos     = CSV.CSVToListaEmprestimo(caminhoEmprestimo, listaUsuarios, listaBibliotecarios, listaLivrosEmprestados);

        
    }
    
    
    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    public void addBibliotecario(Bibliotecario bibliotecario) {
        listaBibliotecarios.add(bibliotecario);
    }

    public List<Bibliotecario> getBibliotecario() {
        return listaBibliotecarios;
    }
    
    public void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public List<Usuario> getUsuario() {
        return listaUsuarios;
    }
    
    public void addLivro(Livro livro) {
        listaLivro.add(livro);
    }

    public List<Livro> getLivro() {
        return listaLivro;
    }
    
    public void addAdmin(Administrador admin) {
        listaAdministradores.add(admin);
    }

    public List<Administrador> getAdmin() {
        return listaAdministradores;
    }
    
    public void addEmprestimo(Emprestimo emprestimo) {
        listaEmprestimos.add(emprestimo);
    }

    public List<Emprestimo> getEmprestimo() {
        return listaEmprestimos;
    }
    
}
