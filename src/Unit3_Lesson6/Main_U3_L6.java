/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson6;

/**
 *
 * @author vbg47
 */
public class Main_U3_L6 {
    public static void main (String[] args){
    UserSocial user_one = new UserSocial(6, "User_Login", "User_Pass", "User_Alex", 28);
    WebMaster web_one = new WebMaster();
    
    web_one.setWebAdres("yahoo.com");
    //user_one.setName("Aleksey");
    
    System.out.println("Name of user_one is " + user_one.getName());
    System.out.println("");
    System.out.println("web adres of web_one is " + web_one.getWebAdres() + " " + web_one.getLogin());

    }
    
}
