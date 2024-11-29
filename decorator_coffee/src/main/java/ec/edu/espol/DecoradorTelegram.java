package ec.edu.espol;

public class DecoradorTelegram extends DecoradorBase{

    public DecoradorTelegram(Notificador n){
        super(n);
    }

    @Override
    public void sendMessage() {
        notificadorEnvolvente.sendMessage();
        System.out.println("- Telegram.");
    }

}
