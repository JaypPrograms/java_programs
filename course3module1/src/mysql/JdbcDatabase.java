package course3module1.src.mysql;
import java.sql.*;

public class JdbcDatabase {
     
    public static void main(String[] args) {

        //declare a value for the connection 
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register driver
            // Open link
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exampledb", "root", "");
            // Execute query
            stmt = conn.createStatement(); //created a statement to be use to search in the database
            ResultSet rs1 = stmt.executeQuery("select * from person;");//search data in the database

            System.out.println("\nValues from person table");
            System.out.println("--------------------------------------------");
            System.out.format("%4s %-12s %-13s %s"," ","User_Id","Firstname","Lastname\n");
            while(rs1.next()){//loop to print the value in the database
                String firstname =rs1.getString("Firstname");
                int userId= rs1.getInt("user_id");
                String lastname=rs1.getString("Lastname");

                System.out.format("%6s %-12s %-13s %-20s %s","",userId,firstname,lastname,"\n");
            }
                System.out.println("--------------------------------------------\n");

            ResultSet rs = stmt.executeQuery("select DISTINCT firstname from person;");//// Execute query 
            System.out.println("Values of firstname without repetation");
            System.out.println("--------------------------------------------");
            System.out.format("%12s","Firstname\n");
             while(rs.next()){//loop to print the value in the database

                String firstname =rs.getString("Firstname");

                System.out.format("%-3s %-8s %s","",firstname,"\n");
            }
            System.out.println("--------------------------------------------");
            System.out.println();

            // Disconnect database
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