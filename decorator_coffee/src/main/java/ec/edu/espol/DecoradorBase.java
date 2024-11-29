package ec.edu.espol;

public abstract class DecoradorBase implements Notificador{

    protected Notificador notificadorEnvolvente;

    public DecoradorBase(Notificador n){
        notificadorEnvolvente = n;
    }

    @Override
    public void sendMessage(){
        notificadorEnvolvente.sendMessage();
        System.out.print("por ");
    }

}
