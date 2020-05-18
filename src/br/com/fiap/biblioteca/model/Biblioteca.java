package br.com.fiap.biblioteca.model;

public class Biblioteca {

	private Livro[] livros;
	private int totalLivros;

	public Biblioteca() {
		int capacidade = 10;
		this.livros = new Livro[capacidade];
		this.totalLivros = -1;
	}

	public Biblioteca(int quantidadeLivros) {
		this.livros = new Livro[quantidadeLivros];
		this.totalLivros = -1;
	}

	public String adiciona(Livro livro) {
		if (cheia() == true) {
			System.err.println("Impossivel adicionar livro!");
		}
		this.totalLivros = this.totalLivros + 1;
		this.livros[this.totalLivros] = livro;

		return "Livro adicionado com sucesso!";
	}

	public Livro consulta(String titulo) {
		for (Livro x : livros) {
			if (titulo == x.getTitulo()) {
				return x;
			}
		}
		return null;
	}

	public Livro remove(Livro livro) {
		if (this.totalLivros < 0) {
			System.err.println("Não há livros a serem removidos!");
		}
		return null;
	}

	public void atualiza(Livro livro) {
		for (Livro x : this.livros) {
			if (livro.getTitulo() == x.getTitulo()) {
				x.remove();
				adiciona(livro);
			}
		}
	}

	public int tamanho() {
		return this.totalLivros + 1;
	}

	public boolean cheia() {
		return this.totalLivros == this.livros.length - 1;
	}

	public boolean vazia() {
		return this.totalLivros < 0;
	}
}
