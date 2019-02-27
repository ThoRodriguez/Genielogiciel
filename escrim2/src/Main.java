
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	private final String url = "jdbc:postgresql://localhost/escrim";
    private final String user = "huan";
    private final String password = "742153";
    
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }

	public static void main(String[] args) {
		
	}

}
