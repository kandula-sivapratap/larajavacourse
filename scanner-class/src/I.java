import java.util.Scanner;
class I 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter your roll number  ");
		Scanner sc =new Scanner(System.in);
		int value =sc.nextInt();
		System.out.println("please enter your name  ");
		String shiv =sc.next();
		System.out.println("please enter initials ");
		char shiv2 =sc.next().charAt(0);
		System.out.println("please enter age ");
		int shiv3 =sc.nextInt();
		System.out.println("please enter course ");
		String shiv4 =sc.next();
		System.out.println("please enter skills ");
		String shiv5 =sc.next();
		System.out.println("please enter fees ");
		Double shiv6 =sc.nextDouble();
		System.out.println("please enter job offer ");
		Boolean shiv7 =sc.nextBoolean();
        System.out.println("roll number:"+value);
        System.out.println("name:"+shiv);
        System.out.println("initials:"+shiv2);
        System.out.println("age:"+shiv3);
        System.out.println("course:"+shiv4);
        System.out.println("skills:"+shiv5);
        System.out.println("free:"+shiv6);
        System.out.println("job offer:"+shiv7);
	}
}
