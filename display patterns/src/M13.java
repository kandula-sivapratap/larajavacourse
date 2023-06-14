class M13
{
	public static void main(String[] args) 
	{
		for (int row = 1;row <= 3 ; row++)
		{
			for (int cols =(row+6); cols>=row; cols--)
			{
				System.out.print((cols + row)+" ");
			}
			System.out.println();
		}
		
	}
}
