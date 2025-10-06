import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println(res);
    }
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n * fact(n - 1);
        }
    }
}