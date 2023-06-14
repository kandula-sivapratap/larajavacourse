class M19
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
				else
			{
				System.out.print(((i+j)-3) +" ");
			}
			
		}
		System.out.println();
		
	}
}
}
