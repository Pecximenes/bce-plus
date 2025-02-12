package Entidades;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
    
    public static List<Livro> CSVToListaLivro(String caminhoArquivo) {
        List<Livro> livros = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Pular a primeira linha (cabeçalho)

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                Bibliotecario bibliotecario = new Bibliotecario();

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
        } catch (IOException e) {
            e.printStackTrace();
        }

        return livros;
    }
    
    static Usuario adicionarUsuario(String[] dados) {
        Livro[] livro = new Livro[0];

        
        // Criando objeto Usuario e adicionando à lista
        Usuario usuario = new Usuario(
                Integer.parseInt(dados[1]),        // ID
                dados[0],                           // Nome
                dados[2],                          // Gênero
                dados[7],                           // Senha
                dados[3],                          // CPF
                dados[4],                          // Curso
                Boolean.parseBoolean(dados[5]),   // Cadastrado
                dados[6],                          // Usuário
                livro
        );
        
        return usuario;
    }
}