
// Program: Scan
// Written by: William Cobb
// Description: Declares a Scanner object to receive user input and then outputs each digit
// Challenges: For loop that calls Math class function in order to calculate each digit
// Time Spent: 1:30
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 01/30/2024             WC             Declared variables to hold user input
// 01/30/2024             WC             Store user input as string    
// 01/30/2024             WC             Convert user input to integer  
// 02/05/2025              WC             Program refinement
// 02/05/2025              WC             Extract digits in for loop

/* Scan.java */

import java.util.Scanner;

public class Scan 
{
 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Scanner memory allocation to store input
        
        System.out.print("Please enter a 5 digit number: "); // Prompt user for input
        int number = input.nextInt(); // Declare integer set to value stored in input

        // For loop to obtain individual digits from number
        for (int digitizer = 4; digitizer >= 0; digitizer--)
        {
            int digitToPrint = (number / (int) Math.pow(10, digitizer)) % 10; 
            System.out.printf(" %d -", digitToPrint);
        }
        
	System.out.println();        
        input.close(); // Close scanner in memory
        System.exit(0);
      
 
    }
 

}
