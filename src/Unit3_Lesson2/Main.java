/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson2;

/**
 *
 * @author vbg47
 */
public class Main {
    public static void main (String [] args){
    User u = new User(26, "Alex", "1994");
    User u2 = new User(58, "Vik", "1962");
    
    User [] uArr = {u, u2};
    String res;
    
    for (int i = 0; i < uArr.length; i++){
    System.out.println(uArr[i].id + " " + uArr[i].login + " " + uArr[i].password);
    }
    
    }
    
}
