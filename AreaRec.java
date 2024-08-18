import java.lang.*;
import java.util.Scanner;
public class AreaRec{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter side1:");
int side1=input.nextInt();
System.out.print("Enter side2:");
int side2=input.nextInt();
System.out.print("Enter side3:");
int side3=input.nextInt();
System.out.print("Enter side4:");
int side4=input.nextInt();
int a=side1+side2+side3+side4;
System.out.print("Area of Rectangle:"+a);
}
}