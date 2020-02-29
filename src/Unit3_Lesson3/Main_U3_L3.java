/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson3;

/**
 *
 * @author vbg47
 */
public class Main_U3_L3 {
    public static void main(String [] args){
    User2 u2 = new User2();
    u2.setId(45);    
    u2.setLogin("Aleksei");
    u2.setPassword();
    System.out.println(u2.getId() + " " + u2.getLogin() + " " + u2.getPassword());
    
    User2 u3 = new User2();
    u3.print();
    
    User2 u4 = new User2(65, "Nik", "Passw");
    u4.setLogin("Very");
    u4.print();
    
    }
    
}
