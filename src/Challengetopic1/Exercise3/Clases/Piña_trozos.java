package Challengetopic1.Exercise3.Clases;

import Challengetopic1.Exercise3.Abstracta.Decorador_HotDog;

public class Piña_trozos extends Decorador_HotDog {
    private Perro_Caliente perro_caliente;

    public Piña_trozos(Perro_Caliente perro_caliente){
        this.perro_caliente=perro_caliente;
    }


    @Override
    public String getDescripcion() {
        return perro_caliente.getDescripcion()+" + Piña_trozos";
    }
}
