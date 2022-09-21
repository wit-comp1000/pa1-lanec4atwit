import java.util.Scanner;

public class PA1pt2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		

		
		int yards, feet, inches;

	System.out.println("Enter the Amount of inches Below");
		inches = userInput.nextInt();
		
		//This is the end of the Collection. The rest of the code will be the conversion
		
			yards = inches / 36;
			inches = inches % 36;
			
			feet = inches / 12;
			inches = inches % 12;
			
		System.out.println("The number of Yards is " + yards);
		
		System.out.println("The number of feet is: " + feet);
		
		System.out.println("The number of Inches is: " + inches);
	}

}
