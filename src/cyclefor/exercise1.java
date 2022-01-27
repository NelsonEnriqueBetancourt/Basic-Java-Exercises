package cyclefor;

import javax.swing.*;
import java.util.Scanner;

public class exercise1 {
    private static int i;

    public static void main(String[] args) {
        //variable
        int nElementos;
        //Scanner
        Scanner entrada = new Scanner(System.in);
        //JOption
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("type the amount of character: "));
        //array
        char [] letras = new char[nElementos];
        System.out.println("type the  elements of array");
        //cycle for
        for (int i=1; i<nElementos; i++);{
            System.out.println("type first character: ");
            letras[i]= entrada.next().charAt(0);
        }

        System.out.println("the character of array is: ");
        for (int i=1; i<nElementos; i++){
            System.out.println(letras[i]+" ");
        }

    }

}
