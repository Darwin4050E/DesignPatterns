package espol.edu.ec.Subsystem;

public class MovilReader {
    public static Producto getProductMovil(String nombreProd){
        System.out.println("Buscando el producto en nuestra lista para moviles...");
        return new Producto(nombreProd);
    }
}
