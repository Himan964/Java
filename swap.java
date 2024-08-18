import java.lang.*;
import java.util.Scanner;
public class swap{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter 1st num:");
int a=input.nextInt();
System.out.print("Enter 2nd num:");
int b=input.nextInt();
int c=a;
a=b;
System.out.println("Final 1st number:"+a);
b=c;
System.out.println("Final 2nd number:"+b);

}
}