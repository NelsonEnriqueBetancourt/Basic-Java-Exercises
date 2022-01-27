package array;

import java.util.Scanner;

public class foreach2 {
    public static void main(String[] args) {
        //Scanner
        Scanner Entrada = new Scanner(System.in);
        //array
        float [] numeros2 = new float[5];

        System.out.println("guardando los numeros del arreglo: ");

        //cycle for
        for(int i=0; i<5; i++){
            System.out.print((i+1)+".ingrese el numero: ");
            numeros2[i]=Entrada.nextFloat();
        }

        System.out.println("\n Imprimiendo numeros: ");
        //cycle foreach
        for(float i = 5; i>0; i--){
            System.out.println(i);
        }
    }
}
