package espol.edu.ec;
import espol.edu.ec.Subsystem.Producto;

public class Main {
    public static void main(String[] args) {
        CanalDeCompra canal = new Telefonico(); //También se puede crear Movil o Web
        Producto product = canal.BuscarProducto("Agua cielo");
        canal.comprar(product);
        
    }
}