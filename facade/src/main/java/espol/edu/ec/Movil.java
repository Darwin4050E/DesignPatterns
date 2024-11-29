package espol.edu.ec;

import espol.edu.ec.Subsystem.MovilReader;
import espol.edu.ec.Subsystem.Producto;

public class Movil extends CanalDeCompra {

    @Override
    public Producto BuscarProducto(String Nombreprod) {
        Producto p = MovilReader.getProductMovil(Nombreprod);
        return p;
    }

}
