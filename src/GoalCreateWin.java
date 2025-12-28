import java.awt.*;
import javax.swing.*;

public class GoalCreateWin {

	public GoalCreateWin() {
		
		JFrame frame = new JFrame();
		
		JPanel framePanel = new JPanel();
		framePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		framePanel.setLayout(new GridLayout(0, 1));
		
		JPanel namePanel = new JPanel();
		JPanel descPanel = new JPanel();
		
		JLabel lNameNewGoal = new JLabel("Goal name: ");
		JLabel lDescNewGoal = new JLabel("Description: ");
		
		JTextField nameNewGoal = new JTextField();
		nameNewGoal.setColumns(30);
		
		JTextArea descNewGoal = new JTextArea();
		descNewGoal.setColumns(30);
		descNewGoal.setRows(5);
		
		frame.add(framePanel, BorderLayout.CENTER);
		framePanel.add(namePanel, BorderLayout.CENTER);
		framePanel.add(descPanel, BorderLayout.CENTER);
		
		namePanel.add(lNameNewGoal, BorderLayout.CENTER);
		namePanel.add(nameNewGoal, BorderLayout.CENTER);
		
		descPanel.add(lDescNewGoal, BorderLayout.CENTER);
		descPanel.add(descNewGoal, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Create new goal");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
