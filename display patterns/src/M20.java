class M20
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 7 ; i++)
		{
			for (int j =6; j>=1; j--)
			{
				if (i==1 ||i==7||j==1||j==6)
				{
				System.out.print("0 ");
				}
				else if ((j-i)+1<=0)
				{
					System.out.print("1 ");
				}
				else
			{
				System.out.print(((j-i)+1) + " ");
			}
			
		}
		System.out.println();
		
	}
}
}







/*
0 0 0 0 0 0
0 4 3 2 1 0
0 3 2 1 1 0
0 2 1 1 1 0
0 1 1 1 1 0
0 0 0 0 0 0
*/