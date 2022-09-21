import java.util.Scanner;


public class PA1 {
public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	
	int yards, feet, inches;
	int sumYards, sumFeet, sumInches;
	int sumTotal;
	System.out.println("Enter Number of Yards Below:");
		yards = userInput.nextInt();
			sumYards = yards*36;
	// Above is the program to collect the amount of yards from the User
		
	System.out.println("Enter Number of feet below:");
		feet = userInput.nextInt();
			sumFeet = feet*12;
			
	// Above is the program to collect the amount of Feet from the user. 
			
			
	System.out.println("Enter Number of Inches Below:");
		inches = userInput.nextInt();
			sumInches = inches; 
			
		//Above is the program to collect amount of inches from the User
			
	sumTotal = sumYards + sumFeet + sumInches;
			
	System.out.println("The Total Number of inches is:" + sumTotal);
	
	
	
}
}
