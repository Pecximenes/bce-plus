package Entidades;
/**
 *
 * @author Davy
 */
public class Usuario extends Pessoa {
    private String curso;
    private boolean cadastrado;
    private String usuario;
    private String senha;
    private Livro[] livrosEmprestados;
    private boolean ehProfessor;

    // Construtor
    public Usuario(int id, String nome, String genero, String senha, String cpf, String curso, boolean cadastrado, String usuario, Livro[] livrosEmprestados) {
        super(id, nome, genero, senha, cpf);
        this.curso = curso;
        this.cadastrado = cadastrado;
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
    }

    public Usuario(int id, String nome, String genero, String senha, String cpf, String curso, boolean cadastrado, String usuario, Livro[] livrosEmprestados, boolean ehProfessor) {
        super(id, nome, genero, senha, cpf);
        this.curso = curso;
        this.cadastrado = cadastrado;
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
        this.ehProfessor = ehProfessor;
    }
    
    

    // Métodos Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public Livro[] getLivros() {
        return livrosEmprestados;
    }

    public void setLivros(Livro[] livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public boolean isProfessor() {
        return ehProfessor;
    }
}
