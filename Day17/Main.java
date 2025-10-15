/*Q1. Write a program to sort an array in ascending order. 
🧩 Example: Input → [5, 2, 9, 1, 5, 6] Output → [1, 2, 5, 5, 6, 9]
*/
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }

        /*Arrays.sort(arr);
        for(int pre : arr){
            System.out.print(pre +" ");
        }*/

        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int pre : arr){
            System.out.print(pre + " ");
        }
        
    }
}