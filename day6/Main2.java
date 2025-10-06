import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting num");
        int st = sc.nextInt();
        System.out.println("Enter ending num");
        int ed = sc.nextInt();

        for(int i=st;i<=ed;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return  false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}