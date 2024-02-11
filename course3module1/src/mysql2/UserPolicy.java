package course3module1.src.mysql2;

import java.sql.*;//import a package to be use in the program

/**
* Java Course 3 assignment 3
*
* @author Jayperson Babaran
* @Description:  Java database connectivity and show to connect
with the MySQL database and the JDBC code step by step.
* Created Date: 06/07/2022
* Modified Date: 06/07/2022
* @Modified By: Jayperson Babaran
*
*/

public class UserPolicy {
    
    public static void main(String[] args) {

        //assigning the database in the mysql
         final String DB_URL = "jdbc:mysql://localhost:3306/module3";
         final String USER = "root";
         final String PASS = "";
        Connection  conn = null;
        Statement stmt = null;

        try {
            // Register driver
            // Open link
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // Execute query
            stmt = conn.createStatement();
            String sql, sql2;
            
            sql2="select * from user_policies";//
            ResultSet rs2 = stmt.executeQuery(sql2);

            System.out.println(" \n Retrieve all the user policy details");
            System.out.format(" %-15s %-8s %-17s %-15s","policy_type_id","user_id", "date_registered", "policy_type_id\n");
            
            

            while(rs2.next()){
                String policyNo =rs2.getString("policy_no");
                int userId= rs2.getInt("user_id");
                String dateRegistered=rs2.getString("date_registered");
                String policyType =rs2.getString("policy_type_id");

                System.out.format("%4s %-12s %-9s %-20s %-17s %s"," ",policyNo,userId,dateRegistered,policyType,"\n");
            }
            System.out.println();
            
            sql = "select * from user_policies where date_registered <'2012-01-01'";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(" Retrieve user policies where registered date is less than ‘2012-01-01’");
            System.out.format(" %-15s %-8s %-17s %-15s","policy_type_id","user_id", "date_registered", "policy_type_id\n");
            while (rs.next()) {
                // The field type needs to be specified
                String policyNo =rs.getString("policy_no");
                int userId= rs.getInt("user_id");
                String dateRegistered=rs.getString("date_registered");
                String policyType =rs.getString("policy_type_id");
                // Print information
                System.out.format("%4s %-12s %-9s %-20s %-17s %s"," ",policyNo,userId,dateRegistered,policyType,"\n");   
            }
            System.out.println();



            // Disconnect database
            rs2.close();
            rs.close();
            stmt.close();
            conn.close();
            

        } catch (SQLException  se) {
            // JDBC error
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the database connection again
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
        }
    }
}