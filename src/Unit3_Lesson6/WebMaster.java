/*
 * by Alex Lysogora
 * Each line should be prefixed with  * 
 */
package Unit3_Lesson6;

/**
 *
 * @author vbg47
 */
public class WebMaster extends User {
    
   private String webAdres;
   
   public WebMaster(int id, String login, String password, String webAdres){
   super(id, login, password);
   this.webAdres = webAdres;
   }
   
   public WebMaster(){   
   }
   
   public String getWebAdres(){   
   return webAdres;
   }
   public void setWebAdres(String webAdres){
   this.webAdres = webAdres;
   }
   
   
}
