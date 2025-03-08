package BiblioteApp;

import javax.swing.JOptionPane;

public class BibliotecaApp {
    public static void main(String[] args) {
        // Creamos la instancia de Biblioteca.
        Biblioteca biblioteca = new Biblioteca();
        
    // 
        
        // Menú de opciones utilizando JOptionPane.
        String menu = "Menú Biblioteca:\n"
                + "1. Agregar Libro\n"
                + "2. Eliminar Libro\n"
                + "3. Ver Todos los Libros\n"
                + "4. Buscar Libro\n"
                + "5. Salir";
        
        int opcion = 0;
        while (opcion != 5) {
            try {
                String opcionStr = JOptionPane.showInputDialog(null, menu, "Menú Biblioteca", JOptionPane.QUESTION_MESSAGE);
                if (opcionStr == null) {
                    // Si se cierra el cuadro de diálogo, salimos.
                    break;
                }
                opcion = Integer.parseInt(opcionStr);
                
                switch (opcion) {
                    case 1:
                        // Agregar Libro
                        String titulo = JOptionPane.showInputDialog(null, "Ingrese el título del libro:");
                        String autor = JOptionPane.showInputDialog(null, "Ingrese el autor:");
                        String isbn = JOptionPane.showInputDialog(null, "Ingrese el ISBN:");
                        
                        if(titulo == null || autor == null || isbn == null ||
                        titulo.trim().isEmpty() || autor.trim().isEmpty() || isbn.trim().isEmpty()){
                            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                        } else {
                            Libro libro = new Libro(titulo, autor, isbn);
                            biblioteca.agregarLibro(libro);
                            JOptionPane.showMessageDialog(null, "Libro agregado correctamente.");
                        }
                        break;
                    case 2:
                        // Eliminar Libro
                        String isbnEliminar = JOptionPane.showInputDialog(null, "Ingrese el ISBN del libro a eliminar:");
                        if(isbnEliminar != null && !isbnEliminar.trim().isEmpty()){
                            biblioteca.eliminarLibro(isbnEliminar);
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un ISBN válido.");
                        }
                        break;
                    case 3:
                        // Ver Todos los Libros
                        String listado = biblioteca.verLibrosToString();
                        JOptionPane.showMessageDialog(null, listado, "Listado de Libros", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 4:
                        // Buscar Libro
                        String criterio = JOptionPane.showInputDialog(null, "Ingrese el título o autor a buscar:");
                        if(criterio != null && !criterio.trim().isEmpty()){
                            String resultadoBusqueda = biblioteca.buscarLibroToString(criterio);
                            if(resultadoBusqueda.isEmpty()){
                                resultadoBusqueda = "No se encontraron libros con el criterio: " + criterio;
                            }
                            JOptionPane.showMessageDialog(null, resultadoBusqueda, "Resultados de búsqueda", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Debe ingresar un criterio de búsqueda.");
                        }
                        break;
                    case 5:
                        // Salir
                        JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Seleccione entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debes ingresar un número entero.");
            }
        }
    }
}
