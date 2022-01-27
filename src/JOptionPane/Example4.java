package JOptionPane;

import javax.swing.*;

 public class Example4 {
    public static void main(String[] args) {
        //atributos
        int numero;

        //Metodo Preguntar al usuario ventana emergente

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));

        //ciclo while
        while (numero !=0){ // el numero sea distinto  a 0

            //condicion if-else
            if (numero %2 ==0){ //si el numero es par
                System.out.println("el numero "+numero+ " es PAR");

            }
            else {
                System.out.println("El numero "+numero+" es IMPAR");

            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero"));
        }
    }
 }