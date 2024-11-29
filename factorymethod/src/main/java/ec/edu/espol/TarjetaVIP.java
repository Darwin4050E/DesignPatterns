package ec.edu.espol;

public class TarjetaVIP extends TarjetaCredito{
    public TarjetaVIP(double costoAnual, double limiteCredito) {
        super(costoAnual, limiteCredito);
    }

    @Override
    public String toString() {
        return String.format("Tarjeta VIP | Costo Anual: %.2f | Limite Credito: %.2f", this.getCostoAnual(), this.getLimiteCredito());
    }
}
