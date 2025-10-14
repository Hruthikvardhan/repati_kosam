//Q1. Write a program to count the number of positive and negative numbers in an array.
/*
 * 🧩 Example:
Input → [10, -5, 3, -2, 7, -9]
Output → Positive = 3, Negative = 3
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int pos =0;
        int neg =0;

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        for(int pre : arr){
            if(pre >0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println(pos +" "+neg);
    }
}