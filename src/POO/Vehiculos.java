package POO;

public class Vehiculos {
    //attributes
    private String marca;
    private String modelo;
    private float precio;

    //method construction
    public Vehiculos(String marca, String modelo, Float precio){
        this.marca= marca;
        this.modelo= modelo;
        this.precio= precio;
    }

    //method get
    public float getPrecio(){
        return precio;
    }

    //mostrar datos

    public String mostraInfo(){
        return "la marca es: "+marca+" el modelo es: "+modelo+"el precio del vehiculo es: "+precio;
    }




}
