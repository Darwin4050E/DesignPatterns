
package ec.edu.espol;

public class DecoradorWire extends DecoradorBase{

    public DecoradorWire(Notificador n){
        super(n);
    }

    @Override
    public void sendMessage() {
        notificadorEnvolvente.sendMessage();
        System.out.println("- Wire.");
    }

}
