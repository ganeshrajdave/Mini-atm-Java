import java.io.*;
import amount.Transaction;
class Operations
{
int ch,dob,pan,phno,add,amount,pin,Amt;
String acc_type,branch,cust,gen,email,ad,name;                                                                                      
                                 								     	
final void account_type()throws Exception 					                       
{									      	
DataInputStream i=new DataInputStream(System.in);					      
System.out.println("1.Savings");
Thread.sleep(1000);
System.out.println("2.Current");
Thread.sleep(1000);
System.out.println("3.Fixed/Term Deposit");
Thread.sleep(1000);
System.out.println("4.Others");
System.out.println("Enter the Account Type");
acc_type=i.readLine();

}
final void create_account()throws Exception
{
RandomAccessFile a=new RandomAccessFile("record.txt","rw");
DataInputStream i=new DataInputStream(System.in);
System.out.println("Enter the branch name");
branch=i.readLine();
System.out.println("Enter the name of the customer");
cust=i.readLine();
System.out.println("Enter the Customer address");
ad=i.readLine();
System.out.println("Enter the gender");
gen=i.readLine();
System.out.println("Enter Date of Birth");
dob=Integer.parseInt(i.readLine());
System.out.println("Enter the pan card N.o");
pan=Integer.parseInt(i.readLine());
System.out.println("Enter the phone number");
phno=Integer.parseInt(i.readLine());
System.out.println("Enter the aadhaar card number");
add=Integer.parseInt(i.readLine());
System.out.println("Enter the email ID");
email=i.readLine();

System.out.println("Please attach the following documents zerox");
System.out.println("1.Aadhaar card");
System.out.println("2.Pan card");
System.out.println("3.Passport Photo");
System.out.println("4.Address Proof");

a.writeUTF(acc_type);
a.writeUTF(branch);
a.writeUTF(cust);
a.writeUTF(ad);
a.writeUTF(gen);
a.writeInt(dob);
a.writeInt(pan);
a.writeInt(phno);
a.writeInt(add);
a.writeUTF(email);
}
final void acc_details()throws Exception
{
RandomAccessFile r=new RandomAccessFile("record.txt","r");

r.seek(0);
acc_type=r.readUTF();
branch=r.readUTF();
cust=r.readUTF();
ad=r.readUTF();
gen=r.readUTF();
dob=r.readInt();
pan=r.readInt();
phno=r.readInt();
add=r.readInt();
email=r.readUTF();

System.out.println("!!!!!!!!!!!!!!!!!!!!!!Your Account Details!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("=======================================");
System.out.println("Your account number is 120510011010045");
System.out.println("Your branch name is "+branch);
System.out.println("The customer name is "+cust);
System.out.println("The customer address is "+ad);
System.out.println("The Gender is "+gen);
System.out.println("The date of birth is "+dob);
System.out.println("The pan card number is "+pan);
System.out.println("The phone number is "+phno);
System.out.println("The addhar number is "+add);
System.out.println("The Email Id is "+email);
System.out.println("=======================================");
}
}
class Bank extends Operations
{ 
public static void main(String args[])throws Exception
{
Bank b=new Bank();
Transaction t=new Transaction();
int ch;
DataInputStream i=new DataInputStream(System.in);
Thread.sleep(1000);
System.out.println("==============================");
System.out.println("Welcome To GRD Bank");
System.out.println("=============================");
Thread.sleep(1000);
System.out.println("1.Account Type");
Thread.sleep(1000);
System.out.println("2.Create Account");
Thread.sleep(1000);
System.out.println("3.Transaction");
Thread.sleep(1000);
System.out.println("4.Account Details");
Thread.sleep(1000);
System.out.println("5.Exit");
do
{
System.out.println("Enter the choice");
ch=Integer.parseInt(i.readLine());
switch(ch)     
{
case 1:
{
b.account_type();
break;
}
case 2:
{
b.create_account();
break;
}
case 3:
{
t.transact();
break;
}
case 4:
{
b.acc_details();
break;
}
case 5:
{
System.out.println("exit");
System.exit(0);
break;
}
default:
{
System.out.println("Please Enter a valid option");
}
}
}while(ch!=5);
}
}
