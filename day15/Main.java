/*Q1. Write a program to find the sum of all positive and negative numbers separately in an array.
👉 Example:
Input → [10, -5, 20, -15, 25]
Output → Positive Sum = 55, Negative Sum = -20
*/
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int possum=0;
        int negsum=0;
        for(int i=0;i<num;i++){
            if(arr[i]>0){
                possum+=arr[i];
            }
            else if(arr[i]<0){
                negsum +=arr[i];
            }
        }
        System.out.println(possum);
        System.out.println(negsum);
    }
}