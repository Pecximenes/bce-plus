package Entidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pedro
 * @param <T>
 */
public interface CarregarCSV<T> {
    List<T> csvParaList(String caminhoArquivo);
}

class ListaUsuarios implements CarregarCSV<Usuario> {

    @Override
    public List<Usuario> csvParaList(String caminhoArquivo) {
        List<Usuario> usuarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                Livro[] livro = new Livro[0];

                // Criando objeto Usuario e adicionando à lista
                Usuario usuario = new Usuario(
                        Integer.parseInt(dados[0]),        // ID
                        dados[1],                           // Nome
                        dados[2],                          // Gênero
                        dados[3],                           // Senha
                        dados[4],                          // CPF
                        dados[5],                          // Curso
                        Boolean.parseBoolean(dados[6]),   // Cadastrado
                        dados[7],                          // Usuário
                        livro
                );
                usuarios.add(usuario);
            }
        } catch (IOException e) {}

        return usuarios;
    }
}


class ListaAdministradores implements CarregarCSV<Administrador> {

    @Override
    public List<Administrador> csvParaList(String caminhoArquivo) {
        List<Administrador> administradores = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                Bibliotecario[] bibliotecario = new Bibliotecario[0];

                // Criando objeto Usuario e adicionando à lista
                Administrador administrador = new Administrador(
                        Integer.parseInt(dados[0]),        // ID
                        dados[1],                           // Nome
                        dados[2],                          // Gênero
                        dados[3],                           // CPF
                        dados[4],                          // Usuario
                        dados[5],                          // Senha
                        bibliotecario
                );
                administradores.add(administrador);
            }
        } catch (IOException e) {}

        return administradores;
    }
}


class ListaBibliotecarios implements CarregarCSV<Bibliotecario> {

    @Override
    public List<Bibliotecario> csvParaList(String caminhoArquivo) {
        List<Bibliotecario> bibliotecarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");

                // Criando objeto Usuario e adicionando à lista
                Bibliotecario bibliotecario = new Bibliotecario(
                        Integer.parseInt(dados[0]), // ID
                        dados[1],                   // Nome
                        dados[2],                   // Gênero
                        dados[3],                   // CPF
                        dados[4],                   // Usuario
                        dados[5],                   // Senha
                        Boolean.parseBoolean(dados[6])  // Primeiro Login
                );
                bibliotecarios.add(bibliotecario);
            }
        } catch (IOException e) {}

        return bibliotecarios;
    }
}


class ListaLivros implements CarregarCSV<Livro> {

    @Override
    public List<Livro> csvParaList(String caminhoArquivo) {
        List<Livro> livros = new ArrayList<>();
        String caminhoArquivoBiblioterario = "src/data/DadosBibliotecario.csv";
        List<Bibliotecario> bibliotecarios = new ListaBibliotecarios().csvParaList(caminhoArquivoBiblioterario);
        Random random = new Random();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                int indiceAleatorio = random.nextInt(bibliotecarios.size());
                String[] dados = linha.split(",");

                // Criando objeto Usuario e adicionando à lista
                Livro livro = new Livro(
                        dados[0],                            // Titulo
                        dados[1],                            // Autor
                        dados[2],                            // Editora
                        Integer.parseInt(dados[3]),          // Ano de Publicação
                        Boolean.parseBoolean(dados[4]),      // Disponível Físico
                        Boolean.parseBoolean(dados[5]),      // Livro Raro
                        Boolean.parseBoolean(dados[6]),      // Disponivel Digital
                        dados[7],                            // Caminho da Imagem
                        bibliotecarios.get(indiceAleatorio), // Bibliotecario
                        dados[9]                             // Categoria
                );
                livros.add(livro);
            }
        } catch (IOException e) {}

        return livros;
    }
}



class ListaEmprestimos implements CarregarCSV<Emprestimo> {

    @Override
    public List<Emprestimo> csvParaList(String caminhoArquivo) {
        List<Emprestimo> emprestimos = new ArrayList<>();
        List<Bibliotecario> bibliotecarios = new ListaBibliotecarios().csvParaList("src/data/DadosBibliotecario.csv");
        List<Usuario> usuarios = new ListaUsuarios().csvParaList("src/data/DadosUsuario.csv");
        List<Livro> livros = new ListaLivros().csvParaList("src/data/DadosLivro.csv");
        Random random = new Random();


        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                List<Livro> livrosEmprestados = new ArrayList<>();
                int indiceAleatorioBibliotecario = random.nextInt(bibliotecarios.size());
                int indiceAleatorioUsuarios = random.nextInt(usuarios.size());
                LocalDate data = LocalDate.parse(dados[0]);
                
                int indiceAleatorioQuantidadeLivros = random.nextInt(livros.size() + 1);
                for (int i = 0; i < indiceAleatorioQuantidadeLivros; i++) {
                    livrosEmprestados.add(livros.get(random.nextInt(livros.size())));
                }

                // Criando objeto Usuario e adicionando à lista
                Emprestimo emprestimo;
                emprestimo = new Emprestimo(
                        usuarios.get(indiceAleatorioUsuarios),            // Usuario
                        bibliotecarios.get(indiceAleatorioBibliotecario), // Bibliotecario
                        livrosEmprestados,         // Lista de livros emprestados
                        data,                      // Data
                        Double.valueOf(dados[1]) // Multa
                );
                emprestimos.add(emprestimo);
            }
        } catch (IOException e) {}

        return emprestimos;
    }
}