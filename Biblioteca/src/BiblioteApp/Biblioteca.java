package BiblioteApp;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = null;
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                libroAEliminar = l;
                break;
            }
        }
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            JOptionPane.showMessageDialog(null, "Libro eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el libro con ISBN: " + isbn);
        }
    }

    // Retorna una cadena con el listado de libros.
    public String verLibrosToString() {
        if (libros.isEmpty()) {
            return "La biblioteca está vacía.";
        }
        StringBuilder sb = new StringBuilder();
        for (Libro l : libros) {
            sb.append(l.toString()).append("\n");
        }
        return sb.toString();
    }

    // Retorna una cadena con el resultado de la búsqueda.
    public String buscarLibroToString(String criterio) {
        StringBuilder sb = new StringBuilder();
        String criterioLower = criterio.toLowerCase();
        for (Libro l : libros) {
            if (l.getTitulo().toLowerCase().contains(criterioLower) || 
                l.getAutor().toLowerCase().contains(criterioLower)) {
                sb.append(l.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
