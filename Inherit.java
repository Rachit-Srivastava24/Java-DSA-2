class Nokia1
{
int x,y;
void f1()
{
System.out.println("parent function 1 is executed.");

}
void f2()
{
System.out.println("parent function 2 is executed.");
}
}
class Nokia2 extends Nokia1
{
int z;
void f3()
{
System.out.println("child function 1 is executed.");
}
}

class Inherit
{
public static void main(String args[])
{
Nokia2 n1=new Nokia2();
n1.f1();
n1.f2();
n1.f3();
}
}