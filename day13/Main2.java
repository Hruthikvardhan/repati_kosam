
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of an Array :");
        int num = sc.nextInt();
        int pro =1;
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
            pro *=arr[i];
        }
        System.out.println(pro);
    }
}
