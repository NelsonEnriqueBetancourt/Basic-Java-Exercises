package array;

import javax.swing.*;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //variables
        int nElementos;

        //JOption
        nElementos= Integer.parseInt(JOptionPane.showInputDialog("Cuantos caracteres deseas ejercutar: "));

        //Scanner
        Scanner Entrada = new Scanner(System.in);

        //array
        char [] letras = new char [nElementos];
        System.out.println("Digite los elementos del arreglo: ");
        //cyclo for
        for (int i=0; i<nElementos; i++){
            System.out.println("\n digite un caracter: ");
            letras[i]=Entrada.next().charAt(0);
        }
        System.out.println("\n los caracteres del arreglo son: ");
        for (int i=0; i<nElementos; i++){
            System.out.print(letras[i]+" ");
        }
    }
}
