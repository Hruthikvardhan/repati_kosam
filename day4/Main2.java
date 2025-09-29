//Write a program to count the number of vowels in a given string. 👉 Example: Input "hello world" → Output 3 (e, o, o)
import java.util.*;
public class Main2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string to check vowels count");
        String str = sc.next();
        int count =0;
        str = str.toLowerCase(); //overridden
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u' ){
                count++;
            }
        }
        System.out.println(count);
    }
}