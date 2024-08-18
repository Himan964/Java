import java.util.Scanner;
import java.lang.*;
public class ageGroups{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter the person age:");
int age=input.nextInt();
if(age<13){
System.out.println("Then, the person is child");
}
else if(age<20){
System.out.println("Then, the person is child");
}
else if(age<60){
System.out.println("Then, the person is adult");
}
else{
System.out.println("Then, the person is Senior");
}
}
}