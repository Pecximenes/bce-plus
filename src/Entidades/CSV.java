package Entidades;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CSV {
    public static List<Usuario> CSVToListaUsuario(String caminhoArquivo) {
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
    
    public static List<Livro> CSVToListaLivro(String caminhoArquivo, List<Bibliotecario> ListaBibliotecarios) {
        List<Livro> livros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                Bibliotecario bibliotecario;
                bibliotecario = ListaBibliotecarios.get(0);

                // Criando objeto Usuario e adicionando à lista
                Livro livro = new Livro(
                        dados[0],                          // Titulo
                        dados[1],                          // Autor
                        dados[2],                          // Editora
                        Integer.parseInt(dados[3]),        // Ano de Publicação
                        Boolean.parseBoolean(dados[4]),    // Disponível Físico
                        Boolean.parseBoolean(dados[5]),    // Livro Raro
                        Boolean.parseBoolean(dados[6]),    // Disponivel Digital
                        dados[7],                          // Caminho da Imagem
                        bibliotecario,                     // Bibliotecario
                        dados[9]                           // Categoria
                );
                livros.add(livro);
            }
        } catch (IOException e) {}

        return livros;
    }
    
    public static List<Administrador> CSVToListaAdministrador(String caminhoArquivo) {
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
    
    public static List<Bibliotecario> CSVToListaBibliotecario(String caminhoArquivo) {
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
    
    /**
     *
     * @param caminhoArquivo
     * @param listaUsuarios
     * @param listaBibliotecarios
     * @param livrosEmprestados
     * @return
     */
    public static List<Emprestimo> CSVToListaEmprestimo(String caminhoArquivo, List<Usuario> listaUsuarios, List<Bibliotecario> listaBibliotecarios, Livro[] livrosEmprestados) {
        List<Emprestimo> emprestimos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                
                Bibliotecario bibliotecario;
                bibliotecario = listaBibliotecarios.get(0);
                
                Usuario usuario;
                usuario = listaUsuarios.get(0);
                
                LocalDate data = LocalDate.parse(dados[0]);

                // Criando objeto Usuario e adicionando à lista
                Emprestimo emprestimo;
                emprestimo = new Emprestimo(
                        usuario,                   // Usuario
                        bibliotecario,             // Bibliotecario
                        livrosEmprestados,         // Lista de livros emprestados
                        data,                      // Data
                        Double.parseDouble(dados[1]) // Multa
                );
                emprestimos.add(emprestimo);
            }
        } catch (IOException e) {}

        return emprestimos;
    }
}