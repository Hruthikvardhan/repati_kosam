import  java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;
        while(b!=0){
            int temp =b;
         b=a%b;
            a=temp;
        }
        System.out.println(a);
    }
}
