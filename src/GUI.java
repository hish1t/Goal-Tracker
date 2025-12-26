import java.awt.*;

import javax.swing.*;

public class GUI {

	public GUI() {
		
		JFrame frame = new JFrame();
		
		JButton createGoal = new JButton("Create new goal");
		JButton showGoals = new JButton("Show my goals");
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		panel.setLayout(new GridLayout(0, 1));
		
		panel.add(createGoal);
		panel.add(showGoals);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Goal's Tracker");
		frame.pack();
		frame.setVisible(true);
		
		createGoal.addActionListener(e -> NewGoalWin());
		
	}
	
	public GoalCreateWin NewGoalWin() {
		GoalCreateWin gcw = new GoalCreateWin();
		return gcw;
	}
}
