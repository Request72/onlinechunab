package model;



public class votemodel {
private String positiontype;
private String partyName;



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





// creation of constructtr
public votemodel(String positiontype,String partyName){
this.positiontype=positiontype;
this.partyName=partyName;


}

    }
