package Herencia.Abstracto;

public class Persona extends SerVivo{

    @Override
    public void alimentarse() {
        System.out.println("La persona se alimenta de comida humana");
    }
}
