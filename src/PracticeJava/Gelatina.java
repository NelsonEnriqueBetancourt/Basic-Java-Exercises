package PracticeJava;

public class Gelatina {
    // Atributos
    String color;
    String sabor;

    // Metodo Constructor sirve para inicializar los atributos de una clase
    public Gelatina(String c, String s){
        this.color = c;
        this.sabor = s;

    }

    // Metodo GETTER
    public String getColor(){
        return this.color;
    }

    public String getSabor(){
        return this.sabor;
    }

    // Metodo SETTER

    public void setColor(String c){
        this.color = c;
    }

    public void setSabor(String s){
        this.sabor = s;
    }

    // Metodo Imprima la info del objeto

    public void mostrarInfo(){

        System.out.println("La Informacion de la gelatina es: ");
        System.out.println("El color es " + getColor());
        System.out.println("El Sabor es " + getSabor());
    }

}
