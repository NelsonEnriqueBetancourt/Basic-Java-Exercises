package busquedasecuencial;

import javax.swing.*;

public class Exercise1 {
    //main
    public static void main(String[] args) {

        //array
        int [] number = new int[]{4,1,2,3,5};

        //variable
        int dato;
        boolean encontrado=false;

        //JOption.pane
        dato=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dato a buscar: "));


        //VARIABLE
        int i=0;

        //BUSQUEDA SECUENCIAL
        while (i<5 && encontrado==false){
            if (number[i] == dato){
                encontrado=true;
            }
            i++;
        }

        //CONDICION IF
        if (encontrado==false){
            System.out.print("Dato no encontrado");
        }else {
            System.out.print("El dato ha sido encontrado, en la posicion:  "+(i-1));
        }

    }
}
