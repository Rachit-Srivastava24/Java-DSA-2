import java.util.*;
class Account
{
int bal;
Account(int b)
{
bal=b;
}
boolean Sufficientbal(int w)
{
if(bal>w)
{
return true;
}
else
{
return false;
}
}
void withdraw(int amt)
{
bal=bal-amt;
System.out.println("Transaction Successfull.");
System.out.println("current balance is "+bal);
}
}
class Customer implements Runnable
{
Account x1;
Customer(Account j1)
{
x1=j1;
}
public void run()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter amount to withdraw:");
int amt=sc.nextInt();
if(x1.Sufficientbal(amt))
{
x1.withdraw(amt);
}
else
{
System.out.println("Insufficient balance");
}
}
}
class MultiSync
{
public static void main(String args[])
{
Account a1=new Account(5000);
Customer c1=new Customer(a1);
Customer c2=new Customer(a1);
Thread t1=new Thread(c1);
Thread t2=new Thread(c2);
t1.start();
t2.start();
}
}