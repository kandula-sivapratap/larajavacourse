class M36 
{
	public static void main(String[] args) 
	{
		for ( int i =0;i<=8;i++)
		{
			for (  int j=1;j<=i;j++)
			{				
				System.out.print(j==1||i==8||i==j?0+"  ": 1+"  ");
			}
			System.out.print("\n");
		}
	
	}
}

