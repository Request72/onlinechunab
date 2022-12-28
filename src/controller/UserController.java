/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package controller;

/**
 *
 * @author user
 */
import database.Dbconnection;
import model.UserModel;

public class UserController{
    Dbconnection dbconnection;
    public int insertUser(UserModel user){
        String firstName = user.getFirstName();
        String lastName = user.getLastName();
        String username= user.getEmail();
        String dob = user.getDob();
        String passwordd = user.getPasswordd();

    
    String insertQuery = String.format("insert into userdata(firstName,lastName,username,national_id,passwordd) values ('%s','%s','%s','%s','%s')",firstName,lastName,username,dob,passwordd);
    System.out.println(insertQuery);
    dbconnection = new Dbconnection();
    int result = dbconnection.manipulate(insertQuery);
    return result;
}
}