package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main(String[] args) {
		// 1. make a main method

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		Robot rob = new Robot("mini");
		// 3. use a for loop to initialize the robots.
		int shiftX = 150;
		rob.setY(300);
		rob.setX(825);
		rob.setSpeed(60);
		rob.penDown();
		int[] count = { 0, 0, 0, 0, 0 };
//	for (int i = 0; i<36; i++) {
//		rob.move(45);
//		rob.turn(-10);
//	}
		/*
		 * for(int i =0; i< robots.length ;i++) {
		 * 
		 * robots[i]=new Robot(); robots[i].setSpeed(55); robots[i].setY(550);
		 * robots[i].setX(shiftX); shiftX+=150; robots[i].penDown(); }
		 */ // 5. use another for loop to iterate through the array and make each robot move
			// a random amount less than 50.
		for (int i = 0; i < robots.length; i++) {

			robots[i] = new Robot("mini");
			robots[i].setSpeed(55);
			robots[i].setY(300);
			robots[i].setX(800);

			robots[i].penDown();
			robots[i].setRandomPenColor();
		}
		Random rand = new Random();
		boolean raceInProgress = true;
		RACE: while (raceInProgress) {
			for (int i = 0; i < 5; i++) {

				
				if (rand.nextBoolean()) {
					robots[i].move(45);
					robots[i].turn(-10);
					count[i]++;
					System.out.println(count[i]);
				}
				if (count[i] == 72) {
					System.out.println("Robot "+i+" has won the Race");
					break RACE;
				
				}
			}
		}
		/*
		 * RACE: while(raceInProgress) { for(int i =0; i<5;i++) {
		 * 
		 * int random = rand.nextInt(51); robots[i].move(random); int currentValue =
		 * robots[i].getY(); if(currentValue<50) {
		 * System.out.println("Robot "+i+" has won."); break RACE; } } }
		 */
	}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
