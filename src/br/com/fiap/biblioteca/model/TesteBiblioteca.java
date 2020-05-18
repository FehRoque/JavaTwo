package br.com.fiap.biblioteca.model;

public class TesteBiblioteca {

	public static void main(String[] args) {

		try {

			Biblioteca bi = new Biblioteca();

			Autor autor = new Autor("J.K Rowling");

			Livro livro = new Livro("HP", "bla", 1997, autor);

			System.out.println(bi.adiciona(livro));
			System.out.println(bi.adiciona(livro));
			System.out.println(bi.adiciona(livro));
			System.out.println(bi.adiciona(livro));

			System.out.println(bi.tamanho());

			System.out.println(bi.consulta("hP"));

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
