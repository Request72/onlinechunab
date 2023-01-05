//package VoteController;
//
///**
// *
// * @author user
// */
//import controller.Dbconnection;
//import database.Dbconnection;
//import model.votemodel;
//
//public class votecontroller{
//    Dbconnection dbconnection;
//    public int insertUser(votemodel user){
//        String positiontype = user.getPositionType();
//        String partyName= user.getPartyName();
//       
//
//    
//    String insertQuery = String.format("insert into vote(positiontype,partyName) values ('%s','%s')",positiontype,partyName);
//    System.out.println(insertQuery);
//    dbconnection = new Dbconnection();
//    int result = dbconnection.manipulate(insertQuery );
//    return result;
//    }
//}