//Write a program to find the largest element in an array.
//👉 Example: Input [10, 25, 7, 90, 13] → Output 90


/*import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n]; // Declare array

        // Taking elements input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int largest = arr[0];
        for(inti=0;i<n;i++){ 
            if(arr[i]>largest ){
                largest= arr[i];
            }
        }
        sc.close();
    }
}*/
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0]; // assume first element is largest

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("The largest element is: " + largest);
    }
}

