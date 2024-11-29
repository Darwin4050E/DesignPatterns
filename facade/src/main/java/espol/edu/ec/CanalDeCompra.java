package espol.edu.ec;

import espol.edu.ec.Subsystem.Cuenta;
import espol.edu.ec.Subsystem.Producto;
import espol.edu.ec.Subsystem.Transaccion;

public abstract class CanalDeCompra {
    protected Producto producto;

    public abstract Producto BuscarProducto(String NombreProd);
    
    public void comprar(Producto producto){
        Cuenta cuenta = Cuenta.enlazarCuenta();
        Transaccion trans = Transaccion.CrearTransacción();
        trans.realizarLaTransacción(cuenta, producto);
    }
}
