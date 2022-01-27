package array;

import java.util.Scanner;

public class foreach1 {
    public static void main(String[] args) {
        //array
        Scanner Entrada = new Scanner(System.in);
        float [] Numeros = new float[5];

        System.out.println("guardando los numeros del arrelo: ");

        for (int i=0; i<5; i++){
            System.out.print((i+1)+".Igrese el numero: ");
            Numeros[i]= Entrada.nextFloat();
        }

        System.out.println("\n imprimir los numeros del arreglo: ");
        //cycle for-each
        for(float i: Numeros){
            System.out.println(i);
        }

    }
}
