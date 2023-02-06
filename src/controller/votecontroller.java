
package controller;
import database.dbConnection;
import model.votemodel;



public class votecontroller{
    dbConnection dbconnection;
    public int insertUser(votemodel user){
        String positiontype = user.getPositionType();
        String partyName= user.getPartyName();
        String username=user.getUserName();

    
    String insertQuery = String.format("insert into vote(username,positiontype,partyName) values ('%s','%s','%s')",username,positiontype,partyName);
    System.out.println(insertQuery);
    dbconnection = new dbConnection();
    int result = dbconnection.manipulate(insertQuery );
    return result;
    }
}