/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson_11_SwitchCase;

import javax.swing.JOptionPane;

/**
 *
 * @author vbg47
 */
public class Lesson_SwiCas {
    public void method (){
    int res;
    String in_n1 = JOptionPane.showInputDialog(null, "Enter first number");
    int inPut_n1 = Integer.parseInt(in_n1);
    
    String in_n2 = JOptionPane.showInputDialog(null, "Enter second number");
    int inPut_n2 = Integer.parseInt(in_n2);
    
    String in_s = JOptionPane.showInputDialog(null, "Enter any symbols (+, -, /, *)");
    //int inPut_s = Integer.parseInt(in_s);
    
    switch (in_s) {
    case "+":
        res = inPut_n1 + inPut_n2;
        JOptionPane.showMessageDialog(null, res);
        break;
    case "-":
        res = inPut_n1 - inPut_n2;
        JOptionPane.showMessageDialog(null, res);
        break;
    case "/":
        if (inPut_n2 == 0) {
        JOptionPane.showMessageDialog(null, "Деление на ноль!");
        in_n2 = JOptionPane.showInputDialog(null, "Введите второе число не равное нулю");
        inPut_n2 = Integer.parseInt(in_n2);
        res = inPut_n1 / inPut_n2;
        JOptionPane.showMessageDialog(null, res);
                } else {
            res = inPut_n1 / inPut_n2;
            JOptionPane.showMessageDialog(null, res);
        }        
        break;
    case "*":
        res = inPut_n1 * inPut_n2;
        JOptionPane.showMessageDialog(null, res);
        break;
        }
    
}
}
