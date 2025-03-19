package ie.atu.week7.sem2;

import java.sql.*;
public class Main {

    public static void main(String[] args) throws SQLException {


    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase", "root", "password");

    try {

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO person(id,name,age, email) VALUES (?,?,?,?)");
        stmt.setInt(1,001);
        stmt.setString(2, "Tom");
        stmt.setInt(3, 25);
        stmt.setString(4, "tom@gmail.com");
        stmt.executeUpdate();

        System.out.println("insert successful");
    } catch (SQLException ex){

        System.out.println("record insert failed.");
        ex.printStackTrace();
    }

    conn.close();
    }
}