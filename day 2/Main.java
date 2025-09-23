//Write a program to check whether a given number is prime or not.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check prime or not");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <=1){
            isPrime= false;
        }
        else{
            for(int i=2;i<num ;i++){
                if (num % i ==0){
                    isPrime = false;
                    break;
                }
            }

        }
        if(isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime");
        }
    }
}