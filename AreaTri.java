import java.lang.*;
import java.util.Scanner;
public class AreaTri{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter base:");
int b=input.nextInt();
System.out.print("Enter height:");
int h=input.nextInt();
int a=(b*h)*1/2;
System.out.print("Area of Triangle:" +a);

}
}