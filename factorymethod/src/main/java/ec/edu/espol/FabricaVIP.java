package ec.edu.espol;

public class FabricaVIP implements FabricaTarjetas{
    
    @Override
    public TarjetaCredito crearTarjeta() {
        return new TarjetaVIP(80, 6000);
    }
    
}
