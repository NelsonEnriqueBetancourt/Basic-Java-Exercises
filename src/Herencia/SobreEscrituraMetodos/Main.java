package Herencia.SobreEscrituraMetodos;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Animal animal1= new Animal();

        Perro perro=new Perro();
        perro.comer();

        p1.comer();
        animal1.comer();

    }
}
