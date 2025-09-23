import java.util.*;
public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while(num !=0){
            int digit = num %10;
            sum += digit;
            num /=10;
        }
        System.out.println(sum);
        sc.close();
    }
}