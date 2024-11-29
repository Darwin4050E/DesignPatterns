package espol.edu.ec.Subsystem;

public class Transaccion {
    public static Transaccion CrearTransacción(){
        System.out.println("Su transacción esta siendo efectuada...");
        return new Transaccion();
    }
    
    public void realizarLaTransacción(Cuenta cuenta, Producto product ){
        System.out.println("El producto " +product.getNombre() +" se ha cargado a su cuenta. ");
    }
}
