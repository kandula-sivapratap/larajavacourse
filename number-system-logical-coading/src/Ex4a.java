class Ex4a
{
	public static void main(String[] args) 
	{
		int num=24365651;
		int count=0;
			while (num!=0)
			{
				++count;
              num=num/10;
			}
		System.out.println("number of digit in"+num+"is"+count);
	}
}
