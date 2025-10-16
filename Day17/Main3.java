import  java.util.*;
public  class Main3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i=0;i<num;i++){
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();
        int index =-1;
      
        
        for(int i=0;i<num;i++){
            if(arr[i]==target){
                index= i;
            }
        }
        if(index != -1){
            System.out.println("Element found at "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}