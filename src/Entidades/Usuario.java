package Entidades;
/**
 *
 * @author Davy
 */
public class Usuario extends Pessoa {
    private String curso;
    private boolean ehProfessor;
    private String usuario;
    private String senha;
    private Livro[] livrosEmprestados;
    //private boolean ehProfessor;

    // Construtor
    public Usuario(int id, String nome, String genero, String senha, String cpf, String curso, boolean ehProfessor, String usuario, Livro[] livrosEmprestados) {
        super(id, nome, genero, senha, cpf);
        this.curso = curso;
        this.ehProfessor = ehProfessor;
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
    }

<<<<<<< HEAD
    public Usuario(int id, String nome, String genero, String senha, String cpf, String curso, boolean cadastrado, String usuario, Livro[] livrosEmprestados, boolean ehProfessor) {
        super(id, nome, genero, senha, cpf);
        this.curso = curso;
        this.cadastrado = cadastrado;
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
        this.ehProfessor = ehProfessor;
    }
=======
//    public Usuario(int id, String nome, String genero, String senha, String cpf, String curso, boolean cadastrado, String usuario, Livro[] livrosEmprestados, boolean ehProfessor) {
//        super(id, nome, genero, senha, cpf);
//        this.curso = curso;
//        this.cadastrado = cadastrado;
//        this.usuario = usuario;
//        this.senha = senha;
//        this.livrosEmprestados = livrosEmprestados;
//        this.ehProfessor = ehProfessor;
//    }
>>>>>>> 67b91212489901466da2b3cb3122ccc36a1d0916
    
    

    // Métodos Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isCadastrado() {
        return ehProfessor;
    }

    public void setCadastrado(boolean ehProfessor) {
        this.ehProfessor = ehProfessor;
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
