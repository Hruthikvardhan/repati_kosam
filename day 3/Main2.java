//Write a program to check whether a given string is a palindrome or not.
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any string");
    String str = sc.nextLine();
    String reversed ="";

    String original = str.toLowerCase();

    for(int i= original.length()-1;i>=0;i--){
        reversed += original.charAt(i);
    }
    if (original.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
