package ec.edu.espol;

public class Cliente {
    private String nombres;
    private double salario;
    private int puntajeCrediticio;
    
    public Cliente(String nombres, double salario, int puntajeCrediticio) {
        this.nombres = nombres;
        this.salario = salario;
        if (puntajeCrediticio>=300 && puntajeCrediticio<=850) {
            this.puntajeCrediticio = puntajeCrediticio;
        } else {
            this.puntajeCrediticio = 300;
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPuntajeCrediticio() {
        return puntajeCrediticio;
    }

    public void setPuntajeCrediticio(int puntajeCrediticio) {
        if (puntajeCrediticio>=300 && puntajeCrediticio<=850) {
            this.puntajeCrediticio = puntajeCrediticio;
        } else {
            this.puntajeCrediticio = 300;
        }
    }

    @Override
    public String toString(){ 
        return String.format("Cliente: %s | Puntaje Crediticio: %d", nombres, puntajeCrediticio);
    }
    
}
