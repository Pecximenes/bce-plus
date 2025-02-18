package Entidades;

import java.time.LocalDate;
import java.util.List;

public class Emprestimo {
    private Usuario usuario;
    private Bibliotecario bibliotecario;
    private List<Livro> livro;
    private LocalDate data;
    private Double multa;

    public Emprestimo(Usuario usuario, List<Livro> livro, LocalDate data, Double multa) {
        this.usuario = usuario;
        this.livro = livro;
        this.data = data;
        this.multa = multa;
    };

    public Emprestimo(Usuario usuario, Bibliotecario bibliotecario, List<Livro> livro, LocalDate data, Double multa) {
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
        this.livro = livro;
        this.data = data;
        this.multa = multa;
    };

    public Usuario getUsuario() {
        return usuario;
    };

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    };

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    };

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    };

    public List<Livro> getLivro() {
        return livro;
    };

    public void setLivro(List<Livro> livro) {
        this.livro = livro;
    };

    public LocalDate getData() {
        return data;
    };

    public void setData(LocalDate data) {
        this.data = data;
    };

    public Double getMulta() {
        return multa;
    };

    public void setMulta(Double multa) {
        this.multa = multa;
    };
};