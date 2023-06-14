import java.util.Arrays;
class A62
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
	     for (int i=e.length-3;i >=0;i--)
		{
			e[i+2]=e[i];
			
		}
		System.out.println("final"+Arrays.toString(e));
		
		
	}
}