import java.util.Scanner;
import java.lang.*;
public class LeapYear{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter the Year:");
int year=input.nextInt();
if(year%400==0 ){
 System.out.println("The Year is a Leap Year");
}
else if(year%100==0 ){
 System.out.println("The Year is not a Leap Year");
}
else if(year%4==0 ){
 System.out.println("The Year is a Leap Year");
}
else{
 System.out.println("The Year is not a Leap Year");
}
}
}