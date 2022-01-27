package cycleWhile;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        //variables
        int number;
        int random;
        int accountant=0;

        random= (int) (Math.random()*100);

        //scanner
        Scanner sc = new Scanner(System.in);

        //cycle do-while
        do {
            System.out.println("ingrese el valor");
            number= sc.nextInt();
            accountant++;
            if (random >number){
                System.out.println();
                System.out.println("Digite numero mayor: ");
            }else {
                System.out.println("Digite numero menor: ");
            }
        }while (number != random);

         System.out.println("\n genial en: "+accountant+" intentos adivinaste el numero");

    }
}
