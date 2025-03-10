package ie.atu.week7.sem2;

import java.sql.*;
public class Main {

    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/exampledatabase", "root", "password");

    try{

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO person(name,age) VALUES (?,?)");
        stmt.setString(1,"Andy");
        stmt.setInt();

    }
}
