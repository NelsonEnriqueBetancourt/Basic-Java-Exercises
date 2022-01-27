package POO;

public class Cuadrilatero {
    //attribute
    private float lado1;
    private float lado2;

    //METHODS
    //method construction
    public Cuadrilatero(float lado1, float lado2){
        this.lado1= lado1;
        this.lado2= lado2;
    }
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    //method getter
    public float getPerimetro(){
        float Perimetro = 2*(lado1+lado2);
        return Perimetro;
    }

    public float getArea(){
        float Area = (lado1*lado2);
        return Area;
    }

    // Imprimir por consola

    /*public void mostrarInfo(){
        Cuadrilatero F1;
        float  lado1,lado2;
        lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado 1"));
        lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado 2"));
        System.out.print((+1)+".El perimetro del Cuadrilatero es: "+getPerimetro());
        System.out.print((+1)+".El area del Cuadrilatero es: "+getArea());
        System.out.println();
    }*/


}
