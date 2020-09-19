package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class DoubleTestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What is your test score?");
	 double testscore = Double.parseDouble(test);
	 
	 if(testscore<=50) {
		 
		JOptionPane.showMessageDialog(null," You can do better!"); 
	
	}
	 
	 if(testscore<=80&&testscore>50) {
		 
	JOptionPane.showMessageDialog(null," Try harder next time!"); 
		
	 }
	 
	 if(testscore<=99&&testscore>80) {
		
		 JOptionPane.showMessageDialog(null," Good Almost to 100!"); 
		 
	 }
		 
	 if(testscore<=100) {
			
		 JOptionPane.showMessageDialog(null,"Well done! you did an AWESOME JOB! :) "); 
		 
	 }
		 
		 
		 JOptionPane.showMessageDialog(null," Try harder next time!"); 
				
			 }
	 
	 
}
	 
	 

}
}
