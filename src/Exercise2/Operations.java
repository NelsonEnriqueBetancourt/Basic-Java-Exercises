package Exercise2;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

                 //OPERATION 1//
        System.out.println("Digite Valor 1: ");
          int v1 = input.nextInt();

        System.out.println("Digite Valor 2: ");
        int v2 = input.nextInt();

        System.out.println("Digite Valor 3: ");
        int v3 = input.nextInt();

        int Resul1= (v1+v2*v3);

        System.out.println("The Resul Is "+ Resul1);
        System.out.println();


                  //OPERATION 2//
        System.out.println("Operation 2 ");

        System.out.println("Digite Valor 1: ");
        int VA1 = input.nextInt();

        System.out.println("Digite Valor 2: ");
        int VA2= input.nextInt();

        System.out.println("Digite Valor 3: ");
        int VA3 = input.nextInt();

        int Resul2 = (VA1+VA2)%VA3;

        System.out.println("The Result 2 is "+ Resul2);
        System.out.println();


                 //OPERATION 3//
        System.out.println("Operation 3 ");

        System.out.println("Digite Valor 1: ");
        int Va1 = input.nextInt();

        System.out.println("Digite Valor 2: ");
        int Va2 = input.nextInt();

        System.out.println("Digite Valor 3: ");
        int Va3 = input.nextInt();

        System.out.println("Digite Valor 4: ");
        int Va4 = input.nextInt();

        int Resul3 = (Va1+Va2*Va3/Va4);

        System.out.println("The Result Is"+ Resul3);
        System.out.println();


                   //OPERATION 4//
        System.out.println("Operation 4 ");

        System.out.println("Digite Valor 1: ");
        int vA1 = input.nextInt();

        System.out.println(" Digite Valor 2: ");
        int vA2 = input.nextInt();

        System.out.println(" Digite Valor 3: ");
        int vA3 = input.nextInt();

        System.out.println("Digite Valor 4: ");
        int vA4 = input.nextInt();

        System.out.println("Digite Valor 5: ");
        int vA5 = input.nextInt();

        System.out.println("Digite Valor 6: ");
        int vA6 = input.nextInt();
        System.out.println();

        int Resul4 = (vA1+vA2/vA3*vA4-vA5%vA6);

        System.out.println("The Result Is "+ Resul4);












    }
}
