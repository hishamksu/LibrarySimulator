import java.util.Scanner;

public class LibrarySimulator {

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE BOOK RENTAL SYSTEM");
		System.out.println(
				"Please select an option:\n"
				+ "1-Login as User\n"
				+ "2-Login as Administrator\n"
				+ "3-Exit the program");

		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		switch (choice) {
		case 1:
			System.out.print("select a user:\n"
					+ "1-Login as Hisham: 44*******\n"
					+ "2-Login as Mohammed: 44*******\n"
					+ "3-Login as Saeed: 44*******");
			int userName = input.nextInt();
			switch (userName) {
			case 1:
			
			
				
				
			    break;
			case 2:
			
			
				
				
			    break;
			case 3:
				
				
				
				
				break;
		    default:
				System.out.print("Invalid selection.");
			break;}
		case 2:
		
			
			break;
		case 3:
			
			
		
		default:
			System.out.print("Invalid selection.");

		}

	}

}
