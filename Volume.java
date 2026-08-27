import java.util.Scanner;
class Volume
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter volume in litres:");
double I=sc.nextDouble();
System.out.println("US Gallons="+(I/3.78541));
System.out.println("Imperial Gallons="+(I/4.54609));
System.out.println("Cubic Metres="+(I/1000));
}
}
