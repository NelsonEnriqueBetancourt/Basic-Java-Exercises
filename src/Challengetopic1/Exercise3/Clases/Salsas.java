package Challengetopic1.Exercise3.Clases;

import Challengetopic1.Exercise3.Abstracta.Decorador_HotDog;

public class Salsas extends Decorador_HotDog {

    private Perro_Caliente perro_caliente;

    public Salsas(Perro_Caliente perroC){
        this.perro_caliente=perroC;
    }

    @Override
    public String getDescripcion() {
        return perro_caliente.getDescripcion()+" + Salsas: ";
    }
}
