package POO;

import javax.swing.*;

public class MainCuadri {
    public static void main(String[] args) {
        Cuadrilatero F1;
        float  lado1,lado2;
        lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado 1"));
        lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del lado 2"));

        if (lado1==lado2){
            F1= new Cuadrilatero(lado1);
            System.out.print((+1)+".Es un cuadrado ");
        }else{
            F1= new Cuadrilatero(lado1,lado2);
        }

        System.out.println("El perimetro del cuadrilatero es: "+F1.getPerimetro());
        System.out.println("El area del cuadrilatero es: "+F1.getArea());

    }
}
