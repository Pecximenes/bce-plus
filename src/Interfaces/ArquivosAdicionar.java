import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Entidades.Livro;


/**
 *
 * @author samuelcds
 */
public interface ArquivosAdicionar {
    final String CSV_FILE = "ArquivosTexto/Livros.csv";

    public static void adicionar(Livro livro) {
        File arquivo = new File(CSV_FILE);
        File diretorio = arquivo.getParentFile();

        try (FileWriter writer = new FileWriter(arquivo, true)) { // true para modo append
            writer.append(livro.getTitulo()).append(",")
                  .append(livro.getAutor()).append(",")
                  .append(livro.getEditora()).append(",")
                  .append(String.valueOf(livro.getAnoPublicacao())).append(",")
                  .append(livro.isDisponivelFisico() ? "Sim" : "Não").append(",")
                  .append(livro.isLivroRaro() ? "Sim" : "Não").append(",")
                  .append(livro.isDisponivelDigital() ? "Sim" : "Não").append(",")
                  .append(livro.getCaminhoImagem()).append(",")
                  .append(livro.getBibliotecario().getNome()).append(",")
                  .append(livro.getCategoria()).append("\n");

            System.out.println("Livro adicionado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }
}
