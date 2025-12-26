import java.awt.*;
import javax.swing.*;

public class GoalCreateWin {

	public GoalCreateWin() {
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		panel.setLayout(new GridLayout(0, 1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Create new goal");
		frame.pack();
		frame.setVisible(true);
	}
}
