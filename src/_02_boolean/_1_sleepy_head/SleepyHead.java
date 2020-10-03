package _02_boolean._1_sleepy_head;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
        String day =JOptionPane.showInputDialog("What day is it?");
		// Set the boolean isWeekend based on the value they enter
		if(day.equals("Saturday")|| day.equals("Sunday")) {
			isWeekend=true;		}
		else{
			isWeekend=false;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if(isWeekend) {
			JOptionPane.showMessageDialog(null,"You get to sleep in!");
		}
		

		
		// If it is not the weekend, tell them to get out of bed and go to school!
		else {
			JOptionPane.showMessageDialog(null,"Get out of bed and go to school!");
		}
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam=false;
		// Write code to ask the user what percentage they scored in their last exam
		  String Exam =JOptionPane.showInputDialog("What percentage did you get on your last exam?");
		
		// If they scored more than 70, they passed the exam.
		   double score = Double.parseDouble(Exam);
		  
		  if(score>=70) {
			 
			  passedExam=true;
		   }
		 
		   
		// If the user passed the exam, congratulate them
		if(passedExam) {
			JOptionPane.showMessageDialog(null,"Good Job!");
		}
		
		else {
			JOptionPane.showMessageDialog(null,"try harder!");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
              if(gameOver.equals("yes")) {
            	   gameIsOver= true;
               }
              else{
          		JOptionPane.showMessageDialog(null,"game is over");	
          		}
		
		
		}
		
		
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed=false;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String color =JOptionPane.showInputDialog(null,"What color do you want the robot to draw with?");
	
		boolean isSquare=false;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String shape = JOptionPane.showInputDialog(null,"What shape do you want the robot to draw");
		
		// Now you MUST use the && operator to join the booleans for this code.
		if(color.equals("red")&&shape.equals("square")) {
			isRed=true;
			isSquare=true;
		}
		else {
			
			JOptionPane.showMessageDialog(null, "The robot does not know how to draw that shape.");
		}
		
		
		if(isRed&&isSquare) {
			
			drawRedSquare();
		}
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
		
	
	
	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	 rob.setPenColor(Color.red);
		rob.penDown();
		rob.setSpeed(5);
		rob.move(10);
		rob.turn(90);
		
		
	   
		
		for( int i = 0; i <4; i++ ) {
			rob.move(100);
			rob.turn(90);
			}
			rob.sparkle();
		
	}	
}
