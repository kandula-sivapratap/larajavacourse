class A43
{
	public static void main(String[] args) 
	{
		int[]array={0,5,7,8,9,2,3,1,6,4};
         //         0 1 2 3 4 5 6 7 8 9
		 for (int i=1;i<array.length;i++ )
		 {
			 if(array[i-1]% 2!=0 && array[i]% 2!=0)
			 {
			 System.out.print(array[i]+" "+array[i-1]+" ");
			 }
		 }
	}
}
