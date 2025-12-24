import java.sql.*;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws SQLException {
//		Goal newGoal = new Goal();
//		
//		newGoal.CreateGoal("Gym on Monday 16:00", "You can do more and be better!"
//				, "Created", 0, LocalDate.now(), LocalDate.now());
		
		
		DatabaseManager newConn = new DatabaseManager();
		
		int result = newConn.insertGoal("Gym on Monday 16:00", "You can do more and be better!"
				, "Created", 0, LocalDate.now(), LocalDate.now());
		
		System.out.println(result);

	}

}
