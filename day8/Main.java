/*Write a program to check whether a given string is a pangram (contains all 26 alphabets at least once). 👉 Example: "The quick brown fox
 jumps over the lazy dog" → Pangram ✅ */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :");
        String str = sc.nextLine().toLowerCase();

        boolean ap[] = new boolean[26];
        int index=0;
        boolean is_pana=true;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if((ch>='a')&&(ch<='z')){
                index = ch-'a';
                ap[index]=true;
            }
        }
        for(boolean pre :ap){
            if(!pre){
                is_pana=false;
                break;
            }
        }
        if(is_pana){
            System.out.println("it is pana");
        }
        else{
            System.out.println("not a pana");
        }
    }
}