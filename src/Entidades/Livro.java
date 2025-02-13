package Entidades;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private boolean disponivelFisico;
    private boolean livroRaro;
    private boolean disponivelDigital;
    private String caminhoImagem;
    private Bibliotecario bibliotecario;
    private String categoria;

    public Livro(String titulo, String autor, String editora, 
            int anoPublicacao, boolean disponivelFisico, boolean livroRaro, 
            boolean disponivelDigital, String caminhoImagem, Bibliotecario bibliotecario, String categoria) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.disponivelFisico = disponivelFisico;
        this.livroRaro = livroRaro;
        this.disponivelDigital = disponivelDigital;
        this.caminhoImagem = caminhoImagem;
        this.bibliotecario = bibliotecario;
        this.categoria = categoria;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivelFisico() {
        return disponivelFisico;
    }

    public void setDisponivelFisico(boolean disponivelFisico) {
        this.disponivelFisico = disponivelFisico;
    }

    public boolean isLivroRaro() {
        return livroRaro;
    }

    public void setLivroRaro(boolean livroRaro) {
        this.livroRaro = livroRaro;
    }

    public boolean isDisponivelDigital() {
        return disponivelDigital;
    }

    public void setDisponivelDigital(boolean disponivelDigital) {
        this.disponivelDigital = disponivelDigital;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String toString() {
        return "Título: " + titulo +
               ", Autor: " + autor +
               ", Editora: " + editora +
               ", Ano: " + anoPublicacao +
               ", Disponível Físico: " + (disponivelFisico ? "Sim" : "Não") +
               ", Livro Raro: " + (livroRaro ? "Sim" : "Não") +
               ", Disponível Digital: " + (disponivelDigital ? "Sim" : "Não") +
               ", Caminho Imagem: " + caminhoImagem +
               ", Bibliotecário: " + (bibliotecario != null ? bibliotecario.getNome() : "N/A") +
               ", Categoria: " + categoria;
    }
};
