import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(temp !=0){
            int digit = temp%10;
            sum +=digit*digit*digit;
            temp/=10;
        }
        if(sum == num){
            System.out.println("am");
        }
        else{
            System.out.println("not a am");
        }
    }
}
