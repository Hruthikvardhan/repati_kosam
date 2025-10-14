/*
Q2. Write a program to copy all elements of one array into another array.
🧩 Example:
Input → [1, 2, 3, 4, 5]
Output → Copied array = [1, 2, 3, 4, 5]
*/
import  java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int num = sc.nextInt();
        int arr[]= new int[num];
        int arr2[]= new int[num];

        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        for(int i =0;i<num;i++){
            arr2[i]=arr[i];
        }
        for(int i=0;i<num;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
