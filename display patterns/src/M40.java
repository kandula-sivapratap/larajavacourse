class M40 
{
	public static void main(String[] args) 
	{
		for ( int i =0;i<=7;i++)
		{
			for (  int j=1;j<=i;j++)
			{				
				System.out.print(i==0||i<=j ? 0+"  ": j+"  ");
			}
			System.out.print("\n");
	}
	}
}
