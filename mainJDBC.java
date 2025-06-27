import java.sql.*;

public class mainJDBC {
    private static final String url = "jdbc:mysql://localhost:3306/myfirstdb"; // ✅ Removed extra space
    private static final String username = "root"; // ✅ Removed extra space
    private static final String password = "Samim"; // ✅ Removed extra space

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // ✅ Load MySQL JDBC Driver
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();
            String query = "SELECT * FROM SrustiStudents";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");

                System.out.println("Student ID: " + id);
                System.out.println("Student Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
                System.out.println("---------------------------");
            }

            // ✅ Close resources
            resultSet.close();
            statement.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
