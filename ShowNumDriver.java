// Program: ShowNumDriver
// Written by: William Cobb
// Description: Gets 2 integers between 1-30 and outputs as asterisks
// Time Spent: 3:30
//
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 02/12/2024           WC  Declared private variables for rows and columns
// 02/13/2024           WC  Added constructors for default and parameterized initialization
// 02/12/2024           WC  Declared variables to hold user input
// 02/13/2024           WC  Store user input as string
// 02/13/2024           WC  Convert user input to integer
// 02/14/2024          	WC  Implemented displayValues() method to print asterisks
// 02/14/2024           WC  Fixed syntax errors 
// 02/14/2024           WC  Added input validation for rows and columns (1-30)
// 3/5/2024             WC  Refined program 

 
/* ShowNumDriver.java */

import java.util.Scanner; // Scanner functionality

public class ShowNumDriver
{
	public static void main(String[] args)
	{
		// Create new Scanner object in memory to get user input
		Scanner input = new Scanner(System.in);
		
		// Class initiation to default copy constructor
		ShowNum NumOne = new ShowNum();
	
		int choice = 0;
		System.out.print("Enter -1 to quit, or any number to proceed: ");
		choice = input.nextInt();
		
		while (choice != -1)
		{
			
			int rows = 0, // Rows
				columns = 0; // Columns
				
			// Boolean variable to determine validity of user inputs
			boolean isValid = false;
			
			// While numbers are not between 1-30
			while (!isValid)
			{
			
				// Get rows from user
				System.out.print("Number of Rows (1-30): ");
				rows = input.nextInt();

				// Get columns from user
				System.out.print("Number of Columns (1-30): ");
				columns = input.nextInt();				
				
				// Check if the integers are between 1-30
				if ((rows >= 1 && rows <= 30) && (columns >= 1 && columns <= 30))
					isValid = true; // Set bool to true to escape while loop
				else
					System.out.println("Not within the specified range!");
			}
			
			// Class initiation to copy constructor with valid parameters now passed in 
			ShowNum NumTwo = new ShowNum(rows, columns);
			
			// Call member function from class to get rows and columns as asterisks 
			NumTwo.displayValues();
			
			System.out.println(" - Results - ");
			System.out.println("Rows: " + NumTwo.getRows());
			System.out.println("Columns: " + NumTwo.getColumns());
			
			// Prompt user 
			System.out.print("Enter -1 to quit, or any number to proceed: ");
			choice = input.nextInt();
			
		}
	

	}
}