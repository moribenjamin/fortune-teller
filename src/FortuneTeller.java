import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String colorAnswer;
		int siblings;
		int yearsToRetirement = 0;
		String bankBalance;
		String location = null;
		String transportation = null;
		
		System.out.println("Hello Stanger, let me tell your fortune.");
		System.out.println("Ente your first name: ");
		firstName = input.nextLine();
		System.out.println("Enter your last name: ");
		lastName = input.nextLine();
		System.out.println("What is your age: ");
		age =input.nextInt();
		System.out.println("Enter your birthmonth number: ");
		birthMonth = input.nextInt();
		input.nextLine();
		System.out.println("What is your favorite ROYGBIV? Not sure what ROYGBIV is, "
							+ "then enter \"Help\"");	
		colorAnswer = input.nextLine();
		if (colorAnswer.equalsIgnoreCase("Help")) {
			System.out.println("The ROYGBIV colors are:\nR = red\nO = orange\nY = "
							+ "yellow\nG = green\nB = blue\nI = indigo\nV = Violet");
			System.out.println("Now, choose a color");			
			colorAnswer = input.nextLine();
			System.out.println("Great! Thanks");
			} else {			
			System.out.println("Great! Thanks.");
			}			
			System.out.println("So....how many siblings do you have?");
			siblings = input.nextInt();
			{
		//Years to Retirement				
		if (age%2==0) {
			yearsToRetirement = 45;
			}
		else if (age%2==1) {
			yearsToRetirement = 47;				 
			}
		
		//Vacation Home Location
		
					
		switch(siblings) {
		case 0:
		location = ("Paris, France");
		break;
		case 1:
		location = ("London, England");
		break;
		case 2:
		location = ("Geneva, Switzerland");
		break;
		case 3:
		location = ("Ibiza, Spain");
		break;
		default:
			
		if (siblings > 3) {
			location = ("Amsterdam, Netherlands");
		}else if (siblings <= 0) {
			location = ("Dayton, OH");				
		}
		}
	    

		//Mode of Transportation
		
		if (colorAnswer.equalsIgnoreCase("red")) {
			transportation = ("Ford Mustang");
			} else if (colorAnswer.equalsIgnoreCase("orange")) {
			  transportation = ("unicorn");
			} else if (colorAnswer.equalsIgnoreCase("yellow")) {
			  transportation = ("magic carpet");
			} else if (colorAnswer.equalsIgnoreCase("green")) {				
			  transportation = ("Uber");
			} else if (colorAnswer.equalsIgnoreCase("blue")) {
			  transportation = ("surfboard");
			} else if (colorAnswer.equalsIgnoreCase("indigo")) {
			  transportation = ("rollerskates");
			} else if (colorAnswer.equalsIgnoreCase("violet")) {
			  transportation = ("invisible jet");
			}
		
		//Bank Balance
		
		switch(birthMonth) {
		case 1:
		case 2:
		case 3:
		case 4:
		bankBalance = ("$1,000,000.00");
		break;
		case 5:
		case 6:
		case 7:
		case 8:
		bankBalance = ("$2,000,000.00");
		break;
		case 9:
		case 10:
		case 11:
		case 12:
		bankBalance = ("$3,000,000.00");
		break;
		default:
		bankBalance = ("$0.00");					
		}
		
		System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years with " + bankBalance + " in the bank, "
				           + "a vacation home in " + location + ", and travel by " + transportation + ".");
	}
	}
}
			
		

			
			

		
