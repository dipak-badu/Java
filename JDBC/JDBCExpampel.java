package JDBC;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExpampel {
 public static void main(String[] args){
    try{
        // load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Establish a connection
        String url = "jdbc:mysql://localhost:3306/test";
        Connection conn = DriverManager.getConnection(url, "root", "Meemansa@23x");

        //Create statement
        Statement st = conn.createStatement();

        // Execute a statement
        ResultSet rs = st.executeQuery("SELECT * FROM Employee");
        while(rs.next()){
            int id = rs.getInt("E_ID") ;
            String name = rs.getString("E_Name");
            String address = rs.getString("E_Address");
            Date DOB = rs.getDate("DOB");
           System.out.println(id+"\t"+name+"\t"+address+"\t"+DOB);
        }

        rs.close();
        st.close();
        conn.close();

    } catch (ClassNotFoundException | SQLException e) {
    System.out.println("Error: " + e.getMessage());
}
 }
    
}