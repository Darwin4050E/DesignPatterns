package ec.edu.espol;

public class DecoradorWhatsapp extends DecoradorBase{

    public DecoradorWhatsapp(Notificador n){
        super(n);
    }

    @Override
    public void sendMessage() {
        notificadorEnvolvente.sendMessage();
        System.out.println("- WhatsApp.");
    }

}
