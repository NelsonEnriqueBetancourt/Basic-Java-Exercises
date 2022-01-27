package JOptionPane;

import javax.swing.*;

public class Example6 {
    public static void main(String[] args) {
        //attribute
        //JOnptionpane
        //cycle while
        //condition
        int value;



        value = Integer.parseInt(JOptionPane.showInputDialog("Record the value: "));

        while (value !=0){

            if (value %2 == 0){
                System.out.println("the Number" +value+" is PAR");
            }
            else {
                System.out.println("The Number" +value+" is odd");
            }

            value = Integer.parseInt(JOptionPane.showInputDialog("Record another value: "));
        }
    }

}


