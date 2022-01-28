package uni.fmi.models;
import java.util.*;

public class Kid {

    public Kid() {
    }

    private String kidNumber;
    public int parentsWorking = 1;
    public int disabledKid = 2;
    public int isHaveTwin = 1;
    public int broterOrSisterInKindergarden = 1;
    public int countPoints;
    public String groupLetter;
    public Set<UserParent> users;
    
    public String getkidNumber() {
        return kidNumber;
    }

    public void setkidNumber(String kidNumber) {
        this.kidNumber = kidNumber;
    }
    public Set<UserParent> getUsers() {
        return null;
    }
  
    public void setUsers(Set<UserParent> users) {
      
    }

}