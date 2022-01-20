package Exercise3;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Cual es tu nombre");
        String N1 = input.next();

        System.out.println("Nº Cedula");
        int CC = input.nextInt();

        System.out.println("Edad");
        int A = input.nextInt();

        System.out.println();

        System.out.println("Estas En El Plantel Felicidades !!");
    }
}

