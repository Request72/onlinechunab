
package model;



public class votemodel {
private String positiontype;
private String partyName;
private String username;



public String getPositionType() {
    return positiontype;
}


public void setPositionType(String positiontype) {
    this.positiontype = positiontype;
}


public String getPartyName() {
    return partyName;
}


public void setPartyName(String partyName) {
    this.partyName = partyName;
}

public String getUserName() {
    return username;
}


public void setUserName(String username) {
    this.username = username;
}




// creation of constructtr
public votemodel(String positiontype,String partyName,String username){
this.positiontype=positiontype;
this.partyName=partyName;
this.username=username;


}

    }