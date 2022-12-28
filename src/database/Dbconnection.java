/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import javax.swing.*;
import java.sql.*;

public class dbConnection {
   public Connection connection;
   
   Statement statement;

   ResultSet resultSet;

   int value;

   public dbConnection(){

       try {


           String username = "onlinechunab";

           String password = "onlinechunab";

           Class.forName("com.mysql.cj.jdbc.Driver");


           connection = DriverManager.getConnection(

                   "jdbc:mysql://db4free.net:3306/onlinechunab",username,password);

                   if(connection!=null){

                       System.out.println("Connected to database");

                   }else{

                       System.out.println("Error connecting to database");

                   }
                   
           statement = connection.createStatement();

       }catch (Exception e){

           e.printStackTrace();



       }
       
   }


   // Via the use of sql query

   // insert, update and delete

   public int executeQuery(String query){

       try {

           value = statement.executeUpdate(query);

           connection.close();

       }catch (SQLIntegrityConstraintViolationException ex){

           JOptionPane.showMessageDialog(null, "These details already exist!");

       }catch (SQLException e){

           e.printStackTrace();

       }

       return value;


   }
   
   
   
    public int manipulate(String query) {

        try {

            value = statement.executeUpdate(query);

            connection.close();

        } catch (SQLIntegrityConstraintViolationException ex) {

            JOptionPane.showMessageDialog(null, "These details already exist!");

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return value;

    }

    public ResultSet retrieve(String query) {

        try {

            resultSet = statement.executeQuery(query);

        } catch (SQLException e) {

            e.printStackTrace();

        }

        return resultSet;

    }

   public static void main(String[] args) {

       new dbConnection();

   }

//    public PreparedStatement prepareStatement(String query) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

   
}
