import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }

        boolean fond = false;

        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                    fond = true;
                    break;
                }
            }
        }
        if(!fond){
            System.out.print("None");
        }
    }
}
