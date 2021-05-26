package jrazek.orderapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import java.sql.Timestamp;

@Entity
public class User {
    @Id
    int id;
    String login;
    String firstName;
    String lastName;
    Timestamp joinDate;
    String emailAddress;

    public User(int id, String login, String firstName, String lastName, Timestamp joinDate, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = joinDate;
        this.emailAddress = emailAddress;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
