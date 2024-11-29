package ec.edu.espol;

public abstract class TarjetaCredito {
    private double costoAnual;
    private double limiteCredito;

    public TarjetaCredito(double costoAnual, double limiteCredito) {
        this.costoAnual = costoAnual;
        this.limiteCredito = limiteCredito;
    }

    public double getCostoAnual() {
        return costoAnual;
    }

    public void setCostoAnual(double costoAnual) {
        this.costoAnual = costoAnual;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

}
