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
    
    private final List<Bibliotecario> listaBibliotecarios;
    private final List<Usuario>       listaUsuarios;
    private final List<Livro>         listaLivro;
    private final List<Administrador> listaAdministradores;
    private final List<Emprestimo>    listaEmprestimos;

    
    private BancoDeDados() {
        listaBibliotecarios  = new ListaBibliotecarios().csvParaList(caminhoBibliiotecario);
        listaUsuarios        = new ListaUsuarios().csvParaList(caminhoUsuario);
        listaLivro           = new ListaLivros().csvParaList(caminhoLivro);
        listaAdministradores = new ListaAdministradores().csvParaList(caminhoAdmin);
        listaEmprestimos     = new ListaEmprestimos().csvParaList(caminhoEmprestimo);

    };
    
    
    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        };
        return instance;
    };

    public void addBibliotecario(Bibliotecario bibliotecario) {
        listaBibliotecarios.add(bibliotecario);
    };

    public List<Bibliotecario> getBibliotecario() {
        return listaBibliotecarios;
    };
    
    public Boolean removeBibliotecarioPorId(Integer id) {
        Boolean sucesso = true;
        try {
            listaBibliotecarios.removeIf(bibliotecario -> bibliotecario.getId() == id);
        } catch (Exception e) {
            sucesso = false;
        }
        return sucesso;
    }
    
//    public Boolean updateBibliotecarioPorId(Integer id, Bibliotecario bibli) {
//        Boolean sucesso = true;
//        try {
//            this.removeBibliotecarioPorId(id);
//            this.addBibliotecario(bibli);
//        } catch (Exception e) {
//            sucesso = false;
//        }
//        return sucesso;
//    }
    
    public void addUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    };
    
    public Boolean removeUsuario(Usuario usuario) {
        Boolean sucesso = true;
        try {
            listaUsuarios.remove(usuario);
        } catch (Exception e) {
            sucesso = false;
        }
        return sucesso;
    };
    
    public Boolean removeUsuarioPorId(Integer id) {
        Boolean sucesso = true;
        try {
            listaUsuarios.removeIf(usuario -> usuario.getId() == id);
        } catch (Exception e) {
            sucesso = false;
        }
        return sucesso;
    }

    public List<Usuario> getUsuario() {
        return listaUsuarios;
    };
    
    public Usuario getUsuarioById(int id) {
        Usuario usuario = null;
        for (Usuario user : listaUsuarios) {
            if (user.getId() == id) {
                usuario = user;
            }
        }
        return usuario;
    };
    
    public void addLivro(Livro livro) {
        listaLivro.add(livro);
    };

    public List<Livro> getLivro() {
        return listaLivro;
    };
    
    public void addAdmin(Administrador admin) {
        listaAdministradores.add(admin);
    };

    public List<Administrador> getAdmin() {
        return listaAdministradores;
    };
    
    public void addEmprestimo(Emprestimo emprestimo) {
        listaEmprestimos.add(emprestimo);
    };

    public List<Emprestimo> getEmprestimo() {
        return listaEmprestimos;
    };
    
};
