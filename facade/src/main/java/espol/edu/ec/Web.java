package espol.edu.ec;

import espol.edu.ec.Subsystem.Producto;
import espol.edu.ec.Subsystem.WebReader;

public class Web extends CanalDeCompra {

    @Override
    public Producto BuscarProducto(String NombreProd) {
        Producto p = WebReader.getProductWeb(NombreProd);
        return p;
    }

}
