class A24
{
int i;
public static void test (A24 shiv)
{
System.out.println("test begin"); 
System.out.println("c:" + obj.i);
obj.i = 10; 
System.out.println("d:" + obj.i);
System.out.println("test end");
}
public static void main(String[] args)
{
System.out.println("main begin");
A24 ref = new A24(); 
ref.i = 5;
System.out.println("a: " + ref.i); 
test (shiv); 

System.out.println("b: " + ref.i);
System.out.println("main end");
}
}

