/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pecximenes
 */
public class Administrador extends Pessoa {
    private String usuario;
    private String senha;
    private Bibliotecario[] bibliotecario;
    
    // Construtor
    public Administrador(int id, String nome, String genero, String cpf, String usuario, String senha, Bibliotecario[] bibliotecario) {
        super(id, nome, genero, senha, cpf);
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
    };
    
    // Métodos Getters e Setters
    public String getUsuario() {
        return usuario;
    };

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    };

    public Bibliotecario[] getBibliotecario() {
        return bibliotecario;
    };

    public void setBibliotecarios(Bibliotecario[] bibliotecario) {
        this.bibliotecario = bibliotecario;
    };   
};

