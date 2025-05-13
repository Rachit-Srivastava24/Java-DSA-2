class Area
{
static void fun1()
{
System.out.println("area1");
}
static void fun2()
{
System.out.println("area2");
}
}
class Example
{
static void fun1()
{
System.out.println("a");
}
static void fun2()
{
System.out.println("b");
}
public static void main(String []args)
{
System.out.println("c");
fun1();
fun2();
Area.fun1();
Area.fun2();
}
}

