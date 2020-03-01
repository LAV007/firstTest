package Lesson_7_Conditional;

import javax.swing.*;

public class Conditional {

    public /*int*/ void enter () {
        try {
            String in = JOptionPane.showInputDialog(null, "Введите положительное число");
            int n = Integer.parseInt(in);
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "Вы ввели число равное или меньше нуля." +
                        "\n" + "Введите положительное число");
            } else if (in == null) JOptionPane.showMessageDialog(null, "Вы не ввели число. Введите положительное число");
            else JOptionPane.showMessageDialog(null, "Вы ввели положительное число");

            String in_2 = JOptionPane.showInputDialog(null, "Введите второе положительное число");
            int n_2 = Integer.parseInt(in_2);
            if (in_2 == null) {JOptionPane.showMessageDialog(null, "Вы не ввели число. Введите положительное число");
            } else if (n_2 == 0) {JOptionPane.showMessageDialog(null, "Результат - бесконечность");
            } else if (n_2 < 0) JOptionPane.showMessageDialog(null, "Второе число меньше нуля");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Вы не ввели число. Введите положительное число");
        }
        /*int n = 5;
        return n;*/
    }
}
