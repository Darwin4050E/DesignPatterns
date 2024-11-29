package ec.edu.espol;

public class Notificacion implements Notificador{

    private String message;

    public Notificacion(String message){
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println("Mensaje: " + message + " ");
        System.out.println("Notificado por: ");
    }

}