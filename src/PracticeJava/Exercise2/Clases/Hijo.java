package PracticeJava.Exercise2.Clases;

public class Hijo extends Persona {
    private String trabajo;
    private String deporte;
    private float sueldo;


    public Hijo(String nombre, int edad, String cargoF, String trabajo, String deporte, float sueldo){
        super(nombre, edad, cargoF);
        this.trabajo=trabajo;
        this.deporte=deporte;
        this.sueldo=sueldo;
    }

    public String getTrabajo(){
        return trabajo;
    }
    public String getDeporte(){
        return deporte;
    }
    public float getSueldo(){
        return sueldo;
    }

    @Override
    public void alimentarse(){
        System.out.println((+1)+".Yo como de todooo ");
    }

    public String toString(){
        return super.toString()+" Trabajo en: "+trabajo+". Mi deporte que practico es: "
                +deporte+". mi sueldo es: "+sueldo;
    }


}
