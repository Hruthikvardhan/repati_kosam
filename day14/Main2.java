//to find min and max element an array 
import  java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for(int  i=0;i<num;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("min and max values : ");
        System.out.println("min"+min);
        System.out.println("max"+max);
    }
}
