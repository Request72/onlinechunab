package model;



public class UserModel {
private String firstName;
private String lastName;
private String email;
private String dob;
private String passwordd;


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


public String getEmail() {
    return email;
}


public void setEmail(String email) {
    this.email = email;
}


public String getDob() {
    return dob;
}


public void setDob(String dob) {
    this.dob = dob;
}


public String getPasswordd() {
    return passwordd;
}


public void setPasswordd(String passwordd) {
    this.passwordd = passwordd;
}


// creation of constructtr
public UserModel(String firstName,String lastName,String email,String dob,String passwordd){
this.firstName=firstName;
this.lastName=lastName;
this.email=email;
this.dob=dob;
this.passwordd=passwordd;

}

    }