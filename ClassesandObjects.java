class nokia
{
private int mic;
private int cam;
void setValue()
{
mic=9;
cam=6;
}
void dispaly()
{
System.out.println(mic);
System.out.println(cam);
}
}
class ClassesandObjects
{
public static void main(String args[])
{
nokia n1=new nokia();
n1.display();
n1.setvalue();
}
}