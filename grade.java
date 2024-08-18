import java.util.Scanner;
import java.lang.*;
public class grade{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.print("Enter the student mark:");
int mark=input.nextInt();
if(mark>90){
System.out.println("Then, the student get A grade");
}
else if(mark>75){
System.out.println("Then, the student get B grade");
}
else if(mark>60){
System.out.println("Then, the student get C grade");
}
else if(mark>30){
System.out.println("Then, the student get D grade");
}
else{
System.out.println("Then, the student get F grade");
}
}
}