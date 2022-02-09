package Herencia.Abstracto;

public class Carnivoro extends Animal{

    @Override
    public void alimentarse() {
        System.out.println("Estos animales se alimentan de carne");
    }
}
