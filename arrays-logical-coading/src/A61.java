import java.util.Arrays;
class A61
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
	     for (int i=e.length-2;i >=0;i-- )
		{
			e[i+1]=e[i];
			
		}
		System.out.println("final"+Arrays.toString(e));
		
		
	}
}