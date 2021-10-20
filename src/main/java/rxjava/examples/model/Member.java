package rxjava.examples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Member {
    private @Id @GeneratedValue Long id;
    private String firstName;
    private String LastName;

    private Member(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public Member(String firstName,String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    
}
