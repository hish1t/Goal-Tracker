import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DatabaseManager {
	
	public static String path = "/Users/marfachornaya/Documents/GitHub/Goal-Tracker/GT_APP_DB.db";

	private Connection conn() throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:" + path);
		return conn;
	}
	
	public int insertGoal(String name, String description, 
			String status, int isDone, LocalDate dateStart, LocalDate dateEnd) throws SQLException {
		
		PreparedStatement ps = null;
		int numRowsInserted = 0;
		
		try {
			String qr = "INSERT INTO Goals (Name, Description, Status, Is_Done, Date_start, Date_end) VALUES (?, ?, ?, ?, ?, ?)";
			Connection conn = this.conn();
			ps = conn.prepareStatement(qr);
			ps.setString(1, name);
			ps.setString(2, description);
			ps.setString(3, status);
			ps.setInt(4, isDone);
			ps.setString(5, String.valueOf(dateStart));
			ps.setString(6, String.valueOf(dateEnd));
			numRowsInserted = ps.executeUpdate();
		} catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	closeConn(ps); // this part can be guilty in slow insert 00:00:03
        }
        return numRowsInserted;
	}
	
	public void closeConn(Statement st) throws SQLException {
		if(st != null) {
			st.close();
		}
        
	}
}
