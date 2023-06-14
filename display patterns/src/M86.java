class M86
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
					System.out.print(k+" ");
				}
				System.out.println();
			}
			
	}

}

/* 
              A
            B A
         C B A
      D C B A
   E D C B A
F E D C B A

D:\logicalcoding\app1\src>java -cp ../classes M86
               A
             B A
          C B A
       D C B A
     E D C B A
  F E D C B A	  */