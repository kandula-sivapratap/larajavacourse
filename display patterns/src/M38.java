class M38 
{
	public static void main(String[] args) 
	{
		for ( int i =0;i<=7;i++)
		{
			for (  int j=0;j<=i;j++)
			{				
				System.out.print(j==0||i==7||i<j?0+"  ": (i-j)+"  ");
			}
			System.out.print("\n");
	}
	}
}
