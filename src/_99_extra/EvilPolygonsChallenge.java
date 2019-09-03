package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
		//2. Set the speed to 100
		rob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose robot color", "yee", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		rob.penDown();
		rob.sparkle();
		rob.miniaturize();
		rob.setPenWidth(100);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		System.out.println(colorChoice);
		if (colorChoice==0) {
			rob.setRandomPenColor();
		}
		if (colorChoice==3) {
			rob.setPenColor(10, 50, 100);
		}
		if (colorChoice==1) {
			rob.setPenColor(100, 50, 10);
		}
		
		//4. Ask the use how many polygons they want to be drawn.
		String s=JOptionPane.showInputDialog("How many you want");
		int yee =Integer.parseInt(s);
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < yee; i++) {
			rob.move(100);
			rob.turn(90);
			rob.turn(50);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

