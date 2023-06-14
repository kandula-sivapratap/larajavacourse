class M87
{
	public static void main(String[] args) 
	{	
		for(char i='A';i<='F';i++)
		{
			for(int j='F';j>=i;j--)
			{
				System.out.print("  ");
			}
			for(char k=i;k>='A';k--)
			{
				if(i=='A'||i=='F'||i==k||k=='A')
				{
					System.out.print(k+" ");
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
              A
            B A
         C 0 A
      D 0 0 A
   E 0  0 0 A
 F E D C B A


D:\logicalcoding\app1\src>java -cp ../classes M87
              A
            B A
         C 0 A
       D 0 0 A
     E 0 0 0 A
  F E D C B A	  */