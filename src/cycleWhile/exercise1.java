package cycleWhile;

import javax.swing.*;

public class exercise1 {
    public static void main(String[] args) {
        //attribute
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("The number is: "));
         while (number !=0){

             if (number %2 ==0){

                 System.out.println("the value is: "+number+" PAR");
             }
             else {
                 System.out.println("the value is: "+number+" old");
             }

             number = Integer.parseInt(JOptionPane.showInputDialog("The second value is: "));
         }
    }
}
