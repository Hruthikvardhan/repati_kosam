//1.Q1. Write a program to find the second smallest element in an array.
import java.util.*;
public  class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array :");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int secondsm= Integer.MAX_VALUE;
        
        for(int pre : arr){
            if(pre < smallest){
                secondsm = smallest;
                smallest = pre;
            }
            else if((pre <secondsm)&&(secondsm !=0)){
                secondsm = pre;
            }
        }
        System.out.println("second smallest:"+secondsm);

    }
}