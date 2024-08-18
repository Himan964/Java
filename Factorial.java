import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Factorial num:");
        int num= sc.nextInt();
        long fact=factorial(num);
        System.out.println("The result of the factorial is : " +fact);

    }
    public static long factorial(int number){
        if(number<2){
            return 1;
        }

        int sum=1;
        int i=2;
        while(i<=number) {
            sum = sum * i;
            i++;
        }
        return sum;

    }

}
