package Lesson_8_CycleFor;

import javax.swing.*;
import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) {
       /* int e = 5;
        int r = 0;

        for (int i = 1; i <= e; i++) {
            r = r + i;
            /*r+i=1
                    r+i=2
                            r+i=3
                                    r+i=4
                                            r+i=5
        System.out.println(r) */
       CycleFor cf = new CycleFor();
       JOptionPane.showMessageDialog(null, cf.cycle());
        }
    }


