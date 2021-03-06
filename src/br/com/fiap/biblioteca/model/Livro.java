package br.com.fiap.biblioteca.model;

public class Livro {

	private String titulo;
	private String isbn;
	private int anoLancamento;
	private Autor autor;
	
	public Livro(String titulo, String isbn, int anoLancamento, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.anoLancamento = anoLancamento;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public Autor getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return 	"Livro: " + this.getTitulo() +
				"\nISBN: " + this.getIsbn() + 
				"\nAno de lanšamento: " + this.getAnoLancamento() +
				"\nAutor: " + this.getAutor().getNome();
	}
}
