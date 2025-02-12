package Entidades;
/**
 *
 * @author Davy
 */
public class Usuario extends Pessoa {
    private String curso;
    private boolean professor;
    private String usuario;
    private Livro[] livrosEmprestados;

    // Construtor
    public Usuario(int id, String nome, String genero, String senha, String cpf, String curso, boolean professor, String usuario, Livro[] livrosEmprestados) {
        super(id, nome, genero, senha, cpf);
        this.curso = curso;
        this.professor = professor;
        this.usuario = usuario;
        this.livrosEmprestados = livrosEmprestados;
    }

    // Métodos Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isProfessor() {
        return professor;
    }

    public void setProfessor(boolean professor) {
        this.professor = professor;
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
}