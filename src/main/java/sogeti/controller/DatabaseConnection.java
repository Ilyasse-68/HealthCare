package controller;

import java.sql.*;

public class DatabaseConnection {
    public static void databaseLink() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/healthcaredb?serverTimezone=UTC",
                    "root",
                    ""
            );
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM User;");
            while (rs.next()) {
                StringBuffer sb = new StringBuffer();
                sb.append("ID :").append(rs.getString(1)).append("\n");
                sb.append("Name :").append(rs.getString(2)).append("\n");
                sb.append("Surname :").append(rs.getString(3)).append("\n");
                sb.append("Mail :").append(rs.getString(4)).append("\n");
                sb.append("Password (lol) :").append(rs.getString(5)).append("\n");
                sb.append("Is doctor ? ").append(rs.getString(6)).append("\n");
                System.out.println(sb.toString());
            }

        }
        catch (SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
            System.out.println("Connexion to DB failed ! :'(");
        }
    }

    public static void main(String[] args) {
        databaseLink();
    }
}
