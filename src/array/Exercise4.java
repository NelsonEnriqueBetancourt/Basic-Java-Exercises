package array;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada = new Scanner(System.in);
        //array
        int [] number = new int[10];
        int ultimo;

        System.out.println("llenar el arreglo: ");
        for (int i=0; i<10 ;i++){
            System.out.print(i +".Digite un numero: ");
            number[i]=Entrada.nextInt();
        }

        ultimo = number[9];//guardamos el ultimo elemento del arreglo

        for (int i=8; i>=0; i--){// avanzar una posicion abajo en el arreglo
            number[i+1] = number[i];
        }

        number[0]= ultimo;

        System.out.println("le nuevo arreglo es: ");
        for (int i=0 ; i<10; i++){
            System.out.println(i + " numero:" + number[i]);
        }
    }
}
