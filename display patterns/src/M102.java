class M102
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=6 ;i++ )
		{
			for (int j=1;j<=6-i ;j++ )
			{
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1;k++ )
			{
				if(k==1||i==6||k==2*i-1)
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
                         1
                      1 0 1
                   1 0 0 0 1 
                1 0 0 0 0 0 1
             1 0 0 0 0 0 0 0 1
          1 1 1 1  1 1 1 1 1 1 1


D:\logicalcoding\app1\src>java -cp ../classes M102
            1
         1 0 1
      1 0 0 0 1
    1 0 0 0 0 0 1
  1 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1 1

*/