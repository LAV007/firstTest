 /*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson3;

/**
 *
 * @author vbg47
 */
public class User2 {
    private int id;
    private String login;
    private String password;
    
    public int getId(){
    return id;
    }   
    public String getLogin(){
    return login;
    }    
    public String getPassword(){
    return password;
    }
    
    public void setId(int id){
    this.id = id;
    }
    public void setLogin(String login){
    this.login = login;
    }
    public void setPassword(String passwoed){
    this.password = password;
    }
    
    public void setId(){
    id = 0;
    }
    public void setLogin(){
    login = "guest";
    }
    public void setPassword(){
    password = "default pass";
    }
    
    public User2(int id, String login, String password){
    this.id = id;
    this.login = login;
    this.password = password;
    }
    public User2 (){
    this.id = 0;
    this.login = "default login";
    this.password = "default password";
    }
    
    public void print(){
    System.out.println(getId() + " " + getLogin() + " " + getPassword());
    }
}
