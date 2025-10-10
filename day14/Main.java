//adding element in by entering an element
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an element : ");
        int ele = sc.nextInt();
        System.out.println("Enter at specific pos :");
        int pos = sc.nextInt();

        int newarr[] = new int[num+1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        newarr[pos] = ele;
        for(int i=pos;i<num;i++){
            newarr[i+1]= arr[i];
        }
        System.out.println("After updatation for new array :");
        for(int x : newarr){
            System.out.print(x+" ");
        }
    }
}