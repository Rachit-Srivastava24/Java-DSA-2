class Bro
{
 int x;
private static int y;
void fun1()
{
y=33;

}
void fun2()
{
System.out.println(y);
}
void fun3()
{
y=66;
}
}
class Staticmembers
{
public static void main(String args[])
{
Bro b1=new Bro();
Bro b2=new Bro();
b1.fun1();
b2.fun3();
b1.fun2();
}
}