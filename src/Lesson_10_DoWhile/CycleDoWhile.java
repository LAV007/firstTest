package Lesson_10_DoWhile;

import javax.swing.*;

public class CycleDoWhile {
  public void DoWhile () {
    String in = JOptionPane.showInputDialog(null, "Enter number");
    int inPut = Integer.parseInt(in);

    do {
      if (inPut > 0) {
      break;
      }
      if (inPut < 0) {
        JOptionPane.showInputDialog(null, "Enter more than null");
      } else if (inPut > 0) {
        break;
      }

    } while (inPut > 0);
    JOptionPane.showMessageDialog(null, "OK");
  }
}
