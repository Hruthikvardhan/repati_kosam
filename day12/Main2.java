import java.util.*;
public  class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[]= new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        int start= 0;
        int end =num-1;

        while(start < end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int pre : arr){
            System.out.print(pre +" ");
        }
    }
}