
/* 	ShowNum.java */

public class ShowNum
{

    /* Member Variables */

    private int rows;
    private int columns;
	
	
	/* Constructors */ 
	
    public ShowNum()
    {
		this.rows = 0; // Set instance of rows to 0
		this.columns = 0; // Set instance of colums to 0
    }
	
    public ShowNum(int rows, int columns)
    {
		this.rows = rows; // Set to first parameter 
		this.columns = columns; // Set to second parameter
	}

	
    /* Methods */
	
	public int getRows() { return rows; }
	public int getColumns() { return columns; }
	
	public void setRows(int r) { rows = r; }
	public void setColumns(int c) { columns = c; }
	
	public void displayValues()
	{	// Rows
		for (int rowPosition = 0; rowPosition < rows; rowPosition++) 
		{	// Columns
			for (int columnPosition = 0; columnPosition < columns; columnPosition++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
    }

}
