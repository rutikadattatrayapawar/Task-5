import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabaseDemo {

    public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement stmt = null;
        String yourDatabaseName = "JDBCbb";
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
            stmt = con.createStatement();
            int status = stmt.executeUpdate("CREATE DATABASE " + yourDatabaseName);
            if (status > 0) {
                System.out.println("created ..");
            }

        }

        catch (Exception e) {
            e.printStackTrace();

        }
    }
}