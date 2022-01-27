package cyclefor;


import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int accountant;

        Scanner sc = new Scanner(System.in);

        System.out.println("The value is: ");
        accountant=sc.nextInt();
        accountant++;// contador es la suma de los datos que yo registre

        //cycle for
        for (int i= 0; i<=accountant; i+=2){
            System.out.println(i);
        }

        System.out.println("The value record "+ accountant);
    }

}
