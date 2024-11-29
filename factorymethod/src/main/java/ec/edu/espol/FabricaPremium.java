package ec.edu.espol;

public class FabricaPremium implements FabricaTarjetas{

    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaPremium(130, 8000);
    }

}
