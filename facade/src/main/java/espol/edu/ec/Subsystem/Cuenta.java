package espol.edu.ec.Subsystem;

public class Cuenta {
    
    public static Cuenta enlazarCuenta(){
        System.out.println("Enlazando con la cuenta del usuario...");
        return new Cuenta();
    }
}
