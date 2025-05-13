import java.util.*;
class Reversenumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt(); //1234
//using algorithm
int rev=0;
while(num!=0)
{
rev=rev*10+num%10;
num=num/10;
}
System.out.println("Reverse number is" +rev);
}
}