package jdbcpackage;

import java.sql.*;

public class PreparedStatements {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "123456789";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String createTableSQL = "CREATE TABLE IF NOT EXISTS studentsprep (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20), age INT)";
            Statement stmt = conn.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("Table created successfully.");

            String insertSQL = "INSERT INTO studentsprep (name, age) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSQL);
            insertStmt.setString(1, "Alice");
            insertStmt.setInt(2, 22);
            insertStmt.executeUpdate();

            insertStmt.setString(1, "Bob");
            insertStmt.setInt(2, 25);
            insertStmt.executeUpdate();
            System.out.println("Data inserted successfully.");

            String updateSQL = "UPDATE studentsprep SET age = ? WHERE name = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSQL);
            updateStmt.setInt(1, 30);
            updateStmt.setString(2, "Bob");
            updateStmt.executeUpdate();
            System.out.println("Data updated successfully.");

            ResultSet rs = stmt.executeQuery("SELECT * FROM studentsprep");
            System.out.println("Studentprep Table:");
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getInt("age"));
            }

            rs.close();
            stmt.close();
            insertStmt.close();
            updateStmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
