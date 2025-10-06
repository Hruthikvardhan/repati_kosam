import java.util.*;
public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     System.out.println("enter any number to check fibbnoc");
     int num = sc.nextInt();
     int a=0;
     int b=1;
     for(int i=0;i<num;i++){
      System.out.print(a);
      int next = a+b;
      a=b;
      b=next;
     }

    }
}