import java.time.LocalDate;

public class Goal {
	
	String name;
	String description;
	String status; 
	int isDone; 
	LocalDate dateStart; 
	LocalDate dateEnd;
	
	public Goal(String name, String description, 
			String status, int isDone, LocalDate dateStart, LocalDate dateEnd) {
		
		this.name = name;
		this.description = description;
		this.status = status;
		this.isDone = isDone;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
}
