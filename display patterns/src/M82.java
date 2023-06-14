class M82
{
	public static void main(String[] args) 
	{	
		for(int i=7;i>=2;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=7;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
	}
}
}

/*              7
              6 7
           5 6 7
        4 5 6 7 
     3 4 5 6 7
  2 3 4 5 6 7

D:\logicalcoding\app1\src>java -cp ../classes M82
              7
            6 7
          5 6 7
        4 5 6 7
      3 4 5 6 7
    2 3 4 5 6 7
  
	  */