class N15a 
{
	public static void main(String[] args) 
	{
		int givenNum= 123;
		int reverseNum =0;
		int digit;
		while (givenNum !=0)
		{
			digit=givenNum %10;
			reverseNum=reverseNum*10+digit;
			reverseNum=givenNum/10;

		}
		System.out.println(reverseNum);
	}
}
