class M14
{
	public static void main(String[] args) 
	{
		for (int row = 3;row >= 1 ; row--)
		{
			for (int cols =(row+4); cols>=row; cols--)
			{
				System.out.print(cols+" ");
			}
			System.out.println();
		}
		
	}
}
