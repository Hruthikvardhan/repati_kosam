import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0, oddSum = 0;
        int diff = Math.abs(evenSum - oddSum);
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        

        System.out.println("Even Sum = " + evenSum);
        System.out.println("Odd Sum = " + oddSum);
        System.out.println("Difference = " + diff);

        sc.close();
    }
}
