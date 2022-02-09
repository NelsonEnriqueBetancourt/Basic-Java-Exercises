package Herencia.Polimosfirmo;

/*--protected funciona como modificador de acceso para que los atributos de una clase padre  tengan acceso a las clases hijas

 */
public class Vehiculo {
    //attribute

    protected String marca;
    protected String modelo;
    protected String matricula;

    //methods

    //constructor
    public Vehiculo(String marca, String modelo, String matricula){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;

    }

    //get

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMatricula(){
        return matricula;
    }

    public String mostInfo(){
        return "La marca es: "+marca+" el modelo es: "+modelo+" la matricula es: "+matricula;
    }


}
