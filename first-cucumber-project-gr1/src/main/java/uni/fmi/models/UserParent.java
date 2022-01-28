package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class UserParent {

    /**
     * Default constructor
     */
    public UserParent() {
    }
    private String Username;
    private String Password;
    private Boolean typeUser;
    public Set<Kid> KIds;
    public Set<Kid> kids;
    public Set<KidsInGroup> classs;
    private Admin admin;

    public String getUsername() {
       
        return Username;
    }
    public void setUsername(String username) {
        this.Username = username;
        
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        this.Password = password;        
    }
    public Boolean getTypeUser () {
    	return typeUser;
    }
    public void setTypeUser (Boolean typeUser){
    	 this.typeUser = typeUser;
    }
    public Kid getKid() {
        return null;
    }
    public void setKid(Kid kid) {
        
    }
    public void addKid() {    
    }
    public String getUserType() {    
        return "";
    }
    public void setUserType(String type) {
       
    }
}