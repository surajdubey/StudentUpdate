/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Data {
    
   static String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static String DB_URL = "jdbc:mysql://localhost/student_database";

   //  Database credentials
   static String USER = "root";
   static String PASS = "123456";
   static String table = "tp_pid";
   
   static Connection conn = null;
   static Statement stmt = null;
   static String sql;
   static ResultSet rs;
   static JFrame frame;
 

 public static void connect()
 {
   try{
          //STEP 2: Register JDBC driver
          Class.forName("com.mysql.jdbc.Driver");

          //STEP 3: Open a connection
          conn = DriverManager.getConnection(DB_URL,USER,PASS);

          //STEP 4: Execute a query
          stmt = conn.createStatement();
      
       }
   
       catch(SQLException e)
       {

       }

       catch(Exception e)
       {

       }
 }//connect
 
 
 public static void check(String s_pid)
 {
 
     try{
      sql = "SELECT * FROM "+table+" WHERE pid="+s_pid;
     rs=stmt.executeQuery(sql);
     
     if(rs.next())
     {
         JOptionPane.showMessageDialog(frame,
            "User is already Registered",
            "Duplicate Entry",
            JOptionPane.ERROR_MESSAGE);
            Sample_sign_up.proceed=false;
     
     }
     
     else{
     
     }
     }
     
     catch(SQLException e)
     {
         System.out.println(e);
     }
 } // insert
 
 
 public static void change_password(String s_pid, String s_pass)
 {
   
      sql = "UPDATE "+table+" SET password='"+s_pass+"' WHERE pid="+Log_in.pid;
      execute(sql);
      
      
 
 } // insert
 
 
 public static void update(String pid, String name, String address, String contact, String year, String branch, String divison, String interest)
 {
     sql="UPDATE "+table+" SET name = '" + name +"',address = '"+address+"',contact ="+contact+",year = '"+year+"',branch = '"+branch+"',divison = '"+divison+"',interest = '"+interest+"' WHERE pid = "+Log_in.pid;
     execute(sql);
 
 }
 
 
 public static void update(String pid, String pass, String name, String address, String contact, String year, String branch, String divison, String interest)
 {
     sql="INSERT INTO "+table+" VALUES(" + pid +",'" + pass +"','"+name+"','"+address+"',"+contact+",'"+year+"','"+branch+"','"+divison+"','"+interest+"')";
     execute(sql);
 
 }
 
 
 
 
 public static void execute(String sql)
 {
     try{
     
     stmt.executeUpdate(sql);
     }
     catch(MySQLIntegrityConstraintViolationException e)
        {
            JOptionPane.showMessageDialog(frame,
            "User is already Registered",
            "Duplicate Entry",
            JOptionPane.ERROR_MESSAGE);
            Sample_sign_up.proceed=false;
        
        }
     
     catch(SQLException e){
         
         System.out.println(e);
     
     }
 
 }
 
 
 public static ResultSet select()
 {
     
     sql= "SELECT * FROM "+table+" WHERE pid = "+Log_in.pid+" and password = '" +Log_in.pass+"'";
     try{  
     rs=stmt.executeQuery(sql);
     }
     
     catch(SQLException e)
     {
     
     }
     
     return rs;
 
 }
 
 
 
 public static ResultSet selectAll()
 {
     
     sql= "SELECT * FROM "+table+" WHERE pid = "+Log_in.pid;
     try{  
     rs=stmt.executeQuery(sql);
     }
     
     catch(SQLException e)
     {
         System.out.println(e);
     
     }
     
     return rs;
 
 }
 
 
 public static void delete()
 {
     sql= "DELETE FROM "+table+" WHERE pid='"+Log_in.pid+"'";
      try{
      stmt.executeUpdate(sql);
      }
      
      catch(SQLException e)
      {
      
      }
 }
 
 
 public static ResultSet n_search(String search)
 {
     
     sql= "SELECT * FROM "+table+" WHERE pid = '"+search+"' OR name LIKE '%"+search+"%'"
             + " OR contact = '"+search+"' OR interest LIKE '%"+search+"%' OR "
             + "address LIKE '%"+search+"%'";
             
      try{  
     rs=stmt.executeQuery(sql);
     }
     
     catch(SQLException e)
     {
         JOptionPane.showMessageDialog(frame,e,"No Search Result",JOptionPane.ERROR_MESSAGE);
      
     
     }
     
     return rs;
 
 }
 
 public static ResultSet all_record()
 {
     sql="SELECT * FROM "+table;
     
      try{  
     rs=stmt.executeQuery(sql);
     }
     
     catch(SQLException e)
     {
         JOptionPane.showMessageDialog(frame,e,"No Search Result",JOptionPane.ERROR_MESSAGE);
      
     
     }
      
     catch(Exception e)
     {
      JOptionPane.showMessageDialog(frame,e,"No Search Result",JOptionPane.ERROR_MESSAGE);
     }
     
     return rs;
 
 
 
 }
 
 
   
}//class
    

