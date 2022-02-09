package PracticeJava.Exercise2.Clases;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String cargoF;

    public Persona(String nombre, int edad, String cargoF){
        this.nombre=nombre;
        this.edad=edad;
        this.cargoF=cargoF;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getCargoF(){
        return cargoF;
    }

    public abstract void alimentarse();

    public String toString(){
        return "mi nombre es : "+nombre+" tengo : "+edad+" años"+" el cargo familiar es: "+cargoF;

    }



}
