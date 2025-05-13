interface i1
{
int x=6;
void f1();
static void f2()//latest function body feature//
{
System.out.println(x);
}

}
class InterF
{
public static void main(String args[])
{
i1.f2();
}
}