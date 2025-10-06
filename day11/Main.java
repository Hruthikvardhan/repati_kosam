//1.find sum of array elements code in java
import java.util.*;
public  class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum =0;
        
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }

       
        System.out.println(sum);
    }
}