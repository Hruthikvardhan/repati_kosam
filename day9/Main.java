//Write a program to check whether a given number is a palindrome (same forward and backward).
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check pali:");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        
        while(temp !=0){
            int digit = temp%10;
            rev = rev*10+digit;
            temp /=10;
        }
        System.out.println(rev);
        if(num == rev){
            System.out.println("it is palidome");
        }
        else{
            System.out.println("not a palidrome");
        }
    }
}