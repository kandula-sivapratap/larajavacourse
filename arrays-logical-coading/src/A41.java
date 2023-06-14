class  A41
{
	public static void main(String[] args) 
	{
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("even  elements  in the middle of two  odd elements");
		 for (int i =1; i < array.length-1; i++)
		  if (array[i-1] % 2 != 0 && array[i+1] % 2 != 0 &&array[i] % 2==0) 
			 {
                System.out.print(array[i] + " ");
            }
	}
}
