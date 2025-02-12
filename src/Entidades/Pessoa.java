
package Entidades;

/**
 *
 * @author Davy
 */
public class Pessoa {
    private int id;
    private String nome;
    private String genero;
    private String senha;
    public String cpf;
    

    // Construtor
<<<<<<< HEAD
    public Pessoa(int id, String nome, String genero, String cpf, String senha) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.cpf = cpf;
        this.senha = senha;
=======
    public Pessoa(int id, String nome, String genero, String senha, String cpf) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.senha = senha;
        this.cpf = cpf;
>>>>>>> 1e66e218488fd4f387aca7f7f88d2fecbb7b5b70
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
}
>>>>>>> 1e66e218488fd4f387aca7f7f88d2fecbb7b5b70
