class Mahesh
{
int x;   //instance (object)member variable
int y;  //instance (object)member variable
void fun1()  //instance (object)member function
{
System.out.println("fun1");
}
void fun2()   //instance (object)member function
{
System.out.println("fun2");
}
}

class Object1
{
public static void main(String args[])
{
Mahesh m1=new Mahesh();
Mahesh m2=new Mahesh();
m1.x=5;
m2.y=7;
System.out.println("hey rachit");
System.out.println(m1.x);
System.out.println("hey rachit");
System.out.println(m2.y);
}
}