package Challengetopic1.Exercise1.Clases;

import Challengetopic1.Exercise1.Interfaces.Music;

public class Disco_Muisc2 extends Store_music implements Music {

    private String color="red";
    private float capacity=5000;
    private int battery=8;


    public Disco_Muisc2(String nombre) {
        super(nombre);
    }

    public String getColor() {
        return color;
    }

    public float getCapacity() {
        return capacity;
    }

    public int getBattery() {
        return battery;
    }


    @Override
    public void Tipo_disco() {
        System.out.println("the name is: "+nombre+"\nel color es: "+getColor()+ "\nla capacidad es: "+getCapacity()+
                " GB"+"\nla battery es: "+getBattery()+" Horas");
    }

}
