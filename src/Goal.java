import java.time.LocalDate;

public class Goal {
	
	
	public void CreateGoal(String name, String description, 
			String status, int isDone, LocalDate dateStart, LocalDate dateEnd) {
		
		System.out.println("New goal is created!");
		System.out.println("Goal name: " + name);
		System.out.println("About: " + description);
		System.out.println("Status: " + status);
		
		if (isDone == 0) {
			System.out.println("Goal isn't done :(");
		}
		else {
			System.out.println("Goal isn done! :)");
		}
		
		System.out.println("Start: " + dateStart + ", End: " + dateEnd);
	}
}
