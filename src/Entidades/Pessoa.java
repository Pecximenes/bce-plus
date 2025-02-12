
package Entidades;

/**
 *
 * @author Davy
 */
public class Pessoa {
    protected int id;
    protected String nome;
    protected String genero;
    protected String senha;
    protected String cpf;
    

    // Construtor
<<<<<<< HEAD
    public Pessoa(int id, String nome, String genero, String senha, String cpf) {
=======

    public Pessoa(int id, String nome, String genero, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
        this.senha = senha;
    }

    public Pessoa(int id, String nome, String genero, String cpf) {
>>>>>>> b9e430f8b58ee02d8cf518ea0000556c84afc30c
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
    }

    // Métodos Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
<<<<<<< HEAD
}
=======
};
>>>>>>> b9e430f8b58ee02d8cf518ea0000556c84afc30c
