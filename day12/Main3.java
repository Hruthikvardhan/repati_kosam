import  java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }

        int oddcount=0;
        int evencount=0;
        for(int pre:arr){
            if(pre %2==0){
                oddcount++;
            }
            else{
                evencount++;
            }
        }
        System.out.println(oddcount+ " "+evencount);
    }
}
