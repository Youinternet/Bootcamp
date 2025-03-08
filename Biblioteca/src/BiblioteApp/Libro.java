package BiblioteApp;

public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor: inicializa un libro con título, autor e ISBN.
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos getters y setters para acceder y modificar los atributos.
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Método toString para mostrar la información del libro de forma legible.
    @Override
    public String toString() {
        return "Libro [Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + "]";
    }
}
