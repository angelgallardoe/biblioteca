package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Libro lib01 = new Libro();
        Libro lib02 = new Libro("La Biblia", "Jesús", 2, 2);
        
        Libro lib03 = new Libro();
        lib03.setTituloLibro("Jorguito");
        lib03.setAutor("987-654-321");
        lib03.setNumEjemplares(0);
        lib03.setNumEjemplaresPrestados(5000);
        
        
        lib02.prestamo();
        lib02.devolucion();
        
        mostrarDatosLibros(lib01);
        mostrarDatosLibros(lib02);
        mostrarDatosLibros(lib03);
    }
    
    public static void mostrarDatosLibros(Libro l){
        System.out.println("Título: "+l.getTituloLibro());
        System.out.println("Autor: "+l.getAutor());
        System.out.println("Disponibles: "+l.getNumEjemplares());  
        System.out.println("Prestados: "+l.getNumEjemplaresPrestados());
        
        
    }
    
    
}
