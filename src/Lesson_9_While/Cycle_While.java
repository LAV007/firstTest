package Lesson_9_While;

import javax.swing.*;

public class Cycle_While {
    public int enter () {
        String in = JOptionPane.showInputDialog(null, "Введите не отрицательное целое число");
        int num = Integer.parseInt(in);
        int res = 1;
        if (num <= 0) JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число либо нуль." +
                                                                                    "\n" + "Введите положительно чисто");
        else {
            int i = 1;
            while (i <= num) {
                res = res * i;
                /**
                 * res = 1 * res = 1
                 * res = 2 * 1 = 2
                 * res = 3 * 2 = 6
                 * res = 4 * 6 = 24
                 * res = 5 * 24 = 120
                 */
                i++;
            }
        }
        return res;
    }

}
