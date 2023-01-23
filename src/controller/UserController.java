package controller;

/**
 *
 * @author user
 */
import database.dbConnection;
import model.UserModel;
import java.sql.*;

public class UserController{
    dbConnection dbconnection;
    public int insertUser(UserModel user){
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String username= user.getEmail();
        String dob = user.getDob();
        String passwordd = user.getPasswordd();

    
    String insertQuery = String.format("insert into userdata(firstName,lastName,username,national_id,passwordd) values ('%s','%s','%s','%s','%s')",firstName,lastName,username,dob,passwordd);
    System.out.println(insertQuery);
    dbconnection = new dbConnection();
    int result = dbconnection.manipulate(insertQuery);
    return result;
    
    
    
}
}
//    public void changePassword(String pNum){
//      dbconnection = new dbConnection();
//      String selectQuery = String.format("Select * from usersdata where username = '%s'",pNum);
//      ResultSet result = dbconnection.retrieve(selectQuery);
//      
//      
//      try{
//          while(result.next()){
//              String prevPass = result.getString("pass");
//             
//               String updateQuery = String.format("update users_data set pass='%s' where phone_number='%s'");
//              
//             
//                  dbconnection.manipulate(updateQuery);
//              }
//          }
//      }catch(SQLException e){
//          e.printStackTrace();
//      }
//      
//  }
    
    

