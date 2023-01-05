/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package controller;
import database.dbConnection;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class chunabController {
    dbConnection dbConnection;
    
    public ResultSet retrieveUser(String email, String password){
 
        String retrieveQuery = String.format(
                "SELECT * FROM userdata WHERE username='%s' AND passwordd='%s'",email,password);
        dbConnection = new dbConnection();
        ResultSet result = dbConnection.retrieve(retrieveQuery);
        return result;
    }
    
    public int deleteId(String username){
    
    String deleteQuery = String.format(
                "Delete FROM userdata WHERE username='%s'",username);
        dbConnection = new dbConnection();
        int result = dbConnection.manipulate(deleteQuery);
        return result;
    }
    
}
