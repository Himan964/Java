import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want a multiplication table :");
        int num=sc.nextInt();
        System.out.println("The multiplication table is :");
        int i=0;
        while (i<=10){

            int multiply=num*i;
            System.out.println(num +"*" + i + "=" + multiply);
            i++;

        }
    }
}
