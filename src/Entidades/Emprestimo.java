package Entidades;

import java.util.Date;

public class Emprestimo {
    private Usuario usuario;
    private Bibliotecario bibliotecario;
    private Livro[] livro;
    private Date data;
    private float multa;

    public Emprestimo(Usuario usuario, Bibliotecario bibliotecario, Livro[] livro, Date data, float multa) {
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
        this.livro = livro;
        this.data = data;
        this.multa = multa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Livro[] getLivro() {
        return livro;
    }

    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }
    
    
}
