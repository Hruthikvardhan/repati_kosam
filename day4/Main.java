import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number to check fibnoicc");
        int num = sc.nextInt();
        System.out.println("fibb");
        int a=0,b=1;
        for(int i=0;i<num;i++){
            System.out.println(a+" ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}