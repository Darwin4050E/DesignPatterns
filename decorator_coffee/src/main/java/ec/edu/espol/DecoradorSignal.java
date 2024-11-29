package ec.edu.espol;

public class DecoradorSignal extends DecoradorBase{

    public DecoradorSignal(Notificador n){
        super(n);
    }

    @Override
    public void sendMessage() {
        notificadorEnvolvente.sendMessage();
        System.out.println("- Signal.");
    }

}
