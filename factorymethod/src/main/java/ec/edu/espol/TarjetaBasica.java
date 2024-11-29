package ec.edu.espol;

public class TarjetaBasica extends TarjetaCredito{
    public TarjetaBasica(double costoAnual, double limiteCredito) {
        super(costoAnual, limiteCredito);
    }

    @Override
    public String toString() {
        return String.format("Tarjeta Basica | Costo Anual: %.2f | Limite Credito: %.2f", this.getCostoAnual(), this.getLimiteCredito());
    }
}
