import java.lang.*;
import java.util.Scanner;
public class AddTwoNum{
 public static void main(String[] args){
    Scanner number=new Scanner(System.in);
    System.out.print("Enter First num:");
    int num1=number.nextInt();
    System.out.print("Enter Second num:");
    int num2=number.nextInt();
    int sum=num1+num2;
    System.out.println(sum);
}
}