class M78
{
	public static void main(String[] args) 
	{	
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=7;k++)
			{
				if( i==1||i==7||k==i||k==7)
				{
				System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
		System.out.println();
	}
}
}


/*
 1 1 1 1 1 1 1
    1 0 0 0 0 1
       1 0 0 0 1
         1 0 0 1
            1 0 1
               1 1
                  1  


D:\logicalcoding\app1\src>java -cp ../classes M78
  1 1 1 1 1 1 1
     1 0 0 0 0 1
        1 0 0 0 1
           1 0 0 1
              1 0 1
                 1 1
                    1			  */