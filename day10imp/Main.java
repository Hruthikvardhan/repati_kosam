//Basic Number Checks 
//1. Check if a number is even or odd.
//n%2==0

/*//2. Check if a number is positive, negative, or zero.
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else if(num ==0){
            System.err.println(num+" zero");
        }
        else{
            System.out.println("negative");
        }
    }
}*/

/*//3. Check if a number is prime.
import  java.util.*;
public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean is_prime=true;

        if(num<=1){
            is_prime=false;
        }
        else{
            for(int i=2;i<Math.sqrt(num);i++){
                if(num%i ==0){
                    is_prime=false;
                    break;
                }
            }
        }
        if(is_prime){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}*/

/*//4. Check if a number is an Armstrong number.
import  java.util.*;
public  class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int temp=n;
        int digits = String.valueOf(n).length();

        while(temp!=0){
            int digit = temp%10;
            sum += Math.pow(digit, digits);
            temp/=10;
        }

        if(sum == n){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not a amstrng ");
        }
    }
}*/

/*//5. Check if a number is a perfect number (sum of divisors equals the number).
//6 ki diviosrs 1,2,3(exclude 6) 1+2+3 =6 sum == num ayte perfect number ex 6 and 28 also perfect numbers
import  java.util.*;
public  class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        for(int i=1;i<n;i++){
            if(n%i ==0){
                sum +=i;
            }
        }
        if(sum == n){
            System.out.println("perfect num");
        }
        else{
            System.out.println("not a perfect num");
        }
    }
}*/

/*//6.Check if a number is a strong number (sum of factorials of digits equals the number).
import  java.util.*;
public  class Main{
    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
        fact *=i;
    }
    return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int sum =0;
        int temp =num;

        while(temp !=0){
            int digit = temp%10;
            sum +=factorial(digit);
            temp/=10;
        }
        if(num == sum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("not a strong num");
        }
    }
}
*/

//7.Check if a number is a palindrome. rev = rev*10=digit;

//8. Check if a number is a happy number.
