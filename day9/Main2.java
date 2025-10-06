//Write a program to find the second largest number in a list/array.
//👉 Example: [10, 20, 4, 45, 99] → Second largest = 45
import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            System.out.println(arr[i]+" ");
        }

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int pre : arr){
            if(pre>largest){
                secondlargest =largest;
                largest = pre;
            }
            else if((pre> secondlargest)&&(pre!=largest)){
                secondlargest = pre;
            }
        }
        System.out.println(secondlargest);
    }
}