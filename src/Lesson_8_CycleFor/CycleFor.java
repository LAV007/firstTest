package Lesson_8_CycleFor;

import javax.swing.*;
import java.util.Scanner;

public class CycleFor {

    public int cycle () {
        String in = JOptionPane.showInputDialog(null, "Enter your number");
        int n = Integer.parseInt(in);
        int result = 0;
        for (int i = 1; i <= n; i++){
            result = result + i;
        }
        return result;
    }

}

