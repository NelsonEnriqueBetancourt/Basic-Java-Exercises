package Herencia.Polimosfirmo;

public class VehiculoTurismo extends Vehiculo{
    private int nPuertas;

    public VehiculoTurismo( int nPuertas, String marca, String modelo, String matricula){
        super(marca,modelo,matricula);
        this.nPuertas=nPuertas;
    }

    public int getnPuertas(){
        return nPuertas;
    }


    @Override
    public String mostInfo(){
        return "La marca es: "+marca+" el modelo es: "+modelo+" la matricula es: "+matricula+
                " el numero de puertas es: "+nPuertas;
    }



}
