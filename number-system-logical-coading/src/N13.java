class N13
{
	public static void main(String[] args) 
	{
		int i=123568924;
		int count=0;
		int d1;
		while (i!=0)
		{
			d1=i%10;
			if((i%10)%2==0)
			{
				count++;
			}
				i=i/10;
		}
			System.out.println(count ++);
		
	}
}
