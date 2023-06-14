class M101
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
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}


/* 
                         1
                      1 1 1
                   1 1 1 1 1 
                1 1 1 1 1 1 1
             1 1 1 1 1 1 1 1 1
          1 1 1 1  1 1 1 1 1 1 1


D:\logicalcoding\app1\src>java -cp ../classes M100
p
p q
p 0 r
p 0 0 s
p 0 0 0 t
p 0 0 0 0 u
p 0 0 0 v
p 0 0 w
p 0 x
p y
p

*/