package ec.edu.espol;

public class DecoradorCorreo extends DecoradorBase{

    public DecoradorCorreo(Notificador n){
        super(n);
    }

    @Override
    public void sendMessage() {
        notificadorEnvolvente.sendMessage();
        System.out.println("- Correo.");
    }

}
