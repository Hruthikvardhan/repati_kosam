//Write a program to reverse a number entered by the user.
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to reverse a number");
        int num = sc.nextInt();
        int reversed =0;
        int temp = num;

        while(temp !=0){
            int digit = temp%10;
            reversed = reversed*10+digit;
            temp /=10;
        }
        System.out.println(reversed);

        /*if(temp == num){
            System.out.println("it is not a paildrome");
        }else{
            System.out.println("it is a palidrome");
        }*/
    }
}