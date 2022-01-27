package cycleWhile;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //attribute
        int number;
        int accountant=0;

        //method Scanner
        Scanner sc = new Scanner(System.in);

        //Cycle do-while
        do { // pedir al usuario una sola vez que registre un dato
            System.out.println("the value is: ");
            number= sc.nextInt();
            accountant++;
        }while (number >=0);
            if (number <0){
                System.out.println("the values is "+accountant);
        }
    }
}
