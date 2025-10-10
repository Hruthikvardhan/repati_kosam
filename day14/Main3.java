import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an size of an array : ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to delete :");
        int pos = sc.nextInt();

        for(int i=pos;i<num-1;i++){
            arr[i]= arr[i+1];
        }
        for(int i=0;i<num-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
