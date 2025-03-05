// Program: Gui
// Written by: William Cobb
// Description: Gets user input as a string and converts to integer then outputs each digit 
// Challenges: Extracting digits with mathematical expressions
// Time Spent: 2:00
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 01/30/2024             WC             Declared variables to hold user input
// 01/30/2024             WC             Store user input as string    
// 01/30/2024             WC             Convert user input to integer  
// 02/05/2025              WC             Program refinement
// 02/05/2025              WC             Set each digit to corresponding part of number.
 

/* Gui.java */

import javax.swing.JOptionPane;

public class Gui 
{
 
    public static void main(String[] args)
    {    
        // Get input from user 
        String input = JOptionPane.showInputDialog(null, "Please enter a number: ");
 
        // Declare integer to initialize as converted string value
        int num = Integer.parseInt(input);
    
        // Extract digits from the number
        int num1 = (num / 10000); // 1st digit
        int num2 = ((num / 1000) % 10); // 2nd digit
        int num3 = ((num / 100) % 10); // 3rd digit
        int num4 = ((num / 10) % 10); // 4th digit
        int num5 = (num % 10); // 5th digit
        
        // Return user input
        System.out.printf(" %d | %d | %d | %d | %d\n", num1, num2, num3, num4, num5);
    }
 
}
