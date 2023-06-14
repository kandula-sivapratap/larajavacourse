class M49
{
	public static void main(String[] args) 
	{
		for(int i =80; i <= 86; i++)
		{
			for(int j = 80; j<= i; j++)
			{
				if(j == 80 || j == i ) 
				{
					System.out.print((char) j +" ");
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
