import java.util.Random;

class Persona1 extends Persona {
    public Persona1(String nombre) {
        super(nombre, new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean(), new Random().nextBoolean());
    }
    
}