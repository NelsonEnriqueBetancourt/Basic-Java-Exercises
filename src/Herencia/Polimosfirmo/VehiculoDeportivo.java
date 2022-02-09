package Herencia.Polimosfirmo;

public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(String marca, String modelo, String matricula, int cilindrada){
        super(marca, modelo, matricula);
        this.cilindrada=cilindrada;

    }

    public int getCilindrada(){
        return cilindrada;
    }

    @Override
    public String mostInfo(){
        return "La marca es: "+marca+" el modelo es: "+modelo+" la matricula es: "+matricula+
                " El cilindraje es: "+cilindrada;
    }
}
