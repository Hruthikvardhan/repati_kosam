/*Q2. Write a program to sort an array in ascending order without using built-in functions.
👉 Example:
Input → [5, 2, 8, 1, 3]
Output → [1, 2, 3, 5, 8]
*/

import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        /*Arrays.sort(arr);*/
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
