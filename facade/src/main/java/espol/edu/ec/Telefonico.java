package espol.edu.ec;

import espol.edu.ec.Subsystem.Producto;
import espol.edu.ec.Subsystem.TelefonicoReader;

public class Telefonico extends CanalDeCompra{

    @Override
    public Producto BuscarProducto(String NombreProd) {
        Producto p = TelefonicoReader.getProductTelefonico(NombreProd);
        return p;
    }

}
