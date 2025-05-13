interface i1
{
int x=6;
void f1();
static void f2()//latest function body feature//
{
System.out.println(x);
}

}
interface i2 extends i1 //multilevel inheritance//
{
int y=2;
void f3();
}
class c1 implements i2
{
public void f1()
{

}
public void f3()
{

}

}
class InterF
{
public static void main(String args[])
{
c1 C1=new c1();
System.out.println(C1.x);
//i1.f2();
}
}