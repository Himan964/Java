import java.lang.*;
import java.util.Scanner;
public class CI{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter principle:");
int p=input.nextInt();
System.out.print("Enter rate of interest:");
double r=input.nextDouble();
System.out.print("Enter time:");
float t=input.nextFloat();
double s=p * Math.pow((1+r/100),t);
System.out.println("The Compound Interest is: "+s);

}
}