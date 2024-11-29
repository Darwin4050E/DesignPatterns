package ec.edu.espol;

public class AsignadorTarjetas {

    public static TarjetaCredito asignarTarjeta(Cliente cliente) {
        FabricaTarjetas fabrica;
        double puntajeCrediticio = cliente.getPuntajeCrediticio();
        if (puntajeCrediticio>=300 && puntajeCrediticio<600) {
            fabrica = new FabricaBasica();
        } else if (puntajeCrediticio>=600 && puntajeCrediticio<750) {
            fabrica = new FabricaVIP();
        } else {
            fabrica = new FabricaPremium();
        }
        TarjetaCredito tarjeta = fabrica.crearTarjeta();
        return tarjeta;
    }
}
