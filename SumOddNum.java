import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("How many numbers you want to print:");
        int numSize=sc.nextInt();
        int i=1,sum=0;
        while (i<=numSize){
            if (i%2 !=0){
                sum=sum+i;

            }
            i++;
        }
        System.out.println(sum);
    }
}
