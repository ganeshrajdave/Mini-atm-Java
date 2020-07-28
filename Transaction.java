package amount ;
import java.io.*;
import java.lang.Exception;
class Exp extends Exception
{
Exp(String s)
{
super(s);
}
}
public class Transaction
{
public void transact()throws Exception
{
int pin,Amt,amount;

DataInputStream i=new DataInputStream(System.in);
int a=25000;
System.out.println("Hii Customer");
Thread.sleep(1000);
System.out.println("Enter your pin");
pin=Integer.parseInt(i.readLine());  
Thread.sleep(1000);
System.out.println("Your current balance is 25000");
Thread.sleep(1000);
System.out.println("Please enter the amount to Debit");
amount=Integer.parseInt(i.readLine());
Amt=a-amount;     
Thread.sleep(1000);                                  
System.out.println("Your current balance is"+Amt);
Thread.sleep(1000);
try
{
if(amount<=25000 && amount>0)
{
System.out.println("Your transaction is valid");
}
else
{
throw new Exp("Sorry your transaction is invalid");
}
}
catch(Exp e)
{
System.out.println(e.getMessage());
}
}
}