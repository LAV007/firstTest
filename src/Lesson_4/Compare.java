package Lesson_4;

import javax.swing.*;
import java.util.Scanner;

public class Compare {
    public double input () {
        JOptionPane.showInputDialog(dbl.nextDouble());
        return dbl.nextDouble();
    }

   Scanner dbl = new Scanner(System.in);

    double d1 = input();
    double d2 = input();

    boolean com1 = d1 > d2;
    boolean com2 = d1 < d2;
    boolean com3 = d1 >= d2;
    boolean com4 = d1 <= d2;
    boolean com5 = d1 != d2;
    boolean com6 = d1 == d2;

    public void compare () {
        //System.out.println(
                JOptionPane.showMessageDialog(null, d1 + " > " + d2 + " is " + com1 + "\n" +
                d1 + " < " + d2 + " is " + com2 + "\n" +
                d1 + " >= " + d2 + " is " + com3 +"\n" +
                d1 + " <= " + d2 + " is " + com4 + "\n" +
                d1 + " != " + d2 + " is " + com5 + "\n" +
                d1 + " == " + d2 + " is " + com6 + "\n");
                /*d1 + " > " + d2 + " is " + com1 + "\n" +
                d1 + " < " + d2 + " is " + com2 + "\n" +
                d1 + " >= " + d2 + " is " + com3 +"\n" +
                d1 + " <= " + d2 + " is " + com4 + "\n" +
                d1 + " != " + d2 + " is " + com5 + "\n" +
                d1 + " == " + d2 + " is " + com6 + "\n");*/

    }
}
