import java.lang.*;
import java.util.Scanner;
public class temparature{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter Fahrenheit temparature is:");
Double F=input.nextDouble();
Double C=(F-32)*5/9;
System.out.println("Enter Celcius temparature is :" +C);
}
}