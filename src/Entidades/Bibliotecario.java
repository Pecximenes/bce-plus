/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author pecximenes
 */
<<<<<<< HEAD
public class Bibliotecario {

    public CharSequence getNome() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
=======
public class Bibliotecario extends Pessoa {
    private String usuario;
    private String senha;
    private boolean primeiroLogin;
>>>>>>> 0da74fdbf5167e530ae19bca1574fce108505f25
    
    // Construtor
    public Bibliotecario(int id, String nome, String genero, String cpf, String usuario, String senha, boolean primeiroLogin) {
        super(id, nome, genero, senha, cpf);
        this.usuario = usuario;
        this.primeiroLogin = primeiroLogin;
    }
    
    // Métodos Getters e Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean getPrimeiroLogin() {
        return primeiroLogin;
    }

    public void setPrimeiroLogin(boolean primeiroLogin) {
        this.primeiroLogin = primeiroLogin;
    }   
}
