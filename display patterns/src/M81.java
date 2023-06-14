class M81
{
	public static void main(String[] args) 
	{	
		for(int i=1;i<=8;i++)
		{
			for(int j=i;j<=8;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
	}
}
}

/*
                     1
                  1 2
               1 2 3
            1 2 3 4
         1 2 3 4 5
      1 2 3 4 5 6
    1 2 3 4 5 6 7 
 1 2 3 4 5 6 7 8


D:\logicalcoding\app1\src>java -cp ../classes M81
                 1
               1 2
             1 2 3
           1 2 3 4
         1 2 3 4 5
       1 2 3 4 5 6
     1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8
	  */