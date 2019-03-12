/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.JAR;

/**
 *
 * @author hp laptop
 */

import java.sql.*;
public interface DatabaseConnection{
    public static void main (String []args) throws Exception{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
        
        String insertsql ="INSERT INTO student VALUES(01,'sule','inaruwa')";
        String selectsql= "SELECT * FROM student ";
        Statement st=conn.createStatement();
        st.executeUpdate(insertsql);
        ResultSet rs= st.executeQuery(selectsql);
        System.out.println("roll" + "\t\t" + "name" + "\t\t" + "address");
        while(rs.next())
        {
            int roll=rs.getInt("roll");
            String name= rs.getString("name");
            String address= rs.getString("address");
            System.out.println(roll + "\t\t" + name + "\t\t" + address);
        }
        conn.close();
        }
        
    }