import bip.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apand
 */
public class TEST {
    String name;

    /**
     *
     * @return
     */
    public TEST(int c)      
    {
        int bl=c;
        try {
 
            // SQL command data stored in String datatype
            String sql;
            sql = "select Admin_name FROM CEDENTIALS WHERE Admin_id=b1;";
            Connection con=DBConnect.Connect();
            Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
 
            // Condition check
            while (rs.next()) {
 
                name = rs.getString("Admin_name");
            }
        }
        // Catch block to handle exception
        catch (Exception e) {
 
            // Print exception pop-up on screen
            System.out.println(e);
        }
    }
    public String retur()
    {
        return name;
    }

public static void main(String[] args) {
 //   Unit myObj = new Unit("O+"); // Create an object of class Main (This will call the constructor)
//    int a=myObj.retur();
//    System.out.println(a);
}
}
