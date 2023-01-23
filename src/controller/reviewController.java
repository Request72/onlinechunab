
package controller;
import database.dbConnection;



import model.reviewmodel;

public class reviewController{
    dbConnection dbconnection;
    public int insertUser(reviewmodel user){
        String FeedBack= user.getReview();
        

    
    String insertQuery = String.format("insert into reviewtable(feedbacks) values ('%s')",FeedBack);
    System.out.println(insertQuery);
    dbconnection = new dbConnection();
    int result = dbconnection.manipulate(insertQuery);
    return result;
    }
}
