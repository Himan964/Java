import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int sum=digit(num);
        System.out.print("Sum of the digits are : " +sum );

    }
    public static int digit(int num){
        int sum=0;
        while (num >0){
            sum= sum+num%10;
            num=num/10;
        }

        return sum;
    }
}
