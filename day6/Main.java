/*Write a program to find the GCD (Greatest Common Divisor) of two numbers entered by the user. 👉 Example: Input 12 and 18 → Output 6 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2:");
        int num2 = sc.nextInt();


        int a = num1;
        int b = num2;
// Euclidean algorithm
        while(b!=0){
            int temp = b;
            b = a%b;
            a= temp;
        }
        System.out.println(a);
    }
}