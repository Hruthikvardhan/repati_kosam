//Q1. Write a program to find the smallest element in an array
import java.util.*;
public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sixe of an array :");
        int num = sc.nextInt();

        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int smallest = arr[0];

        for(int pre:arr){
            if(pre <smallest){
                pre = smallest;
            }
        }
        System.out.println(smallest);
    }
}