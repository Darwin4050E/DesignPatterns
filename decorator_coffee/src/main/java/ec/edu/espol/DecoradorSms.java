package ec.edu.espol;

public class DecoradorSms extends DecoradorBase{

    public DecoradorSms(Notificador n){
        super(n);
    }

    @Override
    public void sendMessage() {
        notificadorEnvolvente.sendMessage();
        System.out.println("- SMS.");
    }

}
