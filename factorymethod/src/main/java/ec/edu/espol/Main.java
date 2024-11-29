package ec.edu.espol;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez", 2500.00, 850);
        Cliente cliente2 = new Cliente("Pedro Díaz", 1200.25, 650);
        Cliente cliente3 = new Cliente("Luis Rodríguez", 750.75, 400);
        TarjetaCredito tarjetaAsignada1 = AsignadorTarjetas.asignarTarjeta(cliente1);
        TarjetaCredito tarjetaAsignada2 = AsignadorTarjetas.asignarTarjeta(cliente2);
        TarjetaCredito tarjetaAsignada3 = AsignadorTarjetas.asignarTarjeta(cliente3);
        System.out.println(cliente1);
        System.out.println(tarjetaAsignada1);
        System.out.println();
        System.out.println(cliente2);
        System.out.println(tarjetaAsignada2);
        System.out.println();
        System.out.println(cliente3);
        System.out.println(tarjetaAsignada3);
    }
}

