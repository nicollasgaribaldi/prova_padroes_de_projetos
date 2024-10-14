package tech.nicollas.com;

import tech.nicollas.com.Usuario;
import tech.nicollas.com.Biblioteca;
import tech.nicollas.com.Livro;

public class Main {
    public static void main(String[] args) {
// Criando objetos e realizando operações conforme o exemplo
        Livro livro1 = new Livro("Os Segredos da Mente Milionária", "T. Harv Eker", 2005);
        Livro livro2 = new Livro("O Poder do Hábito", "Charles Duhigg", 2012);
        Usuario usuario1 = new Usuario("Carlos");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");


        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.exibirLivrosDisponiveis();
        usuario1.emprestarLivro(biblioteca, livro1);
        usuario1.exibirLivrosEmprestados();
        biblioteca.exibirLivrosDisponiveis();
        usuario1.devolverLivro(biblioteca, livro1);
    }
}