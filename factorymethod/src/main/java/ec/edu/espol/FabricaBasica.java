package ec.edu.espol;

public class FabricaBasica implements FabricaTarjetas{

    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaBasica(30, 4500);
    }

}
