//✅ Q2. Merge Two Arrays into One
import  java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size or array1 :");
        int arrele1=sc.nextInt();
        int arr1[] = new int[arrele1];

        for(int i=0;i<arrele1;i++){
            arr1[i]= sc.nextInt();
        }

        System.out.print("Enter the size or array2 :");
        int arrele2=sc.nextInt();
        int arr2[] = new int[arrele1];

        for(int i=0;i<arrele1;i++){
            arr2[i]= sc.nextInt();
        }

        int Mergearr[] = new int[arrele1+arrele2];
        for(int i=0;i<arrele1;i++){
            Mergearr[i]= arr1[i];
        }
        for (int i = 0; i <arrele2 ; i++) {
            Mergearr[arrele1+i] =arr2[i];
        }

        for(int pre: Mergearr){
            System.out.print(pre +" ");
        }
    }
}
