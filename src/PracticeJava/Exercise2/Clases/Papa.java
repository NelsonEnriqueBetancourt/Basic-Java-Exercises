package PracticeJava.Exercise2.Clases;

public class Papa extends Persona {
    private String trabajo;
    private float sueldo;


    public Papa(String nombre, int edad, String cargoF, String trabajo, float sueldo){
        super(nombre,edad,cargoF);
        this.trabajo=trabajo;
        this.sueldo=sueldo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public float getSueldo(){
        return sueldo;
    }

    @Override
    public void alimentarse(){
        System.out.println((+1)+".Me alimento de comida vegana");
    }

    public String toString(){
        return  super.toString()+". Trabajo en: "+trabajo+". me pagan: "+sueldo;
    }


}
