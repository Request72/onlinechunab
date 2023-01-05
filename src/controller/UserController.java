package controller;

/**
 *
 * @author user
 */
import database.dbConnection;
import model.UserModel;

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