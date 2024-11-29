package ec.edu.espol;

public class Main {
    public static void main(String[] args) {
        
        // Creando una notificación base/concreta.
        Notificador n1 = new Notificacion("Usted debe cancelar 10 dólares.");
        System.out.println("-----------------------------------------------------------");

        // Opción 1: Establecer el mecanismo obligatorio SMS junto con opciones adicionales.
        Notificador n2 = new DecoradorSms(n1);
        Notificador n2_1 = new DecoradorWhatsapp(n2);
        Notificador n2_2 = new DecoradorWire(n2_1);
        n2_2.sendMessage();
        System.out.println("-----------------------------------------------------------");

        // Opción 2: Establecer el mecanismo obligatorio Correo junto con opciones adicionales.
        Notificador n3 = new DecoradorCorreo(n1);
        Notificador n3_1 = new DecoradorSignal(n3);
        Notificador n3_2 = new DecoradorTelegram(n3_1);
        n3_2.sendMessage();
        System.out.println("-----------------------------------------------------------");

        // Opción 3: Establecer ambos mecanismos obligatorios junto con opciones adicionales.
        Notificador n4 = new DecoradorSms(n1);
        Notificador n5 = new DecoradorCorreo(n4);
        Notificador n6 = new DecoradorWhatsapp(n5);
        Notificador n7 = new DecoradorTelegram(n6);
        n7.sendMessage();
        System.out.println("-----------------------------------------------------------");

    }
}