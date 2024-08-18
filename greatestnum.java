import java.util.Scanner;
import java.lang.*;
public class greatestnum{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter the 1st number:");
int a=input.nextInt();
System.out.print("Enter the 2nd number:");
int b=input.nextInt();
System.out.print("Enter the 3rd number:");
int c=input.nextInt();
if(a>=b && a>=c){
 System.out.println("Then," +a+" is the greatest number");
}
else if(b>=a && b>=c){
System.out.println("Then," +b+" is the greatest number");
}
else{
System.out.println("Then," +c+" is the greatest number");
}
}
}