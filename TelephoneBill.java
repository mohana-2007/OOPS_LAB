import java.util.Scanner;
class TelephoneBill
{
int custNo, prevMonth, currMonth, duration;
String name, type;
double bill;
void getData()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Customer Number:");
custNo=sc.nextInt();
sc.nextLine();
System.out.print("Enter Customer Name:");
name=sc.nextLine();
System.out.print("Enter Previous Month Duration:");
prevMonth=sc.nextInt();
System.out.print("Enter Current Month Duration:");
currMonth=sc.nextInt();
duration=currMonth-prevMonth;
sc.nextLine();
System.out.print("Enter Connection Type(Prepaid/Postpaid):");
type=sc.nextLine();
}
void calculate()
{
if(type.equalsIgnoreCase("Prepaid"))
bill=duration*1.5;
else
bill=duration*2.0;
}
void display()
{
System.out.println("\n-----TELEPHONE BILL-----");
System.out.println("Customer No:"+custNo);
System.out.println("Customer Name:"+name);
System.out.println("Connection Type:"+type);
System.out.println("Call Duration:"+duration);
System.out.println("Total Bill:Rs."+bill);
}
public static void main(String args[])
{
TelephoneBill obj=new TelephoneBill();
obj.getData();
obj.calculate();
obj.display();
}
}
