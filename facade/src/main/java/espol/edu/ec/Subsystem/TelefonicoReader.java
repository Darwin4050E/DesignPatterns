package espol.edu.ec.Subsystem;

public class TelefonicoReader {
    public static Producto getProductTelefonico(String NombreProd){
        System.out.println("La CallCenter está escogiendo el producto en el sistema...");
        return new Producto(NombreProd);
    }
}
