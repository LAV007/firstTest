/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Lesson_12_Array;

/**
 *
 * @author vbg47
 */
public class Array_Class {
    double [] arr_d = {5.2, 5.6, 6.8, 9.4, 7.3};
    double res = 0;
    
    public void methodArr() {    
    int i = 0;
    
    while (i < arr_d.length) {
    res = res + arr_d[i];    
    i++;
    }
    System.out.println("Сумма элементов массива = " + res);
}
    public void meth_for(){
    double res_1 = 1;
    for (int x = 0; x < arr_d.length; x++){
    res_1 = res_1 * arr_d[x];
    }
    System.out.println("Произведение элементов массива arr_d = " + res_1);
    }
    
}
