import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1=input.nextInt();
        System.out.print("Enter 2nd number:");
        int num2=input.nextInt();
        int result=num1 ^ num2;
        System.out.println("The result is :" + result);
    }
}
