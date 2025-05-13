class Rachh
{
int a;
int b;
void fun1() //instance(object)member function
{
System.out.println("hello fun1");
}
void fun2() //instance(object)member function
{
System.out.println("hello fun2");

}
}
class Handsome
{
public static void main(String args[])
{
Rachh r1=new Rachh();
Rachh r2=new Rachh();
r1.a=9;
r2.b=5;
System.out.println("done");
System.out.println(r1.a);
System.out.println(r1.b);



}
}