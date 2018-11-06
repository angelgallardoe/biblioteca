package biblioteca;

public class Libro {
    private String titulo_libro;
    private String autor;
    private int num_ejemplares;
    private int num_ejemplares_prest;
    
    // CONSTRUCTOR POR DEFECTO //
    public Libro(){
    }
    
    // CONSTRUCTOR CON PARAMETROS //
    public Libro(String titulo_libro, String autor, int num_ejemplares, 
                    int num_ejemplares_prest){
        this.titulo_libro = titulo_libro;
        this.autor = autor;
        this.num_ejemplares = num_ejemplares;
        this.num_ejemplares_prest = num_ejemplares_prest;
    }
    
    // SETTER Y GETTER //
    
    
    public void setTituloLibro(String titulo_libro){
        this.titulo_libro = titulo_libro;
    }        
    
    public void setAutor(String autor){
        this.autor = autor;
    }    
    
    public void setNumEjemplares(int num_ejemplares){
        this.num_ejemplares = num_ejemplares;
    }
    
    public void setNumEjemplaresPrestados(int num_ejemplares_prest){
        this.num_ejemplares_prest = num_ejemplares_prest;
    }
    
    public String getTituloLibro(){
        return this.titulo_libro;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getNumEjemplares(){
        return this.num_ejemplares;
    }
    
    public int getNumEjemplaresPrestados(){
        return this.num_ejemplares_prest;
    }
    
    // METODO PRESTAMO //
        public boolean prestamo(){
        if(num_ejemplares > 0){
            this.num_ejemplares_prest++;
            this.num_ejemplares--;
            System.out.println("Prestamo realizado con éxito.");
            System.out.print("Disponibles: "+this.getNumEjemplares()+", ");
            System.out.println("Prestados: "+this.getNumEjemplaresPrestados());
            return true;
        }else{
            System.out.println("ERROR! No quedan libros para prestar.");
            return false;
        }
    }
    // METODO DEVOLUCION //
        public boolean devolucion(){
        if(num_ejemplares_prest > 0){
            this.num_ejemplares_prest--;
            this.num_ejemplares++;
            System.out.println("Devolución realizada con éxito.");
            System.out.print("Disponibles: "+this.getNumEjemplares()+", ");
            System.out.println("Prestados: "+this.getNumEjemplaresPrestados());
            return true;
        }else{
            System.out.println("ERROR! No existen libros prestados.");
            return false;
        }
    }
    
}
