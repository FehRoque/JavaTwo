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

	public void adiciona(Livro livro) {
		if (cheia() == true) {
			System.err.println("Impossivel adicionar livro!");
		} else {
			this.totalLivros = this.totalLivros + 1;
			this.livros[this.totalLivros] = livro;
		}

	}

	public Livro consulta(String titulo) {
		for (Livro x : livros) {
			if (x.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
				return x;
			}
		}
		return new Livro(titulo, titulo, totalLivros, null);
	}

	public Livro remove(Livro livro) {
		int ultimo = this.totalLivros;
		for (Livro x : this.livros) {
			if (x.getTitulo() == livro.getTitulo()) {
				for (int i = 0; i < ultimo; i++) {
					this.livros[i] = this.livros[i + 1];
				}
				this.totalLivros = this.totalLivros - 1;
				return x;
			}
		}
		return livro;
	}

	//O método atualiza precisaria receber um livro novo pra poder atualizar o antigo
	public void atualiza(Livro livro) {
		Livro livroAntigo = livro;
		this.remove(livroAntigo);
		
		Livro livroNovo = null; //<- livro novo que seria atualizado
		this.adiciona(livroNovo);
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
