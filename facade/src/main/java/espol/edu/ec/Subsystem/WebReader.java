package espol.edu.ec.Subsystem;

public class WebReader {
    public static Producto getProductWeb(String NombreProd){
        System.out.println("Transformando el link URL al producto seleccionado...");
        return new Producto(NombreProd);
    }
}
