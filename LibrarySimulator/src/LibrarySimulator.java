import java.util.Scanner;

public class LibrarySimulator {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean running00 = true;
		int totalBorrowings = 0;
		int totalReturns = 0;
		double totalRevenue = 0;
		
		while (running00 == true) {
		System.out.println("WELCOME TO THE BOOK RENTAL SYSTEM");
		System.out.println("Please select an option:\n" + "1-Login as User\n" + "2-Login as Administrator\n"
				+ "3-Exit the Program");
		int choice = input.nextInt();
		
			switch (choice) {
			// User Selection
			case 1:{
			
				int action;
				int borrowedBooks = 0;
				int returnedBooks = 0;
				double debt = 0;
				boolean running01 = true;
				
				System.out.println("Select a User:\n" + "1-Login as Hisham: 44*******\n" + "2-Login as Mohammed: 44*******\n"
								+ "3-Login as Saeed: 44*******\n" + "4-Return to the Main Menu");
				int userName = input.nextInt();
				
				switch (userName) {
				case 1: // FOR THE USER HISHAM

					while (running01 == true) {
						System.out.println("Select an Option:");
						System.out.println(
								"1- View Borrowed Books\n2- Borrow a Book (0.50 fee)\n3- Return a Book\n4- View Session Summary\n5- Exit to Main Menu");
						action = input.nextInt();

						switch (action) {
						case 1:
							System.out.printf("Currently Borrowed Books: %d\n\n", (borrowedBooks - returnedBooks));
							break;
						case 2:
							if (borrowedBooks < 5) {
								borrowedBooks++;
								debt += 0.50;
								totalBorrowings++;
								totalRevenue += 0.50;
							} else
								System.out.println("You Can't Borrow More Than 5 Books.");
							break;
						case 3:
							if ((borrowedBooks - returnedBooks) > 0) {
								returnedBooks++;
								totalReturns++;
							} else
								System.out.println("You Don't Have Any Books.");
							break;
						case 4:
							System.out.printf("Total Borrowed Books: %d\n", borrowedBooks);
							System.out.printf("Total Returned Books: %d\n", returnedBooks);
							System.out.printf("Total Fees: %.2f\n\n", debt);

							break;
						case 5:
							running01 = false;
							break;
						default:
							System.out.println("Invalid  Selection.\n");
							break;
						}
					}
					break;

				case 2: // FOR THE USER MUHAMMED
					while (running01 == true) {
						System.out.println("Select an Option:");
						System.out.println(
								"1- View Borrowed Books\n2- Borrow a Book (0.50 fee)\n3- Return a Book\n4- View Session Summary\n5- Exit to Main Menu");
						action = input.nextInt();

						switch (action) {
						case 1:
							System.out.printf("Currently Borrowed Books: %d\n\n", (borrowedBooks - returnedBooks));
							break;
						case 2:
							if (borrowedBooks < 5) {
								borrowedBooks++;
								debt += 0.50;
								totalBorrowings++;
								totalRevenue += 0.50;
							} else
								System.out.println("You Can't Borrow More Than 5 Books.");
							break;
						case 3:
							if ((borrowedBooks - returnedBooks) > 0) {
								returnedBooks++;
								totalReturns++;
							} else
								System.out.println("You Don't Have Any Books.");
							break;
						case 4:
							System.out.printf("Total Borrowed Books: %d\n", borrowedBooks);
							System.out.printf("Total Returned Books: %d\n", returnedBooks);
							System.out.printf("Total Fees: %.2f\n\n", debt);

							break;
						case 5:
							running01 = false;
							break;
						default:
							System.out.println("Invalid  Selection.\n");
							break;
						}
					}
					break;

				case 3: // FOR THE USER SAEED
					while (running01 == true) {
						System.out.println("Select an Option:");
						System.out.println(
								"1- View Borrowed Books\n2- Borrow a Book (0.50 fee)\n3- Return a Book\n4- View Session Summary\n5- Exit to Main Menu");
						action = input.nextInt();

						switch (action) {
						case 1:
							System.out.printf("Currently Borrowed Books: %d\n\n", (borrowedBooks - returnedBooks));
							break;
						case 2:
							if (borrowedBooks < 5) {
								borrowedBooks++;
								debt += 0.50;
								totalBorrowings++;
								totalRevenue += 0.50;
							} else
								System.out.println("You Can't Borrow More Than 5 Books.");
							break;
						case 3:
							if ((borrowedBooks - returnedBooks) > 0) {
								returnedBooks++;
								totalReturns++;
							} else
								System.out.println("You Don't Have Any Books.");
							break;
						case 4:
							System.out.printf("Total Borrowed Books: %d\n", borrowedBooks);
							System.out.printf("Total Returned Books: %d\n", returnedBooks);
							System.out.printf("Total Fees: %.2f\n\n", debt);

							break;
						case 5:
							running01 = false;
							break;
						default:
							System.out.println("Invalid  Selection.\n");
							break;
						}
					}
					break;

				case 4: // FOR "Return to the Main Menu"
					running01 = false;

					break;

				default:
					System.out.println("Invalid selection.");
					break;
					}
						} break;
				// Login as admin
			case 2:
				boolean running02 = true;
				while (running02 == true) {

				System.out.println("Select an Option: ");
				System.out.println("1-View Total Revenue\n2-Most Frequent Operation\n3-Exit to Main Menu");
				int choice02 = input.nextInt();
				
				switch (choice02) {
				case 1:
					System.out.printf("Total Revenue: %.2f\n",totalRevenue);

					break;
				case 2:

					break;
				case 3:
					running02 = false;

					break;
				default:
					System.out.print("Invalid selection.");
					break;
				}
					}
				break;
			// Exit Program
			case 3:
				running00 = false;
				break;
			default:
				System.out.println("Invalid selection.");
				break;
				}
			}
		}
	}
