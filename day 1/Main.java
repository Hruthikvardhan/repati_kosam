// Write a program to check whether a given number is even or odd.
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        if (n == 0){
            System.out.println("Zero is considered Even");
        }
        else if (n % 2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        
        sc.close();
    }
}
