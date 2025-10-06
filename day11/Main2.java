//2.find highest element in an array
import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        
        int largest = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>num){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}