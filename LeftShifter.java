import java.util.Scanner;

public class LeftShifter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1=input.nextInt();
        int result=num1<<1;
        System.out.println("The result is :" + result);
    }
}
