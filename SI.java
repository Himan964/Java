import java.lang.*;
import java.util.Scanner;
public class SI{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter principle:");
int p=input.nextInt();
System.out.print("Enter rate of interest:");
double r=input.nextDouble();
System.out.print("Enter time:");
float t=input.nextFloat();
double s=(p*r*t)/100;
System.out.println("The Simple Interest is: "+s);

}
}