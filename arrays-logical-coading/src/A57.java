import java.util.Arrays;
class A57
{
	public static void main(String[] args) 
	{
		int e[]={10,5,13,16,4,7,20,18};
		System.out.println("Intial"+Arrays.toString(e));
		for (int i=0;i<e.length-1;i++ )
		{
			e[i]=e[i+1];
			
		}
		System.out.println("final "+Arrays.toString(e));
		
		
	}
}