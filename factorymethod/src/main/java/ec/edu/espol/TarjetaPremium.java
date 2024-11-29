package ec.edu.espol;

public class TarjetaPremium extends TarjetaCredito{
    public TarjetaPremium(double costoAnual, double limiteCredito) {
        super(costoAnual, limiteCredito);
    }

    @Override
    public String toString() {
        return String.format("Tarjeta Premium | Costo Anual: %.2f | Limite Credito: %.2f", this.getCostoAnual(), this.getLimiteCredito());
    }
}
