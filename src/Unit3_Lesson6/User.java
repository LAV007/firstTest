/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson6;

/**
 *
 * @author vbg47
 */
public class User {
    int id;
    private String login;
    String password;
    
    public void setLogin(){
    this.login = login;
    }
    public String getLogin(){
    return login;
    }
    
    public User(int id, String login, String password){
    this.id = id;
    this.login = login;
    this.password = password;
    }
    
     public User(){
    id = 0;
    login = "defauld login of User";
    password = "password";
    }
}
