
public class Member {

	//Instance attributes (session + persistent borrowedCouunt)

	private int id;

	private String name;

	private int borrowedCount; //number of books currently borrowed(peristent)

	private int numViewBorrowed; //number of times view borrowed count used(session)

	private int numBorrows; //number of borrow operations in this session

	private int numReturns; //number of return operations in this session

	private double sessionFees; //total fees incurred in the session

	

	//Class-level totals(accumulate across all members/sessions)

	public static double TotalRevenue=0.0;

	public static int TotalViewBorrowed=0;

	public static int TotalBorrows=0;

	public static int TotalReturns=0;

	

	//Constructor

	public Member(int id,String name,int borrowedCount) {

		this.id=id;

		this.name=name;

		this.borrowedCount=borrowedCount;

		

	}

	

	//private helpers for constraints

	private boolean canBorrow() {

		return borrowedCount<5; //if true meaning that can borrow

	}

	

	private boolean canReturn() {

		return borrowedCount>0; //if true meaning that can return

	}

	

	//View current borrowed count (increments view counters)

	public void viewBorrowedCount() {

	numViewBorrowed++;

	TotalViewBorrowed++;

	System.out.println("Books currently borrowed: " + borrowedCount);

	}

	

	//Borrow one book: returns true if success, false otherwise

	public boolean borrowOne() {

		if(!canBorrow()) {

			System.out.println("You cannot borrow more than 5 books");

			return false;

		}

		borrowedCount++;

		numBorrows++;

		TotalBorrows++;

		sessionFees +=.50;

		TotalRevenue +=.50;

		System.out.printf("Book borrowed successfully. Fee:%2f\n",0.50);

		return true;

	}

	

	//Return one book: returns true if success, false otherwise

	public boolean returnOne() {

		if(canReturn()) {

			System.out.println("You have no books to return.");

			return false;

		}

		borrowedCount--;

		numReturns++;

		TotalReturns++;

		System.out.println("Book returned successfully.");

		return true;

	}

	

	//Display session statistics for this member

	public void dislayStatistics() {

		System.out.println("======Session Sumary for" +name+ "ID: " +id+ ")======");

		System.out.println("Books Borrowed (this session): " + numBorrows);

		System.out.println("Books Returnd (this session): " +numReturns);

		System.out.println("Times View Borrowed Count used(this sesssion): " +numViewBorrowed);

		System.out.printf("Fees inscrred (this session): %2f\n",sessionFees);

	}
	
	
	// Reset statistics
    public void reset() {
        numBorrows = 0;
        numReturns = 0;
        numViewBorrowed = 0;
        sessionFees = 0;
    }

    // ==== Getters ====

    public String getName() {
        return name;
    }

}
