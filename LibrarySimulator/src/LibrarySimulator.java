
/*سعيد محمد الغامدي: 446103592
هشام سعيد العيسى: 446100805
محمد سليمان الناصر: 446101002
https://github.com/hishamksu/LibrarySimulator.git
*/
import java.util.Scanner;

public class LibrarySimulator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Member hisham = new Member(446100805, "Hisham", 0);
		Member mohammed = new Member(446101002, "Mohammed", 0);
		Member saeed = new Member(446103592, "Saeed", 0);

		boolean running00 = true;

		while (running00 == true) {

			hisham.reset();
			mohammed.reset();
			saeed.reset();

			System.out.println("WELCOME TO THE BOOK RENTAL SYSTEM");
			System.out.println("_____________________________________");
			System.out.println("Please select an option:\n" + "1-Login as User\n" + "2-Login as Administrator\n"
					+ "3-Exit the Program");
			int choice = input.nextInt();

			switch (choice) {

			case 1:

				int action;

				Member currentUser = null;

				boolean running01 = true;

				System.out.println(
						"Select a User:\n" + "1-Login as Hisham: 446100805\n" + "2-Login as Mohammed: 446101002\n"
								+ "3-Login as Saeed: 446103592\n" + "4-Return to the Main Menu");
				int userName = input.nextInt();

				switch (userName) {
				case 1:
					currentUser = hisham;
					System.out.println("Welcome Hisham!");
					break;

				case 2:
					currentUser = mohammed;
					System.out.println("Welcome Mohammed!");
					break;

				case 3:
					currentUser = saeed;
					System.out.println("Welcome Saeed!");
					break;

				case 4: // FOR "Return to the Main Menu"
					running01 = false;
					break;

				// FOR INVALID SELECTIONS
				default:
					System.out.println("Invalid selection.");
					running01 = false;
					break;
				}

				while (running01 == true) {
					System.out.println("Select an Option:");
					System.out.println(
							"1- View Borrowed Books\n2- Borrow a Book (0.50 fee)\n3- Return a Book\n4- View Session Summary\n5- Exit to Main Menu");
					action = input.nextInt();

					switch (action) {
					case 1:
						currentUser.viewBorrowedCount();
						break;
					case 2:
						currentUser.borrowOne();
						break;
					case 3:
						currentUser.returnOne();
						break;
					case 4:
						currentUser.displayStatistics();
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

			// Login as admin
			case 2:
				boolean running02 = true;
				while (running02 == true) {

					System.out.println("Select an Option: ");
					System.out.println("1-View Total Revenue\n2-Most Frequent Operation\n3-Exit to Main Menu");
					int choice02 = input.nextInt();

					switch (choice02) {
					// FOR "View Total Revenue"
					case 1:
						System.out.printf("Total Revenue: %.2f\n", Member.TotalRevenue);

						break;
					// FOR "Most Frequent Operation"
					case 2:
						if (Member.TotalBorrows > Member.TotalReturns) {
							System.out.printf("The Most Frequent Operation is Borrowing: %d Operations.\n",
									Member.TotalBorrows);
						} else if (Member.TotalBorrows < Member.TotalReturns) {
							System.out.printf("The Most Frequent Operation is Return: %d Operations.\n",
									Member.TotalReturns);
						} else
							System.out.printf("Borrowing and Return Are Equal, %d Operations for Each.\n",
									Member.TotalBorrows);
						break;
					// FOR "Return to the Main Menu"
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
