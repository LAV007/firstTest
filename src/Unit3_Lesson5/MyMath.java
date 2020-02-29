/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson5;

/**
 *
 * @author vbg47
 */
public class MyMath {
    private static int count = 0;
    
    public static int add(int a, int b){
    int add = a + b;
    count++;
    return add;    
    }
    public static double add (double a, double b){
    double add = a + b;
    count++;
    return add;
    }
    public static int sub(int a, int b){
    int sub = a - b;
    count++;
    return sub;
    }
    public static int mult(int a, int b){
    int mult = a * b;
    count++;
    return mult;
    }
    public static int div(int a, int b){
    int div = a / b;
    count++;
    return div;
    }
    public static void getCount(){
    System.out.println(count);
    }
    
    // Проверка коммита
}
