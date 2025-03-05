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
