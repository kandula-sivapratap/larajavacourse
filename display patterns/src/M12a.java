class M12a
{
	public static void main(String[] args) 
	{
		for (int row = 1;row <= 3 ; row++)
		{
			for (int cols =row; cols<=(row+ 6); cols++)
			{
				System.out.print((cols + row)+" ");
			}
			System.out.println();
		}
		
	}
}
