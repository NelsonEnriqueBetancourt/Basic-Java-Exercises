package PracticeJava.Exercise2.Clases;

public class Madre  extends Persona {
    private String trabajo;
    private String genero;
    private float sueldo;


    public Madre(String nombre, int edad, String cargoF, String trabajo, String genero, float sueldo){
        super(nombre, edad, cargoF);
        this.trabajo=trabajo;
        this.genero=genero;
        this.sueldo=sueldo;

    }

    public String getTrabajo(){
        return trabajo;
    }
    public String getGenero(){
        return genero;
    }
    public float getSueldo(){
        return sueldo;
    }

    @Override
    public void alimentarse() {
        System.out.println((+1)+".Me alimento de toda clase de comida");
    }

    public String toString(){
        return super.toString()+". trabajo en: "+trabajo+". mi genero es: "+genero+". mi sueldo es: "+sueldo;

    }
}
